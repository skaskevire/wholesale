$(document).ready(function() {
	paintColumns();
	
	
	
	$("#logoutButton").on("click", function() {
		if (confirm("Do you really want to log out?")) {
			open(location, '_self').close();
		}

	});
	$("#dropdownmenu").on("click", function(f) {
		var selectedItem = $(f.target).text();
		if( selectedItem != "Menu")
		{
			$("span#show").text(selectedItem + " selected!");
		}	
	});
});


function paintColumns()
{
	$("reportDatatable).text();
}
