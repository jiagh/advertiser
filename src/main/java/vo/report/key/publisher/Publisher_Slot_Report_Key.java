package vo.report.key.publisher;

public class Publisher_Slot_Report_Key {

	// 日期
	private String day;
	// 小时
	private int hour;
	// 网站ID
	private int site_id;
	// 广告位ID
	private String slot_id;

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getSite_id() {
		return site_id;
	}

	public void setSite_id(int site_id) {
		this.site_id = site_id;
	}

	public String getSlot_id() {
		return slot_id;
	}

	public void setSlot_id(String slot_id) {
		this.slot_id = slot_id;
	}

}
