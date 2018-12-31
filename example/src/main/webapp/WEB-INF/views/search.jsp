<html>
<body>
	<form:form action="list" modelAttribute="searchBean">
		<div>
			<h2>検索</h2>
		</div>

		<div>
			<form:label path="dataId">データID</form:label>
			<form:input path="dataId" />
		</div>

		<div>
			<form:button name="next">次へ</form:button>
		</div>
	</form:form>
</body>
</html>
