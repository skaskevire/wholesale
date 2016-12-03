$(document).ready(function() {
	$(".menuInput").click(function() {
		var actionName = this.id;
		actionName = "/project/" + actionName;
		$("#body").load(actionName);
	});
	$("#seanceList").click(function() {
		var date = document.getElementById("dateString").value;
		var pattern = /^[12][90][0-9][0-9]\-[01]?[0-9]\-[0-3]?[0-9]$/;
		if (!pattern.test(date)) {
			alert("Invalid format of date! It must be yyyy-mm-dd");
			return;
		}
		$("#body").load("/project/seanceList", {
			dateString : date
		});
	});
});

function deleteReservation(id) {
	$("#body").load("/project/deleteReservation", {
		id : id
	});
}

function registerSeance(name, date) {
	var userName = document.getElementById("usrName").value;
	var requestBody = {
		seanceName : name,
		date : date,
		userName : userName
	};
	alert(JSON.stringify(requestBody));
	$("#body").load("/project/saveReservation", requestBody, function() {
		alert("done");
	});
}
