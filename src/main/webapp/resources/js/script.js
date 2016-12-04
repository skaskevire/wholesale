$(document).ready(function() {
	paintColumnsWhereBandwidthMoreLimit();
	appendCurrentDateToHeader();
	
	
	$(".rf-dt").on("click", function() {
		paintColumnsWhereBandwidthMoreLimit();

	});
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


function paintColumnsWhereBandwidthMoreLimit()
{
	var maxPeakBandwidth = 1000;
	//rf-dt - class for table
	$(".rf-dt").each(function(){
		var reportDatatable = $(this);
		reportDatatable.find(".rf-dt-b").children().each(
				function()
				{
					var self = this;
					var peakBandwidth = $(self.children[2]).text();
					var percentage = peakBandwidth / maxPeakBandwidth;
					if(percentage > 0.85)
					{
						self.setAttribute("style","background-color:red;");
					} else if(percentage > 0.7 && percentage < 0.85)
					{
						self.setAttribute("style","background-color:yellow;");
					}
					
				}	
		);
		
	});	
}

function appendCurrentDateToHeader()
{
	var header = $("#mainPanel_header").text();
	$("#mainPanel_header").text(header.format(new Date()));
}

String.prototype.format = function () {
    var args = [].slice.call(arguments);
    return this.replace(/(\{\d+\})/g, function (a){
        return args[+(a.substr(1,a.length-2))||0];
    });
};
