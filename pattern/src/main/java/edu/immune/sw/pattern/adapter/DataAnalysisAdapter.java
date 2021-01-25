package edu.immune.sw.pattern.adapter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.immune.sw.pattern.adapter.legacy.FileIODataAnalyser;

public class DataAnalysisAdapter implements ModernDataAnalyser {

	private ModernDataAnalyser elasticAnalyser = ElasticDataAnalyser.getInstance();

	@Override
	public void store(StorageType storage, Map<String, String> data)
			throws IllegalArgumentException, DataStorageException {
		if (StorageType.ELASTIC.equals(storage)) {
			elasticAnalyser.store(storage, data);
		} else {
			FileIODataAnalyser fileIODataAnalyser = new FileIODataAnalyser();
			try {
				fileIODataAnalyser.acquire();
				fileIODataAnalyser.save(data);
				fileIODataAnalyser.release();
			} catch (IOException e) {
				throw new DataStorageException(e);
			}
		}
	}

	@Override
	public List<String> fetch(StorageType storage, Set<String> searchKeys)
			throws IllegalArgumentException, DataStorageException {

		List<String> data = Collections.emptyList();
		if (StorageType.ELASTIC.equals(storage)) {
			data = elasticAnalyser.fetch(storage, searchKeys);
		} else {
			FileIODataAnalyser fileIODataAnalyser = new FileIODataAnalyser();
			try {
				fileIODataAnalyser.acquire();
				List<String> searchArguments = new ArrayList<>(searchKeys);
				data = fileIODataAnalyser.fetch(searchArguments);
				fileIODataAnalyser.release();
			} catch (IOException e) {
				throw new DataStorageException(e);
			}
		}

		return data;
	}

}
