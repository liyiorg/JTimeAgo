## JTimeAgo - description

A java time ago tool.
Jsp Tag support.

## Sample usage

        JTimeAgo jTimeAgo = new JTimeAgo();
        Date date = Calendar.getInstance().getTime();
        String time = jTimeAgo.getTimeAgo(date);

## Jsp Tag usage
<%@ taglib uri="/JTimeAgo" prefix="JTimeAgo"%>

### second
<JTimeAgo:ago time="1394606114"/>

### millisecond
<JTimeAgo:ago time="1394606114000"/>

### date
<jsp:useBean id="dateValue" class="java.util.Date"/>
<jsp:setProperty name="dateValue" property="time" value="1394606114000" />
<JTimeAgo:ago date="${dateValue}"/>




