 $(function() {
    	var table = $("#example2").DataTable({
    		 "aLengthMenu":[10,20,40,60], 
    		"searching":false,//禁用搜索
    		"lengthChange":true,
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
                    "url":"/tablediff/tableSearch",
                    "data":function(d){
                    	
                    }
            },
    		"aoColumns" : [
    		               
    		          {
		    			"mData" : "schema_name",
		    			"orderable": false , // 禁用排序
		    			"sDefaultContent" : "",
		    			"sWidth" : "2%",
    		        },{
    					"mData" : "table_name",
    					"orderable" : false, // 禁用排序
    					"sDefaultContent" : "",
    					"sWidth" : "6%",
    					
    				} ,  {
    					"mData" : "table_remark",
    					"orderable" : false, // 禁用排序
    					"sDefaultContent" : "",
    					"sWidth" : "10%"
    				}, {
    					"mData" : "table_column_num",
    					"orderable" : false, // 禁用排序
    					"sDefaultContent" : "",
    					"sWidth" : "10%"
    				} ,
    				, {
    					"mData" : "create_time",
    					"orderable" : false, // 禁用排序
    					"sDefaultContent" : "",
    					"sWidth" : "10%"
    				} ,
    				, {
    					"mData" : "table_column_num",
    					"orderable" : false, // 禁用排序
    					"sDefaultContent" : "",
    					"sWidth" : "10%"
    				} ,
    				, {
    					"mData" : "table_column_num",
    					"orderable" : false, // 禁用排序
    					"sDefaultContent" : "",
    					"sWidth" : "10%"
    				} ,
    				 {
    					"mData" : "id",
    					"orderable" : false, // 禁用排序
    					"sDefaultContent" : '',
    					"sWidth" : "10%",
    				    "render":function(data, type, full, meta){
    				    	return	data='<button id="deleteOne" class="btn btn-info" data-id='+data+'>查看</button>';
     				    	
    				    }	
    				},
    				{
    					"mData" : "id",
    					"orderable" : false, // 禁用排序
    					"sDefaultContent" : '',
    					"sWidth" : "10%",
    				    "render":function(data, type, full, meta){
//    				    return	data='<button id="deleteOne" class="btn btn-danger btn-sm" data-id='+data+'>查看</button>';
    				    	return	data='<input type="checkbox" name="" data-id='+data+''>查看</button></span>';
//    				    	 return  data='<a data-id='+data+' href="/monitor/monitorByBaseId?baseId='+data+'">查看</a> '; 
    				    }	
    				} ],
    		/* "columnDefs" : 
    		[{
    			"orderable" : false, // 禁用排序
    			"targets" : [0], // 指定的列
    			"data" : "id",
    			"render" : function(data, type, full, meta) {
    				return '<input type="checkbox" value="'+ data + '" name="id"/>';
    			}
    		}], */
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
       
        /**
    	 * 单行删除按钮点击事件响应
    	 */
//    	$('#example tbody').on('click', '#deleteOne', function() {
//    		 $("input[name=id]").val(table.row($(this).closest('tr')).data().id);//将用户id赋给隐藏的文本框
//    		 setTimeout(function(){deleteBatch();},20);//调用批量删除的方法(延迟20毫秒是为了能够显示出现选中的操作)
//    	});
	     /**
         * 点击查看已监控
         */
        $(document).on('click','#serachById',function(){
          var bid=   $(this).attr("data-id");
          window.location = "/monitor/monitorByBaseId?baseId="+bid;
        })
   
 




        

   

  
   

    });