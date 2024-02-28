

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="header.jsp"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
        <div class="container mt-3" >
		<div class="right_col" role="main" >
          <div class="">
            <div class="page-title">
               
			  <h1>Quản lí sinh viên </h1>
                          <br>
                          <div class="wrap">
                              <div class="pull-right">
                            <form action="find" class="search" method="post">
                               <input type="text" class="searchTerm" name ="name" placeholder="Nhập sinh viên tìm kiếm?">
                               <button type="submit"   class="searchButton">
                               <i class="fa fa-search"></i> Tìm kiếm
                              </button>
                               <p class ="text-danger"><font color ="red" >${mess}</font> </p>
                            </form>
                              </div>
                              <br>
                             
                               
                              <div class="pull-right">
                              <th> <a href="home" class="btn btn-info" ><i class="fa fa-share"></i> Load </a></th>
                               </div>
                         </div>
                            
				<table class="table table-striped table table-bordered " >
				
				<thead class="thead-dark">
				  <tr>
					<th>MÃ SV</th>
					<th>NAME</th>
					<th>NĂM SINH</th>
					<th>ĐỊA CHỈ</th>
                                        <th>TÊN PHÒNG</th>
					<th>Chức năng</th>
                                       
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
                                       
                                        
					
					
					<th><a href="edit?sid=${o.id}" class="btn btn-warning" ><i class="fa fa-pen"></i>  </a>
					<a  onclick="return confirm('Bạn có muốn xóa sinh viên này không');" href="delete?sid=${o.id}" class="btn btn-danger"><i class="fa fa-trash"></i>  </a>
                                       
                                            </th>

                            </tr>
                                </c:forEach>
                            
				
				</tbody>
			  </table>
                          
			  <button type="button" class="btn btn-success">
				<a href="add.jsp" style="color:white; text-decoration:none;"><i class="fa fa-user-plus"></i> Thêm</a> 
			  </button>
                            
            </div>
			</div>
			</div>
			</div>
      
       

  <jsp:include page="footer.jsp"/>       

 
          
        