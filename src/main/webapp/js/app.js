$.ajax({
	type : "POST",
	contentType : 'application/json; charset=utf-8',
	dataType : 'json',
	url : '/spring-mvc-ajax/notes/admin/add',
	data : JSON.stringify({
		title : $("#title").val(),
		text : $("#text").val()
	}),
	success : function() {
		$("#title").val("");
		$("#text").val("");
	}
});
