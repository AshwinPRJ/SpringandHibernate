$( document ).ready(function() {
	
	// SUBMIT FORM
    $("#login").submit(function(event) {
		// Prevent the form from submitting via the browser.
		event.preventDefault();
		console.log(">>>>>>>>>>>>>>>>>>>>>>",event);
		ajaxPost();
	});
    
    
    function ajaxPost(){
    	alert("sending request");
    	console.log($("#username").val());
    	console.log($("#password").val());
    	// PREPARE FORM DATA
    	var formData = {
    		userName : $("#username").val(),
    		password :  $("#password").val(),
    	};
    	
    	// DO POST
    	$.ajax({
			type : "POST",
			contentType : "application/json",
			//url : window.location + "api/customer/save",
			url : "api/login/loginSave",
			data : JSON.stringify(formData),
			dataType : 'json',
			success : function(result) {
				alert("Successfully Login  ", result);
				console.log(">>>>>>>>>>>>>>>>>>>>", result);
				
				
				/*
				if(result.status == "Done"){
					$("#postResultDiv").html("<p style='background-color:#7FA7B0; color:white; padding:20px 20px 20px 20px'>" + 
												"Post Successfully! <br>" +
												"---> Customer's Info: FirstName = " + 
												result.data.firstname + " ,LastName = " + result.data.lastname + "</p>");
				}else{
					$("#postResultDiv").html("<strong>Error</strong>");
				}
				console.log(result);*/
			},
			error : function(e) {
				alert("Error!")
				console.log("ERROR: ", e);
			}
		});
    	
    	// Reset FormData after Posting
    	//resetData();

    }
    
   /* function resetData(){
    	$("#firstname").val("");
    	$("#lastname").val("");
    }*/
})