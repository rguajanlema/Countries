$(document).ready(function(){

	$('.table .eBtn').on('click',function(event){
		event.preventDefault();
		var href = $(this).attr('href');
		
		$.get(href,function(country,status){
			$('.myForm #id').val(country.id);
			$('.myForm #name').val(country.name);
			$('.myForm #capital').val(country.capital);
		});
		
		$('.myForm #exampleModal').modal();
	});
	
});