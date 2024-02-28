<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="header.jsp"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
   
        <!-- /top navigation -->

        <!-- page content -->
        <div class="right_col" role="main">
          <div class="">
            <div class="page-title">
              <div class="title_left">
                <h3>Danh sách nhập phòng</h3>
                 <div class="pull-right">
                              <th> <a href="phongControl" class="btn btn-info" ><i class="fa fa-share"></i> Load </a></th>
                               </div>
                          

              </div>
                
                <div class="title_right">
                <div class="col-md-5 col-sm-5   form-group pull-right top_search">
                     <form action="timFull"  method="post" enctype="multipart/form-data">
                  <div class="input-group">
                    
                      
                
                       <input name="trangthai"  type="text"class="form-control" class="input100" id="pet-select" placeholder="--Trạng thái phòng--">
                         
                    
                    <span class="input-group-btn">
                      <button class="btn btn-default" type="submit">Go!</button>
                      
                    </span>
                       
                  </div>  
                     </form>
                </div>
              </div> 
          
                    
                    
              
                
            </div>

        
            <div class="clearfix"></div>

            <div class="row">
              <div class="col-md-12">
                <div class="">
                  <div class="x_content">
                      
                    <div class="row">
                       
                          <c:forEach items="${lis}"  var = "o">
                      <div class="animated flipInY col-lg-3 col-md-3 col-sm-6  ">
                        <div class="tile-stats">
                          <div class="icon"><i class="fa fa-caret-square-o-right"></i>
                          </div>
                            <div class="count"><font color="#ff9966">Phòng ${o.tenphong}</font></div>
                           <!-- <button type="button" class="btn btn-success">
                                <a href="svPhong1?sid=${o.tenphong} " style="color:white; text-decoration:none;"><i class="fa fa-user-plus"></i> Thêm SV</a> 
                                
			  </button>-->
                                      <button type="button" class="btn btn-success">
                                <a href="dsSvPhong?sid=${o.tenphong} " style="color:white; text-decoration:none;"> Xem SV</a> 
                               

                                
			  </button>                
                                <br>
                                   
                                <b>
                               
                         <p>SỐ LƯỢNG: ${o.soluong}</p>
                         <p>TRẠNG THÁI: ${o.trangthai}</p></b>
                         <br>
                        <!-- <a href="editPhong?sid=${o.tenphong}" class="btn btn-warning" ><i class="fa fa-pen"></i> SỬA </a>
				
                        <a  onclick="return confirm('Bạn có muốn xóa sinh viên này không');" href="#" class="btn btn-danger"><i class="fa fa-trash"></i> XÓA </a>-->
                         
                         <button type="button" class="btn btn-danger">
                                <a href="phiPhong?sid=${o.tenphong} " style="color:white; text-decoration:none;"> Phí Phòng</a> 
                               

                                
			  </button>        
                        </div>
                      </div>
                                        
                         </c:forEach>
                            
                    </div>
                       

                      
                      <hr>
                      <div class="x_content">
                      <div class="row">
                          <div class="col-sm-12">
                            <div class="card-box table-responsive">
                    <p class="text-muted font-13 m-b-30">
                    <h1><font color="#ff9966"> Danh sách sinh viên chưa nhập phòng</font></h1>
                    </p>
                    <table id="datatable" class="table table-striped table-bordered" style="width:100%">
                      <thead>
                        <tr>
                          <th>Mã SINH VIÊN</th>
                          <th>TÊN SINH VIÊN</th>
                          <th>NĂM SINH</th>
                          <th>ĐỊA CHỈ</th>
                          <th>TÊN PHÒNG</th>
                          <th>CHỨC NĂNG</th>
                        </tr>
                      </thead>


                      <tbody>
                         <c:forEach items="${lists}" var = "o">
                        <tr>
                            
                                        <th>${o.id}</th>
					<th>${o.ten}</th>
					<th>${o.age}</th>
					<th>${o.diachi}</th>
                                        <th>${o.tenphong}</th>
                                        <th><a href ="themsvPhong?cid=${o.id}"><button   class="btn btn-warning" type="submit" ><i class="fa fa-address-book"></i> Thêm vào phòng ${st.tenphong}  </button></a>
                                            </th>
                        </tr>
                         </c:forEach>
                        
                      </tbody>
                    </table>
                  </div>
                  </div>
              </div>
            </div>
                </div>
              </div>
                    
             
                 




                   






<div class="pagination">
  <a href="#">&laquo;</a>
  <a href="#">1</a>
  <a href="#" class="active">2</a>

  <a href="#">&raquo;</a>
</div>
                     
                    </div>
                  </div>
                </div>
              </div>
 
            </div>
          </div>
        
        </div>                       


            
                  


    <!-- jQuery -->
    <script src="http://localhost:8081/cuoiki1/js/jquery.min.js"></script>
    <!-- Bootstrap -->
   <script src="http://localhost:8081/cuoiki1/js/bootstrap.bundle.min.js"></script>
    <!-- FastClick -->
    <script src="http://localhost:8081/cuoiki1/js/fastclick.js"></script>
    <!-- NProgress -->
    <script src="http://localhost:8081/cuoiki1/js/nprogress.js"></script>
    <!-- iCheck -->
    <script src="http://localhost:8081/cuoiki1/js/icheck.min.js"></script>

    <!-- Custom Theme Scripts -->
    <script src="http://localhost:8081/cuoiki1/js/custom.min.js"></script>
    
    
    <!-- Bootstrap -->
    <!-- FastClick -->
    <!-- NProgress -->
    <!-- Chart.js -->
    <script src="http://localhost:8081/cuoiki1/js/Chart.min.js"></script>
    <!-- jQuery Sparklines -->
    <script src="http://localhost:8081/cuoiki1/js/jquery.sparkline.min.js"></script>
    <!-- easy-pie-chart -->
    <script src="http://localhost:8081/cuoiki1/js/jquery.easypiechart.min.js"></script>
    <!-- bootstrap-progressbar -->
    <script src="http://localhost:8081/cuoiki1/js/bootstrap-progressbar.min.js"></script>

    <!-- Custom Theme Scripts -->
    
  </body>
</html>

