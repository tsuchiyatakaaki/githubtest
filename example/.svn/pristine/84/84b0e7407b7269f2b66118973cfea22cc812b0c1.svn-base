$(function(){
	bindEvent();
});

function bindEvent(){
	
	$('#search').bind('click', function(event){
		$.get("/example/ajax/1", function(data, statusText, jqXHR){
			$('#teamId').val(data.teamId);
		},'json')
	})
	
	$('#return').bind('click', function(event){
        window.opener.document.mainForm.dataId.value = $('#teamId').val();
        window.close();
	})
}