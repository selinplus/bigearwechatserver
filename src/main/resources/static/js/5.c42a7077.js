(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([[5],{ZQTt:function(t,e,o){},s7qn:function(t,e,o){"use strict";o.r(e);var n=function(){var t=this,e=t.$createElement,o=t._self._c||e;return o("q-page",{attrs:{padding:""}},[o("div",{staticClass:"row gutter-sm"},[o("div",{staticClass:"col-xs-12 col-sm-2"},[o("q-select",{staticClass:"no-margin",attrs:{options:t.types,"float-label":"模块选择",before:[{icon:"format_list_bulleted"}],clearable:""},model:{value:t.moduleInfo.type,callback:function(e){t.$set(t.moduleInfo,"type",e)},expression:"moduleInfo.type"}})],1),t._v(" "),o("div",{staticClass:"col-xs-12 col-sm-10"},[o("q-input",{staticClass:"no-margin",attrs:{"float-label":"标题",before:[{icon:"format_list_bulleted"}]},model:{value:t.moduleInfo.title,callback:function(e){t.$set(t.moduleInfo,"title",e)},expression:"moduleInfo.title"}})],1),t._v(" "),"行业资讯"!=t.moduleInfo.type?o("div",{staticClass:"col-xs-12"},[o("q-uploader",{ref:"carouselUploader",staticClass:"q-mb-lg",attrs:{multiple:"","stack-label":"轮播图上传",url:t.uploadUrl,"auto-expand":""},on:{uploaded:t.fileUploaded}})],1):t._e(),t._v(" "),o("div",{staticClass:"col-xs-12 col-sm-12 q-mt-md"},[o("div",{staticClass:"q-mb-sm",staticStyle:{color:"rgb(153, 153, 153)"}},[t._v("内容")]),t._v(" "),o("q-editor",{attrs:{"min-height":"360px",toolbar:t.toolbarOptions,fonts:t.fonts},model:{value:t.moduleInfo.content,callback:function(e){t.$set(t.moduleInfo,"content",e)},expression:"moduleInfo.content"}})],1),t._v(" "),o("div",{staticClass:"col-12"},[o("div",{staticClass:"row justify-center"},[o("q-btn",{staticClass:"col-1",attrs:{loading:t.btnLoading,color:"positive","no-wrap":"",label:"录入"},on:{click:t.save}}),t._v(" "),o("q-btn",{staticClass:"col-1 q-ml-md",attrs:{color:"warning","no-wrap":"",label:"重置"},on:{click:t.cancel}})],1)])])])},i=[];n._withStripped=!0;var a=o("MVZn"),l=o.n(a),s=o("z0WU"),c=o("L2JU"),r={data:function(){return{btnLoading:!1,types:[{label:"关于我们",value:"关于我们"},{label:"服务特色",value:"服务特色"},{label:"客户之声",value:"客户之声"},{label:"检车流程",value:"检车流程"},{label:"行业资讯",value:"行业资讯"}],toolbarOptions:[["bold","italic","strike","underline","subscript","superscript"],["token","hr"],["fullscreen"],[{label:this.$q.i18n.editor.formatting,icon:this.$q.icon.editor.formatting,list:"no-icons",options:["p","h1","h2","h3","h4","h5","h6","code"]},{label:this.$q.i18n.editor.fontSize,icon:this.$q.icon.editor.fontSize,fixedLabel:!0,fixedIcon:!0,list:"no-icons",options:["size-1","size-2","size-3","size-4","size-5","size-6","size-7"]},{label:this.$q.i18n.editor.defaultFont,icon:this.$q.icon.editor.font,fixedIcon:!0,list:"no-icons",options:["default_font","arial","arial_black","comic_sans","courier_new","impact","lucida_grande","times_new_roman","verdana"]},"removeFormat"],["quote","unordered","ordered","outdent","indent"],[{label:this.$q.i18n.editor.align,icon:this.$q.icon.editor.align,fixedLabel:!0,list:"only-icons",options:["left","center","right","justify"]},{label:this.$q.i18n.editor.align,icon:this.$q.icon.editor.align,fixedLabel:!0,options:["left","center","right","justify"]}],["undo","redo"]],fonts:{arial:"Arial",arial_black:"Arial Black",comic_sans:"Comic Sans MS",courier_new:"Courier New",impact:"Impact",lucida_grande:"Lucida Grande",times_new_roman:"Times New Roman",verdana:"Verdana"},uploadUrl:"http://selinplus.natappvip.cc/upload",moduleInfo:{id:Date.now()+Object(s["a"])(1e5,999999),type:"",title:"",content:""},carousels:[]}},computed:l()({},Object(c["b"])(["dataInput"])),mounted:function(){console.log(this.dataInput),this.dataInput.moduleInfo&&(this.moduleInfo=this.dataInput.moduleInfo)},methods:{save:function(){console.log(this.moduleInfo),this.btnLoading=!0,this.dataInput.moduleInfo?this.update():this.add()},add:function(){var t=this;this.$http.post("http://selinplus.natappvip.cc/module/info/add",{moduleInfo:this.moduleInfo,carousels:this.carousels}).then(function(e){t.btnLoading=!1,200==e.data.code?(t.moduleInfo.id=Date.now()+Object(s["a"])(1e5,999999),t.moduleInfo.type="",t.moduleInfo.title="",t.moduleInfo.content="",t.$refs.carouselUploader&&t.$refs.carouselUploader.reset(),t.$q.notify({message:"录入成功！",color:"positive",position:"center",timeout:1e3})):(t.btnLoading=!1,t.$q.notify({message:"录入失败！",color:"negative",position:"center"}))}).catch(function(e){console.log(e),t.btnLoading=!1,t.$q.notify({message:"录入失败！",color:"negative",position:"center"})})},update:function(){var t=this;console.log(this.moduleInfo.id),this.$http.post("http://selinplus.natappvip.cc/module/info/update",this.moduleInfo).then(function(e){t.btnLoading=!1,200==e.data.code?(t.$store.commit("clear"),t.moduleInfo.id=Date.now()+Object(s["a"])(1e5,999999),t.moduleInfo.type="",t.moduleInfo.title="",t.moduleInfo.content="",t.$refs.carouselUploader&&t.$refs.carouselUploader.reset(),t.$q.notify({message:"修改成功！",color:"positive",position:"center",timeout:1e3})):(t.btnLoading=!1,t.$q.notify({message:"修改失败！",color:"negative",position:"center"}))}).catch(function(e){console.log(e),t.btnLoading=!1,t.$q.notify({message:"修改失败！",color:"negative",position:"center"})})},cancel:function(){this.moduleInfo.title="",this.moduleInfo.type="",this.moduleInfo.content=""},fileUploaded:function(t,e){var o={};o.moduleInfoId=this.moduleInfo.id,o.realname=JSON.parse(e.response).path,this.carousels.push(o)}}},d=r,u=(o("wZGn"),o("KHd+")),p=Object(u["a"])(d,n,i,!1,null,null,null);e["default"]=p.exports},wZGn:function(t,e,o){"use strict";var n=o("ZQTt"),i=o.n(n);i.a},z0WU:function(t,e,o){"use strict";o.d(e,"a",function(){return n}),o.d(e,"b",function(){return i});o("pIFo");var n=function(t,e){return Math.floor(Math.random()*(e-t)+t)+""},i=function(t){return t=t.replace(/<\/?[^>]*>/g,""),t=t.replace(/[ | ]*\n/g,"\n"),t=t.replace(/\n[\s| | ]*\r/g,"\n"),t=t.replace(/&nbsp;/gi,""),t=t.replace(/\s/g,""),t}}}]);