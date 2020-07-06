package edu.immune.sw.pattern.factory.method;

import edu.immune.sw.pattern.factory.ProcessResult;
import edu.immune.sw.pattern.factory.ResponseType;
import edu.immune.sw.pattern.factory.method.bean.Failure;
import edu.immune.sw.pattern.factory.method.bean.Success;
import edu.immune.sw.pattern.factory.method.bean.TimeOut;

public class DefaultResponseGenerator extends ResponseGenerator {

	public Response construct(ProcessResult result, ResponseType type) {
		Response resp = null;
		switch (type) {
		case SUCCESS:
			resp = new Success(result);
			break;
		case FAILURE:
			resp = new Failure(result);
			break;
		case TIMEOUT:
			resp = new TimeOut(result);
			break;
		}
		return resp;
	}

}
