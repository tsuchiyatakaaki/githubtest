$(function(){
	bindEvent();
});

function bindEvent(){
	
	$('#update').bind('click', function(event){
		$(this).parents('form').attr('action', 'update').submit();
	})
	
	$('#create').bind('click', function(event){
		$(this).parents('form').attr('action', 'create').submit();
	})
	
	$('#delete').bind('click', function(event){
		$(this).parents('form').attr('action', 'delete').submit();
	})
	
	$('#ajax').bind('click', function(event){
		$(this).parents('form').attr('action', 'ajax').submit();
	})
}