$(function(){
	bindEvent();
});

function bindEvent(){
	
	$('#targetData\\.teamId').bind('blur', function(event){
		$.get($('#ajaxUrl').val() + $('#targetData\\.teamId').val(), function(data, statusText, jqXHR){
			$('#targetData\\.teamName').val(data.teamName);
			$('#targetData\\.captainId').val(data.captainId);
			$('#targetData\\.name').val(data.name);
			$('#targetData\\.version').val(data.version);
		},'json')
	})
}