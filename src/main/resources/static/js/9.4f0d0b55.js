(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([[9],{IdcS:function(e,t,o){"use strict";var r=o("tWI/"),a=o.n(r);a.a},rLWk:function(e,t,o){"use strict";o.r(t);var r=function(){var e=this,t=e.$createElement,o=e._self._c||t;return o("q-page",{attrs:{padding:""}},[o("div",{staticClass:"row justify-center"},[o("q-input",{staticClass:"col-xs-12 q-mb-md",attrs:{"float-label":"联系人",placeholder:"请输入联系人",before:[{icon:"person"}]},model:{value:e.order.name,callback:function(t){e.$set(e.order,"name",t)},expression:"order.name"}}),o("q-input",{staticClass:"col-xs-12 q-mb-md",attrs:{"float-label":"手机号",placeholder:"请输入手机号",before:[{icon:"phone"}]},model:{value:e.order.phone,callback:function(t){e.$set(e.order,"phone",t)},expression:"order.phone"}}),o("q-select",{staticClass:"col-xs-12 q-mb-lg",attrs:{"float-label":"车牌号",options:e.plateNumOptions,before:[{icon:"drive_eta"}],clearable:""},model:{value:e.order.platenum,callback:function(t){e.$set(e.order,"platenum",t)},expression:"order.platenum"}}),o("div",{staticClass:"row col-xs-12"},[o("p",{staticClass:"caption"},[e._v("安检:")])]),o("q-select",{staticClass:"col-xs-12 q-mb-lg",attrs:{"float-label":"车辆类型",options:e.vehicleOptions,before:[{icon:"format_list_bulleted"}],clearable:""},model:{value:e.vehicleType,callback:function(t){e.vehicleType=t},expression:"vehicleType"}}),o("div",{staticClass:"row q-mb-lg gutter-xl"},[o("q-checkbox",{staticClass:"col q-mr-md",attrs:{val:"路试(100)",color:"amber","left-label":"",label:"路试(100)"},model:{value:e.secuAddition,callback:function(t){e.secuAddition=t},expression:"secuAddition"}}),o("q-checkbox",{staticClass:"col",attrs:{val:"称重(100)",color:"amber","left-label":"",label:"称重(100)"},model:{value:e.secuAddition,callback:function(t){e.secuAddition=t},expression:"secuAddition"}})],1),o("div",{staticClass:"row col-xs-12"},[o("p",{staticClass:"caption"},[e._v("环检:")])]),o("q-select",{staticClass:"col-xs-12 q-mb-lg",attrs:{"float-label":"燃油类型",options:e.fuelOptions,before:[{icon:"format_list_bulleted"}],clearable:""},model:{value:e.order.fuelType,callback:function(t){e.$set(e.order,"fuelType",t)},expression:"order.fuelType"}}),"汽油、天然气、电"==e.order.fuelType?o("div",{staticClass:"col-xs-12 row q-mb-lg gutter-y-sm"},[o("div",{staticClass:"col"},[o("q-radio",{attrs:{val:"初检(90)",color:"amber",label:"初检(90)"},model:{value:e.envCheckType,callback:function(t){e.envCheckType=t},expression:"envCheckType"}})],1),o("div",{staticClass:"col"},[o("q-radio",{attrs:{val:"一次复检(0)",color:"amber",label:"一次复检(0)"},model:{value:e.envCheckType,callback:function(t){e.envCheckType=t},expression:"envCheckType"}})],1),o("div",{staticClass:"col"},[o("q-radio",{attrs:{val:"二次复检(45)",color:"amber",label:"二次复检(45)"},model:{value:e.envCheckType,callback:function(t){e.envCheckType=t},expression:"envCheckType"}})],1),o("div",{staticClass:"col"},[o("q-radio",{attrs:{val:"三次复检(90)",color:"amber",label:"三次复检(90)"},model:{value:e.envCheckType,callback:function(t){e.envCheckType=t},expression:"envCheckType"}})],1)]):e._e(),"柴油"==e.order.fuelType?o("div",{staticClass:"row q-mb-lg gutter-y-sm"},[o("q-radio",{staticClass:"col",attrs:{val:"初检(60)",color:"amber",label:"初检(60)"},model:{value:e.envCheckType,callback:function(t){e.envCheckType=t},expression:"envCheckType"}}),o("q-radio",{staticClass:"col",attrs:{val:"一次复检(0)",color:"amber",label:"一次复检(0)"},model:{value:e.envCheckType,callback:function(t){e.envCheckType=t},expression:"envCheckType"}}),o("q-radio",{staticClass:"col",attrs:{val:"二次复检(30)",color:"amber",label:"二次复检(30)"},model:{value:e.envCheckType,callback:function(t){e.envCheckType=t},expression:"envCheckType"}}),o("q-radio",{staticClass:"col",attrs:{val:"三次复检(60)",color:"amber",label:"三次复检(60)"},model:{value:e.envCheckType,callback:function(t){e.envCheckType=t},expression:"envCheckType"}})],1):e._e(),o("q-datetime",{staticClass:"col-xs-12 q-mb-lg",attrs:{clearable:"","float-label":"预约时间",type:"datetime",before:[{icon:"date_range"}],"first-day-of-week":1,color:"light-blue","format-model":"number",min:e.settings.startDate,max:e.settings.endDate},model:{value:e.order.orderDate,callback:function(t){e.$set(e.order,"orderDate",t)},expression:"order.orderDate"}}),o("div",{staticClass:"row q-mb-lg gutter-xl"},[o("q-radio",{staticClass:"col",attrs:{val:"网上缴费",color:"amber","left-label":"",label:"网上缴费"},model:{value:e.order.paymentMethod,callback:function(t){e.$set(e.order,"paymentMethod",t)},expression:"order.paymentMethod"}}),o("q-radio",{staticClass:"col",attrs:{val:"现场缴费",color:"amber","left-label":"",label:"现场缴费"},model:{value:e.order.paymentMethod,callback:function(t){e.$set(e.order,"paymentMethod",t)},expression:"order.paymentMethod"}})],1),o("q-btn",{staticClass:"full-width",attrs:{loading:e.btnLoading,color:"positive",label:"预约"},on:{click:e.addOrder}})],1)])},a=[];r._withStripped=!0;o("KKXr"),o("f3/d");var s=o("MVZn"),i=o.n(s),l=o("SQGN"),n=function(e,t){return Math.floor(Math.random()*(t-e)+e)+""},c=o("L2JU"),d=o("ta7f"),u=new Date,p={data:function(){return{today:u,vehicleType:"",envCheckType:"",order:{name:"",phone:"",customerId:"",platenum:"",vehicleType:"",secuAddition:"",fuelType:"",envCheckType:"",orderDate:null,paymentMethod:"",payStatus:"未支付",orderNum:"",vehicleTypeFee:0,secuAdditionFee:0,envCheckTypeFee:0,totalFee:0},settings:{startDate:u,endDate:null,hourAmount:25},plateNumOptions:[],vehicleOptions:[{label:"小、微型汽车(1)",value:"小、微型汽车(1)"},{label:"轻型汽车(210)",value:"轻型汽车(210)"},{label:"中型汽车(290)",value:"中型汽车(290)"},{label:"重型半挂车、中型半挂车、轻型半挂车(300)",value:"重型半挂车、中型半挂车、轻型半挂车(300)"},{label:"危险品挂车(390)",value:"危险品挂车(390)"},{label:"大型、重型汽车(390)",value:"大型、重型汽车(390)"}],secuAddition:[],fuelOptions:[{label:"汽油、天然气、电",value:"汽油、天然气、电"},{label:"柴油",value:"柴油"}],btnLoading:!1}},computed:i()({},Object(c["c"])(["userInfo","registerInfo"])),validations:{order:{name:{required:d["required"]},phone:{required:d["required"]},platenum:{required:d["required"]},orderDate:{required:d["required"]},paymentMethod:{required:d["required"]}}},created:function(){var e=this;if(this.registerInfo)return this.disposeUnpaid(),void this.getSettings();this.$http.post("http://www.ytjdcjc.cn/customer/list?openid="+this.userInfo.openId).then(function(t){"200"==t.data.code&&(t.data.data?(e.$store.commit("saveRegisterInfo",t.data.data),e.disposeUnpaid(),e.getSettings()):(e.$q.notify({message:"请先登记",type:"negative",color:"negative",timeout:1e3,position:"top"}),setTimeout(function(){e.$router.push("/register")},1500)))})},methods:{disposeUnpaid:function(){var e=this;this.$http.get("http://www.ytjdcjc.cn/check/order/unpaid?customerId="+this.registerInfo.customer.id).then(function(t){"200"==t.data.code&&t.data.data&&e.$router.push({name:"预约详情",params:{orderNum:t.data.data.orderNum}})})},getSettings:function(){var e=this;this.order.name=this.registerInfo.customer.name,this.order.phone=this.registerInfo.customer.phone;for(var t=0;t<this.registerInfo.cars.length;t++){var o={label:this.registerInfo.cars[t].plateNum,value:this.registerInfo.cars[t].plateNum};this.plateNumOptions.push(o)}this.$http.post("http://www.ytjdcjc.cn/order/setting/getSettings").then(function(t){t.data.data&&(e.settings=t.data.data)})},checkOrderDate:function(e){this.$http.post("http://www.ytjdcjc.cn/check/order/checkOrderDate?orderDate="+this.order.orderDate+"&hourAmount="+this.settings.hourAmount).then(function(t){e(t.data.data)})},keyValueSplit:function(e){var t=e.split("(")[0],o=parseFloat(e.split("(")[1].split(")")[0]);return{key:t,value:o}},prepareOrder:function(){if(this.order.name=this.registerInfo.customer.name,this.order.phone=this.registerInfo.customer.phone,this.order.customerId=this.registerInfo.customer.id,this.order.orderNum=Date.now()+n(1e5,999999),""!=this.vehicleType&&(this.order.vehicleType=this.keyValueSplit(this.vehicleType).key,this.order.vehicleTypeFee=this.keyValueSplit(this.vehicleType).value),""!=this.secuAddition){for(var e=[],t=0;t<this.secuAddition.length;t++){var o=this.keyValueSplit(this.secuAddition[t]);this.order.secuAdditionFee+=o.value,e.push(o.key)}this.order.secuAddition=e.join(",")}""!=this.envCheckType&&(this.order.envCheckType=this.keyValueSplit(this.envCheckType).key,this.order.envCheckTypeFee=this.keyValueSplit(this.envCheckType).value),this.order.totalFee=this.order.vehicleTypeFee+this.order.secuAdditionFee+this.order.envCheckTypeFee},addOrder:function(){var e=this;if(this.prepareOrder(),this.$v.order.name.required)if(this.$v.order.phone.required)if(this.$v.order.platenum.required)if(this.$v.order.orderDate.required)if(this.$v.order.paymentMethod.required){if(0==this.order.totalFee)return void this.$q.notify("预约信息填写有误！");this.checkOrderDate(function(t){t?e.$q.notify(t):(e.btnLoading=!0,e.$http.post("http://www.ytjdcjc.cn/check/order/add",e.order).then(function(t){200==t.data.code?(e.btnLoading=!1,"现场缴费"==e.order.paymentMethod?e.$router.push({name:"预约详情",params:{orderNum:e.order.orderNum}}):"网上缴费"==e.order.paymentMethod&&e.$http.post("http://www.ytjdcjc.cn/pay/createOrder",{body:"JSAPITEST",outTradeNo:e.order.orderNum,totalFee:e.order.totalFee,spbillCreateIp:"218.56.36.83",notifyUrl:"http://selinplus.natappvip.cc/pay/parseOrderNotifyResult",tradeType:"JSAPI",openid:e.userInfo.openId,signType:"MD5"}).then(function(t){console.log(t.data);var o=e;l["c"](t.data,function(e){o.$router.push({name:"预约详情",params:{orderNum:o.order.orderNum}})},function(e){o.$router.push({name:"预约详情",params:{orderNum:o.order.orderNum}})})}).catch(function(e){console.log(e)})):e.$q.notify({color:"negative",icon:"mood_bad",message:t.data.message,position:"top",timeout:1e3})}).catch(function(t){e.btnLoading=!1,console.log(t)}))})}else this.$q.notify("缴费方式不能为空！");else this.$q.notify("预约时间不能为空！");else this.$q.notify("车牌号不能为空！");else this.$q.notify("手机号不能为空！");else this.$q.notify("联系人不能为空！")}}},h=p,m=(o("IdcS"),o("KHd+")),v=Object(m["a"])(h,r,a,!1,null,null,null);t["default"]=v.exports},"tWI/":function(e,t,o){}}]);