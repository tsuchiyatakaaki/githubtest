<!DOCTYPE html>
<html lang="ja">
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="./static/css/style.css">
	<script src="./static/js/jquery-3.3.1.min.js"></script>
	<script src="./static/js/list.js"></script>
	
	<title>test一覧画面</title>
</head>
<body>
	<form:form action="" modelAttribute="listForm">
		<div>
			<h2>一覧画面</h2>
		</div>

		<div>
			検索条件[チームID]：
			<c:out value="${listForm.dataId}" />
		</div>

		<div>
			<table border="1">
				<thead>
					<tr>
						<th>選択</th>
						<th>チームID</th>
						<th>チーム名</th>
						<th>キャプテンID</th>
						<th>キャプテン名</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${listForm.dataList}" var="listBean">
						<tr>
							<td><form:checkbox path="selected" value="${listBean.teamId}" /></td>
							<td><c:out value="${listBean.teamId}" /></td>
							<td><c:out value="${listBean.teamName}" /></td>
							<td><c:out value="${listBean.captainId}" /></td>
							<td><c:out value="${listBean.name}" /></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		
		<div>
			<form:button name="create">新規登録</form:button>
			<form:button name="update">更新</form:button>
			<form:button name="delete">削除</form:button>
			<form:button name="ajax">AJAX</form:button>
		</div>
	</form:form>
</body>
</html>
