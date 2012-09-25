package ecml;

public class Connection extends CommonAttr {
	private long source_id;
	private long target_id;
	private String is_source_label;
	private String is_target_label;
	private String is_middle_label;
	private String middle_content;
	private String is_target_point;
	private String is_source_point;
	public long getSource_id() {
		return source_id;
	}
	public void setSource_id(long source_id) {
		this.source_id = source_id;
	}
	public long getTarget_id() {
		return target_id;
	}
	public void setTarget_id(long target_id) {
		this.target_id = target_id;
	}
	public String getIs_target_label() {
		return is_target_label;
	}
	public void setIs_target_label(String is_target_label) {
		this.is_target_label = is_target_label;
	}
	public String getIs_source_label() {
		return is_source_label;
	}
	public void setIs_source_label(String is_source_label) {
		this.is_source_label = is_source_label;
	}
	public String getMiddle_content() {
		return middle_content;
	}
	public void setMiddle_content(String middle_content) {
		this.middle_content = middle_content;
	}
	public String getIs_middle_label() {
		return is_middle_label;
	}
	public void setIs_middle_label(String is_middle_label) {
		this.is_middle_label = is_middle_label;
	}
	public String getIs_target_point() {
		return is_target_point;
	}
	public void setIs_target_point(String is_target_point) {
		this.is_target_point = is_target_point;
	}
	public String getIs_source_point() {
		return is_source_point;
	}
	public void setIs_source_point(String is_source_point) {
		this.is_source_point = is_source_point;
	}
		
}
