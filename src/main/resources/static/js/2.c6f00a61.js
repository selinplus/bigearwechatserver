(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([[2],{"kmF/":function(e,l,a){"use strict";a.r(l);var t=function(){var e=this,l=e.$createElement,a=e._self._c||l;return a("q-layout",[a("q-page-container",[a("q-page",{attrs:{padding:""}},[a("q-select",{staticClass:"col-xs-12 q-mb-lg",attrs:{"float-label":"车辆类型",options:e.vehicleOptions,before:[{icon:"format_list_bulleted"}],clearable:""},model:{value:e.order.vehicle,callback:function(l){e.$set(e.order,"vehicle",l)},expression:"order.vehicle"}}),e._v(" "),a("div",{staticClass:"row q-mb-lg gutter-sm"},[a("q-radio",{staticClass:"col",attrs:{val:"初检(100)",color:"amber","left-label":"",label:"初检(100)"},model:{value:e.order.envCheckType,callback:function(l){e.$set(e.order,"envCheckType",l)},expression:"order.envCheckType"}}),e._v(" "),a("q-radio",{staticClass:"col",attrs:{val:"一次复检(0)",color:"amber","left-label":"",label:"一次复检(0)"},model:{value:e.order.envCheckType,callback:function(l){e.$set(e.order,"envCheckType",l)},expression:"order.envCheckType"}}),e._v(" "),a("q-radio",{staticClass:"col",attrs:{val:"二次复检(50)",color:"amber","left-label":"",label:"二次复检(50)"},model:{value:e.order.envCheckType,callback:function(l){e.$set(e.order,"envCheckType",l)},expression:"order.envCheckType"}}),e._v(" "),a("q-radio",{staticClass:"col",attrs:{val:"三次复检(100)",color:"amber","left-label":"",label:"三次复检(100)"},model:{value:e.order.envCheckType,callback:function(l){e.$set(e.order,"envCheckType",l)},expression:"order.envCheckType"}})],1),e._v(" "),a("div",{staticClass:"row q-mb-lg gutter-xl"},[a("q-checkbox",{staticClass:"col q-mr-md",attrs:{val:"路试(30)",color:"amber","left-label":"",label:"路试(30)"},model:{value:e.secuAddition,callback:function(l){e.secuAddition=l},expression:"secuAddition"}}),e._v(" "),a("q-checkbox",{staticClass:"col",attrs:{val:"称重(60)",color:"amber","left-label":"",label:"称重(60)"},model:{value:e.secuAddition,callback:function(l){e.secuAddition=l},expression:"secuAddition"}})],1),e._v(" "),a("q-btn",{on:{click:e.log}},[e._v("log")]),e._v(" "),a("q-datetime",{attrs:{type:"datetime","stack-label":"预约时间",min:e.today},model:{value:e.date,callback:function(l){e.date=l},expression:"date"}})],1)],1)],1)},o=[];t._withStripped=!0;a("KKXr");var c=new Date,r={data:function(){return{vehicleOptions:[{label:"小、微型汽车(10)",value:"小、微型汽车(10)"},{label:"轻型汽车(20)",value:"轻型汽车(20)"},{label:"中型汽车(30)",value:"中型汽车(30)"},{label:"重型、中型、轻型半挂车(60)",value:"重型、中型、轻型半挂车(60)"},{label:"危险品挂车(40)",value:"危险品挂车(40)"},{label:"大型、重型汽车(60)",value:"大型、重型汽车(60)"}],order:{vehicle:"",envCheckType:""},secuAddition:[],date:null,today:c}},methods:{log:function(){console.log(this.date)},keyValueSplit:function(e){var l=e.split("(")[0],a=parseFloat(e.split("(")[1].split(")")[0]);return{key:l,value:a}}}},s=r,i=a("KHd+"),n=Object(i["a"])(s,t,o,!1,null,null,null);l["default"]=n.exports}}]);