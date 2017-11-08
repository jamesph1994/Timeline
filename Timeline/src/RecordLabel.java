
public class RecordLabel{
	
	private String labelName;
	private float established;
	
	public RecordLabel(String initName, float initEstablished){
		labelName = initName;
		established = initEstablished;
	}

	/**
	 * @return the labelName
	 */
	public String getLabelName() {
		return labelName;
	}

	/**
	 * @param labelName the labelName to set
	 */
	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

	/**
	 * @return the established
	 */
	public float getEstablished() {
		return established;
	}

	/**
	 * @param established the established to set
	 */
	public void setEstablished(float established) {
		this.established = established;
	}
}
