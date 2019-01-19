$(function(){
	bindEvent();
});

function bindEvent(){
	$('#ui_sub_contents').dialog({
        modal:true
        , title:"検索子画面"
        , autoOpen:false
    });
	
	$('#sub').on('click', function(event){
		window.open("./static/sub.html","sub","width=150,height=400");
	})
	
	$('#ui_sub').on('click', function(event){
		$('#ui_sub_contents').dialog('open');
	})
	
	$('#search').bind('click', function(event){
		$.get("/example/ajax/1", function(data, statusText, jqXHR){
			$('#teamId').val(data.teamId);
		},'json')
	})
	
	$('#return').bind('click', function(event){
		$('#dataId').val($('#teamId').val());
		$('#ui_sub_contents').dialog('close');
	})
}