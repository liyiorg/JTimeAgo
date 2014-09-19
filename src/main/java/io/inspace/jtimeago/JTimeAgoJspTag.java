package io.inspace.jtimeago;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;



public class JTimeAgoJspTag extends SimpleTagSupport{

	private Long time;

	private Date date;

	@Override
	public void doTag() throws JspException, IOException {
		if(time != null){
			date = new Date(time<10000000000l?time*1000:time);
		}
		getJspContext().getOut().write(new JTimeAgo().getTimeAgo(date));
	}

	public void setTime(Long time) {
		this.time = time;
	}

	public void setDate(Date date) {
		this.date = date;
	}



}
