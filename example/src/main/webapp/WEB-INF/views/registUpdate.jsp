<!DOCTYPE html>
<html lang="ja">
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="./static/css/style.css">
	<script type='text/javascript' src="./static/js/jquery-3.3.1.min.js"></script>
	<script type='text/javascript' src="./static/js/jquery.validate.min.js"></script>
	<script src="./static/js/registUpdate.js"></script>
	
	<title>testtest登録更新画面testtest</title>
</head>
<body>
	<form:form action="update" modelAttribute="registUpdateForm" id="mainForm">
		<div>
			<h2>登録更新画面</h2>
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
							<c:out value="${registUpdateForm.targetData.teamId}" />
							<form:hidden path="targetData.teamId"/>
						</td>
						<td>
						
							<form:input path="targetData.teamName"/>
							<div>
								<form:errors path="targetData.teamName"></form:errors>
							</div>
						</td>
						<td>
							<c:out value="${registUpdateForm.targetData.captainId}" />
							<form:hidden path="targetData.captainId"/>
						</td>
						<td>
							<c:out value="${registUpdateForm.targetData.name}" />
							<form:hidden path="targetData.name"/>
						</td>
						<td>
							<form:hidden path="targetData.version"/>
						</td>
					</tr>
				</tbody>
			</table>
		</div>

		<div>
			<form:button name="execCreate">新規登録</form:button>
			<form:button name="execUpdate">更新</form:button>
		</div>
	</form:form>
</body>
</html>
