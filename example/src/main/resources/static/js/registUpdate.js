$(function(){
	bindEvent();
});

function validate(){
	
	$("#mainForm").validate({
		  rules : {
			  "targetData.teamName": {
					required: true
				 },
		  },
		  messages: {
			  "targetData.teamName":{
						required: "必須項目です。入力をお願いします。"
				 },
		  },
		  
		  errorPlacement: function(error, element){

			  if(element.attr('name') === 'targetData.teamName'){
			    error.appendTo($('#errorField'));

			  }else{    
				  error.appendTo($('#errorField'));
			  }
			}

	});
}

function bindEvent(){
	
	$('#execUpdate').bind('click', function(event){
		validate();
		$(this).parents('form').attr('action', 'update').submit();
	})
}