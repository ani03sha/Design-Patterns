package org.redquark.dp.adapter;

/**
 * @author Anirudh Sharma
 *
 */
public class FishingBoatAdapter implements RowingBoat {

	private FishingBoat fishingBoat;

	/**
	 * @param fishingBoat
	 */
	public FishingBoatAdapter() {
		this.fishingBoat = new FishingBoat();
	}

	@Override
	public void row() {
		fishingBoat.sail();
	}

}
