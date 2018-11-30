;(function () {
		
	var start_stream = function()
	{
		$("#stream").click(function(){
			
	        $.ajax({
	            type  :   "get" ,
	            contentType: "application/json",
	            url  :   "http://localhost:5000/startStream",
	            dataType :   "json",
	            statusCode : {
	            	   400: function(){
	            	   },
	            	   202: function(){
	            	   },
	            	   201: function(){
	            	   }
	            },
	            success : function(result){
	         	   		alert(result)
	        		},
	            error : function(e){
	         	   
	            },
	            complete : function(e, xhr, settings){
	         	   
	            }
	         	   
	         }); 

		});
				
	};



$(function(){
	start_stream();
	});
}());
