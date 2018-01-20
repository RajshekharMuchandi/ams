

<!DOCTYPE html>
<html lang="en">
<head>

<title>AMS</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script type="text/javascript">

	
    function send() {
    	console.log("send");
        var flat = {
            flatNo: $("#flatNo").val(),
            wing:$("#wing").val(),
            floor:$("#floor").val(),
            electricityMeter:$("#electricityMeter").val()            
        }

        $.ajax({
            url: '/AMS/ams/api/flat/',
            type: 'post',
            dataType: 'json',
            success: function (data) {
              console.log(data);
            },
            data: flat
        });
    }
		
 
</script>
  
</head>
<body>
	<div class="container">
           
                <h2>Flat Registration</h2>
                <div class="form-group">
                    <label for="flatNo" class="col-sm-3 control-label">Flat No</label>
                    <div class="col-sm-9">
                        <input type="text" id="flatNo" placeholder="Flat No" class="form-control" autofocus>
                        <span class="help-block">Flat No eg.: A101</span>
                    </div>
                </div>
				<div class="form-group">
                    <label for="wing" class="col-sm-3 control-label">Flat Wing</label>
                    <div class="col-sm-9"> 
						<select id="wing" class="form-control" autofocus>
							  <option value="a">A</option>
							  <option value="b">B</option>
							  <option value="c">C</option>
							  <option value="d">D</option>
						</select>
						 <span class="help-block">Select Flat Wing eg.: A</span> 
                    </div>
                </div>
					<div class="form-group">
                    <label for="floor" class="col-sm-3 control-label">Flat floor</label>
                    <div class="col-sm-9"> 
						<select id="floor" class="form-control" autofocus>
							  <option value="f1">1</option>
							  <option value="f2">2</option>
							  <option value="f3">3</option>
							  <option value="f4">4</option>
						</select>
						 <span class="help-block">Select Flat Floor eg.: 1</span> 
                    </div>
                </div>
 
				<div class="form-group">
                    <label for="electricityMeter" class="col-sm-3 control-label">Electricity Meter No</label>
                    <div class="col-sm-9">
                        <input type="text" id="electricityMeter" placeholder="Electricity Meter No " class="form-control" autofocus>
                        <span class="help-block">Electricity Meter No  eg.: mscb556979123</span>
                    </div>
                </div>
				<div class="form-group">
                    <label for="flatArea" class="col-sm-3 control-label">Flat Area</label>
                    <div class="col-sm-9">
                        <input type="text" id="flatArea" placeholder="Flat Area" class="form-control" autofocus>
                        <span class="help-block">Flat Area eg.: 2000 Sq F</span>
                    </div>
                </div>
				<div class="form-group">
                    <label for="parkingDet" class="col-sm-3 control-label">Parking Details</label>
                    <div class="col-sm-9">
                        <input type="text" id="parkingDet" placeholder="Parking Details" class="form-control" autofocus>
                        <span class="help-block">Parking Details eg.: Parking No: A001,150sq area</span>
                    </div>
                </div>
				<div class="form-group">
                    <label for="gasMeter" class="col-sm-3 control-label">Gas Meter No</label>
                    <div class="col-sm-9">
                        <input type="text" id="gasMeter" placeholder="Gas Meter No" class="form-control" autofocus>
                        <span class="help-block">Gas Meter No eg.: GS559989832</span>
                    </div>
                </div>

				<div class="form-group">
                    <label for="furnishType" class="col-sm-3 control-label">Furnish Type</label>
                    <div class="col-sm-9"> 
						<select id="furnishType" class="form-control" autofocus>
							  <option value="fu1">Non-Furnish</option>
							  <option value="fu2">Semi-Furnish</option>
							  <option value="fu3">Full-furnish</option>
						</select>
						 <span class="help-block"> eg.: Non Furnish</span> 
                    </div>
                </div>
				<div class="form-group">
                    <div class="col-sm-9 col-sm-offset-3">
                        <div class="checkbox">
                            <label>
                                <input type="checkbox">I accept <a href="#">terms</a>
                            </label>
                        </div>
                    </div>
                </div> <!-- /.form-group -->
                <div class="form-group">
                    <div class="col-sm-9 col-sm-offset-3">
                        <button type="button" id = "add_flat_button" class="btn btn-primary btn-block" onclick="send()">Register</button>
                    </div>
                </div>
          
        </div> <!-- ./container -->
        
        <div id = "stage" style = "background-color:#cc0;">
         STAGE
      </div>
		</body>
		</html>