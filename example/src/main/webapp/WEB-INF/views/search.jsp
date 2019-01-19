<!DOCTYPE html>
<html lang="ja">
<head>
	<meta charset="UTF-8">
	<script type='text/javascript' src="./static/js/jquery-3.3.1.min.js"></script>
	<script type='text/javascript' src="./static/js/jquery-ui.min.js"></script>
	<link rel="stylesheet" href="./static/css/jquery-ui.min.css">
	
	<link rel="stylesheet" href="./static/css/style.css">
	<script src="./static/js/search.js"></script>
	<title>検索画面</title>
</head>
<body>
	<form:form action="list" modelAttribute="searchForm" id="mainForm" name="mainForm">
		<div>
			<h2>検索画面</h2>
		</div>

		<div>
			<form:label path="dataId">チームID</form:label>
			<form:input path="dataId" />
			<input type="button" id="sub" value="検索子画面(window.open)">
			<input type="button" id="ui_sub" value="検索子画面(jQueryUI)">
		</div>

		<div id="ui_sub_contents"style="display:none;">
			<div>
				<h2>検索子画面</h2>
			</div>
	
			<div>
				<p>
				チームID：<input type="text" id="teamId" name="teamId" size="10" maxlength="5">
				</p>
				<p>
				<input type="button" id="search" value="検索">
				<input type="button" id="return" value="反映">
				</p>
			</div>
		</div>

		<div>
			<form:button name="next">次へ</form:button>
		</div>
	</form:form>
</body>
</html>
