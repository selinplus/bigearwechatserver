(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([[8],{DY7K:function(t,e,a){"use strict";var n=a("N3aY"),i=a.n(n);i.a},N3aY:function(t,e,a){},ez0Y:function(t,e,a){"use strict";a.r(e);var n=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("q-layout",{attrs:{view:"lHh Lpr lFf"}},[a("q-layout-header",[a("q-toolbar",{attrs:{color:"primary",glossy:"mat"===t.$q.theme,inverted:"ios"===t.$q.theme}},[a("q-btn",{attrs:{flat:"",dense:"",round:"","aria-label":"Menu"},on:{click:function(e){t.leftDrawerOpen=!t.leftDrawerOpen}}},[a("q-icon",{attrs:{name:"menu"}})],1),t._v(" "),a("q-toolbar-title",[t._v("\n        钉钉admin\n        ")])],1)],1),t._v(" "),a("q-layout-drawer",{attrs:{"content-class":"mat"===t.$q.theme?"bg-grey-2":null},model:{value:t.leftDrawerOpen,callback:function(e){t.leftDrawerOpen=e},expression:"leftDrawerOpen"}},[a("q-list",{attrs:{"no-border":"",link:"","inset-delimiter":""}},[a("q-list-header",[t._v("admin")]),t._v(" "),a("div",{on:{click:t.clear}},[a("q-item",{attrs:{to:"/main/dataInput"}},[a("q-item-side",{attrs:{icon:"school"}}),t._v(" "),a("q-item-main",{attrs:{label:"内容录入",sublabel:"按模块录入客户端内容"}})],1)],1),t._v(" "),a("q-item",{attrs:{to:"/main/contentManage"}},[a("q-item-side",{attrs:{icon:"chat"}}),t._v(" "),a("q-item-main",{attrs:{label:"内容管理",sublabel:"客户端各模块内容管理"}})],1),t._v(" "),a("q-item",{attrs:{to:"/main/orderManage"}},[a("q-item-side",{attrs:{icon:"code"}}),t._v(" "),a("q-item-main",{attrs:{label:"预约管理",sublabel:"客户端年审预约模块管理"}})],1),t._v(" "),a("q-item",{attrs:{to:"/main/customerVoice"}},[a("q-item-side",{attrs:{icon:"settings"}}),t._v(" "),a("q-item-main",{attrs:{label:"客户之声",sublabel:"客户之声留言回复"}})],1),t._v(" "),a("q-item",{attrs:{to:"/main/setting"}},[a("q-item-side",{attrs:{icon:"settings"}}),t._v(" "),a("q-item-main",{attrs:{label:"设置",sublabel:"年审预约时间设置等"}})],1)],1)],1),t._v(" "),a("q-page-container",[a("router-view")],1)],1)},i=[];n._withStripped=!0;var r=a("4IOb"),l={name:"LayoutDefault",data:function(){return{leftDrawerOpen:this.$q.platform.is.desktop}},methods:{openURL:r["U"],clear:function(){this.$store.commit("clear")}}},s=l,o=(a("DY7K"),a("KHd+")),m=Object(o["a"])(s,n,i,!1,null,null,null);e["default"]=m.exports}}]);