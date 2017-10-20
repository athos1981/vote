 $(function() {
    	var table = $("#example").DataTable({
    		 "aLengthMenu":[10,20,40,60], 
    		"searching":false,//禁用搜索
    		"lengthChange":false,
    		"paging": true,//开启表格分页
    		"bProcessing" : true,
    		"bServerSide" : true,
    		"bAutoWidth" : false,
    		"sort" : "position",
    		"deferRender":true,//延迟渲染
    		"bStateSave" : false, //在第三页刷新页面，会自动到第一页
    		"iDisplayLength" : 10,
    		"iDisplayStart" : 0,
    		"ordering": false,//全局禁用排序
    		"ajax": {
                    "type": "POST",
                    "url":"/jiraResult/detailList?ftype=2",
                    "data":function(d){
                    	 d.resultId=$("#resultId").val();
                    	 d.groupid=$("#groupid").val();
                         d.issueIds_doing=$("#issueIds_doing").val();
                         d.issueIds_not=$("#issueIds_not").val();
                         d.issueIds_join=$("#issueIds_join").val();
                         d.issueIds_done=$("#issueIds_done").val();
                    }
            },
    		"aoColumns" : [
    		               
    		          {
		    			"mData" : "project_name",
		    			"orderable": false , // 禁用排序
		    			"sDefaultContent" : "",
		    			"sWidth" : "2%",
		    		    "render":function(data, type, full, meta){
//	    				   
	    				    	return	data+'-'+full.issue_num+'';
//	    				    	
	    				    }	
    		        },{
    					"mData" : "priority",
    					"orderable" : false, // 禁用排序
    					"sDefaultContent" : "",
    					"sWidth" : "2%",
    					
    				} ,  {
    					"mData" : "issue_title",
    					"orderable" : false, // 禁用排序
    					"sDefaultContent" : "",
    					"sWidth" : "10%"
    				}, {
    					"mData" : "issue_status",
    					"orderable" : false, // 禁用排序
    					"sDefaultContent" : "",
    					"sWidth" : "10%"
    				}
    				, {
    					"mData" : "stop_time",
    					"orderable" : false, // 禁用排序 要改
    					"sDefaultContent" : "",
    					"sWidth" : "10%"
    				}
    				,{
    					"mData" : "bugowner",
    					"orderable" : false, // 禁用排序
    					"sDefaultContent" : "",
    					"sWidth" : "2%"
    			
    				}
    				,{
    					"mData" : "handler",
    					"orderable" : false, // 禁用排序
    					"sDefaultContent" : "",
    					"sWidth" : "2%"
    			
    				}
    			 ],
 
    				"oLanguage" : { // 国际化配置
    	    			"sProcessing" : "正在获取数据，请稍后...",
    	    			"sLengthMenu" : "显示 _MENU_ 条",
    	    			"sZeroRecords" : "没有找到数据",
    	    			"sInfo" : "从 _START_ 到  _END_ 条记录 总记录数为 _TOTAL_ 条",
    	    			"sInfoEmpty" : "记录数为0",
    	    			"sInfoFiltered" : "(全部记录数 _MAX_ 条)",
    	    			"sInfoPostFix" : "",
    	    			"sSearch" : "搜索",
    	    			"sUrl" : "",
    	    			"oPaginate" : {
    	    				"sFirst" : "第一页",
    	    				"sPrevious" : "上一页",
    	    				"sNext" : "下一页",
    	    				"sLast" : "最后一页"
    	    			}
    	    		},
    		initComplete:initComplete,
    		drawCallback: function( settings ) {
    	        /* $('input[name=allChecked]')[0].checked=false; *///取消全选状态
//    	        function initComplete(data){
//    	        	//上方topPlugin DIV中追加HTML
//    	        	var topPlugin='<button id="addButton" class="btn btn-success btn-sm" data-toggle="modal" data-target="#addUser" style="display:block;">' +
//    	        				  '<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>批量删除</button>';
//    	        	
//    	        	//删除用户按钮的HTMLDOM
//    	            var deleteHtml='<button id="deleteButton" class="btn btn-danger btn-sm" style="flot:left;margin-right:10px;">批量删除用户</button>' +
//    	    					       '<span name="deleteTips" style="flot:left;margin-right:10px;color:green;"></span><div style="clear:left;"></div>';
//    	    					       
//    	    		$("#topPlugin").append(topPlugin);//在表格上方topPlugin DIV中追加HTML
//    	           // $("#deleteDep").append(deleteHtml);//表格下方的按钮操作区
//    	           // $("#deleteButton").on("click", deleteUser);//给下方按钮绑定事件
//    	    		
//    	        }
    	    }
    		
    	});
    	
    	/**
         * 表格加载渲染完毕后执行的方法
         * @param data
         */
        function initComplete(data){
        	//上方topPlugin DIV中追加HTML
        	//var topPlugin='<button id="addButton" class="btn btn-success btn-sm" data-toggle="modal" data-target="#addUser" style="display:block;">' +
        				 // '<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>添加用户</button>';
        	
        	//删除用户按钮的HTMLDOM
            var topPlugin='<button   class="btn btn-danger btn-sm" id="deleteAll">批量删除</button> <button   class="btn btn-primary btn-sm addBtn" >新 增</button>             <iframe id="exp" style="display:none;"></iframe><button  class="btn btn-info btn-sm" id="expCsv">导 出全部</button>             <button  class="btn btn-warning btn-sm" id="reset">重置搜索条件</button>' ;
    					       
    		$("#topPlugin").append(topPlugin);//在表格上方topPlugin DIV中追加HTML
    		  
    		     //$("#expCsv").on("click", exp1);//给下方按钮绑定事件
        
        }
       

	  

        
        

 




    

   
       
 


    });