<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<meta http-equiv="X-UA-Compatible" content="IE=edge"/>
	<title>Main</title>

	<!-- 써드파티용 -->
	<link rel="stylesheet" href="resource/libs/webix/webix.css" type="text/css"/>

	<!-- 프로젝트용 -->
	<link rel="stylesheet" href="resource/board/css/base.css" type="text/css"/>

	<!-- 써드파티용 -->
	<script src="resource/libs/jquery-3.2.1.js"></script>
	<script src="resource/libs/lodash-4.17.4.js"></script>
	<script src="resource/libs/webix/webix.js"></script>

	<script>
			var board = {};
			board.manager = {};
			board.main = {};
	</script>

	<!-- 프로젝트용 -->
	<script src="resource/board/javascripts/manager/locationManager.js"></script>
	<script src="resource/board/javascripts/board.js"></script>
</head>
<body>

<script>
	var opts = {};
	board.main.initModule(opts);
</script>

</body>
</html>
