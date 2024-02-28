

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="header.jsp"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
         <div class="right_col" role="main">
          <div class="">
            <div class="page-title">      
            </div>

          

            <div class="clearfix"></div>

            <div class="row">
              <div class="col-md-12">
                <div class="">
                  <div class="x_content">
                      
                   
                       
                     
                     
              <div class="title_left">
                 <h3>Danh sách sinh viên phòng ${st.tenphong} </h3>
              </div>
                <a href="dsSvPhong?sid=${st.tenphong}" class="btn btn-info" ><i class="fa fa-share"></i> Load </a>
             
           

            <div class="clearfix"></div>

            <div class="row">
              <div class="col-md-12 col-sm-12 ">
                <div class="x_panel">
                  <div class="x_title">
                   
                   
                  
                  </div>
                  <div class="x_content">
                      <div class="row">
                          <div class="col-sm-12">
                            <div class="card-box table-responsive">
                   
                    <table id="datatable" class="table table-striped table-bordered" style="width:100%">
                      <thead>
                        <tr>
                          <th>MÃ SINH VIÊN</th>
                          <th>TÊN SINH VIÊN</th>
                          <th>NĂM SINH</th>
                          <th>ĐỊA CHỈ</th>
                          <th>TÊN PHÒNG </th>
                          <th>Chức năng</th>
                         
                        </tr>
                      </thead>


                      <tbody>
                          <c:forEach items="${list}" var = "o">
                        <tr>
                            
                                        <th>${o.id}</th>
					<th>${o.ten}</th>
					<th>${o.age}</th>
					<th>${o.diachi}</th>
                                        <th>${o.tenphong}</th>
                                        <th> <a href="chuyenPhong?id=${o.id}" class="btn btn-info" ><i class="fa fa-share"></i> Chuyển </a>
                                        <a  onclick="return confirm('Bạn có muốn xóa sinh viên này khỏi phòng không');" href="xoaSvPhong?cid=${o.id}" class="btn btn-danger" ><i class="fa fa-share"></i> Xóa  </a></th>
                                                  
                        </tr>
                         </c:forEach>

                      </tbody>
                    </table
                     <th> <a href="phongControl" class="btn btn-info" ><i class="fa fa-share"></i> Back </a></th>

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


  <jsp:include page="footer.jsp"/>       

 
          
        