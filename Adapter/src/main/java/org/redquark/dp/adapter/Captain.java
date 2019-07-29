package org.redquark.dp.adapter;

/**
 * @author Anirudh Sharma
 *
 */
public class Captain {

	private RowingBoat rowingBoat;
	
	public Captain() {
		// Empty constructor
	}
	
	public Captain(RowingBoat rowingBoat) {
		this.rowingBoat = rowingBoat;
	}
	
	/**
	 * @param rowingBoat the rowingBoat to set
	 */
	public void setRowingBoat(RowingBoat rowingBoat) {
		this.rowingBoat = rowingBoat;
	}

	public void row() {
		rowingBoat.row();
	}

}
