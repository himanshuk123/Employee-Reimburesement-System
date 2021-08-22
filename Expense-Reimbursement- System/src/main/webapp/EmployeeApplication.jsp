<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
    integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="main.css" type="text/css">
</head>
<body>
    <nav   class="navbar nav-pills navbar-expand-md">
        <a class="nav-link" href="index.jsp">Homepage</a>
        <a class="nav-link active" href="EmployeeApplication.jsp">reimbursement request</a>
        <a class="nav-link" href="About.html">About_This_Project</a>
    </nav>
    <header class="header" style = "text-align: center;">
        
        <h1>Expense Reimbursement System </h1>
    </header>
    <section >
            <div class="col-md-6" >
                    <form method="post" action="http://localhost:8080/ERSSystem/ReimbursementServlet" class="form" >
                        <div class="form-group">
                            <span><label class="control-label" >EmployeeId </label></span>
                            <span><input name="empid" type="text" class="form-control" placeholder="type your id here*"
                required="required"></span>
                        </div>

                        <div class="form-group">
                            <span><label class="control-label" >Full Name</label></span>
                            <span><input name="empname" type="text" class="form-control" placeholder="type your name here*"
                required="required"></span>
                        </div>

                        <div class="form-group">
                            <span><label class="control-label">Type of reimbursement</label></span>
                        </div>
                         <div class="col-75">
        <select id="reim_type" name="reim_type">
          <option value="Travel Expenses">Travel </option>
          <option value="Health Expenses">Health </option>
 			<option value="Accomodation Expenses">hotel</option>
          <option value="Other Expenses">Other </option>
        </select>
      </div>
                        <div class="form-group">
                            <span><label class="control-label">Amount spent</label></span>
                            <span><input name="reim_ammount" type="text" class="form-control" placeholder="amount... *"
                required="required" ></span>
                        </div>
                <div class="form-group">
                            <span><label class="control-label" >date of request</label></span>
                            <span><input name="reim_dateofrequest" type="text" class="form-control" placeholder="type date *"
                required="required"></span>
                        </div> 
                        
                        <div class= "form-group">
                            <span><label class="control-label">Description:-</label></span>
                             <textarea  name="subject" placeholder="Write something about your reimbursment type.." rows= "6" cols ="72" ></textarea> 
                </div>
                
                <div class= "form-group">
                <span><button class="btn">submit</button></span>
                  </div>  </form>
                </div>
          
    </section>


    <footer>Himanshu KASH &#174;</footer>


    
</body>
</html>