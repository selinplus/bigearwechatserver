webpackJsonp([8],{JyAa:function(n,t,e){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var s={data:function(){return{items:[],totalCount:0,showSpinnerDots:!0}},methods:{loadMore:function(n,t){var e=this;console.log("pageIndex: ",n),this.$http.post("http://selinplus.natappvip.cc/module/info/list?page="+n+"&size=7").then(function(n){e.items=e.items.concat(n.data.data.list),t()}).catch(function(n){console.log(n)})},refresher:function(n){setTimeout(function(){n()},1e3)},removeHTMLTag:function(n){return n=(n=(n=(n=(n=n.replace(/<\/?[^>]*>/g,"")).replace(/[ | ]*\n/g,"\n")).replace(/\n[\s| | ]*\r/g,"\n")).replace(/&nbsp;/gi,"")).replace(/\s/g,"")}},mounted:function(){var n=this;this.$http.get("http://selinplus.natappvip.cc/module/info/totalCount").then(function(t){n.totalCount=t.data.data}).catch(function(n){console.log(n)})},updated:function(){console.log("updated",this.items.length),this.items.length>=this.totalCount&&(this.$refs.infiniteScroll.stop(),this.showSpinnerDots=!1)}},i=function(){var n=this,t=n.$createElement,e=n._self._c||t;return e("q-pull-to-refresh",{attrs:{handler:n.refresher}},[e("q-page",{attrs:{padding:""}},[e("q-list",{attrs:{"no-border":""}},[e("q-infinite-scroll",{ref:"infiniteScroll",attrs:{handler:n.loadMore}},[n._l(n.items,function(t,s){return e("q-item",{key:s,attrs:{separator:"",link:"",to:{name:"行业资讯详情",params:{id:t.id}}}},[e("q-item-main",[e("q-item-tile",{attrs:{label:""}},[n._v(n._s(t.title))]),n._v(" "),e("q-item-tile",{attrs:{sublabel:""},domProps:{innerHTML:n._s(n.removeHTMLTag(t.content).substr(0,50))}})],1)],1)}),n._v(" "),e("div",{staticClass:"row justify-center",staticStyle:{"margin-bottom":"50px"}},[n.showSpinnerDots?e("q-spinner-dots",{attrs:{slot:"message",size:40},slot:"message"}):n._e()],1)],2)],1)],1)],1)},o=[];i._withStripped=!0;var a=e("XyMi"),r=!1;var l=function(n){r||e("QWKd")},c=Object(a.a)(s,i,o,!1,l,null,null);c.options.__file="src/pages/industryInfo.vue";t.default=c.exports},NgIQ:function(n,t,e){(n.exports=e("FZ+f")(!1)).push([n.i,"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n",""])},QWKd:function(n,t,e){var s=e("NgIQ");"string"==typeof s&&(s=[[n.i,s,""]]),s.locals&&(n.exports=s.locals);(0,e("rjj0").default)("77cc9a11",s,!1,{})}});