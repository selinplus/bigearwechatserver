(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([[7],{XInB:function(e,t,a){},YoiW:function(e,t,a){"use strict";a.r(t);var l=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("q-page",[a("q-table",{attrs:{data:e.tableData,columns:e.columns,filter:e.filter,separator:e.separator,"visible-columns":e.visibleColumns,selection:"single",selected:e.selectedSecond,"row-key":"orderNum",color:"secondary",title:"预约管理","rows-per-page-options":e.rowsPerPageOpts,"rows-per-page-label":"每页显示行数",pagination:e.paginationControl},on:{"update:selected":function(t){e.selectedSecond=t},"update:pagination":function(t){e.paginationControl=t}},scopedSlots:e._u([{key:"body-cell-orderDate",fn:function(t){return a("q-td",{attrs:{props:t}},[e._v("\n      "+e._s(e.dateFmt(t.value))+"\n    ")])}},{key:"top-selection",fn:function(t){return[a("q-btn",{staticClass:"q-mr-sm",attrs:{color:"positive",flat:"",round:"",icon:"edit"},on:{click:e.editRow}})]}},{key:"top-right",fn:function(t){return[a("q-search",{staticClass:"col-12 q-mb-sm",attrs:{"hide-underline":"",color:"secondary",placeholder:"搜索"},model:{value:e.filter,callback:function(t){e.filter=t},expression:"filter"}}),e._v(" "),a("q-table-columns",{staticClass:"q-mr-sm",attrs:{label:"筛选",color:"secondary",columns:e.columns},model:{value:e.visibleColumns,callback:function(t){e.visibleColumns=t},expression:"visibleColumns"}}),e._v(" "),a("q-select",{attrs:{color:"secondary",options:[{label:"Horizontal",value:"horizontal"},{label:"Vertical",value:"vertical"},{label:"Cell",value:"cell"},{label:"None",value:"none"}],"hide-underline":""},model:{value:e.separator,callback:function(t){e.separator=t},expression:"separator"}}),e._v(" "),a("q-btn",{attrs:{flat:"",round:"",dense:"",icon:t.inFullscreen?"fullscreen_exit":"fullscreen"},on:{click:t.toggleFullscreen}})]}}])}),e._v(" "),a("q-modal",{ref:"modalRef",attrs:{"content-css":{padding:"50px"}},model:{value:e.editedModal,callback:function(t){e.editedModal=t},expression:"editedModal"}},[a("div",{staticClass:"row gutter-sm"},[a("div",{staticClass:"col-12"},[a("q-select",{attrs:{"float-label":"支付状态",options:e.payStatusOpts,disable:e.disablePayStatus,clearable:""},model:{value:e.editedItem.payStatus,callback:function(t){e.$set(e.editedItem,"payStatus",t)},expression:"editedItem.payStatus"}})],1),e._v(" "),a("div",{staticClass:"col-12"},[a("q-datetime",{staticClass:"col-xs-12 q-mb-lg",attrs:{clearable:"","float-label":"预约时间",type:"datetime",before:[{icon:"date_range"}],"first-day-of-week":1,color:"light-blue","format-model":"date",min:e.today},model:{value:e.editedItem.orderDate,callback:function(t){e.$set(e.editedItem,"orderDate",t)},expression:"editedItem.orderDate"}})],1),e._v(" "),a("div",{staticClass:"col-12 row"},[a("div",{staticClass:"col-12 text-center"},[a("q-btn",{directives:[{name:"close-overlay",rawName:"v-close-overlay"}],staticClass:"q-mr-md",attrs:{color:"warning",size:"13px",label:"取消"}}),e._v(" "),a("q-btn",{directives:[{name:"close-overlay",rawName:"v-close-overlay"}],attrs:{color:"positive",size:"13px",label:"确定"},on:{click:e.save}})],1)])])])],1)},o=[];l._withStripped=!0;a("91GP");var n=a("4IOb"),i=n["S"].formatDate,s=new Date,c={data:function(){return{tableData:[],rowsPerPageOpts:[10,15,20,0],columns:[{name:"name",required:!0,label:"联系人",align:"left",field:"name",sortable:!0},{name:"phone",label:"手机号",align:"left",field:"phone",sortable:!0},{name:"platenum",label:"车牌号",align:"left",field:"platenum",sortable:!0},{name:"vehicleType",label:"车辆类型",align:"left",field:"vehicleType",sortable:!0},{name:"vehicleTypeFee",label:"车辆安检费",align:"left",field:"vehicleTypeFee",sortable:!0},{name:"secuAddition",label:"附加项",align:"left",field:"secuAddition",sortable:!0},{name:"secuAdditionFee",label:"附加费",align:"left",field:"secuAdditionFee",sortable:!0},{name:"fuelType",label:"燃油类型",align:"left",field:"fuelType",sortable:!0},{name:"envCheckType",label:"环检类型",align:"left",field:"envCheckType",sortable:!0},{name:"envCheckTypeFee",label:"环检费",align:"left",field:"envCheckTypeFee",sortable:!0},{name:"totalFee",label:"总费用",align:"left",field:"totalFee",sortable:!0},{name:"orderNum",label:"订单号",align:"left",field:"orderNum",sortable:!0},{name:"orderDate",label:"预约时间",align:"left",field:"orderDate",sortable:!0},{name:"paymentMethod",label:"支付方式",align:"left",field:"paymentMethod",sortable:!0},{name:"payStatus",label:"支付状态",align:"left",field:"payStatus",sortable:!0}],filter:"",visibleColumns:["name","phone","platenum","vehicleType","vehicleTypeFee","secuAddition","secuAdditionFee","fuelType","envCheckType","envCheckTypeFee","totalFee","orderDate","paymentMethod","payStatus"],separator:"none",selection:"multiple",paginationControl:{rowsPerPage:10,page:1},loading:!1,dark:!0,selectedSecond:[],editedModal:!1,editedItem:{},editedIndex:-1,payStatusOpts:[{label:"支付成功",value:"支付成功"},{label:"未支付",value:"未支付"}],disablePayStatus:!0,today:s}},methods:{fetchData:function(){var e=this;this.$http.get("http://www.ytjdcjc.cn/check/order/list").then(function(t){console.log(t.data),e.tableData=t.data.data}).catch(function(e){console.log(e)})},deleteRow:function(){var e=this;this.$q.notify({color:"negative",icon:"delete",message:"确定要删除吗？",position:"top",timeout:0,actions:[{label:"确定",handler:function(){for(var t=[],a=0;a<e.selectedSecond.length;a++)t.push(e.selectedSecond[a].id);var l=t.join(",");e.$http.post("http://www.ytjdcjc.cn/check/order/deleteByIds?ids="+l).then(function(t){200==t.data.code?(e.fetchData(),e.$q.notify({color:"positive",icon:"mood",message:"删除成功！",position:"center",timeout:1e3})):e.$q.notify({color:"negative",icon:"mood_bad",message:"删除失败，请刷新后重试！",position:"center",timeout:1e3})}).catch(function(e){console.log(e)})}},{label:"取消",handler:function(){console.log("取消")}}]})},editRow:function(){this.editedModal=!0,this.editedIndex=this.tableData.indexOf(this.selectedSecond[0]),this.editedItem=Object.assign({},this.selectedSecond[0]),"现场缴费"==this.editedItem.paymentMethod?this.disablePayStatus=!1:this.disablePayStatus=!0},save:function(){var e=this;this.$http.post("http://www.ytjdcjc.cn/check/order/update",this.editedItem).then(function(t){console.log(t.data),200==t.data.code?(e.$q.notify({color:"positive",icon:"mood",message:"修改成功！",position:"center",timeout:1e3}),Object.assign(e.tableData[e.editedIndex],e.editedItem)):e.$q.notify({color:"negative",icon:"mood_bad",message:t.data.message,position:"center",timeout:1e3})}).catch(function(e){console.log(e)})},dateFmt:function(e){return i(e,"YYYY-MM-DD HH:mm:ss")}},mounted:function(){this.fetchData()}},d=c,r=(a("bD2A"),a("KHd+")),u=Object(r["a"])(d,l,o,!1,null,null,null);t["default"]=u.exports},bD2A:function(e,t,a){"use strict";var l=a("XInB"),o=a.n(l);o.a}}]);