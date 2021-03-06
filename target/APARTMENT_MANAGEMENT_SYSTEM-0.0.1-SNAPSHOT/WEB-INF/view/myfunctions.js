function addFlatDetails() {
 
	console.log("addFlatDetails");
    // get inputs
    var flat = new Object();
    
    flat.flatNo = $('#flatNo').val();
    flat.wing = $('#wing').val();
    flat.floor = $('#floor').val();
    flat.electricityMeter = $('#electricityMeter').val();
    flat.flatArea = $('#flatArea').val();
    flat.parkingDet = $('#parkingDet').val();
    flat.gasMeter = $('#gasMeter').val();
    flat.furnishType = $('#furnishType').val(); 
    	
    $.ajax({
        url: "/ams/flat/add",
        type: 'POST',
        dataType: 'json',
        data: JSON.stringify(flat),
        contentType: 'application/json',
        mimeType: 'application/json',
 
        success: function (data) {
            $("tr:has(td)").remove();
 
            $.each(data, function (index, article) {
 
                var td_categories = $("<td/>");
                $.each(article.categories, function (i, tag) {
                    var span = $("<span class='label label-info' style='margin:4px;padding:4px' />");
                    span.text(tag);
                    td_categories.append(span);
                });
 
                var td_tags = $("<td/>");
                $.each(article.tags, function (i, tag) {
                    var span = $("<span class='label' style='margin:4px;padding:4px' />");
                    span.text(tag);
                    td_tags.append(span);
                });
 
                $("#added-articles").append($('<tr/>')
                        .append($('<td/>').html("<a href='"+article.url+"'>"+article.title+"</a>"))
                        .append(td_categories)
                        .append(td_tags)
                );
 
            }); 
        },
        error:function(data,status,er) {
            alert("error: "+data+" status: "+status+" er:"+er);
        }
    });
}