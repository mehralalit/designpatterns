package edu.immune.sw.pattern.decorator.map;

public class TravellerMap extends MapDecorator {

	public TravellerMap(Map map) {
		super(map);
	}

	@Override
	public void draw() {
		super.draw();
		mapUI.printDistance(map.getLocationCoordinates());
		mapUI.printTravelTime(map.getLocationCoordinates());
	}
	
}
