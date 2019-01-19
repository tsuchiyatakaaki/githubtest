<!DOCTYPE html>
<html lang="ja">
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="./static/css/style.css">
	<script type='text/javascript' src="./static/js/jquery-3.3.1.min.js"></script>
	<script type='text/javascript' src="./static/js/jquery.validate.min.js"></script>
	<script src="./static/js/ajax.js"></script>
	
	<title>AJAX画面</title>
</head>
<body>
	<form:form action="ajax" modelAttribute="ajaxForm" id="mainForm">
		<div>
			<h2>AJAX画面</h2>
		</div>

		<div id="errorField">
			<form:errors path="error"></form:errors>
		</div>
		
		<div>
			<table border="1">
				<thead>
					<tr>
						<th>チームID</th>
						<th>チーム名</th>
						<th>キャプテンID</th>
						<th>キャプテン名</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>
							<form:input path="targetData.teamId"/>
							<div>
								<form:errors path="targetData.teamId"></form:errors>
							</div>
						</td>
						<td>
							<form:input path="targetData.teamName"/>
							<div>
								<form:errors path="targetData.teamName"></form:errors>
							</div>
						</td>
						<td>
							<form:input path="targetData.captainId"/>
							<div>
								<form:errors path="targetData.captainId"></form:errors>
							</div>
						</td>
						<td>
							<form:input path="targetData.name"/>
							<div>
								<form:errors path="targetData.name"></form:errors>
							</div>
						</td>
						<td>
							<form:input path="targetData.version"/>
							<div>
								<form:errors path="targetData.version"></form:errors>
							</div>
						</td>
						
						<td>
							<spring:url value="/ajax/" var="ajaxUrl"/>
							<input id="ajaxUrl" type="hidden" value="${ajaxUrl}"/>
						</td>
						
					</tr>
				</tbody>
			</table>
		</div>

	</form:form>
</body>
</html>
