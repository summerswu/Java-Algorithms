<!DOCTYPE html>
<!-- saved from url=(0095)https://leetcode.com/explore/learn/card/queue-stack/228/first-in-first-out-data-structure/1337/ -->
<html class="gr__leetcode_com"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8"><style type="text/css">@charset "UTF-8";[ng\:cloak],[ng-cloak],[data-ng-cloak],[x-ng-cloak],.ng-cloak,.x-ng-cloak,.ng-hide{display:none !important;}ng\:form{display:block;}.ng-animate-block-transitions{transition:0s all!important;-webkit-transition:0s all!important;}.ng-hide-add-active,.ng-hide-remove{display:block!important;}</style>
    <script type="text/javascript" src="./circularQueue_files/8d5fb92f6e"></script><script src="./circularQueue_files/nr-1123.min.js.download"></script><script async="" src="./circularQueue_files/analytics.js.download"></script><script type="text/javascript">(window.NREUM||(NREUM={})).loader_config={xpid:"UAQDVFVRGwEAXVlbBAg="};window.NREUM||(NREUM={}),__nr_require=function(t,n,e){function r(e){if(!n[e]){var o=n[e]={exports:{}};t[e][0].call(o.exports,function(n){var o=t[e][1][n];return r(o||n)},o,o.exports)}return n[e].exports}if("function"==typeof __nr_require)return __nr_require;for(var o=0;o<e.length;o++)r(e[o]);return r}({1:[function(t,n,e){function r(t){try{s.console&&console.log(t)}catch(n){}}var o,i=t("ee"),a=t(18),s={};try{o=localStorage.getItem("__nr_flags").split(","),console&&"function"==typeof console.log&&(s.console=!0,o.indexOf("dev")!==-1&&(s.dev=!0),o.indexOf("nr_dev")!==-1&&(s.nrDev=!0))}catch(c){}s.nrDev&&i.on("internal-error",function(t){r(t.stack)}),s.dev&&i.on("fn-err",function(t,n,e){r(e.stack)}),s.dev&&(r("NR AGENT IN DEVELOPMENT MODE"),r("flags: "+a(s,function(t,n){return t}).join(", ")))},{}],2:[function(t,n,e){function r(t,n,e,r,s){try{p?p-=1:o(s||new UncaughtException(t,n,e),!0)}catch(f){try{i("ierr",[f,c.now(),!0])}catch(d){}}return"function"==typeof u&&u.apply(this,a(arguments))}function UncaughtException(t,n,e){this.message=t||"Uncaught error with no additional information",this.sourceURL=n,this.line=e}function o(t,n){var e=n?null:c.now();i("err",[t,e])}var i=t("handle"),a=t(19),s=t("ee"),c=t("loader"),f=t("gos"),u=window.onerror,d=!1,l="nr@seenError",p=0;c.features.err=!0,t(1),window.onerror=r;try{throw new Error}catch(h){"stack"in h&&(t(8),t(7),"addEventListener"in window&&t(5),c.xhrWrappable&&t(9),d=!0)}s.on("fn-start",function(t,n,e){d&&(p+=1)}),s.on("fn-err",function(t,n,e){d&&!e[l]&&(f(e,l,function(){return!0}),this.thrown=!0,o(e))}),s.on("fn-end",function(){d&&!this.thrown&&p>0&&(p-=1)}),s.on("internal-error",function(t){i("ierr",[t,c.now(),!0])})},{}],3:[function(t,n,e){t("loader").features.ins=!0},{}],4:[function(t,n,e){function r(t){}if(window.performance&&window.performance.timing&&window.performance.getEntriesByType){var o=t("ee"),i=t("handle"),a=t(8),s=t(7),c="learResourceTimings",f="addEventListener",u="resourcetimingbufferfull",d="bstResource",l="resource",p="-start",h="-end",m="fn"+p,w="fn"+h,v="bstTimer",y="pushState",g=t("loader");g.features.stn=!0,t(6);var x=NREUM.o.EV;o.on(m,function(t,n){var e=t[0];e instanceof x&&(this.bstStart=g.now())}),o.on(w,function(t,n){var e=t[0];e instanceof x&&i("bst",[e,n,this.bstStart,g.now()])}),a.on(m,function(t,n,e){this.bstStart=g.now(),this.bstType=e}),a.on(w,function(t,n){i(v,[n,this.bstStart,g.now(),this.bstType])}),s.on(m,function(){this.bstStart=g.now()}),s.on(w,function(t,n){i(v,[n,this.bstStart,g.now(),"requestAnimationFrame"])}),o.on(y+p,function(t){this.time=g.now(),this.startPath=location.pathname+location.hash}),o.on(y+h,function(t){i("bstHist",[location.pathname+location.hash,this.startPath,this.time])}),f in window.performance&&(window.performance["c"+c]?window.performance[f](u,function(t){i(d,[window.performance.getEntriesByType(l)]),window.performance["c"+c]()},!1):window.performance[f]("webkit"+u,function(t){i(d,[window.performance.getEntriesByType(l)]),window.performance["webkitC"+c]()},!1)),document[f]("scroll",r,{passive:!0}),document[f]("keypress",r,!1),document[f]("click",r,!1)}},{}],5:[function(t,n,e){function r(t){for(var n=t;n&&!n.hasOwnProperty(u);)n=Object.getPrototypeOf(n);n&&o(n)}function o(t){s.inPlace(t,[u,d],"-",i)}function i(t,n){return t[1]}var a=t("ee").get("events"),s=t(21)(a,!0),c=t("gos"),f=XMLHttpRequest,u="addEventListener",d="removeEventListener";n.exports=a,"getPrototypeOf"in Object?(r(document),r(window),r(f.prototype)):f.prototype.hasOwnProperty(u)&&(o(window),o(f.prototype)),a.on(u+"-start",function(t,n){var e=t[1],r=c(e,"nr@wrapped",function(){function t(){if("function"==typeof e.handleEvent)return e.handleEvent.apply(e,arguments)}var n={object:t,"function":e}[typeof e];return n?s(n,"fn-",null,n.name||"anonymous"):e});this.wrapped=t[1]=r}),a.on(d+"-start",function(t){t[1]=this.wrapped||t[1]})},{}],6:[function(t,n,e){var r=t("ee").get("history"),o=t(21)(r);n.exports=r,o.inPlace(window.history,["pushState","replaceState"],"-")},{}],7:[function(t,n,e){var r=t("ee").get("raf"),o=t(21)(r),i="equestAnimationFrame";n.exports=r,o.inPlace(window,["r"+i,"mozR"+i,"webkitR"+i,"msR"+i],"raf-"),r.on("raf-start",function(t){t[0]=o(t[0],"fn-")})},{}],8:[function(t,n,e){function r(t,n,e){t[0]=a(t[0],"fn-",null,e)}function o(t,n,e){this.method=e,this.timerDuration=isNaN(t[1])?0:+t[1],t[0]=a(t[0],"fn-",this,e)}var i=t("ee").get("timer"),a=t(21)(i),s="setTimeout",c="setInterval",f="clearTimeout",u="-start",d="-";n.exports=i,a.inPlace(window,[s,"setImmediate"],s+d),a.inPlace(window,[c],c+d),a.inPlace(window,[f,"clearImmediate"],f+d),i.on(c+u,r),i.on(s+u,o)},{}],9:[function(t,n,e){function r(t,n){d.inPlace(n,["onreadystatechange"],"fn-",s)}function o(){var t=this,n=u.context(t);t.readyState>3&&!n.resolved&&(n.resolved=!0,u.emit("xhr-resolved",[],t)),d.inPlace(t,y,"fn-",s)}function i(t){g.push(t),h&&(b?b.then(a):w?w(a):(E=-E,R.data=E))}function a(){for(var t=0;t<g.length;t++)r([],g[t]);g.length&&(g=[])}function s(t,n){return n}function c(t,n){for(var e in t)n[e]=t[e];return n}t(5);var f=t("ee"),u=f.get("xhr"),d=t(21)(u),l=NREUM.o,p=l.XHR,h=l.MO,m=l.PR,w=l.SI,v="readystatechange",y=["onload","onerror","onabort","onloadstart","onloadend","onprogress","ontimeout"],g=[];n.exports=u;var x=window.XMLHttpRequest=function(t){var n=new p(t);try{u.emit("new-xhr",[n],n),n.addEventListener(v,o,!1)}catch(e){try{u.emit("internal-error",[e])}catch(r){}}return n};if(c(p,x),x.prototype=p.prototype,d.inPlace(x.prototype,["open","send"],"-xhr-",s),u.on("send-xhr-start",function(t,n){r(t,n),i(n)}),u.on("open-xhr-start",r),h){var b=m&&m.resolve();if(!w&&!m){var E=1,R=document.createTextNode(E);new h(a).observe(R,{characterData:!0})}}else f.on("fn-end",function(t){t[0]&&t[0].type===v||a()})},{}],10:[function(t,n,e){function r(){var t=window.NREUM,n=t.info.accountID||null,e=t.info.agentID||null,r=t.info.trustKey||null,i="btoa"in window&&"function"==typeof window.btoa;if(!n||!e||!i)return null;var a={v:[0,1],d:{ty:"Browser",ac:n,ap:e,id:o.generateCatId(),tr:o.generateCatId(),ti:Date.now()}};return r&&n!==r&&(a.d.tk=r),btoa(JSON.stringify(a))}var o=t(16);n.exports={generateTraceHeader:r}},{}],11:[function(t,n,e){function r(t){var n=this.params,e=this.metrics;if(!this.ended){this.ended=!0;for(var r=0;r<p;r++)t.removeEventListener(l[r],this.listener,!1);n.aborted||(e.duration=s.now()-this.startTime,this.loadCaptureCalled||4!==t.readyState?null==n.status&&(n.status=0):a(this,t),e.cbTime=this.cbTime,d.emit("xhr-done",[t],t),c("xhr",[n,e,this.startTime]))}}function o(t,n){var e=t.responseType;if("json"===e&&null!==n)return n;var r="arraybuffer"===e||"blob"===e||"json"===e?t.response:t.responseText;return w(r)}function i(t,n){var e=f(n),r=t.params;r.host=e.hostname+":"+e.port,r.pathname=e.pathname,t.sameOrigin=e.sameOrigin}function a(t,n){t.params.status=n.status;var e=o(n,t.lastSize);if(e&&(t.metrics.rxSize=e),t.sameOrigin){var r=n.getResponseHeader("X-NewRelic-App-Data");r&&(t.params.cat=r.split(", ").pop())}t.loadCaptureCalled=!0}var s=t("loader");if(s.xhrWrappable){var c=t("handle"),f=t(12),u=t(10).generateTraceHeader,d=t("ee"),l=["load","error","abort","timeout"],p=l.length,h=t("id"),m=t(15),w=t(14),v=window.XMLHttpRequest;s.features.xhr=!0,t(9),d.on("new-xhr",function(t){var n=this;n.totalCbs=0,n.called=0,n.cbTime=0,n.end=r,n.ended=!1,n.xhrGuids={},n.lastSize=null,n.loadCaptureCalled=!1,t.addEventListener("load",function(e){a(n,t)},!1),m&&(m>34||m<10)||window.opera||t.addEventListener("progress",function(t){n.lastSize=t.loaded},!1)}),d.on("open-xhr-start",function(t){this.params={method:t[0]},i(this,t[1]),this.metrics={}}),d.on("open-xhr-end",function(t,n){"loader_config"in NREUM&&"xpid"in NREUM.loader_config&&this.sameOrigin&&n.setRequestHeader("X-NewRelic-ID",NREUM.loader_config.xpid);var e=!1;if("init"in NREUM&&"distributed_tracing"in NREUM.init&&(e=!!NREUM.init.distributed_tracing.enabled),e&&this.sameOrigin){var r=u();r&&n.setRequestHeader("newrelic",r)}}),d.on("send-xhr-start",function(t,n){var e=this.metrics,r=t[0],o=this;if(e&&r){var i=w(r);i&&(e.txSize=i)}this.startTime=s.now(),this.listener=function(t){try{"abort"!==t.type||o.loadCaptureCalled||(o.params.aborted=!0),("load"!==t.type||o.called===o.totalCbs&&(o.onloadCalled||"function"!=typeof n.onload))&&o.end(n)}catch(e){try{d.emit("internal-error",[e])}catch(r){}}};for(var a=0;a<p;a++)n.addEventListener(l[a],this.listener,!1)}),d.on("xhr-cb-time",function(t,n,e){this.cbTime+=t,n?this.onloadCalled=!0:this.called+=1,this.called!==this.totalCbs||!this.onloadCalled&&"function"==typeof e.onload||this.end(e)}),d.on("xhr-load-added",function(t,n){var e=""+h(t)+!!n;this.xhrGuids&&!this.xhrGuids[e]&&(this.xhrGuids[e]=!0,this.totalCbs+=1)}),d.on("xhr-load-removed",function(t,n){var e=""+h(t)+!!n;this.xhrGuids&&this.xhrGuids[e]&&(delete this.xhrGuids[e],this.totalCbs-=1)}),d.on("addEventListener-end",function(t,n){n instanceof v&&"load"===t[0]&&d.emit("xhr-load-added",[t[1],t[2]],n)}),d.on("removeEventListener-end",function(t,n){n instanceof v&&"load"===t[0]&&d.emit("xhr-load-removed",[t[1],t[2]],n)}),d.on("fn-start",function(t,n,e){n instanceof v&&("onload"===e&&(this.onload=!0),("load"===(t[0]&&t[0].type)||this.onload)&&(this.xhrCbStart=s.now()))}),d.on("fn-end",function(t,n){this.xhrCbStart&&d.emit("xhr-cb-time",[s.now()-this.xhrCbStart,this.onload,n],n)})}},{}],12:[function(t,n,e){n.exports=function(t){var n=document.createElement("a"),e=window.location,r={};n.href=t,r.port=n.port;var o=n.href.split("://");!r.port&&o[1]&&(r.port=o[1].split("/")[0].split("@").pop().split(":")[1]),r.port&&"0"!==r.port||(r.port="https"===o[0]?"443":"80"),r.hostname=n.hostname||e.hostname,r.pathname=n.pathname,r.protocol=o[0],"/"!==r.pathname.charAt(0)&&(r.pathname="/"+r.pathname);var i=!n.protocol||":"===n.protocol||n.protocol===e.protocol,a=n.hostname===document.domain&&n.port===e.port;return r.sameOrigin=i&&(!n.hostname||a),r}},{}],13:[function(t,n,e){function r(){}function o(t,n,e){return function(){return i(t,[f.now()].concat(s(arguments)),n?null:this,e),n?void 0:this}}var i=t("handle"),a=t(18),s=t(19),c=t("ee").get("tracer"),f=t("loader"),u=NREUM;"undefined"==typeof window.newrelic&&(newrelic=u);var d=["setPageViewName","setCustomAttribute","setErrorHandler","finished","addToTrace","inlineHit","addRelease"],l="api-",p=l+"ixn-";a(d,function(t,n){u[n]=o(l+n,!0,"api")}),u.addPageAction=o(l+"addPageAction",!0),u.setCurrentRouteName=o(l+"routeName",!0),n.exports=newrelic,u.interaction=function(){return(new r).get()};var h=r.prototype={createTracer:function(t,n){var e={},r=this,o="function"==typeof n;return i(p+"tracer",[f.now(),t,e],r),function(){if(c.emit((o?"":"no-")+"fn-start",[f.now(),r,o],e),o)try{return n.apply(this,arguments)}catch(t){throw c.emit("fn-err",[arguments,this,t],e),t}finally{c.emit("fn-end",[f.now()],e)}}}};a("actionText,setName,setAttribute,save,ignore,onEnd,getContext,end,get".split(","),function(t,n){h[n]=o(p+n)}),newrelic.noticeError=function(t,n){"string"==typeof t&&(t=new Error(t)),i("err",[t,f.now(),!1,n])}},{}],14:[function(t,n,e){n.exports=function(t){if("string"==typeof t&&t.length)return t.length;if("object"==typeof t){if("undefined"!=typeof ArrayBuffer&&t instanceof ArrayBuffer&&t.byteLength)return t.byteLength;if("undefined"!=typeof Blob&&t instanceof Blob&&t.size)return t.size;if(!("undefined"!=typeof FormData&&t instanceof FormData))try{return JSON.stringify(t).length}catch(n){return}}}},{}],15:[function(t,n,e){var r=0,o=navigator.userAgent.match(/Firefox[\/\s](\d+\.\d+)/);o&&(r=+o[1]),n.exports=r},{}],16:[function(t,n,e){function r(){function t(){return n?15&n[e++]:16*Math.random()|0}var n=null,e=0,r=window.crypto||window.msCrypto;r&&r.getRandomValues&&(n=r.getRandomValues(new Uint8Array(31)));for(var o,i="xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx",a="",s=0;s<i.length;s++)o=i[s],"x"===o?a+=t().toString(16):"y"===o?(o=3&t()|8,a+=o.toString(16)):a+=o;return a}function o(){function t(){return n?15&n[e++]:16*Math.random()|0}var n=null,e=0,r=window.crypto||window.msCrypto;r&&r.getRandomValues&&Uint8Array&&(n=r.getRandomValues(new Uint8Array(31)));for(var o=[],i=0;i<16;i++)o.push(t().toString(16));return o.join("")}n.exports={generateUuid:r,generateCatId:o}},{}],17:[function(t,n,e){function r(t,n){if(!o)return!1;if(t!==o)return!1;if(!n)return!0;if(!i)return!1;for(var e=i.split("."),r=n.split("."),a=0;a<r.length;a++)if(r[a]!==e[a])return!1;return!0}var o=null,i=null,a=/Version\/(\S+)\s+Safari/;if(navigator.userAgent){var s=navigator.userAgent,c=s.match(a);c&&s.indexOf("Chrome")===-1&&s.indexOf("Chromium")===-1&&(o="Safari",i=c[1])}n.exports={agent:o,version:i,match:r}},{}],18:[function(t,n,e){function r(t,n){var e=[],r="",i=0;for(r in t)o.call(t,r)&&(e[i]=n(r,t[r]),i+=1);return e}var o=Object.prototype.hasOwnProperty;n.exports=r},{}],19:[function(t,n,e){function r(t,n,e){n||(n=0),"undefined"==typeof e&&(e=t?t.length:0);for(var r=-1,o=e-n||0,i=Array(o<0?0:o);++r<o;)i[r]=t[n+r];return i}n.exports=r},{}],20:[function(t,n,e){n.exports={exists:"undefined"!=typeof window.performance&&window.performance.timing&&"undefined"!=typeof window.performance.timing.navigationStart}},{}],21:[function(t,n,e){function r(t){return!(t&&t instanceof Function&&t.apply&&!t[a])}var o=t("ee"),i=t(19),a="nr@original",s=Object.prototype.hasOwnProperty,c=!1;n.exports=function(t,n){function e(t,n,e,o){function nrWrapper(){var r,a,s,c;try{a=this,r=i(arguments),s="function"==typeof e?e(r,a):e||{}}catch(f){l([f,"",[r,a,o],s])}u(n+"start",[r,a,o],s);try{return c=t.apply(a,r)}catch(d){throw u(n+"err",[r,a,d],s),d}finally{u(n+"end",[r,a,c],s)}}return r(t)?t:(n||(n=""),nrWrapper[a]=t,d(t,nrWrapper),nrWrapper)}function f(t,n,o,i){o||(o="");var a,s,c,f="-"===o.charAt(0);for(c=0;c<n.length;c++)s=n[c],a=t[s],r(a)||(t[s]=e(a,f?s+o:o,i,s))}function u(e,r,o){if(!c||n){var i=c;c=!0;try{t.emit(e,r,o,n)}catch(a){l([a,e,r,o])}c=i}}function d(t,n){if(Object.defineProperty&&Object.keys)try{var e=Object.keys(t);return e.forEach(function(e){Object.defineProperty(n,e,{get:function(){return t[e]},set:function(n){return t[e]=n,n}})}),n}catch(r){l([r])}for(var o in t)s.call(t,o)&&(n[o]=t[o]);return n}function l(n){try{t.emit("internal-error",n)}catch(e){}}return t||(t=o),e.inPlace=f,e.flag=a,e}},{}],ee:[function(t,n,e){function r(){}function o(t){function n(t){return t&&t instanceof r?t:t?c(t,s,i):i()}function e(e,r,o,i){if(!l.aborted||i){t&&t(e,r,o);for(var a=n(o),s=m(e),c=s.length,f=0;f<c;f++)s[f].apply(a,r);var d=u[g[e]];return d&&d.push([x,e,r,a]),a}}function p(t,n){y[t]=m(t).concat(n)}function h(t,n){var e=y[t];if(e)for(var r=0;r<e.length;r++)e[r]===n&&e.splice(r,1)}function m(t){return y[t]||[]}function w(t){return d[t]=d[t]||o(e)}function v(t,n){f(t,function(t,e){n=n||"feature",g[e]=n,n in u||(u[n]=[])})}var y={},g={},x={on:p,addEventListener:p,removeEventListener:h,emit:e,get:w,listeners:m,context:n,buffer:v,abort:a,aborted:!1};return x}function i(){return new r}function a(){(u.api||u.feature)&&(l.aborted=!0,u=l.backlog={})}var s="nr@context",c=t("gos"),f=t(18),u={},d={},l=n.exports=o();l.backlog=u},{}],gos:[function(t,n,e){function r(t,n,e){if(o.call(t,n))return t[n];var r=e();if(Object.defineProperty&&Object.keys)try{return Object.defineProperty(t,n,{value:r,writable:!0,enumerable:!1}),r}catch(i){}return t[n]=r,r}var o=Object.prototype.hasOwnProperty;n.exports=r},{}],handle:[function(t,n,e){function r(t,n,e,r){o.buffer([t],r),o.emit(t,n,e)}var o=t("ee").get("handle");n.exports=r,r.ee=o},{}],id:[function(t,n,e){function r(t){var n=typeof t;return!t||"object"!==n&&"function"!==n?-1:t===window?0:a(t,i,function(){return o++})}var o=1,i="nr@id",a=t("gos");n.exports=r},{}],loader:[function(t,n,e){function r(){if(!E++){var t=b.info=NREUM.info,n=p.getElementsByTagName("script")[0];if(setTimeout(u.abort,3e4),!(t&&t.licenseKey&&t.applicationID&&n))return u.abort();f(g,function(n,e){t[n]||(t[n]=e)}),c("mark",["onload",a()+b.offset],null,"api");var e=p.createElement("script");e.src="https://"+t.agent,n.parentNode.insertBefore(e,n)}}function o(){"complete"===p.readyState&&i()}function i(){c("mark",["domContent",a()+b.offset],null,"api")}function a(){return R.exists&&performance.now?Math.round(performance.now()):(s=Math.max((new Date).getTime(),s))-b.offset}var s=(new Date).getTime(),c=t("handle"),f=t(18),u=t("ee"),d=t(17),l=window,p=l.document,h="addEventListener",m="attachEvent",w=l.XMLHttpRequest,v=w&&w.prototype;NREUM.o={ST:setTimeout,SI:l.setImmediate,CT:clearTimeout,XHR:w,REQ:l.Request,EV:l.Event,PR:l.Promise,MO:l.MutationObserver};var y=""+location,g={beacon:"bam.nr-data.net",errorBeacon:"bam.nr-data.net",agent:"js-agent.newrelic.com/nr-1123.min.js"},x=w&&v&&v[h]&&!/CriOS/.test(navigator.userAgent),b=n.exports={offset:s,now:a,origin:y,features:{},xhrWrappable:x,userAgent:d};t(13),p[h]?(p[h]("DOMContentLoaded",i,!1),l[h]("load",r,!1)):(p[m]("onreadystatechange",o),l[m]("onload",r)),c("mark",["firstbyte",s],null,"api");var E=0,R=t(20)},{}]},{},["loader",2,11,4,3]);</script><script type="text/javascript">window.NREUM||(NREUM={});NREUM.info={"beacon":"bam.nr-data.net","errorBeacon":"bam.nr-data.net","licenseKey":"8d5fb92f6e","applicationID":"2098939","transactionName":"ZwMAYEdSCktRWxZRXV5JJEFbUBBRX1ZNXFhRCAVbG0UNXUdLTF9XXgMQXVYdBllDXVhsV10WDlVBVjJRVU9MX1dE","queueTime":0,"applicationTime":57,"agent":""}</script>
    <title>Explore - LeetCode</title>
    <meta property="og:title" content="Explore - LeetCode">

    
    <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no, viewport-fit=cover" name="viewport">
    
    <meta name="description" content="
LeetCode Explore is the best place for everyone to start practicing and learning on LeetCode. No matter if you are a beginner or a master, there are always new topics waiting for you to explore.">
    
    <meta property="og:image" content="/static/images/LeetCode_Sharing.png">
    <meta property="og:description" content="
LeetCode Explore is the best place for everyone to start practicing and learning on LeetCode. No matter if you are a beginner or a master, there are always new topics waiting for you to explore.">

    

    <link rel="apple-touch-icon" sizes="57x57" href="https://leetcode.com/apple-touch-icon-57x57.png">
    <link rel="apple-touch-icon" sizes="60x60" href="https://leetcode.com/apple-touch-icon-60x60.png">
    <link rel="apple-touch-icon" sizes="72x72" href="https://leetcode.com/apple-touch-icon-72x72.png">
    <link rel="apple-touch-icon" sizes="76x76" href="https://leetcode.com/apple-touch-icon-76x76.png">
    <link rel="apple-touch-icon" sizes="114x114" href="https://leetcode.com/apple-touch-icon-114x114.png">
    <link rel="apple-touch-icon" sizes="120x120" href="https://leetcode.com/apple-touch-icon-120x120.png">
    <link rel="apple-touch-icon" sizes="144x144" href="https://leetcode.com/apple-touch-icon-144x144.png">
    <link rel="apple-touch-icon" sizes="152x152" href="https://leetcode.com/apple-touch-icon-152x152.png">
    <link rel="apple-touch-icon" sizes="180x180" href="https://leetcode.com/apple-touch-icon-180x180.png">
    <link rel="icon" type="image/png" href="https://leetcode.com/favicon-16x16.png" sizes="16x16">
    <link rel="icon" type="image/png" href="https://leetcode.com/favicon-32x32.png" sizes="32x32">
    <link rel="icon" type="image/png" href="https://leetcode.com/favicon-96x96.png" sizes="96x96">
    <link rel="icon" type="image/png" href="https://leetcode.com/favicon-160x160.png" sizes="160x160">
    <link rel="icon" type="image/png" href="https://leetcode.com/favicon-192x192.png" sizes="192x192">
    <meta name="application-name" content="LeetCode">
    <meta name="msapplication-TileColor" content="#da532c">
    <meta name="msapplication-TileImage" content="/mstile-144x144.png">

    

    <script>
  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o)
  ,m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a
  ,m)})(window,document,'script','//www.google-analytics.com/analytics.js','ga'
  );
  ga('create', 'UA-6849839-6', 'leetcode.com');
  ga('require', 'displayfeatures');
  ga('send', 'pageview');
</script>

    <link href="./circularQueue_files/bootstrap.min.css" rel="stylesheet">
    <link href="./circularQueue_files/font-awesome.min.css" rel="stylesheet">
    <link href="./circularQueue_files/bootstrap-table.min.css" rel="stylesheet">

    

    <link rel="stylesheet" href="./circularQueue_files/d004efacfbfe.css" type="text/css">

    

    
<link rel="stylesheet" href="./circularQueue_files/katex.min.css">
<script type="text/x-mathjax-config;executed=true">
  MathJax.Hub.Config({
    skipStartupTypeset: true,
    showMathMenu: false,
    config: ['MMLorHTML.js'],
    jax: ['input/TeX','input/MathML','input/AsciiMath','output/HTML-CSS','output/NativeMML', 'output/PreviewHTML'],
    extensions: ['tex2jax.js','mml2jax.js','asciimath2jax.js','MathMenu.js','MathZoom.js', 'fast-preview.js', 'AssistiveMML.js', 'a11y/accessibility-menu.js'],
    TeX: {
      extensions: ['AMSmath.js','AMSsymbols.js','noErrors.js','noUndefined.js', 'enclose.js']
    }
  });
</script>


    
  <link rel="stylesheet" href="./circularQueue_files/56fb78573a7e.css" type="text/css">


    <script type="text/javascript" src="./circularQueue_files/552cba795668.js.download"></script>
    <script src="./circularQueue_files/jquery.min.js.download"></script>
    <script src="./circularQueue_files/jquery.cookie.js.download"></script>
    <script src="./circularQueue_files/jquery.sticky.js.download"></script>
    <script src="./circularQueue_files/clipboard.min.js.download"></script>
    <script src="./circularQueue_files/sweetalert2.min.js.download"></script>
    <script>
      $(document).ready(function(){
        $('.sticky').sticky({topSpacing:0});
      });

      
      
      
      window.LeetCodeData = {
        features: {
          questionTranslation: false,
          subscription: true,
          signUp: true,
          chinaProblemDiscuss: false,
          enableSharedWorker: true,
          enableChannels: false,
          enableDangerZone: true,
          enableCnJobs: false,
        },
        regionInfo: "US",
        userStatus: {
          isSignedIn: true,
          optedIn:  true ,
          isPremium: false,
          isAdmin:  false ,
          isStaff:  false ,
          isTranslator:  false ,
          isSuperuser:  false ,
          request_region: 'US',
          region: '',
          permissions: [],
          
            realName: '',
            username: 'summerswu',
            userSlug: 'summerswu',
            avatar: 'https://www.gravatar.com/avatar/f85a10db30647f3297bdd1f5aac199c5.png?s=200',
            numUnreadNotifications: 0,
            lastModified: 1543006091,
          
          
        },
        chinaURL: "https://leetcode-cn.com",
        websocketUrl: "wss://sockets.leetcode.com",
        navbar: {
          
            loginSocial: [{"id": "linkedin", "login_url": "/accounts/linkedin/login/"}, {"id": "google", "login_url": "/accounts/google/login/"}, {"id": "github", "login_url": "/accounts/github/login/"}, {"id": "facebook", "login_url": "/accounts/facebook/login/"}],
          
          loginNext: undefined,
          subscription: true,
          mi: true,
          miNext: true,
          contest: true,
          discuss: true,
          store: true,
          book: true,
          translate: false,
          identity:  "" ,
        },
      };
    </script>
    <script src="./circularQueue_files/angular.min.js.download"></script>
    <script src="./circularQueue_files/jquery-ui.min.js.download"></script>
    <script src="./circularQueue_files/noty.min.js.download"></script>
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="/static/html5shiv/dist/html5shiv.min.js"></script>
      <script src="/static/respond.js/dest/respond.min.js"></script>
    <![endif]-->

    
  <script>
    $(document).ready(function() {
      var time_diff = new Date() - new Date(localStorage.getItem('region_switcher_last_close_ts'))
      if (time_diff > 86400000) {  // 86400000ms == 1day
        $("#region_switcher").removeClass('hide');
      }
    });

    function openNavList() {
      var menu = $('#nav-menu-btn');
      var navbar = $('.navbar-collapse');
      if(!navbar.hasClass('collapsing')) {
        if(navbar.hasClass('in')) {
          menu.removeClass('open');
        } else {
          menu.addClass('open');
        }
      }
    };

    function closeRegion() {
      $("#region_switcher").addClass('hide');
      localStorage.setItem('region_switcher_last_close_ts', new Date());
    }
  </script>

  <style type="text/css">/**
 * React Select
 * ============
 * Created by Jed Watson and Joss Mackison for KeystoneJS, http://www.keystonejs.com/
 * https://twitter.com/jedwatson https://twitter.com/jossmackison https://twitter.com/keystonejs
 * MIT License: https://github.com/JedWatson/react-select
*/
.Select {
  position: relative;
}
.Select input::-webkit-contacts-auto-fill-button,
.Select input::-webkit-credentials-auto-fill-button {
  display: none !important;
}
.Select input::-ms-clear {
  display: none !important;
}
.Select input::-ms-reveal {
  display: none !important;
}
.Select,
.Select div,
.Select input,
.Select span {
  -webkit-box-sizing: border-box;
  box-sizing: border-box;
}
.Select.is-disabled .Select-arrow-zone {
  cursor: default;
  pointer-events: none;
  opacity: 0.35;
}
.Select.is-disabled > .Select-control {
  background-color: #f9f9f9;
}
.Select.is-disabled > .Select-control:hover {
  -webkit-box-shadow: none;
          box-shadow: none;
}
.Select.is-open > .Select-control {
  border-bottom-right-radius: 0;
  border-bottom-left-radius: 0;
  background: #fff;
  border-color: #b3b3b3 #ccc #d9d9d9;
}
.Select.is-open > .Select-control .Select-arrow {
  top: -2px;
  border-color: transparent transparent #999;
  border-width: 0 5px 5px;
}
.Select.is-searchable.is-open > .Select-control {
  cursor: text;
}
.Select.is-searchable.is-focused:not(.is-open) > .Select-control {
  cursor: text;
}
.Select.is-focused > .Select-control {
  background: #fff;
}
.Select.is-focused:not(.is-open) > .Select-control {
  border-color: #007eff;
  -webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075), 0 0 0 3px rgba(0, 126, 255, 0.1);
          box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075), 0 0 0 3px rgba(0, 126, 255, 0.1);
  background: #fff;
}
.Select.has-value.is-clearable.Select--single > .Select-control .Select-value {
  padding-right: 42px;
}
.Select.has-value.Select--single > .Select-control .Select-value .Select-value-label,
.Select.has-value.is-pseudo-focused.Select--single > .Select-control .Select-value .Select-value-label {
  color: #333;
}
.Select.has-value.Select--single > .Select-control .Select-value a.Select-value-label,
.Select.has-value.is-pseudo-focused.Select--single > .Select-control .Select-value a.Select-value-label {
  cursor: pointer;
  text-decoration: none;
}
.Select.has-value.Select--single > .Select-control .Select-value a.Select-value-label:hover,
.Select.has-value.is-pseudo-focused.Select--single > .Select-control .Select-value a.Select-value-label:hover,
.Select.has-value.Select--single > .Select-control .Select-value a.Select-value-label:focus,
.Select.has-value.is-pseudo-focused.Select--single > .Select-control .Select-value a.Select-value-label:focus {
  color: #007eff;
  outline: none;
  text-decoration: underline;
}
.Select.has-value.Select--single > .Select-control .Select-value a.Select-value-label:focus,
.Select.has-value.is-pseudo-focused.Select--single > .Select-control .Select-value a.Select-value-label:focus {
  background: #fff;
}
.Select.has-value.is-pseudo-focused .Select-input {
  opacity: 0;
}
.Select.is-open .Select-arrow,
.Select .Select-arrow-zone:hover > .Select-arrow {
  border-top-color: #666;
}
.Select.Select--rtl {
  direction: rtl;
  text-align: right;
}
.Select-control {
  background-color: #fff;
  border-color: #d9d9d9 #ccc #b3b3b3;
  border-radius: 4px;
  border: 1px solid #ccc;
  color: #333;
  cursor: default;
  display: table;
  border-spacing: 0;
  border-collapse: separate;
  height: 36px;
  outline: none;
  overflow: hidden;
  position: relative;
  width: 100%;
}
.Select-control:hover {
  -webkit-box-shadow: 0 1px 0 rgba(0, 0, 0, 0.06);
          box-shadow: 0 1px 0 rgba(0, 0, 0, 0.06);
}
.Select-control .Select-input:focus {
  outline: none;
  background: #fff;
}
.Select-placeholder,
.Select--single > .Select-control .Select-value {
  bottom: 0;
  color: #aaa;
  left: 0;
  line-height: 34px;
  padding-left: 10px;
  padding-right: 10px;
  position: absolute;
  right: 0;
  top: 0;
  max-width: 100%;
  overflow: hidden;
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
  white-space: nowrap;
}
.Select-input {
  height: 34px;
  padding-left: 10px;
  padding-right: 10px;
  vertical-align: middle;
}
.Select-input > input {
  width: 100%;
  background: none transparent;
  border: 0 none;
  -webkit-box-shadow: none;
          box-shadow: none;
  cursor: default;
  display: inline-block;
  font-family: inherit;
  font-size: inherit;
  margin: 0;
  outline: none;
  line-height: 17px;
  /* For IE 8 compatibility */
  padding: 8px 0 12px;
  /* For IE 8 compatibility */
  -webkit-appearance: none;
}
.is-focused .Select-input > input {
  cursor: text;
}
.has-value.is-pseudo-focused .Select-input {
  opacity: 0;
}
.Select-control:not(.is-searchable) > .Select-input {
  outline: none;
}
.Select-loading-zone {
  cursor: pointer;
  display: table-cell;
  position: relative;
  text-align: center;
  vertical-align: middle;
  width: 16px;
}
.Select-loading {
  -webkit-animation: Select-animation-spin 400ms infinite linear;
  animation: Select-animation-spin 400ms infinite linear;
  width: 16px;
  height: 16px;
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  border-radius: 50%;
  border: 2px solid #ccc;
  border-right-color: #333;
  display: inline-block;
  position: relative;
  vertical-align: middle;
}
.Select-clear-zone {
  -webkit-animation: Select-animation-fadeIn 200ms;
  animation: Select-animation-fadeIn 200ms;
  color: #999;
  cursor: pointer;
  display: table-cell;
  position: relative;
  text-align: center;
  vertical-align: middle;
  width: 17px;
}
.Select-clear-zone:hover {
  color: #D0021B;
}
.Select-clear {
  display: inline-block;
  font-size: 18px;
  line-height: 1;
}
.Select--multi .Select-clear-zone {
  width: 17px;
}
.Select-arrow-zone {
  cursor: pointer;
  display: table-cell;
  position: relative;
  text-align: center;
  vertical-align: middle;
  width: 25px;
  padding-right: 5px;
}
.Select--rtl .Select-arrow-zone {
  padding-right: 0;
  padding-left: 5px;
}
.Select-arrow {
  border-color: #999 transparent transparent;
  border-style: solid;
  border-width: 5px 5px 2.5px;
  display: inline-block;
  height: 0;
  width: 0;
  position: relative;
}
.Select-control > *:last-child {
  padding-right: 5px;
}
.Select--multi .Select-multi-value-wrapper {
  display: inline-block;
}
.Select .Select-aria-only {
  position: absolute;
  display: inline-block;
  height: 1px;
  width: 1px;
  margin: -1px;
  clip: rect(0, 0, 0, 0);
  overflow: hidden;
  float: left;
}
@-webkit-keyframes Select-animation-fadeIn {
  from {
    opacity: 0;
  }
  to {
    opacity: 1;
  }
}
@keyframes Select-animation-fadeIn {
  from {
    opacity: 0;
  }
  to {
    opacity: 1;
  }
}
.Select-menu-outer {
  border-bottom-right-radius: 4px;
  border-bottom-left-radius: 4px;
  background-color: #fff;
  border: 1px solid #ccc;
  border-top-color: #e6e6e6;
  -webkit-box-shadow: 0 1px 0 rgba(0, 0, 0, 0.06);
          box-shadow: 0 1px 0 rgba(0, 0, 0, 0.06);
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  margin-top: -1px;
  max-height: 200px;
  position: absolute;
  left: 0;
  top: 100%;
  width: 100%;
  z-index: 1;
  -webkit-overflow-scrolling: touch;
}
.Select-menu {
  max-height: 198px;
  overflow-y: auto;
}
.Select-option {
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  background-color: #fff;
  color: #666666;
  cursor: pointer;
  display: block;
  padding: 8px 10px;
}
.Select-option:last-child {
  border-bottom-right-radius: 4px;
  border-bottom-left-radius: 4px;
}
.Select-option.is-selected {
  background-color: #f5faff;
  /* Fallback color for IE 8 */
  background-color: rgba(0, 126, 255, 0.04);
  color: #333;
}
.Select-option.is-focused {
  background-color: #ebf5ff;
  /* Fallback color for IE 8 */
  background-color: rgba(0, 126, 255, 0.08);
  color: #333;
}
.Select-option.is-disabled {
  color: #cccccc;
  cursor: default;
}
.Select-noresults {
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  color: #999999;
  cursor: default;
  display: block;
  padding: 8px 10px;
}
.Select--multi .Select-input {
  vertical-align: middle;
  margin-left: 10px;
  padding: 0;
}
.Select--multi.Select--rtl .Select-input {
  margin-left: 0;
  margin-right: 10px;
}
.Select--multi.has-value .Select-input {
  margin-left: 5px;
}
.Select--multi .Select-value {
  background-color: #ebf5ff;
  /* Fallback color for IE 8 */
  background-color: rgba(0, 126, 255, 0.08);
  border-radius: 2px;
  border: 1px solid #c2e0ff;
  /* Fallback color for IE 8 */
  border: 1px solid rgba(0, 126, 255, 0.24);
  color: #007eff;
  display: inline-block;
  font-size: 0.9em;
  line-height: 1.4;
  margin-left: 5px;
  margin-top: 5px;
  vertical-align: top;
}
.Select--multi .Select-value-icon,
.Select--multi .Select-value-label {
  display: inline-block;
  vertical-align: middle;
}
.Select--multi .Select-value-label {
  border-bottom-right-radius: 2px;
  border-top-right-radius: 2px;
  cursor: default;
  padding: 2px 5px;
}
.Select--multi a.Select-value-label {
  color: #007eff;
  cursor: pointer;
  text-decoration: none;
}
.Select--multi a.Select-value-label:hover {
  text-decoration: underline;
}
.Select--multi .Select-value-icon {
  cursor: pointer;
  border-bottom-left-radius: 2px;
  border-top-left-radius: 2px;
  border-right: 1px solid #c2e0ff;
  /* Fallback color for IE 8 */
  border-right: 1px solid rgba(0, 126, 255, 0.24);
  padding: 1px 5px 3px;
}
.Select--multi .Select-value-icon:hover,
.Select--multi .Select-value-icon:focus {
  background-color: #d8eafd;
  /* Fallback color for IE 8 */
  background-color: rgba(0, 113, 230, 0.08);
  color: #0071e6;
}
.Select--multi .Select-value-icon:active {
  background-color: #c2e0ff;
  /* Fallback color for IE 8 */
  background-color: rgba(0, 126, 255, 0.24);
}
.Select--multi.Select--rtl .Select-value {
  margin-left: 0;
  margin-right: 5px;
}
.Select--multi.Select--rtl .Select-value-icon {
  border-right: none;
  border-left: 1px solid #c2e0ff;
  /* Fallback color for IE 8 */
  border-left: 1px solid rgba(0, 126, 255, 0.24);
}
.Select--multi.is-disabled .Select-value {
  background-color: #fcfcfc;
  border: 1px solid #e3e3e3;
  color: #333;
}
.Select--multi.is-disabled .Select-value-icon {
  cursor: not-allowed;
  border-right: 1px solid #e3e3e3;
}
.Select--multi.is-disabled .Select-value-icon:hover,
.Select--multi.is-disabled .Select-value-icon:focus,
.Select--multi.is-disabled .Select-value-icon:active {
  background-color: #fcfcfc;
}
@keyframes Select-animation-spin {
  to {
    -webkit-transform: rotate(1turn);
            transform: rotate(1turn);
  }
}
@-webkit-keyframes Select-animation-spin {
  to {
    -webkit-transform: rotate(1turn);
  }
}
</style><style type="text/css">.rc-dialog {
  position: relative;
  width: auto;
  margin: 10px;
}
.rc-dialog-wrap {
  position: fixed;
  overflow: auto;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  z-index: 1050;
  -webkit-overflow-scrolling: touch;
  outline: 0;
}
.rc-dialog-content {
  position: relative;
  background-color: #fff;
  border: 1px solid #999;
  border: 1px solid rgba(0, 0, 0, 0.2);
  border-radius: 6px;
  -webkit-box-shadow: 0 3px 9px rgba(0, 0, 0, 0.5);
          box-shadow: 0 3px 9px rgba(0, 0, 0, 0.5);
  background-clip: padding-box;
  outline: 0;
}
.rc-dialog-header {
  padding: 15px;
  border-bottom: 1px solid #e5e5e5;
}
.rc-dialog-close {
  cursor: pointer;
  border: 0;
  background: transparent;
  font-size: 21px;
  position: absolute;
  right: 20px;
  top: 12px;
  font-weight: 700;
  line-height: 1;
  color: #000;
  text-shadow: 0 1px 0 #fff;
  filter: alpha(opacity=20);
  opacity: .2;
  text-decoration: none;
}
.rc-dialog-close-x:after {
  content: '\D7';
}
.rc-dialog-close:hover {
  opacity: 1;
  filter: alpha(opacity=100);
  text-decoration: none;
}
.rc-dialog-title {
  margin: 0;
  line-height: 1.42857143;
}
.rc-dialog-body {
  position: relative;
  padding: 15px;
}
.rc-dialog-footer {
  padding: 15px;
  text-align: right;
  border-top: 1px solid #e5e5e5;
}
.rc-dialog-footer .btn + .btn {
  margin-left: 5px;
  margin-bottom: 0;
}
.rc-dialog-footer .btn-group .btn + .btn {
  margin-left: -1px;
}
.rc-dialog-footer .btn-block + .btn-block {
  margin-left: 0;
}
@media (min-width: 768px) {
  .rc-dialog {
    width: 600px;
    margin: 30px auto;
  }
  .rc-dialog-content {
    -webkit-box-shadow: 0 5px 15px rgba(0, 0, 0, 0.5);
            box-shadow: 0 5px 15px rgba(0, 0, 0, 0.5);
  }
}
.rc-dialog-slide-fade-enter,
.rc-dialog-slide-fade-appear {
  -webkit-transform: translate(0, -25%);
          transform: translate(0, -25%);
}
.rc-dialog-slide-fade-enter,
.rc-dialog-slide-fade-appear,
.rc-dialog-slide-fade-leave {
  -webkit-animation-duration: .3s;
          animation-duration: .3s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-timing-function: ease-out;
          animation-timing-function: ease-out;
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.rc-dialog-slide-fade-enter.rc-dialog-slide-fade-enter-active,
.rc-dialog-slide-fade-appear.rc-dialog-slide-fade-appear-active {
  -webkit-animation-name: rcDialogSlideFadeIn;
          animation-name: rcDialogSlideFadeIn;
  -webkit-animation-play-state: running;
          animation-play-state: running;
}
.rc-dialog-slide-fade-leave.rc-dialog-slide-fade-leave-active {
  -webkit-animation-name: rcDialogSlideFadeOut;
          animation-name: rcDialogSlideFadeOut;
  -webkit-animation-play-state: running;
          animation-play-state: running;
}
@-webkit-keyframes rcDialogSlideFadeIn {
  0% {
    -webkit-transform: translate(0, -25%);
            transform: translate(0, -25%);
  }
  100% {
    -webkit-transform: translate(0, 0);
            transform: translate(0, 0);
  }
}
@keyframes rcDialogSlideFadeIn {
  0% {
    -webkit-transform: translate(0, -25%);
            transform: translate(0, -25%);
  }
  100% {
    -webkit-transform: translate(0, 0);
            transform: translate(0, 0);
  }
}
@-webkit-keyframes rcDialogSlideFadeOut {
  0% {
    -webkit-transform: translate(0, 0);
            transform: translate(0, 0);
  }
  100% {
    -webkit-transform: translate(0, -25%);
            transform: translate(0, -25%);
  }
}
@keyframes rcDialogSlideFadeOut {
  0% {
    -webkit-transform: translate(0, 0);
            transform: translate(0, 0);
  }
  100% {
    -webkit-transform: translate(0, -25%);
            transform: translate(0, -25%);
  }
}
.rc-dialog-mask {
  position: fixed;
  top: 0;
  right: 0;
  left: 0;
  bottom: 0;
  background-color: #373737;
  background-color: rgba(55, 55, 55, 0.6);
  height: 100%;
  filter: alpha(opacity=50);
  z-index: 1050;
}
.rc-dialog-mask-hidden {
  display: none;
}
.rc-dialog-fade-enter,
.rc-dialog-fade-appear {
  opacity: 0;
  -webkit-animation-duration: 0.3s;
          animation-duration: 0.3s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-timing-function: cubic-bezier(0.55, 0, 0.55, 0.2);
          animation-timing-function: cubic-bezier(0.55, 0, 0.55, 0.2);
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.rc-dialog-fade-leave {
  -webkit-animation-duration: 0.3s;
          animation-duration: 0.3s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-timing-function: cubic-bezier(0.55, 0, 0.55, 0.2);
          animation-timing-function: cubic-bezier(0.55, 0, 0.55, 0.2);
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.rc-dialog-fade-enter.rc-dialog-fade-enter-active,
.rc-dialog-fade-appear.rc-dialog-fade-appear-active {
  -webkit-animation-name: rcDialogFadeIn;
          animation-name: rcDialogFadeIn;
  -webkit-animation-play-state: running;
          animation-play-state: running;
}
.rc-dialog-fade-leave.rc-dialog-fade-leave-active {
  -webkit-animation-name: rcDialogFadeOut;
          animation-name: rcDialogFadeOut;
  -webkit-animation-play-state: running;
          animation-play-state: running;
}
@-webkit-keyframes rcDialogFadeIn {
  0% {
    opacity: 0;
  }
  100% {
    opacity: 1;
  }
}
@keyframes rcDialogFadeIn {
  0% {
    opacity: 0;
  }
  100% {
    opacity: 1;
  }
}
@-webkit-keyframes rcDialogFadeOut {
  0% {
    opacity: 1;
  }
  100% {
    opacity: 0;
  }
}
@keyframes rcDialogFadeOut {
  0% {
    opacity: 1;
  }
  100% {
    opacity: 0;
  }
}
</style><style type="text/css">.ReactTable{position:relative;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-ms-flex-direction:column;flex-direction:column;border:1px solid rgba(0,0,0,0.1);}.ReactTable *{-webkit-box-sizing:border-box;box-sizing:border-box}.ReactTable .rt-table{-webkit-box-flex:1;-ms-flex:auto 1;flex:auto 1;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-ms-flex-direction:column;flex-direction:column;-webkit-box-align:stretch;-ms-flex-align:stretch;align-items:stretch;width:100%;border-collapse:collapse;overflow:auto}.ReactTable .rt-thead{-webkit-box-flex:1;-ms-flex:1 0 auto;flex:1 0 auto;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-ms-flex-direction:column;flex-direction:column;-webkit-user-select:none;-moz-user-select:none;-ms-user-select:none;user-select:none;}.ReactTable .rt-thead.-headerGroups{background:rgba(0,0,0,0.03);border-bottom:1px solid rgba(0,0,0,0.05)}.ReactTable .rt-thead.-filters{border-bottom:1px solid rgba(0,0,0,0.05);}.ReactTable .rt-thead.-filters input,.ReactTable .rt-thead.-filters select{border:1px solid rgba(0,0,0,0.1);background:#fff;padding:5px 7px;font-size:inherit;border-radius:3px;font-weight:normal;outline:none}.ReactTable .rt-thead.-filters .rt-th{border-right:1px solid rgba(0,0,0,0.02)}.ReactTable .rt-thead.-header{-webkit-box-shadow:0 2px 15px 0 rgba(0,0,0,0.15);box-shadow:0 2px 15px 0 rgba(0,0,0,0.15)}.ReactTable .rt-thead .rt-tr{text-align:center}.ReactTable .rt-thead .rt-th,.ReactTable .rt-thead .rt-td{padding:5px 5px;line-height:normal;position:relative;border-right:1px solid rgba(0,0,0,0.05);-webkit-transition:-webkit-box-shadow .3s cubic-bezier(.175,.885,.32,1.275);transition:-webkit-box-shadow .3s cubic-bezier(.175,.885,.32,1.275);-o-transition:box-shadow .3s cubic-bezier(.175,.885,.32,1.275);transition:box-shadow .3s cubic-bezier(.175,.885,.32,1.275);transition:box-shadow .3s cubic-bezier(.175,.885,.32,1.275), -webkit-box-shadow .3s cubic-bezier(.175,.885,.32,1.275);-webkit-box-shadow:inset 0 0 0 0 transparent;box-shadow:inset 0 0 0 0 transparent;}.ReactTable .rt-thead .rt-th.-sort-asc,.ReactTable .rt-thead .rt-td.-sort-asc{-webkit-box-shadow:inset 0 3px 0 0 rgba(0,0,0,0.6);box-shadow:inset 0 3px 0 0 rgba(0,0,0,0.6)}.ReactTable .rt-thead .rt-th.-sort-desc,.ReactTable .rt-thead .rt-td.-sort-desc{-webkit-box-shadow:inset 0 -3px 0 0 rgba(0,0,0,0.6);box-shadow:inset 0 -3px 0 0 rgba(0,0,0,0.6)}.ReactTable .rt-thead .rt-th.-cursor-pointer,.ReactTable .rt-thead .rt-td.-cursor-pointer{cursor:pointer}.ReactTable .rt-thead .rt-th:last-child,.ReactTable .rt-thead .rt-td:last-child{border-right:0}.ReactTable .rt-thead .rt-resizable-header{overflow:visible;}.ReactTable .rt-thead .rt-resizable-header:last-child{overflow:hidden}.ReactTable .rt-thead .rt-resizable-header-content{overflow:hidden;-o-text-overflow:ellipsis;text-overflow:ellipsis}.ReactTable .rt-thead .rt-header-pivot{border-right-color:#f7f7f7}.ReactTable .rt-thead .rt-header-pivot:after,.ReactTable .rt-thead .rt-header-pivot:before{left:100%;top:50%;border:solid transparent;content:" ";height:0;width:0;position:absolute;pointer-events:none}.ReactTable .rt-thead .rt-header-pivot:after{border-color:rgba(255,255,255,0);border-left-color:#fff;border-width:8px;margin-top:-8px}.ReactTable .rt-thead .rt-header-pivot:before{border-color:rgba(102,102,102,0);border-left-color:#f7f7f7;border-width:10px;margin-top:-10px}.ReactTable .rt-tbody{-webkit-box-flex:99999;-ms-flex:99999 1 auto;flex:99999 1 auto;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-ms-flex-direction:column;flex-direction:column;overflow:auto;}.ReactTable .rt-tbody .rt-tr-group{border-bottom:solid 1px rgba(0,0,0,0.05);}.ReactTable .rt-tbody .rt-tr-group:last-child{border-bottom:0}.ReactTable .rt-tbody .rt-td{border-right:1px solid rgba(0,0,0,0.02);}.ReactTable .rt-tbody .rt-td:last-child{border-right:0}.ReactTable .rt-tbody .rt-expandable{cursor:pointer;-o-text-overflow:clip;text-overflow:clip}.ReactTable .rt-tr-group{-webkit-box-flex:1;-ms-flex:1 0 auto;flex:1 0 auto;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-ms-flex-direction:column;flex-direction:column;-webkit-box-align:stretch;-ms-flex-align:stretch;align-items:stretch}.ReactTable .rt-tr{-webkit-box-flex:1;-ms-flex:1 0 auto;flex:1 0 auto;display:-webkit-inline-box;display:-ms-inline-flexbox;display:inline-flex}.ReactTable .rt-th,.ReactTable .rt-td{-webkit-box-flex:1;-ms-flex:1 0 0px;flex:1 0 0;white-space:nowrap;-o-text-overflow:ellipsis;text-overflow:ellipsis;padding:7px 5px;overflow:hidden;-webkit-transition:.3s ease;-o-transition:.3s ease;transition:.3s ease;-webkit-transition-property:width,min-width,padding,opacity;-o-transition-property:width,min-width,padding,opacity;transition-property:width,min-width,padding,opacity;}.ReactTable .rt-th.-hidden,.ReactTable .rt-td.-hidden{width:0 !important;min-width:0 !important;padding:0 !important;border:0 !important;opacity:0 !important}.ReactTable .rt-expander{display:inline-block;position:relative;margin:0;color:transparent;margin:0 10px;}.ReactTable .rt-expander:after{content:'';position:absolute;width:0;height:0;top:50%;left:50%;-webkit-transform:translate(-50%,-50%) rotate(-90deg);transform:translate(-50%,-50%) rotate(-90deg);border-left:5.04px solid transparent;border-right:5.04px solid transparent;border-top:7px solid rgba(0,0,0,0.8);-webkit-transition:all .3s cubic-bezier(.175,.885,.32,1.275);-o-transition:all .3s cubic-bezier(.175,.885,.32,1.275);transition:all .3s cubic-bezier(.175,.885,.32,1.275);cursor:pointer}.ReactTable .rt-expander.-open:after{-webkit-transform:translate(-50%,-50%) rotate(0);transform:translate(-50%,-50%) rotate(0)}.ReactTable .rt-resizer{display:inline-block;position:absolute;width:36px;top:0;bottom:0;right:-18px;cursor:col-resize;z-index:10}.ReactTable .rt-tfoot{-webkit-box-flex:1;-ms-flex:1 0 auto;flex:1 0 auto;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-ms-flex-direction:column;flex-direction:column;-webkit-box-shadow:0 0 15px 0 rgba(0,0,0,0.15);box-shadow:0 0 15px 0 rgba(0,0,0,0.15);}.ReactTable .rt-tfoot .rt-td{border-right:1px solid rgba(0,0,0,0.05);}.ReactTable .rt-tfoot .rt-td:last-child{border-right:0}.ReactTable.-striped .rt-tr.-odd{background:rgba(0,0,0,0.03)}.ReactTable.-highlight .rt-tbody .rt-tr:not(.-padRow):hover{background:rgba(0,0,0,0.05)}.ReactTable .-pagination{z-index:1;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-pack:justify;-ms-flex-pack:justify;justify-content:space-between;-webkit-box-align:stretch;-ms-flex-align:stretch;align-items:stretch;-ms-flex-wrap:wrap;flex-wrap:wrap;padding:3px;-webkit-box-shadow:0 0 15px 0 rgba(0,0,0,0.1);box-shadow:0 0 15px 0 rgba(0,0,0,0.1);border-top:2px solid rgba(0,0,0,0.1);}.ReactTable .-pagination input,.ReactTable .-pagination select{border:1px solid rgba(0,0,0,0.1);background:#fff;padding:5px 7px;font-size:inherit;border-radius:3px;font-weight:normal;outline:none}.ReactTable .-pagination .-btn{-webkit-appearance:none;-moz-appearance:none;appearance:none;display:block;width:100%;height:100%;border:0;border-radius:3px;padding:6px;font-size:1em;color:rgba(0,0,0,0.6);background:rgba(0,0,0,0.1);-webkit-transition:all .1s ease;-o-transition:all .1s ease;transition:all .1s ease;cursor:pointer;outline:none;}.ReactTable .-pagination .-btn[disabled]{opacity:.5;cursor:default}.ReactTable .-pagination .-btn:not([disabled]):hover{background:rgba(0,0,0,0.3);color:#fff}.ReactTable .-pagination .-previous,.ReactTable .-pagination .-next{-webkit-box-flex:1;-ms-flex:1;flex:1;text-align:center}.ReactTable .-pagination .-center{-webkit-box-flex:1.5;-ms-flex:1.5;flex:1.5;text-align:center;margin-bottom:0;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-orient:horizontal;-webkit-box-direction:normal;-ms-flex-direction:row;flex-direction:row;-ms-flex-wrap:wrap;flex-wrap:wrap;-webkit-box-align:center;-ms-flex-align:center;align-items:center;-ms-flex-pack:distribute;justify-content:space-around}.ReactTable .-pagination .-pageInfo{display:inline-block;margin:3px 10px;white-space:nowrap}.ReactTable .-pagination .-pageJump{display:inline-block;}.ReactTable .-pagination .-pageJump input{width:70px;text-align:center}.ReactTable .-pagination .-pageSizeOptions{margin:3px 10px}.ReactTable .rt-noData{display:block;position:absolute;left:50%;top:50%;-webkit-transform:translate(-50%,-50%);transform:translate(-50%,-50%);background:rgba(255,255,255,0.8);-webkit-transition:all .3s ease;-o-transition:all .3s ease;transition:all .3s ease;z-index:1;pointer-events:none;padding:20px;color:rgba(0,0,0,0.5)}.ReactTable .-loading{display:block;position:absolute;left:0;right:0;top:0;bottom:0;background:rgba(255,255,255,0.8);-webkit-transition:all .3s ease;-o-transition:all .3s ease;transition:all .3s ease;z-index:-1;opacity:0;pointer-events:none;}.ReactTable .-loading > div{position:absolute;display:block;text-align:center;width:100%;top:50%;left:0;font-size:15px;color:rgba(0,0,0,0.6);-webkit-transform:translateY(-52%);transform:translateY(-52%);-webkit-transition:all .3s cubic-bezier(.25,.46,.45,.94);-o-transition:all .3s cubic-bezier(.25,.46,.45,.94);transition:all .3s cubic-bezier(.25,.46,.45,.94)}.ReactTable .-loading.-active{opacity:1;z-index:2;pointer-events:all;}.ReactTable .-loading.-active > div{-webkit-transform:translateY(50%);transform:translateY(50%)}.ReactTable .rt-resizing .rt-th,.ReactTable .rt-resizing .rt-td{-webkit-transition:none !important;-o-transition:none !important;transition:none !important;cursor:col-resize;-webkit-user-select:none;-moz-user-select:none;-ms-user-select:none;user-select:none}</style><style type="text/css">.CodeMirror-foldmarker {
  color: blue;
  text-shadow: #b9f 1px 1px 2px, #b9f -1px -1px 2px, #b9f 1px -1px 2px, #b9f -1px 1px 2px;
  font-family: arial;
  line-height: .3;
  cursor: pointer;
}
.CodeMirror-foldgutter {
  width: .7em;
}
.CodeMirror-foldgutter-open,
.CodeMirror-foldgutter-folded {
  cursor: pointer;
}
.CodeMirror-foldgutter-open:after {
  content: "\25BE";
}
.CodeMirror-foldgutter-folded:after {
  content: "\25B8";
}
</style><style type="text/css">.CodeMirror-dialog {
  position: absolute;
  left: 0; right: 0;
  background: inherit;
  z-index: 15;
  padding: .1em .8em;
  overflow: hidden;
  color: inherit;
}

.CodeMirror-dialog-top {
  border-bottom: 1px solid #eee;
  top: 0;
}

.CodeMirror-dialog-bottom {
  border-top: 1px solid #eee;
  bottom: 0;
}

.CodeMirror-dialog input {
  border: none;
  outline: none;
  background: transparent;
  width: 20em;
  color: inherit;
  font-family: monospace;
}

.CodeMirror-dialog button {
  font-size: 70%;
}
</style><style type="text/css">/* BASICS */

.CodeMirror {
  /* Set height, width, borders, and global font properties here */
  font-family: monospace;
  height: 300px;
  color: black;
  direction: ltr;
}

/* PADDING */

.CodeMirror-lines {
  padding: 4px 0; /* Vertical padding around content */
}
.CodeMirror pre {
  padding: 0 4px; /* Horizontal padding of content */
}

.CodeMirror-scrollbar-filler, .CodeMirror-gutter-filler {
  background-color: white; /* The little square between H and V scrollbars */
}

/* GUTTER */

.CodeMirror-gutters {
  border-right: 1px solid #ddd;
  background-color: #f7f7f7;
  white-space: nowrap;
}
.CodeMirror-linenumbers {}
.CodeMirror-linenumber {
  padding: 0 3px 0 5px;
  min-width: 20px;
  text-align: right;
  color: #999;
  white-space: nowrap;
}

.CodeMirror-guttermarker { color: black; }
.CodeMirror-guttermarker-subtle { color: #999; }

/* CURSOR */

.CodeMirror-cursor {
  border-left: 1px solid black;
  border-right: none;
  width: 0;
}
/* Shown when moving in bi-directional text */
.CodeMirror div.CodeMirror-secondarycursor {
  border-left: 1px solid silver;
}
.cm-fat-cursor .CodeMirror-cursor {
  width: auto;
  border: 0 !important;
  background: #7e7;
}
.cm-fat-cursor div.CodeMirror-cursors {
  z-index: 1;
}
.cm-fat-cursor-mark {
  background-color: rgba(20, 255, 20, 0.5);
  -webkit-animation: blink 1.06s steps(1) infinite;
  animation: blink 1.06s steps(1) infinite;
}
.cm-animate-fat-cursor {
  width: auto;
  border: 0;
  -webkit-animation: blink 1.06s steps(1) infinite;
  animation: blink 1.06s steps(1) infinite;
  background-color: #7e7;
}
@-webkit-keyframes blink {
  0% {}
  50% { background-color: transparent; }
  100% {}
}
@keyframes blink {
  0% {}
  50% { background-color: transparent; }
  100% {}
}

/* Can style cursor different in overwrite (non-insert) mode */
.CodeMirror-overwrite .CodeMirror-cursor {}

.cm-tab { display: inline-block; text-decoration: inherit; }

.CodeMirror-rulers {
  position: absolute;
  left: 0; right: 0; top: -50px; bottom: -20px;
  overflow: hidden;
}
.CodeMirror-ruler {
  border-left: 1px solid #ccc;
  top: 0; bottom: 0;
  position: absolute;
}

/* DEFAULT THEME */

.cm-s-default .cm-header {color: blue;}
.cm-s-default .cm-quote {color: #090;}
.cm-negative {color: #d44;}
.cm-positive {color: #292;}
.cm-header, .cm-strong {font-weight: bold;}
.cm-em {font-style: italic;}
.cm-link {text-decoration: underline;}
.cm-strikethrough {text-decoration: line-through;}

.cm-s-default .cm-keyword {color: #708;}
.cm-s-default .cm-atom {color: #219;}
.cm-s-default .cm-number {color: #164;}
.cm-s-default .cm-def {color: #00f;}
.cm-s-default .cm-variable,
.cm-s-default .cm-punctuation,
.cm-s-default .cm-property,
.cm-s-default .cm-operator {}
.cm-s-default .cm-variable-2 {color: #05a;}
.cm-s-default .cm-variable-3, .cm-s-default .cm-type {color: #085;}
.cm-s-default .cm-comment {color: #a50;}
.cm-s-default .cm-string {color: #a11;}
.cm-s-default .cm-string-2 {color: #f50;}
.cm-s-default .cm-meta {color: #555;}
.cm-s-default .cm-qualifier {color: #555;}
.cm-s-default .cm-builtin {color: #30a;}
.cm-s-default .cm-bracket {color: #997;}
.cm-s-default .cm-tag {color: #170;}
.cm-s-default .cm-attribute {color: #00c;}
.cm-s-default .cm-hr {color: #999;}
.cm-s-default .cm-link {color: #00c;}

.cm-s-default .cm-error {color: #f00;}
.cm-invalidchar {color: #f00;}

.CodeMirror-composing { border-bottom: 2px solid; }

/* Default styles for common addons */

div.CodeMirror span.CodeMirror-matchingbracket {color: #0b0;}
div.CodeMirror span.CodeMirror-nonmatchingbracket {color: #a22;}
.CodeMirror-matchingtag { background: rgba(255, 150, 0, .3); }
.CodeMirror-activeline-background {background: #e8f2ff;}

/* STOP */

/* The rest of this file contains styles related to the mechanics of
   the editor. You probably shouldn't touch them. */

.CodeMirror {
  position: relative;
  overflow: hidden;
  background: white;
}

.CodeMirror-scroll {
  overflow: scroll !important; /* Things will break if this is overridden */
  /* 30px is the magic margin used to hide the element's real scrollbars */
  /* See overflow: hidden in .CodeMirror */
  margin-bottom: -30px; margin-right: -30px;
  padding-bottom: 30px;
  height: 100%;
  outline: none; /* Prevent dragging from highlighting the element */
  position: relative;
}
.CodeMirror-sizer {
  position: relative;
  border-right: 30px solid transparent;
}

/* The fake, visible scrollbars. Used to force redraw during scrolling
   before actual scrolling happens, thus preventing shaking and
   flickering artifacts. */
.CodeMirror-vscrollbar, .CodeMirror-hscrollbar, .CodeMirror-scrollbar-filler, .CodeMirror-gutter-filler {
  position: absolute;
  z-index: 6;
  display: none;
}
.CodeMirror-vscrollbar {
  right: 0; top: 0;
  overflow-x: hidden;
  overflow-y: scroll;
}
.CodeMirror-hscrollbar {
  bottom: 0; left: 0;
  overflow-y: hidden;
  overflow-x: scroll;
}
.CodeMirror-scrollbar-filler {
  right: 0; bottom: 0;
}
.CodeMirror-gutter-filler {
  left: 0; bottom: 0;
}

.CodeMirror-gutters {
  position: absolute; left: 0; top: 0;
  min-height: 100%;
  z-index: 3;
}
.CodeMirror-gutter {
  white-space: normal;
  height: 100%;
  display: inline-block;
  vertical-align: top;
  margin-bottom: -30px;
}
.CodeMirror-gutter-wrapper {
  position: absolute;
  z-index: 4;
  background: none !important;
  border: none !important;
}
.CodeMirror-gutter-background {
  position: absolute;
  top: 0; bottom: 0;
  z-index: 4;
}
.CodeMirror-gutter-elt {
  position: absolute;
  cursor: default;
  z-index: 4;
}
.CodeMirror-gutter-wrapper ::-moz-selection { background-color: transparent }
.CodeMirror-gutter-wrapper ::selection { background-color: transparent }
.CodeMirror-gutter-wrapper ::-moz-selection { background-color: transparent }

.CodeMirror-lines {
  cursor: text;
  min-height: 1px; /* prevents collapsing before first draw */
}
.CodeMirror pre {
  /* Reset some styles that the rest of the page might have set */ border-radius: 0;
  border-width: 0;
  background: transparent;
  font-family: inherit;
  font-size: inherit;
  margin: 0;
  white-space: pre;
  word-wrap: normal;
  line-height: inherit;
  color: inherit;
  z-index: 2;
  position: relative;
  overflow: visible;
  -webkit-tap-highlight-color: transparent;
  -webkit-font-variant-ligatures: contextual;
  font-variant-ligatures: contextual;
}
.CodeMirror-wrap pre {
  word-wrap: break-word;
  white-space: pre-wrap;
  word-break: normal;
}

.CodeMirror-linebackground {
  position: absolute;
  left: 0; right: 0; top: 0; bottom: 0;
  z-index: 0;
}

.CodeMirror-linewidget {
  position: relative;
  z-index: 2;
  padding: 0.1px; /* Force widget margins to stay inside of the container */
}

.CodeMirror-widget {}

.CodeMirror-rtl pre { direction: rtl; }

.CodeMirror-code {
  outline: none;
}

/* Force content-box sizing for the elements where we expect it */
.CodeMirror-scroll,
.CodeMirror-sizer,
.CodeMirror-gutter,
.CodeMirror-gutters,
.CodeMirror-linenumber {
  -webkit-box-sizing: content-box;
          box-sizing: content-box;
}

.CodeMirror-measure {
  position: absolute;
  width: 100%;
  height: 0;
  overflow: hidden;
  visibility: hidden;
}

.CodeMirror-cursor {
  position: absolute;
  pointer-events: none;
}
.CodeMirror-measure pre { position: static; }

div.CodeMirror-cursors {
  visibility: hidden;
  position: relative;
  z-index: 3;
}
div.CodeMirror-dragcursors {
  visibility: visible;
}

.CodeMirror-focused div.CodeMirror-cursors {
  visibility: visible;
}

.CodeMirror-selected { background: #d9d9d9; }
.CodeMirror-focused .CodeMirror-selected { background: #d7d4f0; }
.CodeMirror-crosshair { cursor: crosshair; }
.CodeMirror-line::-moz-selection, .CodeMirror-line > span::-moz-selection, .CodeMirror-line > span > span::-moz-selection { background: #d7d4f0; }
.CodeMirror-line::selection, .CodeMirror-line > span::selection, .CodeMirror-line > span > span::selection { background: #d7d4f0; }
.CodeMirror-line::-moz-selection, .CodeMirror-line > span::-moz-selection, .CodeMirror-line > span > span::-moz-selection { background: #d7d4f0; }

.cm-searching {
  background-color: #ffa;
  background-color: rgba(255, 255, 0, .4);
}

/* Used to force a border model for a node */
.cm-force-border { padding-right: .1px; }

@media print {
  /* Hide the cursor when printing */
  .CodeMirror div.CodeMirror-cursors {
    visibility: hidden;
  }
}

/* See issue #2901 */
.cm-tab-wrap-hack:after { content: ''; }

/* Help users use markselection to safely style text background */
span.CodeMirror-selectedtext { background: none; }
</style><style type="text/css">/* Based on Sublime Text's Monokai theme */

.cm-s-monokai.CodeMirror { background: #272822; color: #f8f8f2; }
.cm-s-monokai div.CodeMirror-selected { background: #49483E; }
.cm-s-monokai .CodeMirror-line::-moz-selection, .cm-s-monokai .CodeMirror-line > span::-moz-selection, .cm-s-monokai .CodeMirror-line > span > span::-moz-selection { background: rgba(73, 72, 62, .99); }
.cm-s-monokai .CodeMirror-line::selection, .cm-s-monokai .CodeMirror-line > span::selection, .cm-s-monokai .CodeMirror-line > span > span::selection { background: rgba(73, 72, 62, .99); }
.cm-s-monokai .CodeMirror-line::-moz-selection, .cm-s-monokai .CodeMirror-line > span::-moz-selection, .cm-s-monokai .CodeMirror-line > span > span::-moz-selection { background: rgba(73, 72, 62, .99); }
.cm-s-monokai .CodeMirror-gutters { background: #272822; border-right: 0px; }
.cm-s-monokai .CodeMirror-guttermarker { color: white; }
.cm-s-monokai .CodeMirror-guttermarker-subtle { color: #d0d0d0; }
.cm-s-monokai .CodeMirror-linenumber { color: #d0d0d0; }
.cm-s-monokai .CodeMirror-cursor { border-left: 1px solid #f8f8f0; }

.cm-s-monokai span.cm-comment { color: #75715e; }
.cm-s-monokai span.cm-atom { color: #ae81ff; }
.cm-s-monokai span.cm-number { color: #ae81ff; }

.cm-s-monokai span.cm-comment.cm-attribute { color: #97b757; }
.cm-s-monokai span.cm-comment.cm-def { color: #bc9262; }
.cm-s-monokai span.cm-comment.cm-tag { color: #bc6283; }
.cm-s-monokai span.cm-comment.cm-type { color: #5998a6; }

.cm-s-monokai span.cm-property, .cm-s-monokai span.cm-attribute { color: #a6e22e; }
.cm-s-monokai span.cm-keyword { color: #f92672; }
.cm-s-monokai span.cm-builtin { color: #66d9ef; }
.cm-s-monokai span.cm-string { color: #e6db74; }

.cm-s-monokai span.cm-variable { color: #f8f8f2; }
.cm-s-monokai span.cm-variable-2 { color: #9effff; }
.cm-s-monokai span.cm-variable-3, .cm-s-monokai span.cm-type { color: #66d9ef; }
.cm-s-monokai span.cm-def { color: #fd971f; }
.cm-s-monokai span.cm-bracket { color: #f8f8f2; }
.cm-s-monokai span.cm-tag { color: #f92672; }
.cm-s-monokai span.cm-header { color: #ae81ff; }
.cm-s-monokai span.cm-link { color: #ae81ff; }
.cm-s-monokai span.cm-error { background: #f92672; color: #f8f8f0; }

.cm-s-monokai .CodeMirror-activeline-background { background: #373831; }
.cm-s-monokai .CodeMirror-matchingbracket {
  text-decoration: underline;
  color: white !important;
}
</style><style type="text/css">/* Port of TextMate's Blackboard theme */

.cm-s-blackboard.CodeMirror { background: #0C1021; color: #F8F8F8; }
.cm-s-blackboard div.CodeMirror-selected { background: #253B76; }
.cm-s-blackboard .CodeMirror-line::-moz-selection, .cm-s-blackboard .CodeMirror-line > span::-moz-selection, .cm-s-blackboard .CodeMirror-line > span > span::-moz-selection { background: rgba(37, 59, 118, .99); }
.cm-s-blackboard .CodeMirror-line::selection, .cm-s-blackboard .CodeMirror-line > span::selection, .cm-s-blackboard .CodeMirror-line > span > span::selection { background: rgba(37, 59, 118, .99); }
.cm-s-blackboard .CodeMirror-line::-moz-selection, .cm-s-blackboard .CodeMirror-line > span::-moz-selection, .cm-s-blackboard .CodeMirror-line > span > span::-moz-selection { background: rgba(37, 59, 118, .99); }
.cm-s-blackboard .CodeMirror-gutters { background: #0C1021; border-right: 0; }
.cm-s-blackboard .CodeMirror-guttermarker { color: #FBDE2D; }
.cm-s-blackboard .CodeMirror-guttermarker-subtle { color: #888; }
.cm-s-blackboard .CodeMirror-linenumber { color: #888; }
.cm-s-blackboard .CodeMirror-cursor { border-left: 1px solid #A7A7A7; }

.cm-s-blackboard .cm-keyword { color: #FBDE2D; }
.cm-s-blackboard .cm-atom { color: #D8FA3C; }
.cm-s-blackboard .cm-number { color: #D8FA3C; }
.cm-s-blackboard .cm-def { color: #8DA6CE; }
.cm-s-blackboard .cm-variable { color: #FF6400; }
.cm-s-blackboard .cm-operator { color: #FBDE2D; }
.cm-s-blackboard .cm-comment { color: #AEAEAE; }
.cm-s-blackboard .cm-string { color: #61CE3C; }
.cm-s-blackboard .cm-string-2 { color: #61CE3C; }
.cm-s-blackboard .cm-meta { color: #D8FA3C; }
.cm-s-blackboard .cm-builtin { color: #8DA6CE; }
.cm-s-blackboard .cm-tag { color: #8DA6CE; }
.cm-s-blackboard .cm-attribute { color: #8DA6CE; }
.cm-s-blackboard .cm-header { color: #FF6400; }
.cm-s-blackboard .cm-hr { color: #AEAEAE; }
.cm-s-blackboard .cm-link { color: #8DA6CE; }
.cm-s-blackboard .cm-error { background: #9D1E15; color: #F8F8F8; }

.cm-s-blackboard .CodeMirror-activeline-background { background: #3C3636; }
.cm-s-blackboard .CodeMirror-matchingbracket { outline:1px solid grey;color:white !important; }
</style><style type="text/css">.cm-s-eclipse span.cm-meta { color: #FF1717; }
.cm-s-eclipse span.cm-keyword { line-height: 1em; font-weight: bold; color: #7F0055; }
.cm-s-eclipse span.cm-atom { color: #219; }
.cm-s-eclipse span.cm-number { color: #164; }
.cm-s-eclipse span.cm-def { color: #00f; }
.cm-s-eclipse span.cm-variable { color: black; }
.cm-s-eclipse span.cm-variable-2 { color: #0000C0; }
.cm-s-eclipse span.cm-variable-3, .cm-s-eclipse span.cm-type { color: #0000C0; }
.cm-s-eclipse span.cm-property { color: black; }
.cm-s-eclipse span.cm-operator { color: black; }
.cm-s-eclipse span.cm-comment { color: #3F7F5F; }
.cm-s-eclipse span.cm-string { color: #2A00FF; }
.cm-s-eclipse span.cm-string-2 { color: #f50; }
.cm-s-eclipse span.cm-qualifier { color: #555; }
.cm-s-eclipse span.cm-builtin { color: #30a; }
.cm-s-eclipse span.cm-bracket { color: #cc7; }
.cm-s-eclipse span.cm-tag { color: #170; }
.cm-s-eclipse span.cm-attribute { color: #00c; }
.cm-s-eclipse span.cm-link { color: #219; }
.cm-s-eclipse span.cm-error { color: #f00; }

.cm-s-eclipse .CodeMirror-activeline-background { background: #e8f2ff; }
.cm-s-eclipse .CodeMirror-matchingbracket { outline:1px solid grey; color:black !important; }
</style><style type="text/css">/*

    Name:       Tomorrow Night - Bright
    Author:     Chris Kempson

    Port done by Gerard Braad <me@gbraad.nl>

*/

.cm-s-tomorrow-night-bright.CodeMirror { background: #000000; color: #eaeaea; }
.cm-s-tomorrow-night-bright div.CodeMirror-selected { background: #424242; }
.cm-s-tomorrow-night-bright .CodeMirror-gutters { background: #000000; border-right: 0px; }
.cm-s-tomorrow-night-bright .CodeMirror-guttermarker { color: #e78c45; }
.cm-s-tomorrow-night-bright .CodeMirror-guttermarker-subtle { color: #777; }
.cm-s-tomorrow-night-bright .CodeMirror-linenumber { color: #424242; }
.cm-s-tomorrow-night-bright .CodeMirror-cursor { border-left: 1px solid #6A6A6A; }

.cm-s-tomorrow-night-bright span.cm-comment { color: #d27b53; }
.cm-s-tomorrow-night-bright span.cm-atom { color: #a16a94; }
.cm-s-tomorrow-night-bright span.cm-number { color: #a16a94; }

.cm-s-tomorrow-night-bright span.cm-property, .cm-s-tomorrow-night-bright span.cm-attribute { color: #99cc99; }
.cm-s-tomorrow-night-bright span.cm-keyword { color: #d54e53; }
.cm-s-tomorrow-night-bright span.cm-string { color: #e7c547; }

.cm-s-tomorrow-night-bright span.cm-variable { color: #b9ca4a; }
.cm-s-tomorrow-night-bright span.cm-variable-2 { color: #7aa6da; }
.cm-s-tomorrow-night-bright span.cm-def { color: #e78c45; }
.cm-s-tomorrow-night-bright span.cm-bracket { color: #eaeaea; }
.cm-s-tomorrow-night-bright span.cm-tag { color: #d54e53; }
.cm-s-tomorrow-night-bright span.cm-link { color: #a16a94; }
.cm-s-tomorrow-night-bright span.cm-error { background: #d54e53; color: #6A6A6A; }

.cm-s-tomorrow-night-bright .CodeMirror-activeline-background { background: #2a2a2a; }
.cm-s-tomorrow-night-bright .CodeMirror-matchingbracket { text-decoration: underline; color: white !important; }
</style><style type="text/css">/*
Solarized theme for code-mirror
http://ethanschoonover.com/solarized
*/

/*
Solarized color palette
http://ethanschoonover.com/solarized/img/solarized-palette.png
*/

.solarized.base03 { color: #002b36; }
.solarized.base02 { color: #073642; }
.solarized.base01 { color: #586e75; }
.solarized.base00 { color: #657b83; }
.solarized.base0 { color: #839496; }
.solarized.base1 { color: #93a1a1; }
.solarized.base2 { color: #eee8d5; }
.solarized.base3  { color: #fdf6e3; }
.solarized.solar-yellow  { color: #b58900; }
.solarized.solar-orange  { color: #cb4b16; }
.solarized.solar-red { color: #dc322f; }
.solarized.solar-magenta { color: #d33682; }
.solarized.solar-violet  { color: #6c71c4; }
.solarized.solar-blue { color: #268bd2; }
.solarized.solar-cyan { color: #2aa198; }
.solarized.solar-green { color: #859900; }

/* Color scheme for code-mirror */

.cm-s-solarized {
  line-height: 1.45em;
  color-profile: sRGB;
  rendering-intent: auto;
}
.cm-s-solarized.cm-s-dark {
  color: #839496;
  background-color: #002b36;
  text-shadow: #002b36 0 1px;
}
.cm-s-solarized.cm-s-light {
  background-color: #fdf6e3;
  color: #657b83;
  text-shadow: #eee8d5 0 1px;
}

.cm-s-solarized .CodeMirror-widget {
  text-shadow: none;
}

.cm-s-solarized .cm-header { color: #586e75; }
.cm-s-solarized .cm-quote { color: #93a1a1; }

.cm-s-solarized .cm-keyword { color: #cb4b16; }
.cm-s-solarized .cm-atom { color: #d33682; }
.cm-s-solarized .cm-number { color: #d33682; }
.cm-s-solarized .cm-def { color: #2aa198; }

.cm-s-solarized .cm-variable { color: #839496; }
.cm-s-solarized .cm-variable-2 { color: #b58900; }
.cm-s-solarized .cm-variable-3, .cm-s-solarized .cm-type { color: #6c71c4; }

.cm-s-solarized .cm-property { color: #2aa198; }
.cm-s-solarized .cm-operator { color: #6c71c4; }

.cm-s-solarized .cm-comment { color: #586e75; font-style:italic; }

.cm-s-solarized .cm-string { color: #859900; }
.cm-s-solarized .cm-string-2 { color: #b58900; }

.cm-s-solarized .cm-meta { color: #859900; }
.cm-s-solarized .cm-qualifier { color: #b58900; }
.cm-s-solarized .cm-builtin { color: #d33682; }
.cm-s-solarized .cm-bracket { color: #cb4b16; }
.cm-s-solarized .CodeMirror-matchingbracket { color: #859900; }
.cm-s-solarized .CodeMirror-nonmatchingbracket { color: #dc322f; }
.cm-s-solarized .cm-tag { color: #93a1a1; }
.cm-s-solarized .cm-attribute { color: #2aa198; }
.cm-s-solarized .cm-hr {
  color: transparent;
  border-top: 1px solid #586e75;
  display: block;
}
.cm-s-solarized .cm-link { color: #93a1a1; cursor: pointer; }
.cm-s-solarized .cm-special { color: #6c71c4; }
.cm-s-solarized .cm-em {
  color: #999;
  text-decoration: underline;
  -webkit-text-decoration-style: dotted;
          text-decoration-style: dotted;
}
.cm-s-solarized .cm-error,
.cm-s-solarized .cm-invalidchar {
  color: #586e75;
  border-bottom: 1px dotted #dc322f;
}

.cm-s-solarized.cm-s-dark div.CodeMirror-selected { background: #073642; }
.cm-s-solarized.cm-s-dark.CodeMirror ::-moz-selection { background: rgba(7, 54, 66, 0.99); }
.cm-s-solarized.cm-s-dark.CodeMirror ::selection { background: rgba(7, 54, 66, 0.99); }
.cm-s-solarized.cm-s-dark .CodeMirror-line::-moz-selection, .cm-s-dark .CodeMirror-line > span::-moz-selection, .cm-s-dark .CodeMirror-line > span > span::-moz-selection { background: rgba(7, 54, 66, 0.99); }

.cm-s-solarized.cm-s-light div.CodeMirror-selected { background: #eee8d5; }
.cm-s-solarized.cm-s-light .CodeMirror-line::-moz-selection, .cm-s-light .CodeMirror-line > span::-moz-selection, .cm-s-light .CodeMirror-line > span > span::-moz-selection { background: #eee8d5; }
.cm-s-solarized.cm-s-light .CodeMirror-line::selection, .cm-s-light .CodeMirror-line > span::selection, .cm-s-light .CodeMirror-line > span > span::selection { background: #eee8d5; }
.cm-s-solarized.cm-s-light .CodeMirror-line::-moz-selection, .cm-s-ligh .CodeMirror-line > span::-moz-selection, .cm-s-ligh .CodeMirror-line > span > span::-moz-selection { background: #eee8d5; }

/* Editor styling */



/* Little shadow on the view-port of the buffer view */
.cm-s-solarized.CodeMirror {
  -webkit-box-shadow: inset 7px 0 12px -6px #000;
  box-shadow: inset 7px 0 12px -6px #000;
}

/* Remove gutter border */
.cm-s-solarized .CodeMirror-gutters {
  border-right: 0;
}

/* Gutter colors and line number styling based of color scheme (dark / light) */

/* Dark */
.cm-s-solarized.cm-s-dark .CodeMirror-gutters {
  background-color: #073642;
}

.cm-s-solarized.cm-s-dark .CodeMirror-linenumber {
  color: #586e75;
  text-shadow: #021014 0 -1px;
}

/* Light */
.cm-s-solarized.cm-s-light .CodeMirror-gutters {
  background-color: #eee8d5;
}

.cm-s-solarized.cm-s-light .CodeMirror-linenumber {
  color: #839496;
}

/* Common */
.cm-s-solarized .CodeMirror-linenumber {
  padding: 0 5px;
}
.cm-s-solarized .CodeMirror-guttermarker-subtle { color: #586e75; }
.cm-s-solarized.cm-s-dark .CodeMirror-guttermarker { color: #ddd; }
.cm-s-solarized.cm-s-light .CodeMirror-guttermarker { color: #cb4b16; }

.cm-s-solarized .CodeMirror-gutter .CodeMirror-gutter-text {
  color: #586e75;
}

/* Cursor */
.cm-s-solarized .CodeMirror-cursor { border-left: 1px solid #819090; }

/* Fat cursor */
.cm-s-solarized.cm-s-light.cm-fat-cursor .CodeMirror-cursor { background: #77ee77; }
.cm-s-solarized.cm-s-light .cm-animate-fat-cursor { background-color: #77ee77; }
.cm-s-solarized.cm-s-dark.cm-fat-cursor .CodeMirror-cursor { background: #586e75; }
.cm-s-solarized.cm-s-dark .cm-animate-fat-cursor { background-color: #586e75; }

/* Active line */
.cm-s-solarized.cm-s-dark .CodeMirror-activeline-background {
  background: rgba(255, 255, 255, 0.06);
}
.cm-s-solarized.cm-s-light .CodeMirror-activeline-background {
  background: rgba(0, 0, 0, 0.06);
}
</style><style type="text/css">.cm-s-github.CodeMirror {
  background: #fff;
  color: #24292e;
}

.cm-s-github .CodeMirror-gutters {
  background: #fff;
  border-right-width: 0;
}

.cm-s-github .CodeMirror-guttermarker {
  color: white;
}

.cm-s-github .CodeMirror-guttermarker-subtle {
  color: #d0d0d0;
}

.cm-s-github .CodeMirror-linenumber {
  color: #959da5;
  padding: 0 16px 0 16px;
}

.cm-s-github .CodeMirror-cursor {
  border-left: 1px solid #24292e;
}

.cm-s-github div.CodeMirror-selected,
.cm-s-github .CodeMirror-line::selection,
.cm-s-github .CodeMirror-line > span::selection,
.cm-s-github .CodeMirror-line > span > span::selection,
.cm-s-github .CodeMirror-line::-moz-selection,
.cm-s-github .CodeMirror-line > span::-moz-selection,
.cm-s-github .CodeMirror-line > span > span::-moz-selection {
  background: #c8c8fa;
}

.cm-s-github .CodeMirror-activeline-background {
  background: #fafbfc;
}

.cm-s-github .CodeMirror-matchingbracket {
  text-decoration: underline;
  color: #24292e !important;
}

.cm-s-github .cm-comment { color: #6a737d; }

.cm-s-github .cm-keyword {
  color: #d73a49;
}

.cm-s-github .cm-string {
  font-weight: normal;
  font-style: normal;
  text-decoration: none;
  color: #032f62;
}

.cm-s-github span.cm-def { color: #6f42c1; }
.cm-s-github span.cm-atom { color: #005cc5; }
.cm-s-github span.cm-operator { color: #d73a49; }
.cm-s-github span.cm-number { color: #005cc5; }
.cm-s-github span.cm-meta { color: #005cc5; }
.cm-s-github span.cm-builtin { color: #005cc5; }
.cm-s-github span.cm-variable { color: #24292e; }
.cm-s-github span.cm-variable-2 { color: #005cc5; }
.cm-s-github span.cm-variable-3 { color: #d73a49; }
.cm-s-github span.cm-property { color: #24292e; }
.cm-s-github span.cm-tag { color: #005cc5; }
</style><style type="text/css">.cm-s-textmate.CodeMirror { color: #000000; background: #FFFFFF; }
.cm-s-textmate span.cm-meta {color: rgb(7, 32, 170);}
.cm-s-textmate span.cm-keyword { color: rgb(16, 51, 246); }
.cm-s-textmate span.cm-atom {color: rgb(88, 92, 246);}
.cm-s-textmate span.cm-number {color: rgb(11, 41, 206);}
.cm-s-textmate span.cm-def {color: rgb(16, 51, 246);}
.cm-s-textmate span.cm-variable {color: black;}
.cm-s-textmate span.cm-variable-2 {color: rgb(85, 148, 164);}
.cm-s-textmate span.cm-variable-3 {color: rgb(16, 51, 246);}
.cm-s-textmate span.cm-property {color: black;}
.cm-s-textmate span.cm-operator {color: rgb(16, 51, 246);}
.cm-s-textmate span.cm-comment {color: rgb(51, 126, 247);}
.cm-s-textmate span.cm-string {color: rgb(49, 120, 33);}
.cm-s-textmate span.cm-string-2 {color: rgb(193, 52, 32);}
.cm-s-textmate span.cm-error {color: #F00;}
.cm-s-textmate span.cm-qualifier {color: #555;}
.cm-s-textmate span.cm-builtin {color: rgb(109, 119, 240);}
.cm-s-textmate span.cm-bracket {color: #cc7;}
.cm-s-textmate span.cm-tag {color: rgb(16, 51, 246);}
.cm-s-textmate span.cm-attribute {color: #036A07;}

.cm-s-textmate .CodeMirror-activeline-background {background: #e8f2ff !important;}
.cm-s-textmate .CodeMirror-matchhighlight { background: #e9e9e9 }
.cm-s-textmate div.CodeMirror-selected { background: rgb(208, 227, 253); }
</style><style type="text/css">.cm-s-xcode.CodeMirror { color: #000000; background: #FFFFFF; }
.cm-s-xcode span.cm-meta {color: rgb(127, 75, 48);}
.cm-s-xcode span.cm-keyword { color: #C800A4; }
.cm-s-xcode span.cm-atom {color: rgb(178, 58, 158);}
.cm-s-xcode span.cm-number {color: #3A00DC;}
.cm-s-xcode span.cm-def {color: rgb(16, 51, 246);}
.cm-s-xcode span.cm-variable {color: black;}
.cm-s-xcode span.cm-variable-2 {color: rgb(105, 64, 164);}
.cm-s-xcode span.cm-variable-3 {color: #C900A4;}
.cm-s-xcode span.cm-property {color: black;}
.cm-s-xcode span.cm-operator {color: #C800A4;}
.cm-s-xcode span.cm-comment {color: #008E00;}
.cm-s-xcode span.cm-string {color: #DF0002;}
.cm-s-xcode span.cm-string-2 {color: rgb(193, 52, 32);}
.cm-s-xcode span.cm-error {color: #F00;}
.cm-s-xcode span.cm-qualifier {color: #555;}
.cm-s-xcode span.cm-builtin {color: rgb(178, 58, 158);}
.cm-s-xcode span.cm-bracket {color: #cc7;}
.cm-s-xcode span.cm-tag {color: rgb(16, 51, 246);}
.cm-s-xcode span.cm-attribute {color: #036A07;}

.cm-s-xcode .CodeMirror-matchingbracket {
  outline: 1px solid gray;
  color:black !important;
}
.cm-s-xcode .CodeMirror-activeline-background {background: rgb(238, 245, 254) !important;}
.cm-s-xcode .CodeMirror-matchhighlight { background: #e9e9e9 }
.cm-s-xcode div.CodeMirror-selected { background: rgb(185, 214, 252); }
</style><style type="text/css"></style><style type="text/css">@font-face{font-family:TypoRound;font-weight:normal;src:url(/static/webpack_bundles/font/Typo_Round_Regular.1a899395b.otf) format('opentype')}@font-face{font-family:TypoRound;font-style:italic;src:url(/static/webpack_bundles/font/Typo_Round_Italic.e145f2054.otf) format('opentype')}@font-face{font-family:TypoRound;font-weight:bold;src:url(/static/webpack_bundles/font/Typo_Round_Bold.4391ba69a.otf) format('opentype')}@font-face{font-family:TypoRound;font-weight:bold;font-style:italic;src:url(/static/webpack_bundles/font/Typo_Round_Bold_Italic.b03aac909.otf) format('opentype')}@font-face{font-family:TypoRound;font-weight:thin;src:url(/static/webpack_bundles/font/Typo_Round_Thin.81285367c.otf) format('opentype')}@font-face{font-family:TypoRound;font-weight:thin;font-style:italic;src:url(/static/webpack_bundles/font/Typo_Round_Thin_Italic.b82184009.otf) format('opentype')}@font-face{font-family:TypoRound;font-weight:lighter;src:url(/static/webpack_bundles/font/Typo_Round_Light.d737fd73e.otf) format('opentype')}@font-face{font-family:TypoRound;font-weight:lighter;font-style:italic;src:url(/static/webpack_bundles/font/Typo_Round_Light_Italic.698a944df.otf) format('opentype')}@font-face{font-family:FetteMittelschrift;font-weight:normal;font-style:normal;src:url(/static/webpack_bundles/font/FetteMittelschrift_Regular.30a0b93e1.ttf) format('truetype'),url(/static/webpack_bundles/font/FetteMittelschrift_Regular.7284ae0ed.woff2) format('woff2'),url(/static/webpack_bundles/font/FetteMittelschrift_Regular.d0ee387de.woff) format('woff')}@font-face{font-family:LcIconFont;src:url(/static/webpack_bundles/font/common_icon.dd75ff0b1.eot);src:url(/static/webpack_bundles/font/common_icon.dd75ff0b1.eot#iefix) format('embedded-opentype'),url(/static/webpack_bundles/font/common_icon.e0ddbb6d0.ttf) format('truetype'),url(/static/webpack_bundles/font/common_icon.89e10fa93.woff) format('woff'),url(/static/webpack_bundles/images/common_icon.e8842540c.svg#common_icon) format('svg');font-weight:normal;font-style:normal}</style><style type="text/css">.lc-animation-zoom-in-enter,.lc-animation-zoom-in-appear{-webkit-transform:translate3d(0, 0, 0);transform:translate3d(0, 0, 0);-webkit-transform-origin:center;transform-origin:center}.lc-animation-zoom-in-enter,.lc-animation-zoom-in-appear,.lc-animation-zoom-in-leave{-webkit-animation-duration:.2s;animation-duration:.2s;-webkit-animation-fill-mode:forwards;animation-fill-mode:forwards;-webkit-animation-timing-function:ease;animation-timing-function:ease;-webkit-animation-play-state:paused;animation-play-state:paused;opacity:0}.lc-animation-zoom-in-leave{opacity:1}.lc-animation-zoom-in-enter.lc-animation-zoom-in-enter-active,.lc-animation-zoom-in-appear.lc-animation-zoom-in-appear-active{-webkit-animation-name:lcZoomIn;animation-name:lcZoomIn;-webkit-animation-play-state:running;animation-play-state:running}.lc-animation-zoom-in-leave.lc-animation-zoom-in-leave-active{-webkit-animation-name:lcZoomIn;animation-name:lcZoomIn;animation-direction:reverse;-webkit-animation-play-state:running;animation-play-state:running;-webkit-animation-iteration-count:1;animation-iteration-count:1}@-webkit-keyframes lcZoomIn{from{-webkit-transform:scale(0);transform:scale(0);opacity:0}to{-webkit-transform:scale(1);transform:scale(1);opacity:1}}@keyframes lcZoomIn{from{-webkit-transform:scale(0);transform:scale(0);opacity:0}to{-webkit-transform:scale(1);transform:scale(1);opacity:1}}</style><style type="text/css">.simple-avatar__1nLM{display:inline-block}.simple-avatar__1nLM.hover-effect__2WOZ .simp-avatar__mRN_{-webkit-box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);box-shadow:0 5px 15px 0 rgba(0,0,0,0.08)}.simple-avatar__1nLM.hover-effect__2WOZ .simp-avatar__mRN_[data-has-link='true']{-webkit-box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);-webkit-transition:-webkit-box-shadow .4s;transition:-webkit-box-shadow .4s;-o-transition:box-shadow .4s;transition:box-shadow .4s;transition:box-shadow .4s, -webkit-box-shadow .4s}.simple-avatar__1nLM.hover-effect__2WOZ .simp-avatar__mRN_[data-has-link='true']:hover{-webkit-box-shadow:0 15px 30px 0 rgba(0,0,0,0.15);box-shadow:0 15px 30px 0 rgba(0,0,0,0.15)}.simp-avatar__mRN_{border-radius:1020px}.simp-avatar__mRN_[data-has-link='true']{cursor:pointer}.text-avatar__5boC{display:inline-block;font-weight:200;text-align:center;padding-top:5px;font-size:14px;background:#bdc3c7;color:white}</style><style type="text/css">.content__3Tyz{text-align:left}.header__2HEG b{font-size:20px}.header__2HEG span{font-size:14px}</style><style type="text/css">.perfect-wrap__FosU{display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-ms-flex-direction:column;flex-direction:column}.perfect-wrap__FosU::before{content:' ';-webkit-box-flex:.618;-ms-flex-positive:.618;flex-grow:.618}.perfect-wrap__FosU::after{content:' ';-webkit-box-flex:1;-ms-flex-positive:1;flex-grow:1}.base-modal__2SlO{min-width:300px;max-width:80vw;margin:20px auto}.base-modal__2SlO .rc-dialog-body>.close{position:absolute;top:15px;right:15px}.reset-rc-dialog-body-style__23jm .rc-dialog-body{padding:0}.reset-rc-dialog-content-border__2pcz .rc-dialog-content{border:none}</style><style type="text/css">.setting-btn__2v2k+.popover{white-space:nowrap;max-width:none}.setting-board-modal__FolE .description__21Ft{padding-bottom:5px}.setting-board-modal__FolE .description__21Ft .theme-base__3FF5{margin-top:-5px;margin-bottom:5px;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-orient:horizontal;-webkit-box-direction:normal;-ms-flex-flow:row wrap;flex-flow:row wrap;max-width:100%}@media (max-width:480px){.setting-board-modal__FolE .description__21Ft .theme-base__3FF5{display:block}.setting-board-modal__FolE .description__21Ft .theme-base__3FF5 .theme-header__3ha3,.setting-board-modal__FolE .description__21Ft .theme-base__3FF5 .theme-detail__3hL9,.setting-board-modal__FolE .description__21Ft .theme-base__3FF5 .theme-select-wrapper__sJO3{width:100%;margin-top:0;margin-bottom:10px}}.setting-board-modal__FolE .description__21Ft .option-base__2npZ{margin-top:5px;margin-bottom:5px;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-orient:horizontal;-webkit-box-direction:normal;-ms-flex-flow:row wrap;flex-flow:row wrap;max-width:100%}@media (max-width:480px){.setting-board-modal__FolE .description__21Ft .option-base__2npZ{display:block}.setting-board-modal__FolE .description__21Ft .option-base__2npZ .option-header__al9K,.setting-board-modal__FolE .description__21Ft .option-base__2npZ .option-detail__4qEK,.setting-board-modal__FolE .description__21Ft .option-base__2npZ .option-select-wrapper__Zj-G{width:100%;margin-top:0;margin-bottom:10px}}.setting-board-modal__FolE .description__21Ft .theme-header__3ha3,.setting-board-modal__FolE .description__21Ft .option-header__al9K{-webkit-box-flex:0;-ms-flex:0 0 70%;flex:0 0 70%;font-size:16px;font-weight:500;margin-top:2px}.setting-board-modal__FolE .description__21Ft .theme-detail__3hL9,.setting-board-modal__FolE .description__21Ft .option-detail__4qEK{-webkit-box-flex:0;-ms-flex:0 0 65%;flex:0 0 65%;margin-top:-15px;font-size:small;color:grey}.setting-board-modal__FolE .description__21Ft .theme-select-wrapper__sJO3,.setting-board-modal__FolE .description__21Ft .option-select-wrapper__Zj-G{-webkit-box-flex:1;-ms-flex:1;flex:1;margin-top:15px}.setting-board-modal__FolE .description__21Ft .base-line__Agul{margin-top:10px;margin-bottom:10px}.block-popover__Bye8{display:block;height:100%}</style><style type="text/css">.lc-alert-base__GTOx{position:fixed;z-index:150;top:0;left:0;width:100%;height:100%;opacity:0}.lc-alert-base__GTOx[data-status='entered']{-webkit-transition:.2s all;-o-transition:.2s all;transition:.2s all;opacity:1}.lc-alert-base__GTOx[data-status='entering'],.lc-alert-base__GTOx[data-status='exiting'],.lc-alert-base__GTOx[data-status='exited']{-webkit-transition:.6s all;-o-transition:.6s all;transition:.6s all;opacity:0}.lc-alert-base__GTOx[data-status='entering'] .alert-content__2Ke2>.inner__3Zl8,.lc-alert-base__GTOx[data-status='exiting'] .alert-content__2Ke2>.inner__3Zl8,.lc-alert-base__GTOx[data-status='exited'] .alert-content__2Ke2>.inner__3Zl8{-webkit-transition:.2s all;-o-transition:.2s all;transition:.2s all;opacity:0;-webkit-transform:translateY(20px);transform:translateY(20px);-webkit-animation-timing-function:ease-in;animation-timing-function:ease-in}.lc-alert-base__GTOx[data-status='exited']{display:none}.bg-cover__251O{position:absolute;z-index:-1;top:0;left:0;background:rgba(0,0,0,0.6);width:100%;height:100%;-webkit-backdrop-filter:blur(5px);backdrop-filter:blur(5px)}.lc-alert__2567{z-index:1}.alert-content__2Ke2{position:absolute;top:50%;left:50%;-webkit-transform:translate(-50%, -50%);transform:translate(-50%, -50%);width:520px}@media (max-width:520px){.alert-content__2Ke2{width:100%}}.inner__3Zl8{-webkit-transition:.2s all;-o-transition:.2s all;transition:.2s all;opacity:1;-webkit-transform:translateY(0);transform:translateY(0);-webkit-animation-timing-function:ease-in;animation-timing-function:ease-in;-webkit-transform-origin:50% 50%;transform-origin:50% 50%;width:calc(100% - 40px);margin:auto}.inner-content__3Pbg{background-color:white;min-height:100px;border-radius:10px;display:-webkit-box;display:-ms-flexbox;display:flex}.close-modal-btn__1W8e{cursor:pointer;z-index:1;position:absolute;right:10px;top:23px;width:25px;height:25px}.close-modal-btn__1W8e:hover .cross__UZjL{background:#ac2925}.close-modal-btn__1W8e .cross__UZjL{-webkit-transition:.4s all;-o-transition:.4s all;transition:.4s all;border-radius:1020px;background:#dddddd;height:2px;width:25px;-webkit-transform-origin:50% 50%;transform-origin:50% 50%}.close-modal-btn__1W8e .cross__UZjL:first-child{-webkit-transform:rotate(45deg) translateY(1px);transform:rotate(45deg) translateY(1px)}.close-modal-btn__1W8e .cross__UZjL:last-child{-webkit-transform:rotate(-45deg) translateY(-1px);transform:rotate(-45deg) translateY(-1px)}</style><style type="text/css">.lc-alert-title__3sym{width:100%;font-weight:500;white-space:nowrap;overflow:hidden;-o-text-overflow:ellipsis;text-overflow:ellipsis;font-size:16px;padding:14px 18px 2px 18px;-webkit-box-flex:1;-ms-flex:1;flex:1;-webkit-transition:.2s all;-o-transition:.2s all;transition:.2s all}.lc-alert-title__3sym[data-status='entering'],.lc-alert-title__3sym[data-status='exiting'],.lc-alert-title__3sym[data-status='exited']{-webkit-box-flex:0;-ms-flex:0;flex:0;padding:0}.lc-alert-title__3sym[data-status='exited']{display:none}</style><style type="text/css">.lc-alert-body__E0c3{color:#95a5a6;padding:6px 18px;-webkit-box-flex:1;-ms-flex:1;flex:1;-webkit-transition:.2s all;-o-transition:.2s all;transition:.2s all}.lc-alert-body__E0c3[data-status='entering'],.lc-alert-body__E0c3[data-status='exiting'],.lc-alert-body__E0c3[data-status='exited']{-webkit-box-flex:0;-ms-flex:0;flex:0;padding:0}.lc-alert-body__E0c3[data-status='exited']{display:none}</style><style type="text/css">.lc-alert-button__7Byx,.lc-alert-dropdown-container__1R8y{display:-webkit-inline-box;display:-ms-inline-flexbox;display:inline-flex}.lc-alert-button__7Byx{display:-webkit-inline-box;display:-ms-inline-flexbox;display:inline-flex;-webkit-box-align:baseline;-ms-flex-align:baseline;align-items:baseline;padding:6px 10px;color:#00acff;font-weight:500;border-radius:4px}.lc-alert-button__7Byx:hover{cursor:pointer;background-color:#ecf0f1}.lc-alert-dropdown__2OPY{position:absolute;border-radius:4px;background-color:white;-webkit-box-shadow:rgba(0,0,0,0.2) 0 2px 5px;box-shadow:rgba(0,0,0,0.2) 0 2px 5px;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-ms-flex-direction:column;flex-direction:column;top:calc(100% - 10px);right:5px}.lc-alert-dropdown-button__3h8l{font-weight:500;padding:6px 10px;border-radius:0;color:#00acff;max-width:250px;overflow:hidden;-o-text-overflow:ellipsis;text-overflow:ellipsis;white-space:nowrap}.lc-alert-dropdown-button__3h8l:hover{cursor:pointer;background-color:#ecf0f1}.lc-alert-dropdown-button__3h8l:first-child{border-top-left-radius:4px;border-top-right-radius:4px}.lc-alert-dropdown-button__3h8l:last-child{border-bottom-left-radius:4px;border-bottom-right-radius:4px}.delete__12NY,.danger__2Bvz{color:#d05451}.cancel__16wG{}.submit__KYJA{}.confirm__3w_p{}.delete-dropdown__1Ju6{color:#d05451}.cancel-dropdown__1SO8{}.submit-dropdown__1ydo{}.confirm-dropdown__2zkJ{}.disabled__1uZ_{color:#bdc3c7}.disabled__1uZ_:hover{cursor:default;background-color:transparent}</style><style type="text/css">.lc-alert-button-group__2THN{display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-pack:end;-ms-flex-pack:end;justify-content:flex-end;-ms-flex-item-align:end;align-self:flex-end;-webkit-box-flex:0;-ms-flex-positive:0;flex-grow:0;max-height:32px;margin:2px 12px 8px;-webkit-transition:.2s all;-o-transition:.2s all;transition:.2s all}.lc-alert-button-group__2THN[data-status='entering'],.lc-alert-button-group__2THN[data-status='exiting'],.lc-alert-button-group__2THN[data-status='exited']{max-height:0}.lc-alert-button-group__2THN[data-status='exited']{display:none}</style><style type="text/css">.lc-alert-icon-container__EZ61{color:white;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-align:center;-ms-flex-align:center;align-items:center;-webkit-box-pack:center;-ms-flex-pack:center;justify-content:center;height:65px;width:100%;-ms-flex-item-align:start;align-self:flex-start;-webkit-box-flex:0;-ms-flex:0 0 60px;flex:0 0 60px;max-height:60px;-webkit-transition:.2s all;-o-transition:.2s all;transition:.2s all;border-radius:4px;margin:8px 0}.lc-alert-icon-container__EZ61[data-status='entering'],.lc-alert-icon-container__EZ61[data-status='exiting'],.lc-alert-icon-container__EZ61[data-status='exited']{max-height:0}.lc-alert-icon-container__EZ61[data-status='exited']{display:none}</style><style type="text/css">.lc-alert-content__4Rv0{width:100%;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-ms-flex-direction:column;flex-direction:column;-webkit-box-flex:1;-ms-flex:1;flex:1}.lc-alert-content__4Rv0[data-show-close-button='true'] .lc-alert-title-container__3t-v{width:calc(100% - 30px)}</style><style type="text/css">.lc-notification-body__3xIU{color:black;font-size:12px;max-height:40px;line-height:1.5}.lc-notification-body__3xIU[data-status='exited']{display:none}</style><style type="text/css">.lc-notification-title__1PHD{font-weight:500;white-space:nowrap;overflow:hidden;-o-text-overflow:ellipsis;text-overflow:ellipsis;font-size:11px;text-transform:uppercase;color:#95a5a6}</style><style type="text/css">.lc-notification-title-body-wrapper__1Jk_{display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-ms-flex-direction:column;flex-direction:column;-webkit-box-flex:1;-ms-flex:1;flex:1;padding:10px 10px 10px 14px;min-width:0;-webkit-box-pack:center;-ms-flex-pack:center;justify-content:center}</style><style type="text/css">.lc-notification-content__2Ub-{width:100%;height:100%;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-orient:horizontal;-webkit-box-direction:normal;-ms-flex-direction:row;flex-direction:row;-ms-flex-line-pack:stretch;align-content:stretch}@media (min-width:768px){.lc-notification-content__2Ub-{width:300px}}.lc-notification-content__2Ub-[data-show-close-button='true'] .lc-notification-title-container__1tNY{width:calc(100% - 20px)}</style><style type="text/css">.lc-notification-wrapper__129j{position:absolute;top:52px;right:0;width:310px;padding:5px;overflow-x:hidden;z-index:150;-webkit-transition:.2s all 0s top;-o-transition:.2s all 0s top;transition:.2s all 0s top}@media screen and (max-width:767px){.lc-notification-wrapper__129j{width:100%;position:absolute;top:0;margin-top:0 !important;padding:0}}.notification-content__6NBh{display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-ms-flex-direction:column;flex-direction:column;z-index:150;padding-bottom:5px}@media screen and (max-width:767px){.notification-content__6NBh{width:100%}}.notification-content__6NBh[data-status='entered']{-webkit-transition:all .2s,top 0ms;-o-transition:all .2s,top 0ms;transition:all .2s,top 0ms}@media screen and (min-width:768px){.notification-content__6NBh[data-status='entered']{-webkit-transform:translateX(0);transform:translateX(0)}}@media screen and (max-width:767px){.notification-content__6NBh[data-status='entered']{margin-top:0}}.notification-content__6NBh[data-status='entering'],.notification-content__6NBh[data-status='exiting'],.notification-content__6NBh[data-status='exited']{-webkit-transition:all .2s,top 0ms;-o-transition:all .2s,top 0ms;transition:all .2s,top 0ms}@media screen and (min-width:768px){.notification-content__6NBh[data-status='entering'],.notification-content__6NBh[data-status='exiting'],.notification-content__6NBh[data-status='exited']{-webkit-transform:translateX(105%);transform:translateX(105%)}}@media screen and (max-width:767px){.notification-content__6NBh[data-status='entering'],.notification-content__6NBh[data-status='exiting'],.notification-content__6NBh[data-status='exited']{margin-top:-65px}}.notification-content__6NBh[data-status='entering'] .notification-content__6NBh>.inner__GYIP,.notification-content__6NBh[data-status='exiting'] .notification-content__6NBh>.inner__GYIP,.notification-content__6NBh[data-status='exited'] .notification-content__6NBh>.inner__GYIP{-webkit-transition:.2s all;-o-transition:.2s all;transition:.2s all;opacity:0;-webkit-transform:translateY(20px);transform:translateY(20px);-webkit-animation-timing-function:ease-in;animation-timing-function:ease-in}.notification-content__6NBh[data-status='exited']{display:none}.notification-content__6NBh>.inner__GYIP{-webkit-transition:.2s all;-o-transition:.2s all;transition:.2s all;opacity:1;-webkit-transform:translateY(0);transform:translateY(0);-webkit-animation-timing-function:ease-in;animation-timing-function:ease-in;-webkit-transform-origin:50% 50%;transform-origin:50% 50%;width:100%;position:-webkit-sticky;position:sticky;top:0;-ms-flex-item-align:start;align-self:flex-start}.notification-content__6NBh>.inner__GYIP .inner-content__1IIy{z-index:150;background-color:white;min-width:100px;height:65px;width:100%;padding:0;display:-webkit-box;display:-ms-flexbox;display:flex;overflow:hidden;-webkit-box-shadow:rgba(0,0,0,0.2) 0 2px 5px;box-shadow:rgba(0,0,0,0.2) 0 2px 5px}@media screen and (min-width:768px){.notification-content__6NBh>.inner__GYIP .inner-content__1IIy{border-radius:4px}}.close-notification-btn__2ppp{cursor:pointer;z-index:1;position:absolute;right:6px;top:13px;width:15px;height:15px}.close-notification-btn__2ppp:hover .cross__q6mv{background:#ac2925}.close-notification-btn__2ppp .cross__q6mv{-webkit-transition:.4s all;-o-transition:.4s all;transition:.4s all;border-radius:1020px;background:#dddddd;height:2px;width:15px;-webkit-transform-origin:50% 50%;transform-origin:50% 50%}.close-notification-btn__2ppp .cross__q6mv:first-child{-webkit-transform:rotate(45deg) translateY(1px);transform:rotate(45deg) translateY(1px)}.close-notification-btn__2ppp .cross__q6mv:last-child{-webkit-transform:rotate(-45deg) translateY(-1px);transform:rotate(-45deg) translateY(-1px)}@media screen and (min-width:768px){.fixed__22l5{position:fixed;top:5px;right:5px}}</style><style type="text/css">.lc-notification-button__w3Vq,.lc-notification-dropdown-container__TQAK{display:-webkit-inline-box;display:-ms-inline-flexbox;display:inline-flex}.lc-notification-dropdown__1vou{position:absolute;border-radius:4px;background-color:white;-webkit-box-shadow:rgba(0,0,0,0.2) 0 2px 5px;box-shadow:rgba(0,0,0,0.2) 0 2px 5px;top:calc(100% + 1px);right:0;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-ms-flex-direction:column;flex-direction:column}.lc-notification-dropdown-container__TQAK{border-top:1px solid #ecf0f1}.lc-notification-dropdown-container__TQAK:first-child{border-top:none}.lc-notification-dropdown-container__TQAK:first-child .lc-notification-button__w3Vq{border-top-right-radius:4px}.lc-notification-dropdown-container__TQAK .lc-notification-button__w3Vq{border-top-right-radius:0;border-bottom-right-radius:4px}.lc-notification-button__w3Vq{width:100%;max-width:42px;padding:6px;-webkit-box-sizing:content-box;box-sizing:content-box;font-size:12px;font-weight:400;color:#95a5a6;overflow:hidden;-o-text-overflow:ellipsis;text-overflow:ellipsis;white-space:nowrap;-webkit-box-pack:center;-ms-flex-pack:center;justify-content:center;-webkit-box-align:center;-ms-flex-align:center;align-items:center;border-top:1px solid #ecf0f1;-webkit-box-flex:1;-ms-flex:1;flex:1}.lc-notification-button__w3Vq .lc-notification-button__w3Vq{border-top:none}.lc-notification-button__w3Vq:hover{cursor:pointer;background-color:#ecf0f1}.lc-notification-button__w3Vq:first-child{border-top:none;border-top-right-radius:4px}.lc-notification-button__w3Vq:last-child{border-bottom-right-radius:4px}.lc-notification-dropdown-button__1Fq5{max-width:250px;min-width:55px;overflow:hidden;-o-text-overflow:ellipsis;text-overflow:ellipsis;white-space:nowrap;padding:6px;border-top:1px solid #ecf0f1;font-size:12px;font-weight:400;color:#95a5a6}.lc-notification-dropdown-button__1Fq5:first-child{border-top:none;border-top-right-radius:4px}.lc-notification-dropdown-button__1Fq5:last-child{border-bottom-right-radius:4px}.lc-notification-dropdown-button__1Fq5:hover{cursor:pointer;background-color:#ecf0f1}.disabled__1YhJ{color:#bdc3c7}.disabled__1YhJ:hover{cursor:default;background-color:transparent}</style><style type="text/css">.lc-notification-button-group__35sv{display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-ms-flex-direction:column;flex-direction:column;-webkit-box-flex:0;-ms-flex:0 0 55px;flex:0 0 55px;border-left:1px solid #ecf0f1;-ms-flex-item-align:end;align-self:flex-end;height:100%}.lc-notification-button-group__35sv[data-status='exited']{display:none}</style><style type="text/css">.lc-notification-icon-container__1YjM{color:white;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-align:center;-ms-flex-align:center;align-items:center;-webkit-box-pack:center;-ms-flex-pack:center;justify-content:center;height:65px;-ms-flex-item-align:start;align-self:flex-start;-webkit-box-flex:0;-ms-flex:0 0 59px;flex:0 0 59px}@media screen and (min-width:768px){.lc-notification-icon-container__1YjM{border-top-left-radius:4px;border-bottom-left-radius:4px}}</style><style type="text/css">.message-box__17I3{position:relative;margin:15px 0;padding:15px 20px;border-radius:5px}.message-box__17I3 .close__1QFu{position:absolute;top:15px;right:15px;-webkit-user-select:none;-moz-user-select:none;-ms-user-select:none;user-select:none}</style><style type="text/css">.crash__1bT4{position:absolute;left:0;right:0;top:0;bottom:0;margin:auto;width:300px;height:150px;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-ms-flex-direction:column;flex-direction:column;-webkit-box-pack:center;-ms-flex-pack:center;justify-content:center;-webkit-box-align:center;-ms-flex-align:center;align-items:center}</style><script type="text/javascript" charset="utf8" async="" src="./circularQueue_files/en.js.download"></script><style type="text/css">.loading__2SyG{display:inline-block;color:#3c4859;text-shadow:0 0 5px rgba(0,0,0,0.3)}.loading__2SyG[data-show='false']{display:none}</style><style type="text/css">.loading-area__2xs9{position:relative;display:block;height:100%}.loading-area__2xs9[data-show='false']{display:none}.loading-icon__1IZD{position:absolute;top:0;right:0;bottom:0;left:0;margin:auto;width:24px;height:24px;font-size:24px}</style><style type="text/css">.page-drawer-base__-zHW{-webkit-transition:.4s all !important;-o-transition:.4s all !important;transition:.4s all !important;position:fixed;bottom:0;left:0;width:100%;z-index:147;border-top:1px solid #dddddd;background:white;min-height:200px;height:auto;-webkit-box-shadow:0 0 50px 0 rgba(0,0,0,0.15);box-shadow:0 0 50px 0 rgba(0,0,0,0.15);-webkit-transition:-webkit-box-shadow .4s;transition:-webkit-box-shadow .4s;-o-transition:box-shadow .4s;transition:box-shadow .4s;transition:box-shadow .4s, -webkit-box-shadow .4s}.page-drawer-base__-zHW:hover{-webkit-box-shadow:0 0 50px 0 rgba(0,0,0,0.3);box-shadow:0 0 50px 0 rgba(0,0,0,0.3)}.page-drawer-base__-zHW[data-appear='false']{min-height:0 !important;height:0 !important;opacity:0}.page-drawer-base__-zHW[data-appear='true']{opacity:1}.page-drawer-base__-zHW[data-fullscreen='true']{min-height:calc(100vh - 52px - 40px / 2 - 10px)}.page-drawer-base__-zHW .btn-container{height:0;z-index:1}.page-drawer-base__-zHW .content-container{height:100%;margin:0 10px}.page-drawer-base__-zHW .fullscreen-btn{-webkit-box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);-webkit-transition:-webkit-box-shadow .4s;transition:-webkit-box-shadow .4s;-o-transition:box-shadow .4s;transition:box-shadow .4s;transition:box-shadow .4s, -webkit-box-shadow .4s;border:1px solid #dddddd;height:40px;width:40px;margin-top:-22px;text-align:center;padding:8px 0 0 0}.page-drawer-base__-zHW .fullscreen-btn:hover{-webkit-box-shadow:0 15px 30px 0 rgba(0,0,0,0.15);box-shadow:0 15px 30px 0 rgba(0,0,0,0.15)}.fullscreen-btn-wrapper__1TBu{display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-pack:end;-ms-flex-pack:end;justify-content:flex-end}</style><style type="text/css">.wrapper__2vgc .progress{height:12px;margin:0}</style><style type="text/css">.search-input__1IOH{display:inline-block;border-top-right-radius:0;border-bottom-right-radius:0;width:calc(100% - 38px)}.search-btn__2pHJ{border-left:none;border-top-left-radius:0;border-bottom-left-radius:0}.base__1K9q[data-round='true'] .search-input__1IOH{border-top-left-radius:1020px;border-bottom-left-radius:1020px}.base__1K9q[data-round='true'] .search-btn__2pHJ{width:38px;border-top-right-radius:1020px;border-bottom-right-radius:1020px}</style><style type="text/css">.switch-base__1Zql{display:inline-block;position:relative;border:1px solid #dddddd;border-radius:1020px;height:24px;width:45px;cursor:pointer}.switch-base__1Zql,.switch-base__1Zql *{-webkit-transition:.4s all;-o-transition:.4s all;transition:.4s all}.switch-base__1Zql .toggle__3ZBJ{height:20px;width:20px;background:white;-webkit-box-shadow:0 3px 5px 0 rgba(0,0,0,0.1);box-shadow:0 3px 5px 0 rgba(0,0,0,0.1);border:1px solid #dddddd;border-radius:1020px;position:absolute;top:1px}.switch-base__1Zql[data-on='false'] .toggle__3ZBJ{left:1px}.switch-base__1Zql[data-on='true']{background:#1da09c}.switch-base__1Zql[data-on='true'] .toggle__3ZBJ{border:1px solid white;left:22px}</style><style type="text/css">.group__3y5f .btn:focus{outline:none}.group__3y5f .btn[data-active='true']{background:#d2d8e0;pointer-events:none}</style><style type="text/css">.pagination-base__aILV .page-btn,.pagination-base__aILV .prev-btn,.pagination-base__aILV .next-btn{cursor:pointer}.pagination-base__aILV.light-pager__1ng8{text-align:center}.pagination-base__aILV.light-pager__1ng8 .disabled,.pagination-base__aILV.light-pager__1ng8 *:disabled{opacity:.5;pointer-events:none}.pagination-base__aILV.light-pager__1ng8 .prev-btn,.pagination-base__aILV.light-pager__1ng8 .next-btn{position:absolute}.pagination-base__aILV.light-pager__1ng8 .prev-btn,.pagination-base__aILV.light-pager__1ng8 .next-btn,.pagination-base__aILV.light-pager__1ng8 .prev-btn:hover,.pagination-base__aILV.light-pager__1ng8 .next-btn:hover{background:transparent !important}.pagination-base__aILV.light-pager__1ng8 .prev-btn>*,.pagination-base__aILV.light-pager__1ng8 .next-btn>*{height:32px;width:32px;text-align:center;padding-left:0;padding-right:0;font-size:0;color:transparent;padding-top:7px;border:none;border-top-left-radius:1020px !important;border-top-right-radius:1020px !important;border-bottom-left-radius:1020px !important;border-bottom-right-radius:1020px !important;background:white;-webkit-box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);-webkit-transition:-webkit-box-shadow .4s;transition:-webkit-box-shadow .4s;-o-transition:box-shadow .4s;transition:box-shadow .4s;transition:box-shadow .4s, -webkit-box-shadow .4s}.pagination-base__aILV.light-pager__1ng8 .prev-btn>*:hover,.pagination-base__aILV.light-pager__1ng8 .next-btn>*:hover{-webkit-box-shadow:0 15px 30px 0 rgba(0,0,0,0.15);box-shadow:0 15px 30px 0 rgba(0,0,0,0.15)}.pagination-base__aILV.light-pager__1ng8 .page-btn>*{border-radius:10px;border:none;margin-left:5px;margin-right:5px;background:white;-webkit-box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);-webkit-transition:-webkit-box-shadow .4s;transition:-webkit-box-shadow .4s;-o-transition:box-shadow .4s;transition:box-shadow .4s;transition:box-shadow .4s, -webkit-box-shadow .4s}.pagination-base__aILV.light-pager__1ng8 .page-btn>*:hover{-webkit-box-shadow:0 15px 30px 0 rgba(0,0,0,0.15);box-shadow:0 15px 30px 0 rgba(0,0,0,0.15)}.pagination-base__aILV.light-pager__1ng8 .page-btn>*:active,.pagination-base__aILV.light-pager__1ng8 .page-btn>*.active,.pagination-base__aILV.light-pager__1ng8 .page-btn>*:focus{background-color:#3fbbff !important}.pagination-base__aILV.light-pager__1ng8 .page-btn.disabled>*{-webkit-box-shadow:none !important;box-shadow:none !important;background:none !important}.pagination-base__aILV.light-pager__1ng8 .prev-btn{left:0}.pagination-base__aILV.light-pager__1ng8 .prev-btn>*::after{color:black;font:normal normal normal 16px/1 FontAwesome;content:'\F104'}.pagination-base__aILV.light-pager__1ng8 .next-btn{right:0}.pagination-base__aILV.light-pager__1ng8 .next-btn>*::after{color:black;font:normal normal normal 16px/1 FontAwesome;content:'\F105'}.pagination-base__aILV.light-pager__1ng8 .page-btn:active,.pagination-base__aILV.light-pager__1ng8 .page-btn.active,.pagination-base__aILV.light-pager__1ng8 .page-btn:focus,.pagination-base__aILV.light-pager__1ng8 .page-btn:active *,.pagination-base__aILV.light-pager__1ng8 .page-btn.active *,.pagination-base__aILV.light-pager__1ng8 .page-btn:focus *{background-color:#3fbbff !important}.pagination-base__aILV.light-pager__1ng8 .pagination>.active>a,.pagination-base__aILV.light-pager__1ng8 .pagination>.active>a:focus,.pagination-base__aILV.light-pager__1ng8 .pagination>.active>a:hover,.pagination-base__aILV.light-pager__1ng8 .pagination>.active>span,.pagination-base__aILV.light-pager__1ng8 .pagination>.active>span:focus,.pagination-base__aILV.light-pager__1ng8 .pagination>.active>span:hover{background-color:#3fbbff !important}</style><style type="text/css">.share-button-cn-base__8y9z .need-share-button{position:inherit;display:inline-block}.share-button-cn-base__8y9z .need-share-button_dropdown{opacity:1;display:block;visibility:visible;background:none;-webkit-box-shadow:none;box-shadow:none;-webkit-transition:none;-o-transition:none;transition:none;-webkit-transform:none;transform:none;position:inherit;top:inherit;left:inherit;margin-top:0;margin-left:0 !important;width:inherit}.share-button-cn-base__8y9z .need-share-button_dropdown#share-widget{margin-left:0}.share-button-cn-base__8y9z .need-share-button_dropdown,.share-button-cn-base__8y9z .need-share-button_dropdown *{-webkit-user-select:none;-moz-user-select:none;-ms-user-select:none;user-select:none}.share-button-cn-base__8y9z .need-share-button_dropdown span.need-share-button_link{position:relative;top:2px;line-height:0;height:25px;width:32px;font-size:18px}.share-button-cn-base__8y9z .need-share-button_dropdown .need-share-wechat-code-image{-webkit-box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);-webkit-transition:-webkit-box-shadow .4s;transition:-webkit-box-shadow .4s;-o-transition:box-shadow .4s;transition:box-shadow .4s;transition:box-shadow .4s, -webkit-box-shadow .4s;border-radius:5px;z-index:5;margin-top:10px;position:absolute;width:192px}.share-button-cn-base__8y9z .need-share-button_dropdown .need-share-wechat-code-image:hover{-webkit-box-shadow:0 15px 30px 0 rgba(0,0,0,0.15);box-shadow:0 15px 30px 0 rgba(0,0,0,0.15)}.share-button-cn-base__8y9z .need-share-button_dropdown span.icon-wechat{color:#2ec102}.share-button-cn-base__8y9z .need-share-button_dropdown span.icon-wechat::before{font-size:17px;font-family:FontAwesome;content:'\F1D7'}.share-button-cn-base__8y9z .need-share-button_dropdown span.icon-weibo{color:#ec0017}.share-button-cn-base__8y9z .need-share-button_dropdown span.icon-weibo::before{font-size:19px;font-family:FontAwesome;content:'\F18A'}.share-button-cn-base__8y9z .need-share-button_dropdown span.icon-qqzone{color:#0098e6}.share-button-cn-base__8y9z .need-share-button_dropdown span.icon-qqzone::before{font-size:17px;font-family:FontAwesome;content:'\F1D6'}.share-button-cn-base__8y9z .need-share-button_dropdown span.icon-linkedin{top:3px;color:#0177b9}.share-button-cn-base__8y9z .need-share-button_dropdown span.icon-linkedin::before{font-size:20px;font-family:FontAwesome;content:'\F08C'}</style><style type="text/css">.share-button__1qQ5{display:inline-block;margin-right:5px;text-align:center;cursor:pointer}.share-button__1qQ5:last-child{margin-right:0}.cn-container__30AW{text-align:center}</style><style type="text/css">.not-found-wrapper__3V_q{width:100%;margin-top:140px;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-pack:center;-ms-flex-pack:center;justify-content:center;-webkit-box-align:center;-ms-flex-align:center;align-items:center}.not-found-wrapper__3V_q img,.not-found-wrapper__3V_q .text__2qI2{width:300px}@media (max-width:400px){.not-found-wrapper__3V_q img,.not-found-wrapper__3V_q .text__2qI2{width:100%}}.not-found-wrapper__3V_q img{padding:0 15px}.not-found-wrapper__3V_q .text__2qI2{padding:0 15px 0 30px}.not-found-wrapper__3V_q .text__2qI2 h3{font-size:30px;font-weight:500}.not-found-wrapper__3V_q .text__2qI2 .redirect-btn__1sb1{padding:6px 12px;margin-top:25px}@media (max-width:992px){.not-found-wrapper__3V_q{-webkit-box-orient:vertical;-webkit-box-direction:normal;-ms-flex-direction:column;flex-direction:column;margin-top:40px}}</style><style type="text/css">.playground-create-btn-dropdown:hover .add-icon,.playground-create-btn-dropdown.expanded-dropdown .add-icon{opacity:1 !important}.playground-create-btn-dropdown:hover .dropdown-content,.playground-create-btn-dropdown.expanded-dropdown .dropdown-content{display:block}.nav-img-animation img{-webkit-filter:brightness(.85);filter:brightness(.85);-webkit-transition:all .4s;-o-transition:all .4s;transition:all .4s}.nav-img-animation:hover img{-webkit-filter:none;filter:none}.navbar #playgroundNav{margin-top:12px;margin-left:10px}.navbar #playgroundNav .dropdown{text-align:center}.navbar #playgroundNav .dropdown-menu{width:160px;left:50%;margin-left:-80px}.navbar #playgroundNav .square{margin-left:75px;z-index:-1;background:white;-webkit-transform:rotate(45deg);transform:rotate(45deg);height:10px;width:10px}.navbar #playgroundNav .dropdown-view{background:white;border-radius:5px;margin-top:-5px;font-size:10px;color:#95a5a6}.navbar #playgroundNav .dropdown-view .select-title{padding-top:5px;padding-bottom:5px;margin-left:5px;margin-right:5px;border-bottom:1px solid #ecf0f1}.navbar #playgroundNav .dropdown-view .selection-left{border-right:1px solid #ecf0f1}.navbar #playgroundNav .dropdown-view .selection-bottom{border-top:1px solid #ecf0f1;margin-left:5px;margin-right:5px;padding-top:5px;padding-bottom:5px}.navbar #playgroundNav .dropdown-view .selection-bottom .selector{margin-left:0;margin-right:0}.navbar #playgroundNav .dropdown-view .selector{cursor:pointer;padding-top:5px;padding-bottom:5px;margin-left:5px;margin-right:5px;border-radius:5px}.navbar #playgroundNav .dropdown-view .selector:hover{background:#f5f5f5}.navbar #playgroundNav .dropdown-view .selection{cursor:pointer;width:50%;display:inline-block;margin-top:5px;margin-bottom:5px}.navbar #playgroundNav .dropdown-view .selection .icon{font-size:28px;font-weight:200;height:40px;line-height:initial;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-align:center;-ms-flex-align:center;align-items:center;-webkit-box-pack:center;-ms-flex-pack:center;justify-content:center}.navbar #playgroundNav .dropdown-view .selection .icon>.fa{font-size:.55em}.navbar #playgroundNav .dropdown-view .selection .new-icon{color:#0088cc}.navbar #playgroundNav .dropdown-view .selection .manage-icon{color:#fea116}.navbar #playgroundNav .dropdown-view .selection .title{margin-top:5px}.navbar #playgroundNav .dropdown-content{text-align:center;padding-top:2px;padding-bottom:0;background:none;border:none}.navbar #playgroundNav .icon-base{padding-right:5px;padding-left:5px;color:white;cursor:pointer}.navbar #playgroundNav .icon-base .add-icon{opacity:0;position:absolute;z-index:10;font-size:14px;top:10px;right:0;background:#222222;border-radius:1020px;line-height:0;padding-top:1px;padding-left:2px;padding-right:0px;padding-bottom:1px;-webkit-transition:.4s all;-o-transition:.4s all;transition:.4s all}.navbar #playgroundNav img{-webkit-filter:brightness(.85);filter:brightness(.85);-webkit-transition:all .4s;-o-transition:all .4s;transition:all .4s}.navbar #playgroundNav:hover img{-webkit-filter:none;filter:none}</style><style type="text/css">.element-base{margin-top:20px}.element-base .element-touch-event{cursor:pointer}.element-base .element-touch-event:hover .element-name{color:#17807d}.element-base .element-touch-event:hover .element-object{-webkit-box-shadow:0 15px 30px 0 rgba(0,0,0,0.15);box-shadow:0 15px 30px 0 rgba(0,0,0,0.15)}.element-base .element-name{margin-top:10px}.element-base .element-object{-webkit-transition:.4s all;-o-transition:.4s all;transition:.4s all;-webkit-box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);margin:0 auto;height:100px;width:150px;border-radius:10px;background:white;vertical-align:middle}.element-base .element-object .object{position:relative;top:35%;-webkit-transform:translateY(-35%);transform:translateY(-35%)}.element-base .element-object .object .text-100{font-size:50px}.element-base .element-object .object .object-img{height:100px;border-radius:10px}.element-base .element-object .object .template-label{color:#373737;border-bottom-right-radius:10px;border-bottom-left-radius:10px;position:absolute;padding:5px;width:100%;bottom:0;font-size:12px;-webkit-backdrop-filter:blur(10px);backdrop-filter:blur(10px);background:rgba(255,255,255,0.5)}</style><style type="text/css">@media (max-width:375px){.CreateModal-base .modal-body.row{padding:0;padding-bottom:20px}.CreateModal-base .element-base{padding-left:0;padding-right:0}}.CreateModal-base .modal-content{background:#fafafa}.CreateModal-base .modal-body.row{margin-right:0;margin-left:0}</style><style type="text/css">.dropdown-content.user-dropdown{-webkit-transition:.4s all;-o-transition:.4s all;transition:.4s all;border:none;min-width:240px;padding-bottom:0;right:-1px;top:30px}.dropdown-content.user-dropdown .square{background:white;-webkit-transform:rotate(45deg);transform:rotate(45deg);height:10px;width:10px;position:absolute;top:-5px}.dropdown-content.user-dropdown,.dropdown-content.user-dropdown *{text-decoration:none}.dropdown-content.user-dropdown .square{right:18px}.dropdown-content.user-dropdown .line{margin-top:-1px}.dropdown.nav-user-mobile-base .user-dropdown{-webkit-transition:.4s all;-o-transition:.4s all;transition:.4s all;opacity:0;display:block;visibility:hidden}.dropdown.nav-user-mobile-base.open .user-dropdown{opacity:1;visibility:visible}@media (max-width:767px){.dropdown-content.user-dropdown{right:-10px;left:auto;top:38px;border-top-left-radius:0;border-top-right-radius:0;border-bottom-left-radius:0;border-bottom-right-radius:0;width:100%}.dropdown-content.user-dropdown .square{right:17px}}@media (min-width:768px) and (max-width:991px){.dropdown-content.user-dropdown{top:30px}}.option-list.nav-user-app .list-item{cursor:pointer;padding:8px 10px}@media (max-width:767px){.option-list.nav-user-app .list-item{padding:12px 10px}}.option-list.nav-user-app .list-item:hover{background:#f5f5f5}.option-list.nav-user-app .list-item:last-child{border-bottom-left-radius:5px;border-bottom-right-radius:5px}.switch-to-new{size:14px;margin-left:16px}</style><style type="text/css">.nav-user-app.app-box .row{margin:0}.nav-user-app.app{position:relative;padding:0 5px;border-bottom:1px solid #ecf0f1}.nav-user-app.app:not(:nth-child(3n)){border-right:1px solid #ecf0f1}.nav-user-app.app .app-base{cursor:pointer;text-align:center;margin-bottom:5px;margin-top:5px;padding-top:15px;padding-bottom:5px}.nav-user-app.app .app-base:hover{border-radius:5px;background:#f5f5f5}.nav-user-app.app .app-icon{font-size:20px}.nav-user-app.app .app-name{font-size:10px;margin-top:5px;color:#95a5a6}.app-box.nav-user-app .app-base .app-icon{color:#5a5a5a}.app-box.nav-user-app .notebook .app-icon{color:#fea116}.app-box.nav-user-app .list .app-icon{color:#d05451}.app-box.nav-user-app .submission .app-icon{color:#1da09c}.app-box.nav-user-app .points .app-icon{color:#ffdf00}.app-box.nav-user-app .user-progress .app-icon{color:#8365cd}.app-box.nav-user-app .my-articles .app-icon{color:#0088cc}</style><style type="text/css">.nav-user-app.account-info{padding-bottom:5px;padding-left:5px;padding-right:5px;border-bottom:1px solid #ecf0f1}.nav-user-app.account-info .user-info{height:30px;padding:5px 5px}.nav-user-app.account-info .user-info .username{display:inline-block;max-width:170px;overflow:hidden;-o-text-overflow:ellipsis;text-overflow:ellipsis;white-space:pre;cursor:pointer}.nav-user-app.account-info .user-info .username:hover{color:grey}.nav-user-app.account-info .member-status{cursor:pointer;display:inline-block;position:relative;top:-2px;border:1px solid #1da09c;color:#1da09c;border-radius:3px;padding:0px 5px;font-size:9px}.nav-user-app.account-info .member-status:hover{border-color:#17807d;color:#17807d}.nav-user-app.account-info .member-status.vip{border-color:#fea116;color:#fea116}.nav-user-app.account-info .member-status.vip:hover{border-color:#d58512;color:#d58512}</style><style type="text/css">#nav-user-app{margin-top:13px;margin-left:20px;margin-right:5px;line-height:1.43}@media (max-width:767px){#nav-user-app{margin-left:10px;margin-right:10px}}@media (min-width:768px) and (max-width:991px){#nav-user-app{margin-left:20px;margin-right:10px}#nav-user-app .btn.sign-in-btn{border-left:none;padding-left:0}}.nav-user-base:hover .nav-user-icon-base{color:white}.nav-user-base:hover .nav-user-icon-base img.avatar{opacity:1}.nav-user-base .nav-user-icon-base{-webkit-transition:.4s all;-o-transition:.4s all;transition:.4s all;color:#9d9d9d;font-size:12px;cursor:pointer}.nav-user-base .nav-user-icon-base img.avatar{-webkit-transition:.4s all;-o-transition:.4s all;transition:.4s all;border-radius:5px;opacity:.85;height:21px}.nav-user-base .nav-user-icon-base i.caret{margin-left:6px}.playground-create-btn-dropdown.other-dropdown-open .dropdown-content{display:none !important}.nav-login-base{margin-top:-2px}.nav-login-base .btn{border:none;padding-top:4px;padding-bottom:4px;color:white;font-weight:500;padding-left:0;padding-right:0;border-radius:0}@media (min-width:768px){.nav-login-base .btn:first-child{border-left:1px solid #5a5a5a;padding-left:15px}}@media (max-width:767px){.nav-login-base{border-top:1px solid #464646;margin-top:-15px;padding-top:8px}}.nav-login-base .or{position:relative;top:1px;color:grey;font-weight:300}</style><style type="text/css">.nav-user-mobile-base{position:absolute;top:13px;right:10px;width:100%}.nav-user-mobile-base:hover .nav-user-icon-base{color:white}.nav-user-mobile-base:hover .nav-user-icon-base img.avatar{opacity:1}.nav-user-mobile-base .nav-user-icon-base{-webkit-transition:.4s all;-o-transition:.4s all;transition:.4s all;color:#9d9d9d;font-size:12px;cursor:pointer}.nav-user-mobile-base .nav-user-icon-base img.avatar{-webkit-transition:.4s all;-o-transition:.4s all;transition:.4s all;border-radius:5px;opacity:.85;height:25px}</style><style type="text/css">.icon__3Su4{width:1em;height:1em;vertical-align:middle;fill:currentColor;overflow:hidden}</style><style type="text/css">.notifications-square{background:white;-webkit-transform:rotate(45deg);transform:rotate(45deg);height:10px;width:10px;position:absolute;top:-5px;right:59px;pointer-events:none;z-index:-1}.notifications-square.active-square{background:#f2f2f2}.notifications-square.unread-square{background:#f0faff}.notifications-container-compact{margin:0;max-width:600px;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-ms-flex-direction:column;flex-direction:column;border-radius:5px;overflow:hidden}.notifications-container-compact .no-notifications-placeholder{height:150px;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-pack:center;-ms-flex-pack:center;justify-content:center;-webkit-box-align:center;-ms-flex-align:center;align-items:center;font-weight:500;padding:20px;font-size:16px;color:#bdc3c7;text-align:center}.notifications-container-compact .notifications-scroll-container{max-height:600px;overflow-y:auto}@media (max-height:800px){.notifications-container-compact .notifications-scroll-container{max-height:calc(100vh - 200px)}}.notifications-container-compact a.notification-list-item{cursor:pointer;display:-webkit-box;display:-ms-flexbox;display:flex;max-width:600px;min-height:60px;background-color:white;border-bottom:1px #dddddd solid;color:inherit}.notifications-container-compact a.notification-list-item:hover,.notifications-container-compact a.notification-list-item:focus{text-decoration:none}.notifications-container-compact a.notification-list-item:last-child{border-bottom:0}.notifications-container-compact a.notification-list-item.notification-list-unread-item{background-color:#f0faff}.notifications-container-compact a.notification-list-item.notification-list-active-item{background-color:#f2f2f2}.notifications-container-compact a.notification-list-item .notification-icon-container{-webkit-box-flex:0;-ms-flex:0 0 64px;flex:0 0 64px;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-pack:center;-ms-flex-pack:center;justify-content:center;-webkit-box-align:center;-ms-flex-align:center;align-items:center;font-size:1.5em}.notifications-container-compact a.notification-list-item .notification-icon-container .notification-icon{background-color:#3fbbff;color:white;width:36px;height:36px;border-radius:1000px;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-pack:center;-ms-flex-pack:center;justify-content:center;-webkit-box-align:center;-ms-flex-align:center;align-items:center}.notifications-container-compact a.notification-list-item .notification-content-container{padding:10px 10px 10px 0;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-pack:center;-ms-flex-pack:center;justify-content:center;-webkit-box-orient:vertical;-webkit-box-direction:normal;-ms-flex-direction:column;flex-direction:column;-webkit-box-align:start;-ms-flex-align:start;align-items:flex-start;width:100%;min-width:0}.notifications-container-compact a.notification-list-item .notification-content-container .notification-content-header{display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-pack:justify;-ms-flex-pack:justify;justify-content:space-between;-ms-flex-item-align:stretch;align-self:stretch}.notifications-container-compact a.notification-list-item .notification-content-container .notification-content-header .notification-content-title{font-size:12px;color:#95a5a6;text-transform:uppercase;font-weight:500}.notifications-container-compact a.notification-list-item .notification-content-container .notification-content-body{display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-pack:start;-ms-flex-pack:start;justify-content:flex-start;-ms-flex-item-align:stretch;align-self:stretch;-webkit-box-orient:vertical;-webkit-box-direction:normal;-ms-flex-direction:column;flex-direction:column}.notifications-container-compact a.notification-list-item .notification-content-container .notification-content-body .notification-main-content{margin:5px 0;overflow:hidden;-o-text-overflow:ellipsis;text-overflow:ellipsis;white-space:pre}.notifications-container-compact a.notification-list-item .notification-content-container .notification-content-footer{display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-pack:justify;-ms-flex-pack:justify;justify-content:space-between;-ms-flex-item-align:stretch;align-self:stretch}.notifications-container-compact .notifications-see-all-container{padding:10px;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-pack:center;-ms-flex-pack:center;justify-content:center;-webkit-box-align:center;-ms-flex-align:center;align-items:center;min-height:0;background-color:#ecf0f1;font-weight:500;border-top:1px #dddddd solid}.notification-content-date{font-size:11px}</style><style type="text/css">.notification-btn-dropdown .notification-btn{margin-top:3px;font-size:18px;color:#95a5a6;cursor:pointer;-webkit-user-select:none;-moz-user-select:none;-ms-user-select:none;user-select:none}.notification-btn-dropdown .notification-btn.notification-btn-active{color:#fea116}.notification-btn-dropdown .unread-red-circle{display:-webkit-box;display:-ms-flexbox;display:flex;position:absolute;background-color:#d05451;border-radius:50%;top:-9px;left:9px;border:2px solid #222222;pointer-events:none;color:white;font-size:8px;-webkit-box-pack:center;-ms-flex-pack:center;justify-content:center;-webkit-box-align:center;-ms-flex-align:center;align-items:center;padding:3px;line-height:8px;min-width:18px}.notification-btn-dropdown .notification-dropdown{padding:0;width:450px;right:-56px;top:30px}</style><style type="text/css">.notifications-container{max-width:600px;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-ms-flex-direction:column;flex-direction:column;margin-top:10px;margin-bottom:60px}.notifications-container .no-notifications-placeholder{height:150px;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-pack:center;-ms-flex-pack:center;justify-content:center;-webkit-box-align:center;-ms-flex-align:center;align-items:center;font-weight:500;padding:20px;font-size:16px;color:#bdc3c7;text-align:center}.notifications-container .notification-list-item{display:-webkit-box;display:-ms-flexbox;display:flex;width:100%;min-height:60px;background-color:white;border-bottom:1px #dddddd solid}.notifications-container .notification-list-item.notification-list-unread-item{background-color:#e2f5ff}.notifications-container .notification-list-item .notification-icon-container{-webkit-box-flex:0;-ms-flex:0 0 64px;flex:0 0 64px;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-pack:center;-ms-flex-pack:center;justify-content:center;-webkit-box-align:center;-ms-flex-align:center;align-items:center;font-size:1.5em}.notifications-container .notification-list-item .notification-icon-container .notification-icon{background-color:#3fbbff;color:white;width:36px;height:36px;border-radius:1000px;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-pack:center;-ms-flex-pack:center;justify-content:center;-webkit-box-align:center;-ms-flex-align:center;align-items:center}.notifications-container .notification-list-item .notification-content-container{padding:15px 0 15px 0;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-pack:center;-ms-flex-pack:center;justify-content:center;-webkit-box-orient:vertical;-webkit-box-direction:normal;-ms-flex-direction:column;flex-direction:column;-webkit-box-align:start;-ms-flex-align:start;align-items:flex-start;width:100%}.notifications-container .notification-list-item .notification-content-container .notification-content-header{display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-pack:justify;-ms-flex-pack:justify;justify-content:space-between;-ms-flex-item-align:stretch;align-self:stretch}.notifications-container .notification-list-item .notification-content-container .notification-content-header .notification-content-title{font-size:12px;color:#95a5a6;text-transform:uppercase;font-weight:500}.notifications-container .notification-list-item .notification-content-container .notification-content-body{display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-pack:start;-ms-flex-pack:start;justify-content:flex-start;-ms-flex-item-align:stretch;align-self:stretch;-webkit-box-orient:vertical;-webkit-box-direction:normal;-ms-flex-direction:column;flex-direction:column}.notifications-container .notification-list-item .notification-content-container .notification-content-body .notification-main-content{margin:5px 0}.notifications-container .notification-list-item .notification-content-container .notification-content-footer{display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-pack:justify;-ms-flex-pack:justify;justify-content:space-between;-ms-flex-item-align:stretch;align-self:stretch}.notifications-container .notification-list-item .notification-action-btn-container{-ms-flex-item-align:center;align-self:center;padding:10px}.notifications-container .notification-list-item .notification-action-btn-container .notification-content-action-btn{font-weight:500;text-transform:uppercase;font-size:11px;background-color:white;color:#3fbbff;border:2px solid #3fbbff}.notification-content-date{font-size:11px}</style><style type="text/css">#lc_navbar{line-height:1.42857143}#lc_navbar .container{position:relative}#lc_navbar ul.nav.navbar-nav li.dropdown .dropdown-menu{margin-top:1px}#lc_navbar .nav-item-badge{position:absolute;top:9px;right:-5px;background:red;border-radius:6px;padding:0 3px;color:white;font-size:8px;line-height:12px}</style><style type="text/css">/* Chart.js */
@-webkit-keyframes chartjs-render-animation{from{opacity:0.99}to{opacity:1}}@keyframes chartjs-render-animation{from{opacity:0.99}to{opacity:1}}.chartjs-render-monitor{-webkit-animation:chartjs-render-animation 0.001s;animation:chartjs-render-animation 0.001s;}</style><style type="text/css">.progress-chart-wrapper{position:relative}.progress-chart-wrapper .percentage{color:grey;font-size:8px;font-weight:300}.progress-chart-wrapper .checkmark{text-align:center;position:absolute;top:13px;right:0;left:0;margin-left:1px;color:#5cb85c;font-size:12px}.progress-chart-wrapper .center-percentage{text-align:center;color:white;font-size:10px;position:absolute;top:20px;right:0;left:0;margin-left:2px;font-weight:400}</style><style type="text/css">.smart-bg-color{background:#00c1de;background:-webkit-gradient(linear, left top, left bottom, from(#167af4), to(#00c1de));background:-webkit-linear-gradient(#167af4, #00c1de);background:-o-linear-gradient(#167af4, #00c1de);background:linear-gradient(#167af4, #00c1de)}.smart-bg-color[class*='python']{background:#ffe369;background:-webkit-gradient(linear, left top, left bottom, from(#4785b6), to(#ffe369));background:-webkit-linear-gradient(#4785b6, #ffe369);background:-o-linear-gradient(#4785b6, #ffe369);background:linear-gradient(#4785b6, #ffe369)}.smart-bg-color[class*='swift']{background:#fcaf3f;background:-webkit-gradient(linear, left top, left bottom, from(#ff3527), to(#fcaf3f));background:-webkit-linear-gradient(#ff3527, #fcaf3f);background:-o-linear-gradient(#ff3527, #fcaf3f);background:linear-gradient(#ff3527, #fcaf3f)}.smart-bg-color[class*='java']{background:#f89c90;background:-webkit-gradient(linear, left top, left bottom, from(#ea2d2e), to(#f89c90));background:-webkit-linear-gradient(#ea2d2e, #f89c90);background:-o-linear-gradient(#ea2d2e, #f89c90);background:linear-gradient(#ea2d2e, #f89c90)}.smart-bg-color[class*='scala']{background:#fd3a4e;background:-webkit-gradient(linear, left top, left bottom, from(#bd013f), to(#fd3a4e));background:-webkit-linear-gradient(#bd013f, #fd3a4e);background:-o-linear-gradient(#bd013f, #fd3a4e);background:linear-gradient(#bd013f, #fd3a4e)}.smart-bg-color[class*='ruby']{background:#ea2d2e;background:-webkit-gradient(linear, left top, left bottom, from(#9a020f), to(#ea2d2e));background:-webkit-linear-gradient(#9a020f, #ea2d2e);background:-o-linear-gradient(#9a020f, #ea2d2e);background:linear-gradient(#9a020f, #ea2d2e)}.smart-bg-color[class*='cpp']{background:#649ad2;background:-webkit-gradient(linear, left top, left bottom, from(#004482), to(#649ad2));background:-webkit-linear-gradient(#004482, #649ad2);background:-o-linear-gradient(#004482, #649ad2);background:linear-gradient(#004482, #649ad2)}.smart-bg-color[class*='csharp']{background:#c651e7;background:-webkit-gradient(linear, left top, left bottom, from(#68217a), to(#c651e7));background:-webkit-linear-gradient(#68217a, #c651e7);background:-o-linear-gradient(#68217a, #c651e7);background:linear-gradient(#68217a, #c651e7)}.smart-bg-color[class*='javascript']{background:#fef16e;background:-webkit-gradient(linear, left top, left bottom, from(#d7b02b), to(#fef16e));background:-webkit-linear-gradient(#d7b02b, #fef16e);background:-o-linear-gradient(#d7b02b, #fef16e);background:linear-gradient(#d7b02b, #fef16e)}.smart-bg-color[class*='php']{background:#aeb2d5;background:-webkit-gradient(linear, left top, left bottom, from(#777bb3), to(#aeb2d5));background:-webkit-linear-gradient(#777bb3, #aeb2d5);background:-o-linear-gradient(#777bb3, #aeb2d5);background:linear-gradient(#777bb3, #aeb2d5)}.smart-bg-color[class*='sql']{background:#b9d635;background:-webkit-gradient(linear, left top, left bottom, from(#72a800), to(#b9d635));background:-webkit-linear-gradient(#72a800, #b9d635);background:-o-linear-gradient(#72a800, #b9d635);background:linear-gradient(#72a800, #b9d635)}.smart-bg-color[class*='bash']{background:#669f70;background:-webkit-gradient(linear, left top, left bottom, from(#2a3539), to(#669f70));background:-webkit-linear-gradient(#2a3539, #669f70);background:-o-linear-gradient(#2a3539, #669f70);background:linear-gradient(#2a3539, #669f70)}.smart-bg-color[class*='kotlin']{background:#c95daf;background:-webkit-gradient(linear, left top, left bottom, from(#0888d9), to(#c95daf));background:-webkit-linear-gradient(#0888d9, #c95daf);background:-o-linear-gradient(#0888d9, #c95daf);background:linear-gradient(#0888d9, #c95daf)}.smart-bg-color[class*='go']{background:#74cedd;background:-webkit-gradient(linear, left top, left bottom, from(#65b2c1), to(#74cedd));background:-webkit-linear-gradient(#65b2c1, #74cedd);background:-o-linear-gradient(#65b2c1, #74cedd);background:linear-gradient(#65b2c1, #74cedd)}.explore-card-base{margin-top:15px !important;margin-bottom:15px !important}.explore-card-base a{color:black}.explore-card-base a:hover{color:#3fbbff}@media (max-width:767px){.explore-card-base{margin-top:25px !important;margin-bottom:25px !important}}.explore-card-base .explore-card{margin:auto;max-width:300px;background:#fff;background:-webkit-gradient(linear, left top, left bottom, from(#f5f5f5), to(#fff));background:-webkit-linear-gradient(#f5f5f5, #fff);background:-o-linear-gradient(#f5f5f5, #fff);background:linear-gradient(#f5f5f5, #fff);-webkit-transition:.4s all;-o-transition:.4s all;transition:.4s all;-webkit-box-shadow:inset 0 4px 7px 1px #ffffff,inset 0 -5px 20px rgba(173,186,204,0.25),0 2px 6px rgba(0,21,64,0.14),0 10px 20px rgba(0,21,64,0.05);box-shadow:inset 0 4px 7px 1px #ffffff,inset 0 -5px 20px rgba(173,186,204,0.25),0 2px 6px rgba(0,21,64,0.14),0 10px 20px rgba(0,21,64,0.05);border-radius:15px}.explore-card-base .explore-card:hover{-webkit-box-shadow:inset 0 4px 7px 1px #ffffff,inset 0 -5px 20px rgba(173,186,204,0.25),0 0 20px rgba(0,21,64,0.14),0 0 40px rgba(0,0,0,0.2);box-shadow:inset 0 4px 7px 1px #ffffff,inset 0 -5px 20px rgba(173,186,204,0.25),0 0 20px rgba(0,21,64,0.14),0 0 40px rgba(0,0,0,0.2)}.explore-card-base .explore-card.unpublished .bot-base{border-bottom-left-radius:15px;border-bottom-right-radius:15px;border-bottom:4px solid #fea116}.explore-card-base .explore-card .top-base{height:200px;position:relative;border-top-left-radius:15px;border-top-right-radius:15px;background:#00c1de;background:-webkit-gradient(linear, left top, left bottom, from(#167af4), to(#00c1de));background:-webkit-linear-gradient(#167af4, #00c1de);background:-o-linear-gradient(#167af4, #00c1de);background:linear-gradient(#167af4, #00c1de)}.explore-card-base .explore-card .top-base[class*='python']{background:#ffe369;background:-webkit-gradient(linear, left top, left bottom, from(#4785b6), to(#ffe369));background:-webkit-linear-gradient(#4785b6, #ffe369);background:-o-linear-gradient(#4785b6, #ffe369);background:linear-gradient(#4785b6, #ffe369)}.explore-card-base .explore-card .top-base[class*='swift']{background:#fcaf3f;background:-webkit-gradient(linear, left top, left bottom, from(#ff3527), to(#fcaf3f));background:-webkit-linear-gradient(#ff3527, #fcaf3f);background:-o-linear-gradient(#ff3527, #fcaf3f);background:linear-gradient(#ff3527, #fcaf3f)}.explore-card-base .explore-card .top-base[class*='java']{background:#f89c90;background:-webkit-gradient(linear, left top, left bottom, from(#ea2d2e), to(#f89c90));background:-webkit-linear-gradient(#ea2d2e, #f89c90);background:-o-linear-gradient(#ea2d2e, #f89c90);background:linear-gradient(#ea2d2e, #f89c90)}.explore-card-base .explore-card .top-base[class*='scala']{background:#fd3a4e;background:-webkit-gradient(linear, left top, left bottom, from(#bd013f), to(#fd3a4e));background:-webkit-linear-gradient(#bd013f, #fd3a4e);background:-o-linear-gradient(#bd013f, #fd3a4e);background:linear-gradient(#bd013f, #fd3a4e)}.explore-card-base .explore-card .top-base[class*='ruby']{background:#ea2d2e;background:-webkit-gradient(linear, left top, left bottom, from(#9a020f), to(#ea2d2e));background:-webkit-linear-gradient(#9a020f, #ea2d2e);background:-o-linear-gradient(#9a020f, #ea2d2e);background:linear-gradient(#9a020f, #ea2d2e)}.explore-card-base .explore-card .top-base[class*='cpp']{background:#649ad2;background:-webkit-gradient(linear, left top, left bottom, from(#004482), to(#649ad2));background:-webkit-linear-gradient(#004482, #649ad2);background:-o-linear-gradient(#004482, #649ad2);background:linear-gradient(#004482, #649ad2)}.explore-card-base .explore-card .top-base[class*='csharp']{background:#c651e7;background:-webkit-gradient(linear, left top, left bottom, from(#68217a), to(#c651e7));background:-webkit-linear-gradient(#68217a, #c651e7);background:-o-linear-gradient(#68217a, #c651e7);background:linear-gradient(#68217a, #c651e7)}.explore-card-base .explore-card .top-base[class*='javascript']{background:#fef16e;background:-webkit-gradient(linear, left top, left bottom, from(#d7b02b), to(#fef16e));background:-webkit-linear-gradient(#d7b02b, #fef16e);background:-o-linear-gradient(#d7b02b, #fef16e);background:linear-gradient(#d7b02b, #fef16e)}.explore-card-base .explore-card .top-base[class*='php']{background:#aeb2d5;background:-webkit-gradient(linear, left top, left bottom, from(#777bb3), to(#aeb2d5));background:-webkit-linear-gradient(#777bb3, #aeb2d5);background:-o-linear-gradient(#777bb3, #aeb2d5);background:linear-gradient(#777bb3, #aeb2d5)}.explore-card-base .explore-card .top-base[class*='sql']{background:#b9d635;background:-webkit-gradient(linear, left top, left bottom, from(#72a800), to(#b9d635));background:-webkit-linear-gradient(#72a800, #b9d635);background:-o-linear-gradient(#72a800, #b9d635);background:linear-gradient(#72a800, #b9d635)}.explore-card-base .explore-card .top-base[class*='bash']{background:#669f70;background:-webkit-gradient(linear, left top, left bottom, from(#2a3539), to(#669f70));background:-webkit-linear-gradient(#2a3539, #669f70);background:-o-linear-gradient(#2a3539, #669f70);background:linear-gradient(#2a3539, #669f70)}.explore-card-base .explore-card .top-base[class*='kotlin']{background:#c95daf;background:-webkit-gradient(linear, left top, left bottom, from(#0888d9), to(#c95daf));background:-webkit-linear-gradient(#0888d9, #c95daf);background:-o-linear-gradient(#0888d9, #c95daf);background:linear-gradient(#0888d9, #c95daf)}.explore-card-base .explore-card .top-base[class*='go']{background:#74cedd;background:-webkit-gradient(linear, left top, left bottom, from(#65b2c1), to(#74cedd));background:-webkit-linear-gradient(#65b2c1, #74cedd);background:-o-linear-gradient(#65b2c1, #74cedd);background:linear-gradient(#65b2c1, #74cedd)}.explore-card-base .explore-card .top-base .top-inner-layer{-webkit-transition:.4s all;-o-transition:.4s all;transition:.4s all;position:relative;border-top-left-radius:15px;border-top-right-radius:15px;padding:15px;height:100%}.explore-card-base .explore-card .top-base .explore-heading .title{text-shadow:0 0 20px rgba(0,0,0,0.6);line-height:1.2;margin-top:7px;font-size:30px;font-weight:600;color:white}.explore-card-base .explore-card .top-base .explore-heading .description{text-shadow:0 0 20px rgba(0,0,0,0.6);color:white;font-weight:500;line-height:18px;font-size:16px;opacity:.8}.explore-card-base .explore-card .top-base .date-info{position:absolute;font-weight:500;bottom:10px;opacity:.9}.explore-card-base .explore-card .bot-base{height:84px;position:relative;padding:10px;text-align:center;z-index:1}.explore-card-base .explore-card .bot-base .big-number{font-size:26px;font-weight:500;color:#222222}.explore-card-base .explore-card .bot-base .text-label{margin-top:-5px;font-size:12px;color:grey}.explore-card-base .explore-card .bot-base .card-stats{width:calc(100% - 85px)}.explore-card-base .explore-card .bot-base .card-stats .stats.status{-webkit-transition:.4s all;-o-transition:.4s all;transition:.4s all;position:absolute;width:70px;text-align:center;right:15px;font-size:12px;font-weight:400;top:49px}.explore-card-base .explore-card .bot-base .card-stats .stats.status.completed{color:#449d44}.explore-card-base .explore-card .bot-base .card-stats .stats.status.complete-precentage{color:grey;top:42px;font-size:18px;font-weight:400}.explore-card-base .explore-card .start-button-base{cursor:pointer;position:absolute;top:-35px;right:15px;height:70px;width:70px;border-radius:1020px;background:white;-webkit-transition:.4s all;-o-transition:.4s all;transition:.4s all;text-align:center;font-size:16px;padding-top:23px;padding-left:3px;z-index:2}.explore-card-base .explore-card .start-button-base:hover{color:#1da09c;-webkit-box-shadow:0 5px 10px rgba(29,160,156,0.1),0 0 10px rgba(0,0,0,0.2);box-shadow:0 5px 10px rgba(29,160,156,0.1),0 0 10px rgba(0,0,0,0.2)}.explore-card-base .explore-card .start-button-base i.icon{position:relative;top:-1px}.explore-card-base .explore-card .start-button-base.locked{padding-left:0;padding-right:0}.explore-card-base .explore-card .start-button-base.locked:hover{color:#fea116}.explore-card-base .explore-card .start-button:hover+.card-stats .stats.status{opacity:1}</style><style type="text/css">@media (max-width:767px){body.with-mobile-tab-bar footer{display:none}}.mobile-tab-bar-base{position:fixed;z-index:2;bottom:0;left:0;width:100%;-webkit-box-shadow:0 -3px 3px 0 rgba(0,0,0,0.08);box-shadow:0 -3px 3px 0 rgba(0,0,0,0.08);background:white;padding-bottom:env(safe-area-inset-bottom)}.mobile-tab-bar-base _::-webkit-full-page-media,.mobile-tab-bar-base _:future,:root .mobile-tab-bar-base{background:rgba(255,255,255,0.85) !important;-webkit-backdrop-filter:blur(10px);backdrop-filter:blur(10px)}.mobile-tab-bar-base .tab-bar{height:50px;text-align:center;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-ms-flex-flow:center;flex-flow:center;-ms-flex-line-pack:center;align-content:center;-ms-flex-pack:distribute;justify-content:space-around}.mobile-tab-bar-base a{text-decoration:none}.mobile-tab-bar-base .tab-item{padding:0px 10px;color:grey}.mobile-tab-bar-base .tab-item .icon{font-size:24px}.mobile-tab-bar-base .tab-item .title-lable{position:relative;top:-10px;font-size:10px}.mobile-tab-bar-base .active .tab-item{color:#3fbbff}</style><style type="text/css">.dragscroll-container .scroll-btn{-webkit-transition:.2s all;-o-transition:.2s all;transition:.2s all;width:40px;height:60px;border-radius:5px;background-color:black;position:absolute;cursor:pointer;z-index:3;opacity:0;top:50%;-webkit-transform:translateY(-50%);transform:translateY(-50%);text-align:center}.dragscroll-container .scroll-btn i{margin-top:24px;font-size:16px;color:white}.dragscroll-container:hover .scroll-btn{opacity:.1}.dragscroll-container:hover .scroll-btn:hover{opacity:.3}.dragscroll-container .scroll-btn-left{left:100px}.dragscroll-container .scroll-btn-right{right:100px}@media (max-width:1199px){.dragscroll-container .scroll-btn-left{left:10px}.dragscroll-container .scroll-btn-right{right:10px}}@media (max-width:767px){.dragscroll-container .scroll-btn-left,.dragscroll-container .scroll-btn-right{display:none}}</style><style type="text/css">@media (max-width:767px){.explore-home-basic:not(.explore-home-showcase){max-width:330px}}@media (max-width:991px) and (min-width:768px){.explore-home-basic:not(.explore-home-showcase){max-width:660px;margin:auto}}.explore-home-basic .category-title{margin-top:30px;margin-bottom:0px;font-size:30px;font-weight:600}.explore-home-basic .category-title a{text-decoration:none}.explore-home-basic .category-title .more-btn{-webkit-box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);-webkit-transition:-webkit-box-shadow .4s;transition:-webkit-box-shadow .4s;-o-transition:box-shadow .4s;transition:box-shadow .4s;transition:box-shadow .4s, -webkit-box-shadow .4s;cursor:pointer;border-radius:1020px;background:white;padding:2px 15px 3px 15px;margin-top:-40px;font-size:14px;font-weight:500}.explore-home-basic .category-title .more-btn:hover{-webkit-box-shadow:0 15px 30px 0 rgba(0,0,0,0.15);box-shadow:0 15px 30px 0 rgba(0,0,0,0.15)}.explore-home-basic .category-title .more-btn:hover{background:#ecf0f1}.explore-home-basic .explore-page-title{margin-bottom:5px}.explore-home-basic .tool-set-base{margin-top:-50px}@media (max-width:767px){.explore-home-basic .tool-set-base{float:none !important;margin-top:20px}.explore-home-basic .tool-set-base .searchbar{-webkit-box-flex:2;-ms-flex-positive:2;flex-grow:2}}.explore-home-basic .navigation-tool-set{position:relative;top:-5px;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-pack:end;-ms-flex-pack:end;justify-content:flex-end}.explore-home-basic .navigation-tool-set .popover{margin-top:-2px;border:none}.explore-home-basic .navigation-tool-set .popover .arrow{display:none}.explore-home-basic .navigation-tool-set .popover .popover-content{padding:2px 5px}.explore-home-basic .navigation-tool-set .item{margin-right:20px;margin-top:-9px}.explore-home-basic .navigation-tool-set .item .icon{color:#afafaf;font-size:30px;text-shadow:0px 1px 0 white}.explore-home-basic .navigation-tool-set .item .icon:hover{color:#337ab7}.explore-home-basic .navigation-tool-set .searchbar{margin-left:5px}.explore-home-basic .navigation-tool-set .searchbar input{border-radius:1020px}.explore-home-basic .popular-section{margin-top:30px}.explore-home-basic .popular-section .title{color:#afafaf;font-size:16px;font-weight:500}.explore-home-showcase .popular-section{padding-bottom:30px}.explore-home-showcase .popular-section .showcase{margin:0 5px}.explore-home-showcase .page-heading{padding-right:5px;padding-left:5px}.explore-home-showcase .category-title{padding-right:5px;padding-left:5px}@media (min-width:768px){.explore-home-showcase{padding-left:60px;padding-right:60px}.explore-home-showcase .explore-index-showcase-base .showcase-row{margin-left:-60px !important;margin-right:-60px !important}.explore-home-showcase .explore-index-showcase-base .showcase-row .showcase-scroll{padding:20px 60px}.explore-home-showcase .explore-index-showcase-base .showcase-row .showcase-scroll .showcase:last-child{width:340px;padding-right:60px}}@media (min-width:1200px){.explore-home-showcase{padding-left:200px;padding-right:200px}.explore-home-showcase .explore-index-showcase-base .showcase-row{margin-left:-200px !important;margin-right:-200px !important}.explore-home-showcase .explore-index-showcase-base .showcase-row .showcase-scroll{padding:20px 200px}.explore-home-showcase .explore-index-showcase-base .showcase-row .showcase-scroll .showcase:last-child{width:480px;padding-right:200px}.explore-home-showcase .showcase-row::before,.explore-home-showcase .showcase-row::after{width:140px !important}}.explore-home-showcase .explore-index-showcase-base .showcase-row{position:relative;margin-left:-15px;margin-right:-15px}.explore-home-showcase .explore-index-showcase-base .showcase-row::before,.explore-home-showcase .explore-index-showcase-base .showcase-row::after{position:absolute;display:block;content:'';z-index:2;top:0;height:354px;width:0px;pointer-events:none}.explore-home-showcase .explore-index-showcase-base .showcase-row::before{left:0;background:#fafafa;background:-webkit-gradient(linear, left top, right top, from(#fafafa), to(rgba(250,250,250,0)));background:-webkit-linear-gradient(left, #fafafa, rgba(250,250,250,0));background:-o-linear-gradient(left, #fafafa, rgba(250,250,250,0));background:linear-gradient(to right, #fafafa, rgba(250,250,250,0))}.explore-home-showcase .explore-index-showcase-base .showcase-row::after{right:0;background:rgba(250,250,250,0);background:-webkit-gradient(linear, left top, right top, from(rgba(250,250,250,0)), to(#fafafa));background:-webkit-linear-gradient(left, rgba(250,250,250,0), #fafafa);background:-o-linear-gradient(left, rgba(250,250,250,0), #fafafa);background:linear-gradient(to right, rgba(250,250,250,0), #fafafa)}.explore-home-showcase .explore-index-showcase-base .showcase-scroll{-ms-overflow-style:none;overflow:-moz-scrollbars-none;padding:20px 15px;display:-webkit-box;display:-ms-flexbox;display:flex;-ms-flex-wrap:nowrap;flex-wrap:nowrap;overflow-x:auto;-webkit-overflow-scrolling:touch}.explore-home-showcase .explore-index-showcase-base .showcase-scroll::-webkit-scrollbar{display:none}@media (max-width:767px){.explore-home-showcase .explore-index-showcase-base .showcase-scroll,.explore-home-showcase .explore-index-showcase-base .showcase-scroll *{-webkit-transition:none;-o-transition:none;transition:none;-webkit-backface-visibility:hidden;backface-visibility:hidden}}.explore-home-showcase .showcase{-webkit-box-flex:0;-ms-flex:0 0 auto;flex:0 0 auto;width:280px;margin:0 10px}.explore-home-showcase .showcase:last-child{width:300px;padding-right:20px}</style><style type="text/css">.chapter-list-base .chapter-list .chapter-list-item{cursor:pointer;position:relative;display:-webkit-box;display:-ms-flexbox;display:flex;padding-top:15px;padding-bottom:15px;border-right:none;border-left:none;border-color:#dddddd}.chapter-list-base .chapter-list .chapter-list-item.active{border-color:#222222;background:#222222}.chapter-list-base .chapter-list .chapter-list-item.active .description:after{background:-webkit-gradient(linear, left top, right top, from(rgba(34,34,34,0)), color-stop(50%, #222222));background:-webkit-linear-gradient(left, rgba(34,34,34,0), #222222 50%);background:-o-linear-gradient(left, rgba(34,34,34,0), #222222 50%);background:linear-gradient(to right, rgba(34,34,34,0), #222222 50%)}.chapter-list-base .chapter-list .chapter-list-item.active:hover{border-color:black;background:black}.chapter-list-base .chapter-list .chapter-list-item.active:hover .description:after{background:-webkit-gradient(linear, left top, right top, from(rgba(0,0,0,0)), color-stop(50%, black));background:-webkit-linear-gradient(left, rgba(0,0,0,0), black 50%);background:-o-linear-gradient(left, rgba(0,0,0,0), black 50%);background:linear-gradient(to right, rgba(0,0,0,0), black 50%)}.chapter-list-base .chapter-list .chapter-list-item:hover{background:#ecf0f1}.chapter-list-base .chapter-list .chapter-list-item:hover .description:after{background:-webkit-gradient(linear, left top, right top, from(rgba(236,240,241,0)), color-stop(50%, #ecf0f1));background:-webkit-linear-gradient(left, rgba(236,240,241,0), #ecf0f1 50%);background:-o-linear-gradient(left, rgba(236,240,241,0), #ecf0f1 50%);background:linear-gradient(to right, rgba(236,240,241,0), #ecf0f1 50%)}.chapter-list-base .chapter-list .chapter-list-item:first-child{border-top:none}.chapter-list-base .chapter-list .chapter-list-item:last-child{border-bottom:none}.chapter-list-base .side-status{width:35px;text-align:center;margin-right:15px}.chapter-list-base .side-status .percentage{color:grey;font-size:10px}.chapter-list-base .category{width:calc(100% - 35px - 15px)}.chapter-list-base .title{margin-top:8px;font-size:20px;line-height:1.3em;margin-bottom:5px;font-weight:500}.chapter-list-base .side-status{font-size:25px}.chapter-list-base .description{opacity:.5;position:relative;-o-text-overflow:ellipsis;text-overflow:ellipsis;word-wrap:break-word;overflow:hidden;max-height:2.6em;line-height:1.3em;-webkit-user-select:none;-moz-user-select:none;-ms-user-select:none;user-select:none;margin-bottom:10px}.chapter-list-base .description::after{content:'';text-align:right;position:absolute;bottom:0;right:0;width:40%;height:1.3em;background:-webkit-gradient(linear, left top, right top, from(rgba(255,255,255,0)), color-stop(50%, #fff));background:-webkit-linear-gradient(left, rgba(255,255,255,0), #fff 50%);background:-o-linear-gradient(left, rgba(255,255,255,0), #fff 50%);background:linear-gradient(to right, rgba(255,255,255,0), #fff 50%)}.explore-detail-base .chapter-list-base{border-radius:15px;-webkit-transition:.4s all;-o-transition:.4s all;transition:.4s all;-webkit-box-shadow:inset 0 4px 7px 1px #ffffff,inset 0 -5px 20px rgba(173,186,204,0.25),0 2px 6px rgba(0,21,64,0.14),0 10px 20px rgba(0,21,64,0.05);box-shadow:inset 0 4px 7px 1px #ffffff,inset 0 -5px 20px rgba(173,186,204,0.25),0 2px 6px rgba(0,21,64,0.14),0 10px 20px rgba(0,21,64,0.05)}.explore-detail-base .chapter-list-base:hover{-webkit-box-shadow:inset 0 4px 7px 1px #ffffff,inset 0 -5px 20px rgba(173,186,204,0.25),0 0 20px rgba(0,21,64,0.14),0 0 40px rgba(0,0,0,0.2);box-shadow:inset 0 4px 7px 1px #ffffff,inset 0 -5px 20px rgba(173,186,204,0.25),0 0 20px rgba(0,21,64,0.14),0 0 40px rgba(0,0,0,0.2)}.explore-detail-base .chapter-list-base .chapter-list{border-radius:15px}.explore-detail-base .chapter-list-base .chapter-list .chapter-list-item:first-child{border-top-left-radius:15px;border-top-right-radius:15px}.explore-detail-base .chapter-list-base .chapter-list .chapter-list-item:last-child{border-bottom-left-radius:15px;border-bottom-right-radius:15px}</style><style type="text/css">.check-mark{display:inline-block}.check-mark i{font-size:20px;position:relative;bottom:-2px;width:22px}.check-mark.completed{color:#3fbbff}.check-mark.completed.show-prev-complete{color:#fea116}.check-mark.incomplete{color:#cccccc}.check-mark.completed i{text-shadow:0 1px white}.active .check-mark.completed{color:white}.active .check-mark.completed i{text-shadow:none}</style><style type="text/css">.explore-item-list .list-group-item{padding:10px 15px 5px 15px;min-height:50px;font-weight:300;font-size:16px}.explore-item-list .list-group-item.accessible:hover{cursor:pointer;background:#ecf0f1}.explore-item-list .list-group-item.disable{background-color:white;cursor:not-allowed}.explore-item-list .list-group-item.disable .title{opacity:.4}.explore-item-list .list-group-item .chapter-title{font-size:18px;font-weight:500}.explore-item-list .list-group-item .title{font-size:14px;font-weight:500}.explore-item-list .list-group-item .item-detail,.explore-item-list .list-group-item .status{display:inline-block}.explore-item-list .list-group-item .status{width:20px;vertical-align:top}.explore-item-list .list-group-item .item-detail{width:calc(100% - 20px);padding-left:10px;position:relative}.explore-item-list .list-group-item .item-detail .icon{position:relative;top:-1px}.explore-item-list .list-group-item .item-detail .title{overflow:hidden;-o-text-overflow:ellipsis;text-overflow:ellipsis;white-space:pre;margin-top:2px;max-width:calc(100% - 25px)}.explore-item-list .list-group-item .item-detail .description{font-weight:400;opacity:.5;font-size:12px}.explore-item-list .list-group-item:nth-child(even){background:#fafafa}</style><style type="text/css">.explore-login-message{display:block;margin:25px 0 20px 0;padding:16px 15px;-webkit-box-sizing:border-box;box-sizing:border-box;background:#fefaf4;border:1px solid #ffe0b2;border-radius:10px;font-size:14px;color:#555}.explore-login-message .login-text{margin:0 .4em;color:#0288d1}.explore-login-message:hover{text-decoration:none}.explore-login-message:hover .login-text{text-decoration:underline}</style><style type="text/css">.overview-tables-base .table-base{border-radius:10px;background:#f5f5f5;margin-bottom:20px}.overview-tables-base .table-header{position:relative;z-index:1;border-top-right-radius:10px;border-top-left-radius:10px;border-bottom:1px solid #dddddd;border:1px solid #dddddd;background:white;-webkit-box-shadow:0 3px 3px 0 rgba(0,0,0,0.08);box-shadow:0 3px 3px 0 rgba(0,0,0,0.08);cursor:pointer}.overview-tables-base .table-header:hover{color:#0088cc}.overview-tables-base .table-item{height:53px;border-bottom:1px solid #dddddd;cursor:pointer;background:#f5f5f5;padding:15px}.overview-tables-base .table-item.accessible:hover{background:#ecf0f1 !important}.overview-tables-base .table-item.disable{cursor:not-allowed}.overview-tables-base .table-item.disable .title{opacity:.4}.overview-tables-base .table-item:last-child{border-bottom:none}@media (min-width:1200px){.overview-tables-base .table-item:not(.odd-table-child):last-child{border-bottom-right-radius:10px}.overview-tables-base .table-item:not(.odd-table-child):nth-last-child(2){border-bottom-left-radius:10px;border-bottom:none}.overview-tables-base .table-item.odd-table-child:last-child{border-bottom-left-radius:10px}.overview-tables-base .table-item:nth-child(odd){border-right:1px solid #dddddd}.overview-tables-base .table-item:nth-child(4n){background:#fafafa}.overview-tables-base .table-item:nth-child(4n-1){background:#fafafa}}@media (max-width:1199px){.overview-tables-base .table-item:nth-child(even){background:#fafafa}.overview-tables-base .table-item:last-child{border-bottom-right-radius:10px;border-bottom-left-radius:10px}}.overview-tables-base .table-item>*{display:inline-block;vertical-align:top}.overview-tables-base .overview-item-list-base{margin-left:0;margin-right:0;border-left:1px solid #dddddd;border-right:1px solid #dddddd;border-bottom:1px solid #dddddd;border-bottom-right-radius:10px;border-bottom-left-radius:10px}.overview-tables-base .overview-item-list-base.item-bg{background:#fafafa}.overview-tables-base .overview-item-list-base.item-bg-alt{background:#f5f5f5}.overview-tables-base .title{margin-top:-1px;margin-left:10px;font-size:14px;font-weight:500;overflow:hidden;-o-text-overflow:ellipsis;text-overflow:ellipsis;white-space:pre;max-width:280px}.overview-tables-base .chapter-title{margin:15px;font-size:18px;font-weight:500}.overview-tables-base .chapter-progress{margin-top:5px;margin-right:8px}.overview-tables-base .chapter-progress .checkmark{top:12px;margin-left:0px;font-size:15px}</style><style type="text/css">.chapter-view-base .explore-paragraph .heading-row:first-child{display:block}.chapter-view-base .explore-paragraph .heading-row:first-child .explore-share-container{padding-left:0;padding-right:16px}.chapter-view-base .explore-paragraph .heading-row:first-child .explore-share-container>div{margin-right:0;margin-left:auto}@media (max-width:767px){.chapter-view-base .explore-paragraph .heading-row:first-child .explore-share-container{margin-top:-10px;margin-bottom:30px}.chapter-view-base .explore-paragraph .heading-row:first-child .explore-share-container>div{margin:auto}}.explore-paragraph{padding-bottom:40px;font-size:18px;color:grey}.explore-paragraph h1,.explore-paragraph h2,.explore-paragraph h3,.explore-paragraph h4,.explore-paragraph h5,.explore-paragraph h6{padding-bottom:10px;color:black}</style><style type="text/css">.smart-bg-color{background:#00c1de;background:-webkit-gradient(linear, left top, left bottom, from(#167af4), to(#00c1de));background:-webkit-linear-gradient(#167af4, #00c1de);background:-o-linear-gradient(#167af4, #00c1de);background:linear-gradient(#167af4, #00c1de)}.smart-bg-color[class*='python']{background:#ffe369;background:-webkit-gradient(linear, left top, left bottom, from(#4785b6), to(#ffe369));background:-webkit-linear-gradient(#4785b6, #ffe369);background:-o-linear-gradient(#4785b6, #ffe369);background:linear-gradient(#4785b6, #ffe369)}.smart-bg-color[class*='swift']{background:#fcaf3f;background:-webkit-gradient(linear, left top, left bottom, from(#ff3527), to(#fcaf3f));background:-webkit-linear-gradient(#ff3527, #fcaf3f);background:-o-linear-gradient(#ff3527, #fcaf3f);background:linear-gradient(#ff3527, #fcaf3f)}.smart-bg-color[class*='java']{background:#f89c90;background:-webkit-gradient(linear, left top, left bottom, from(#ea2d2e), to(#f89c90));background:-webkit-linear-gradient(#ea2d2e, #f89c90);background:-o-linear-gradient(#ea2d2e, #f89c90);background:linear-gradient(#ea2d2e, #f89c90)}.smart-bg-color[class*='scala']{background:#fd3a4e;background:-webkit-gradient(linear, left top, left bottom, from(#bd013f), to(#fd3a4e));background:-webkit-linear-gradient(#bd013f, #fd3a4e);background:-o-linear-gradient(#bd013f, #fd3a4e);background:linear-gradient(#bd013f, #fd3a4e)}.smart-bg-color[class*='ruby']{background:#ea2d2e;background:-webkit-gradient(linear, left top, left bottom, from(#9a020f), to(#ea2d2e));background:-webkit-linear-gradient(#9a020f, #ea2d2e);background:-o-linear-gradient(#9a020f, #ea2d2e);background:linear-gradient(#9a020f, #ea2d2e)}.smart-bg-color[class*='cpp']{background:#649ad2;background:-webkit-gradient(linear, left top, left bottom, from(#004482), to(#649ad2));background:-webkit-linear-gradient(#004482, #649ad2);background:-o-linear-gradient(#004482, #649ad2);background:linear-gradient(#004482, #649ad2)}.smart-bg-color[class*='csharp']{background:#c651e7;background:-webkit-gradient(linear, left top, left bottom, from(#68217a), to(#c651e7));background:-webkit-linear-gradient(#68217a, #c651e7);background:-o-linear-gradient(#68217a, #c651e7);background:linear-gradient(#68217a, #c651e7)}.smart-bg-color[class*='javascript']{background:#fef16e;background:-webkit-gradient(linear, left top, left bottom, from(#d7b02b), to(#fef16e));background:-webkit-linear-gradient(#d7b02b, #fef16e);background:-o-linear-gradient(#d7b02b, #fef16e);background:linear-gradient(#d7b02b, #fef16e)}.smart-bg-color[class*='php']{background:#aeb2d5;background:-webkit-gradient(linear, left top, left bottom, from(#777bb3), to(#aeb2d5));background:-webkit-linear-gradient(#777bb3, #aeb2d5);background:-o-linear-gradient(#777bb3, #aeb2d5);background:linear-gradient(#777bb3, #aeb2d5)}.smart-bg-color[class*='sql']{background:#b9d635;background:-webkit-gradient(linear, left top, left bottom, from(#72a800), to(#b9d635));background:-webkit-linear-gradient(#72a800, #b9d635);background:-o-linear-gradient(#72a800, #b9d635);background:linear-gradient(#72a800, #b9d635)}.smart-bg-color[class*='bash']{background:#669f70;background:-webkit-gradient(linear, left top, left bottom, from(#2a3539), to(#669f70));background:-webkit-linear-gradient(#2a3539, #669f70);background:-o-linear-gradient(#2a3539, #669f70);background:linear-gradient(#2a3539, #669f70)}.smart-bg-color[class*='kotlin']{background:#c95daf;background:-webkit-gradient(linear, left top, left bottom, from(#0888d9), to(#c95daf));background:-webkit-linear-gradient(#0888d9, #c95daf);background:-o-linear-gradient(#0888d9, #c95daf);background:linear-gradient(#0888d9, #c95daf)}.smart-bg-color[class*='go']{background:#74cedd;background:-webkit-gradient(linear, left top, left bottom, from(#65b2c1), to(#74cedd));background:-webkit-linear-gradient(#65b2c1, #74cedd);background:-o-linear-gradient(#65b2c1, #74cedd);background:linear-gradient(#65b2c1, #74cedd)}body{background:#fafafa}.explore-detail-base .up-shadow{z-index:1;position:relative}.explore-detail-base .explore-banner{background:#00c1de;background:-webkit-gradient(linear, left top, left bottom, from(#167af4), to(#00c1de));background:-webkit-linear-gradient(#167af4, #00c1de);background:-o-linear-gradient(#167af4, #00c1de);background:linear-gradient(#167af4, #00c1de)}.explore-detail-base .explore-banner[class*='python']{background:#ffe369;background:-webkit-gradient(linear, left top, left bottom, from(#4785b6), to(#ffe369));background:-webkit-linear-gradient(#4785b6, #ffe369);background:-o-linear-gradient(#4785b6, #ffe369);background:linear-gradient(#4785b6, #ffe369)}.explore-detail-base .explore-banner[class*='swift']{background:#fcaf3f;background:-webkit-gradient(linear, left top, left bottom, from(#ff3527), to(#fcaf3f));background:-webkit-linear-gradient(#ff3527, #fcaf3f);background:-o-linear-gradient(#ff3527, #fcaf3f);background:linear-gradient(#ff3527, #fcaf3f)}.explore-detail-base .explore-banner[class*='java']{background:#f89c90;background:-webkit-gradient(linear, left top, left bottom, from(#ea2d2e), to(#f89c90));background:-webkit-linear-gradient(#ea2d2e, #f89c90);background:-o-linear-gradient(#ea2d2e, #f89c90);background:linear-gradient(#ea2d2e, #f89c90)}.explore-detail-base .explore-banner[class*='scala']{background:#fd3a4e;background:-webkit-gradient(linear, left top, left bottom, from(#bd013f), to(#fd3a4e));background:-webkit-linear-gradient(#bd013f, #fd3a4e);background:-o-linear-gradient(#bd013f, #fd3a4e);background:linear-gradient(#bd013f, #fd3a4e)}.explore-detail-base .explore-banner[class*='ruby']{background:#ea2d2e;background:-webkit-gradient(linear, left top, left bottom, from(#9a020f), to(#ea2d2e));background:-webkit-linear-gradient(#9a020f, #ea2d2e);background:-o-linear-gradient(#9a020f, #ea2d2e);background:linear-gradient(#9a020f, #ea2d2e)}.explore-detail-base .explore-banner[class*='cpp']{background:#649ad2;background:-webkit-gradient(linear, left top, left bottom, from(#004482), to(#649ad2));background:-webkit-linear-gradient(#004482, #649ad2);background:-o-linear-gradient(#004482, #649ad2);background:linear-gradient(#004482, #649ad2)}.explore-detail-base .explore-banner[class*='csharp']{background:#c651e7;background:-webkit-gradient(linear, left top, left bottom, from(#68217a), to(#c651e7));background:-webkit-linear-gradient(#68217a, #c651e7);background:-o-linear-gradient(#68217a, #c651e7);background:linear-gradient(#68217a, #c651e7)}.explore-detail-base .explore-banner[class*='javascript']{background:#fef16e;background:-webkit-gradient(linear, left top, left bottom, from(#d7b02b), to(#fef16e));background:-webkit-linear-gradient(#d7b02b, #fef16e);background:-o-linear-gradient(#d7b02b, #fef16e);background:linear-gradient(#d7b02b, #fef16e)}.explore-detail-base .explore-banner[class*='php']{background:#aeb2d5;background:-webkit-gradient(linear, left top, left bottom, from(#777bb3), to(#aeb2d5));background:-webkit-linear-gradient(#777bb3, #aeb2d5);background:-o-linear-gradient(#777bb3, #aeb2d5);background:linear-gradient(#777bb3, #aeb2d5)}.explore-detail-base .explore-banner[class*='sql']{background:#b9d635;background:-webkit-gradient(linear, left top, left bottom, from(#72a800), to(#b9d635));background:-webkit-linear-gradient(#72a800, #b9d635);background:-o-linear-gradient(#72a800, #b9d635);background:linear-gradient(#72a800, #b9d635)}.explore-detail-base .explore-banner[class*='bash']{background:#669f70;background:-webkit-gradient(linear, left top, left bottom, from(#2a3539), to(#669f70));background:-webkit-linear-gradient(#2a3539, #669f70);background:-o-linear-gradient(#2a3539, #669f70);background:linear-gradient(#2a3539, #669f70)}.explore-detail-base .explore-banner[class*='kotlin']{background:#c95daf;background:-webkit-gradient(linear, left top, left bottom, from(#0888d9), to(#c95daf));background:-webkit-linear-gradient(#0888d9, #c95daf);background:-o-linear-gradient(#0888d9, #c95daf);background:linear-gradient(#0888d9, #c95daf)}.explore-detail-base .explore-banner[class*='go']{background:#74cedd;background:-webkit-gradient(linear, left top, left bottom, from(#65b2c1), to(#74cedd));background:-webkit-linear-gradient(#65b2c1, #74cedd);background:-o-linear-gradient(#65b2c1, #74cedd);background:linear-gradient(#65b2c1, #74cedd)}.explore-detail-base .explore-banner .banner-inner{height:300px}.explore-detail-base .explore-banner .banner-inner .container{padding-top:40px;height:300px}.explore-detail-base .explore-banner .banner-inner .explore-title{margin-top:75px}@media (min-width:992px){.explore-detail-base .explore-banner .banner-inner .explore-title{padding-left:30px}}@media (max-width:991px){.explore-detail-base .explore-banner .banner-inner .explore-title{margin-top:60px;text-align:center}}.explore-detail-base .page-heading{margin-top:0;z-index:2;position:relative}.explore-detail-base .page-heading *{color:white;text-shadow:0 4px 20px rgba(0,0,0,0.3)}.explore-detail-base .page-heading .page-label{opacity:.8}.explore-detail-base .page-heading .page-label.card-description{color:white}.explore-detail-base .explore-detail-body-base{margin-top:-30px}.explore-detail-base .explore-detail-body-base .intro-area{margin-top:50px}@media (min-width:992px){.explore-detail-base .explore-detail-body-base .intro-area{padding-left:30px}}.explore-detail-base .explore-paragraph .heading-row{display:-webkit-box;display:-ms-flexbox;display:flex}.explore-detail-base .explore-paragraph .explore-share-container{margin-left:auto;margin-top:20px;display:-webkit-box;display:-ms-flexbox;display:flex;min-width:203px;padding-left:10px}.explore-detail-base .explore-fav-btn{position:absolute;cursor:pointer;top:35px;right:20px;padding:0 10px;font-weight:300;font-size:18px;color:white;background:#fbc12a;border-radius:1020px;-webkit-box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);-webkit-transition:-webkit-box-shadow .4s;transition:-webkit-box-shadow .4s;-o-transition:box-shadow .4s;transition:box-shadow .4s;transition:box-shadow .4s, -webkit-box-shadow .4s}.explore-detail-base .explore-fav-btn:hover{-webkit-box-shadow:0 15px 30px 0 rgba(0,0,0,0.15);box-shadow:0 15px 30px 0 rgba(0,0,0,0.15)}@media (max-width:767px){.explore-detail-base .explore-fav-btn{top:85px}}</style><style type="text/css">@media (max-width:767px){.explore-history-base{max-width:330px;margin:auto}}@media (max-width:991px) and (min-width:768px){.explore-history-base .container{max-width:660px;margin:auto}}.explore-history-base .tab-view{margin-top:-55px}.explore-history-base .tab-view a{text-decoration:none}.explore-history-base .tab-view a:not(:first-child){margin-left:10px}.explore-history-base .tab-view button{font-weight:500;border:none !important;background:transparent;color:#0088cc}.explore-history-base .tab-view button.active,.explore-history-base .tab-view button:focus,.explore-history-base .tab-view button:hover{background:#ecf0f1;outline:none}.explore-history-base .tab-view button:hover{color:#015580;background:#ecf0f1}.explore-history-base .tab-view button:not(:first-child){margin-left:10px}@media (max-width:767px){.explore-history-base .tab-view{float:none !important;margin-top:20px;margin-bottom:20px}}</style><style type="text/css">.expandable-chapter-list{height:100%}.expandable-chapter-list .back-btn{border-top:none;font-weight:600;font-size:16px}.expandable-chapter-list .back-btn .close-btn{cursor:pointer;color:#0088cc}.expandable-chapter-list .back-btn .real-back-btn{cursor:pointer}.expandable-chapter-list .back-btn .real-back-btn:hover{color:#0088cc}.expandable-chapter-list .back-btn.back-btn-xs{margin-left:15px;margin-top:35px;color:#afafaf}.expandable-chapter-list .back-btn.back-btn-xs:hover{color:#0088cc}.expandable-chapter-list-base{height:100%;background:white}.expandable-chapter-list-base .list-group{margin-bottom:0}.expandable-chapter-list-base .list-group-item{border-left:none;border-right:none;border-radius:0}.expandable-chapter-list-base .expand-list-btn{-webkit-transition:.4s all;-o-transition:.4s all;transition:.4s all}.expandable-chapter-list-base .expand-list-btn.active{-webkit-transform:rotate(45deg);transform:rotate(45deg)}.expandable-chapter-list-base .chapter-item{-webkit-user-select:none;-moz-user-select:none;-ms-user-select:none;user-select:none;padding:0}.expandable-chapter-list-base .chapter-item .chapter-base{cursor:pointer}.expandable-chapter-list-base .chapter-item .chapter-base.active{background:#222222}.expandable-chapter-list-base .chapter-item .chapter-base.active:hover{background:black}.expandable-chapter-list-base .chapter-item .chapter-base.active:hover .description::after{background:-webkit-gradient(linear, left top, right top, from(rgba(0,0,0,0)), color-stop(50%, black));background:-webkit-linear-gradient(left, rgba(0,0,0,0), black 50%);background:-o-linear-gradient(left, rgba(0,0,0,0), black 50%);background:linear-gradient(to right, rgba(0,0,0,0), black 50%)}.expandable-chapter-list-base .chapter-item .chapter-base.active .description::after{background:-webkit-gradient(linear, left top, right top, from(rgba(34,34,34,0)), color-stop(50%, #222222));background:-webkit-linear-gradient(left, rgba(34,34,34,0), #222222 50%);background:-o-linear-gradient(left, rgba(34,34,34,0), #222222 50%);background:linear-gradient(to right, rgba(34,34,34,0), #222222 50%)}.expandable-chapter-list-base .chapter-item .chapter-base.active .description{color:#ecf0f1}.expandable-chapter-list-base .chapter-item .chapter-base.active .title,.expandable-chapter-list-base .chapter-item .chapter-base.active .expand-list-btn{color:white}.expandable-chapter-list-base .chapter-item .chapter-base.opened{-webkit-box-shadow:0 3px 3px 0 rgba(0,0,0,0.08);box-shadow:0 3px 3px 0 rgba(0,0,0,0.08);position:relative;z-index:1}.expandable-chapter-list-base .chapter-item .progress-status,.expandable-chapter-list-base .chapter-item .discuss-icon-container{display:inline-block;vertical-align:top;width:30px;position:relative;top:6px;left:7px;font-size:18px}.expandable-chapter-list-base .chapter-item .progress-status .checkmark,.expandable-chapter-list-base .chapter-item .discuss-icon-container .checkmark,.expandable-chapter-list-base .chapter-item .progress-status .discuss-icon,.expandable-chapter-list-base .chapter-item .discuss-icon-container .discuss-icon{top:12px;margin-left:0}.expandable-chapter-list-base .chapter-item .progress-status .discuss-icon,.expandable-chapter-list-base .chapter-item .discuss-icon-container .discuss-icon{position:absolute;left:7px}.expandable-chapter-list-base .chapter-item .chapter{display:inline-block;width:calc(100% - 30px);padding:15px}.expandable-chapter-list-base .chapter-item .chapter .title{line-height:1.3em;margin-bottom:5px;font-size:15px;font-weight:500}.expandable-chapter-list-base .chapter-item .chapter .description{opacity:.5;position:relative;-o-text-overflow:ellipsis;text-overflow:ellipsis;word-wrap:break-word;overflow:hidden;max-height:1.3em;line-height:1.3em;-webkit-user-select:none;-moz-user-select:none;-ms-user-select:none;user-select:none;font-size:12px}.expandable-chapter-list-base .chapter-item .chapter .description::after{content:'';text-align:right;position:absolute;bottom:0;right:0;width:40%;height:1.3em;background:-webkit-gradient(linear, left top, right top, from(rgba(255,255,255,0)), color-stop(50%, #fff));background:-webkit-linear-gradient(left, rgba(255,255,255,0), #fff 50%);background:-o-linear-gradient(left, rgba(255,255,255,0), #fff 50%);background:linear-gradient(to right, rgba(255,255,255,0), #fff 50%)}.expandable-chapter-list-base .chapter-item .chapter .expand-list-btn i.fa{font-size:18px;-webkit-transition:.4s all;-o-transition:.4s all;transition:.4s all;-webkit-transform:rotate(-90deg);transform:rotate(-90deg)}.expandable-chapter-list-base .chapter-item .chapter .expand-list-btn i.fa.expand{-webkit-transform:rotate(0deg);transform:rotate(0deg)}.expandable-chapter-list-base .chapter-item .list-group{padding:8px 0 5px 0;background:#fafafa;-webkit-box-shadow:inset 0 -3px 3px -3px rgba(0,0,0,0.08);box-shadow:inset 0 -3px 3px -3px rgba(0,0,0,0.08)}.expandable-chapter-list-base .chapter-item .list-group .list-group-item{border:none}.expandable-chapter-list-base .item-list-group .list-group-item{height:45px;background:#fafafa;cursor:pointer;-webkit-transition:.3s all;-o-transition:.3s all;transition:.3s all}.expandable-chapter-list-base .item-list-group .list-group-item.accessible:hover .title .content-icon,.expandable-chapter-list-base .item-list-group .list-group-item.accessible:hover .title span{opacity:1}.expandable-chapter-list-base .item-list-group .list-group-item.selected,.expandable-chapter-list-base .item-list-group .list-group-item.selected:hover{background:#ecf0f1}.expandable-chapter-list-base .item-list-group .list-group-item.selected .title .content-icon,.expandable-chapter-list-base .item-list-group .list-group-item.selected:hover .title .content-icon,.expandable-chapter-list-base .item-list-group .list-group-item.selected .title span,.expandable-chapter-list-base .item-list-group .list-group-item.selected:hover .title span{opacity:1}.expandable-chapter-list-base .item-list-group .list-group-item .check-mark{vertical-align:top}.expandable-chapter-list-base .item-list-group .list-group-item .title{max-width:205px;margin-top:-1px;margin-left:10px;display:inline-block;font-weight:500;overflow:hidden;-o-text-overflow:ellipsis;text-overflow:ellipsis;white-space:pre;white-space:nowrap}.expandable-chapter-list-base .item-list-group .list-group-item .title .content-icon,.expandable-chapter-list-base .item-list-group .list-group-item .title span{-webkit-transition:.1s all;-o-transition:.1s all;transition:.1s all;opacity:.75}.expandable-chapter-list-base .item-list-group .list-group-item .description{opacity:.5;font-size:12px;margin-left:10px}.expandable-chapter-list-base .item-list-group .list-group-item .info-icon{margin-top:-1px;font-size:15px}.expandable-chapter-list-base .item-list-group .list-group-item .info-icon .info-btn{position:relative;right:-2px;opacity:.6}.expandable-chapter-list-base .item-list-group .list-group-item.disable{cursor:not-allowed}.expandable-chapter-list-base .item-list-group .list-group-item.disable .title,.expandable-chapter-list-base .item-list-group .list-group-item.disable .info-btn{opacity:.4}.item-intro-modal .description{color:grey}.discuss-category-link,.discuss-category-link:hover,.discuss-category-link:visited{color:unset;text-decoration:none}</style><style type="text/css">.title-cell__ZGos .fa{margin-left:1em}.title-cell__ZGos a[data-limit='true']{max-width:200px;display:inline-block;vertical-align:bottom;overflow:hidden;-o-text-overflow:ellipsis;text-overflow:ellipsis;white-space:nowrap}.favor-icon__2vM7{color:#f0ad4e}</style><style type="text/css">.tags-cell__I1pn a{margin:2px}</style><style type="text/css">.acceptance__TLxK{min-width:60px}.frequency__Hs3t{min-width:110px}.frequency__Hs3t .fa{margin-left:.5em}.table.table__XKyc tbody{color:#808080}.table.table__XKyc tbody>tr:nth-of-type(odd){background:#fafafa}.table.table__XKyc th{border-bottom:1px solid #dddddd;outline:none}.table.table__XKyc td{border-top:none}</style><style type="text/css">.question-description__3U1T{line-height:24px}.translation-tool__3Ffj{float:right}.translation-tool__3Ffj .tooltip{margin-top:-7px}</style><style type="text/css">.noty_layout_mixin, #noty_layout__top, #noty_layout__topLeft, #noty_layout__topCenter, #noty_layout__topRight, #noty_layout__bottom, #noty_layout__bottomLeft, #noty_layout__bottomCenter, #noty_layout__bottomRight, #noty_layout__center, #noty_layout__centerLeft, #noty_layout__centerRight {
  position: fixed;
  margin: 0;
  padding: 0;
  z-index: 9999999;
  -webkit-transform: translateZ(0) scale(1, 1);
          transform: translateZ(0) scale(1, 1);
  -webkit-backface-visibility: hidden;
          backface-visibility: hidden;
  -webkit-font-smoothing: subpixel-antialiased;
  filter: blur(0);
  -webkit-filter: blur(0);
  max-width: 90%; }

#noty_layout__top {
  top: 0;
  left: 5%;
  width: 90%; }

#noty_layout__topLeft {
  top: 20px;
  left: 20px;
  width: 325px; }

#noty_layout__topCenter {
  top: 5%;
  left: 50%;
  width: 325px;
          -webkit-transform: translate(calc(-50% - .5px)) translateZ(0) scale(1, 1);
                  transform: translate(calc(-50% - .5px)) translateZ(0) scale(1, 1); }

#noty_layout__topRight {
  top: 20px;
  right: 20px;
  width: 325px; }

#noty_layout__bottom {
  bottom: 0;
  left: 5%;
  width: 90%; }

#noty_layout__bottomLeft {
  bottom: 20px;
  left: 20px;
  width: 325px; }

#noty_layout__bottomCenter {
  bottom: 5%;
  left: 50%;
  width: 325px;
          -webkit-transform: translate(calc(-50% - .5px)) translateZ(0) scale(1, 1);
                  transform: translate(calc(-50% - .5px)) translateZ(0) scale(1, 1); }

#noty_layout__bottomRight {
  bottom: 20px;
  right: 20px;
  width: 325px; }

#noty_layout__center {
  top: 50%;
  left: 50%;
  width: 325px;
          -webkit-transform: translate(calc(-50% - .5px), calc(-50% - .5px)) translateZ(0) scale(1, 1);
                  transform: translate(calc(-50% - .5px), calc(-50% - .5px)) translateZ(0) scale(1, 1); }

#noty_layout__centerLeft {
  top: 50%;
  left: 20px;
  width: 325px;
          -webkit-transform: translate(0, calc(-50% - .5px)) translateZ(0) scale(1, 1);
                  transform: translate(0, calc(-50% - .5px)) translateZ(0) scale(1, 1); }

#noty_layout__centerRight {
  top: 50%;
  right: 20px;
  width: 325px;
          -webkit-transform: translate(0, calc(-50% - .5px)) translateZ(0) scale(1, 1);
                  transform: translate(0, calc(-50% - .5px)) translateZ(0) scale(1, 1); }

.noty_progressbar {
  display: none; }

.noty_has_timeout.noty_has_progressbar .noty_progressbar {
  display: block;
  position: absolute;
  left: 0;
  bottom: 0;
  height: 3px;
  width: 100%;
  background-color: #646464;
  opacity: 0.2;
  filter: alpha(opacity=10); }

.noty_bar {
  -webkit-backface-visibility: hidden;
  -webkit-transform: translate(0, 0) translateZ(0) scale(1, 1);
      transform: translate(0, 0) scale(1, 1);
  -webkit-font-smoothing: subpixel-antialiased;
  overflow: hidden; }

.noty_effects_open {
  opacity: 0;
  -webkit-transform: translate(50%);
          transform: translate(50%);
  -webkit-animation: noty_anim_in 0.5s cubic-bezier(0.68, -0.55, 0.265, 1.55);
          animation: noty_anim_in 0.5s cubic-bezier(0.68, -0.55, 0.265, 1.55);
  -webkit-animation-fill-mode: forwards;
          animation-fill-mode: forwards; }

.noty_effects_close {
  -webkit-animation: noty_anim_out 0.5s cubic-bezier(0.68, -0.55, 0.265, 1.55);
          animation: noty_anim_out 0.5s cubic-bezier(0.68, -0.55, 0.265, 1.55);
  -webkit-animation-fill-mode: forwards;
          animation-fill-mode: forwards; }

.noty_fix_effects_height {
  -webkit-animation: noty_anim_height 75ms ease-out;
          animation: noty_anim_height 75ms ease-out; }

.noty_close_with_click {
  cursor: pointer; }

.noty_close_button {
  position: absolute;
  top: 2px;
  right: 2px;
  font-weight: bold;
  width: 20px;
  height: 20px;
  text-align: center;
  line-height: 20px;
  background-color: rgba(0, 0, 0, 0.05);
  border-radius: 2px;
  cursor: pointer;
  -webkit-transition: all .2s ease-out;
  -o-transition: all .2s ease-out;
  transition: all .2s ease-out; }

.noty_close_button:hover {
  background-color: rgba(0, 0, 0, 0.1); }

.noty_modal {
  position: fixed;
  width: 100%;
  height: 100%;
  background-color: #000;
  z-index: 10000;
  opacity: .3;
  left: 0;
  top: 0; }

.noty_modal.noty_modal_open {
  opacity: 0;
  -webkit-animation: noty_modal_in .3s ease-out;
          animation: noty_modal_in .3s ease-out; }

.noty_modal.noty_modal_close {
  -webkit-animation: noty_modal_out .3s ease-out;
          animation: noty_modal_out .3s ease-out;
  -webkit-animation-fill-mode: forwards;
          animation-fill-mode: forwards; }

@-webkit-keyframes noty_modal_in {
  100% {
    opacity: .3; } }

@keyframes noty_modal_in {
  100% {
    opacity: .3; } }

@-webkit-keyframes noty_modal_out {
  100% {
    opacity: 0; } }

@keyframes noty_modal_out {
  100% {
    opacity: 0; } }

@keyframes noty_modal_out {
  100% {
    opacity: 0; } }

@-webkit-keyframes noty_anim_in {
  100% {
    -webkit-transform: translate(0);
            transform: translate(0);
    opacity: 1; } }

@keyframes noty_anim_in {
  100% {
    -webkit-transform: translate(0);
            transform: translate(0);
    opacity: 1; } }

@-webkit-keyframes noty_anim_out {
  100% {
    -webkit-transform: translate(50%);
            transform: translate(50%);
    opacity: 0; } }

@keyframes noty_anim_out {
  100% {
    -webkit-transform: translate(50%);
            transform: translate(50%);
    opacity: 0; } }

@-webkit-keyframes noty_anim_height {
  100% {
    height: 0; } }

@keyframes noty_anim_height {
  100% {
    height: 0; } }

.noty_theme__relax.noty_bar {
  margin: 4px 0;
  overflow: hidden;
  border-radius: 2px;
  position: relative; }
  .noty_theme__relax.noty_bar .noty_body {
    padding: 10px; }
  .noty_theme__relax.noty_bar .noty_buttons {
    border-top: 1px solid #e7e7e7;
    padding: 5px 10px; }

.noty_theme__relax.noty_type__alert,
.noty_theme__relax.noty_type__notification {
  background-color: #fff;
  border: 1px solid #dedede;
  color: #444; }

.noty_theme__relax.noty_type__warning {
  background-color: #FFEAA8;
  border: 1px solid #FFC237;
  color: #826200; }
  .noty_theme__relax.noty_type__warning .noty_buttons {
    border-color: #dfaa30; }

.noty_theme__relax.noty_type__error {
  background-color: #FF8181;
  border: 1px solid #e25353;
  color: #FFF; }
  .noty_theme__relax.noty_type__error .noty_buttons {
    border-color: darkred; }

.noty_theme__relax.noty_type__info,
.noty_theme__relax.noty_type__information {
  background-color: #78C5E7;
  border: 1px solid #3badd6;
  color: #FFF; }
  .noty_theme__relax.noty_type__info .noty_buttons,
  .noty_theme__relax.noty_type__information .noty_buttons {
    border-color: #0B90C4; }

.noty_theme__relax.noty_type__success {
  background-color: #BCF5BC;
  border: 1px solid #7cdd77;
  color: darkgreen; }
  .noty_theme__relax.noty_type__success .noty_buttons {
    border-color: #50C24E; }

.noty_theme__metroui.noty_bar {
  margin: 4px 0;
  overflow: hidden;
  position: relative;
  -webkit-box-shadow: rgba(0, 0, 0, 0.298039) 0 0 5px 0;
          box-shadow: rgba(0, 0, 0, 0.298039) 0 0 5px 0; }
  .noty_theme__metroui.noty_bar .noty_progressbar {
    position: absolute;
    left: 0;
    bottom: 0;
    height: 3px;
    width: 100%;
    background-color: #000;
    opacity: 0.2;
    filter: alpha(opacity=20); }
  .noty_theme__metroui.noty_bar .noty_body {
    padding: 1.25em;
    font-size: 14px; }
  .noty_theme__metroui.noty_bar .noty_buttons {
    padding: 0 10px .5em 10px; }

.noty_theme__metroui.noty_type__alert,
.noty_theme__metroui.noty_type__notification {
  background-color: #fff;
  color: #1d1d1d; }

.noty_theme__metroui.noty_type__warning {
  background-color: #FA6800;
  color: #fff; }

.noty_theme__metroui.noty_type__error {
  background-color: #CE352C;
  color: #FFF; }

.noty_theme__metroui.noty_type__info,
.noty_theme__metroui.noty_type__information {
  background-color: #1BA1E2;
  color: #FFF; }

.noty_theme__metroui.noty_type__success {
  background-color: #60A917;
  color: #fff; }

.noty_theme__mint.noty_bar {
  margin: 4px 0;
  overflow: hidden;
  border-radius: 2px;
  position: relative; }
  .noty_theme__mint.noty_bar .noty_body {
    padding: 10px;
    font-size: 14px; }
  .noty_theme__mint.noty_bar .noty_buttons {
    padding: 10px; }

.noty_theme__mint.noty_type__alert,
.noty_theme__mint.noty_type__notification {
  background-color: #fff;
  border-bottom: 1px solid #D1D1D1;
  color: #2F2F2F; }

.noty_theme__mint.noty_type__warning {
  background-color: #FFAE42;
  border-bottom: 1px solid #E89F3C;
  color: #fff; }

.noty_theme__mint.noty_type__error {
  background-color: #DE636F;
  border-bottom: 1px solid #CA5A65;
  color: #fff; }

.noty_theme__mint.noty_type__info,
.noty_theme__mint.noty_type__information {
  background-color: #7F7EFF;
  border-bottom: 1px solid #7473E8;
  color: #fff; }

.noty_theme__mint.noty_type__success {
  background-color: #AFC765;
  border-bottom: 1px solid #A0B55C;
  color: #fff; }

.noty_theme__sunset.noty_bar {
  margin: 4px 0;
  overflow: hidden;
  border-radius: 2px;
  position: relative; }
  .noty_theme__sunset.noty_bar .noty_body {
    padding: 10px;
    font-size: 14px;
    text-shadow: 1px 1px 1px rgba(0, 0, 0, 0.1); }
  .noty_theme__sunset.noty_bar .noty_buttons {
    padding: 10px; }

.noty_theme__sunset.noty_type__alert,
.noty_theme__sunset.noty_type__notification {
  background-color: #073B4C;
  color: #fff; }
  .noty_theme__sunset.noty_type__alert .noty_progressbar,
  .noty_theme__sunset.noty_type__notification .noty_progressbar {
    background-color: #fff; }

.noty_theme__sunset.noty_type__warning {
  background-color: #FFD166;
  color: #fff; }

.noty_theme__sunset.noty_type__error {
  background-color: #EF476F;
  color: #fff; }
  .noty_theme__sunset.noty_type__error .noty_progressbar {
    opacity: .4; }

.noty_theme__sunset.noty_type__info,
.noty_theme__sunset.noty_type__information {
  background-color: #118AB2;
  color: #fff; }
  .noty_theme__sunset.noty_type__info .noty_progressbar,
  .noty_theme__sunset.noty_type__information .noty_progressbar {
    opacity: .6; }

.noty_theme__sunset.noty_type__success {
  background-color: #06D6A0;
  color: #fff; }

.noty_theme__bootstrap-v3.noty_bar {
  margin: 4px 0;
  overflow: hidden;
  position: relative;
  border: 1px solid transparent;
  border-radius: 4px; }
  .noty_theme__bootstrap-v3.noty_bar .noty_body {
    padding: 15px; }
  .noty_theme__bootstrap-v3.noty_bar .noty_buttons {
    padding: 10px; }
  .noty_theme__bootstrap-v3.noty_bar .noty_close_button {
    font-size: 21px;
    font-weight: 700;
    line-height: 1;
    color: #000;
    text-shadow: 0 1px 0 #fff;
    filter: alpha(opacity=20);
    opacity: .2;
    background: transparent; }
  .noty_theme__bootstrap-v3.noty_bar .noty_close_button:hover {
    background: transparent;
    text-decoration: none;
    cursor: pointer;
    filter: alpha(opacity=50);
    opacity: .5; }

.noty_theme__bootstrap-v3.noty_type__alert,
.noty_theme__bootstrap-v3.noty_type__notification {
  background-color: #fff;
  color: inherit; }

.noty_theme__bootstrap-v3.noty_type__warning {
  background-color: #fcf8e3;
  color: #8a6d3b;
  border-color: #faebcc; }

.noty_theme__bootstrap-v3.noty_type__error {
  background-color: #f2dede;
  color: #a94442;
  border-color: #ebccd1; }

.noty_theme__bootstrap-v3.noty_type__info,
.noty_theme__bootstrap-v3.noty_type__information {
  background-color: #d9edf7;
  color: #31708f;
  border-color: #bce8f1; }

.noty_theme__bootstrap-v3.noty_type__success {
  background-color: #dff0d8;
  color: #3c763d;
  border-color: #d6e9c6; }

.noty_theme__bootstrap-v4.noty_bar {
  margin: 4px 0;
  overflow: hidden;
  position: relative;
  border: 1px solid transparent;
  border-radius: .25rem; }
  .noty_theme__bootstrap-v4.noty_bar .noty_body {
    padding: .75rem 1.25rem; }
  .noty_theme__bootstrap-v4.noty_bar .noty_buttons {
    padding: 10px; }
  .noty_theme__bootstrap-v4.noty_bar .noty_close_button {
    font-size: 1.5rem;
    font-weight: 700;
    line-height: 1;
    color: #000;
    text-shadow: 0 1px 0 #fff;
    filter: alpha(opacity=20);
    opacity: .5;
    background: transparent; }
  .noty_theme__bootstrap-v4.noty_bar .noty_close_button:hover {
    background: transparent;
    text-decoration: none;
    cursor: pointer;
    filter: alpha(opacity=50);
    opacity: .75; }

.noty_theme__bootstrap-v4.noty_type__alert,
.noty_theme__bootstrap-v4.noty_type__notification {
  background-color: #fff;
  color: inherit; }

.noty_theme__bootstrap-v4.noty_type__warning {
  background-color: #fcf8e3;
  color: #8a6d3b;
  border-color: #faebcc; }

.noty_theme__bootstrap-v4.noty_type__error {
  background-color: #f2dede;
  color: #a94442;
  border-color: #ebccd1; }

.noty_theme__bootstrap-v4.noty_type__info,
.noty_theme__bootstrap-v4.noty_type__information {
  background-color: #d9edf7;
  color: #31708f;
  border-color: #bce8f1; }

.noty_theme__bootstrap-v4.noty_type__success {
  background-color: #dff0d8;
  color: #3c763d;
  border-color: #d6e9c6; }

.noty_theme__semanticui.noty_bar {
  margin: 4px 0;
  overflow: hidden;
  position: relative;
  border: 1px solid transparent;
  font-size: 1em;
  border-radius: .28571429rem;
  -webkit-box-shadow: 0 0 0 1px rgba(34, 36, 38, 0.22) inset, 0 0 0 0 transparent;
          box-shadow: 0 0 0 1px rgba(34, 36, 38, 0.22) inset, 0 0 0 0 transparent; }
  .noty_theme__semanticui.noty_bar .noty_body {
    padding: 1em 1.5em;
    line-height: 1.4285em; }
  .noty_theme__semanticui.noty_bar .noty_buttons {
    padding: 10px; }

.noty_theme__semanticui.noty_type__alert,
.noty_theme__semanticui.noty_type__notification {
  background-color: #f8f8f9;
  color: rgba(0, 0, 0, 0.87); }

.noty_theme__semanticui.noty_type__warning {
  background-color: #fffaf3;
  color: #573a08;
  -webkit-box-shadow: 0 0 0 1px #c9ba9b inset, 0 0 0 0 transparent;
          box-shadow: 0 0 0 1px #c9ba9b inset, 0 0 0 0 transparent; }

.noty_theme__semanticui.noty_type__error {
  background-color: #fff6f6;
  color: #9f3a38;
  -webkit-box-shadow: 0 0 0 1px #e0b4b4 inset, 0 0 0 0 transparent;
          box-shadow: 0 0 0 1px #e0b4b4 inset, 0 0 0 0 transparent; }

.noty_theme__semanticui.noty_type__info,
.noty_theme__semanticui.noty_type__information {
  background-color: #f8ffff;
  color: #276f86;
  -webkit-box-shadow: 0 0 0 1px #a9d5de inset, 0 0 0 0 transparent;
          box-shadow: 0 0 0 1px #a9d5de inset, 0 0 0 0 transparent; }

.noty_theme__semanticui.noty_type__success {
  background-color: #fcfff5;
  color: #2c662d;
  -webkit-box-shadow: 0 0 0 1px #a3c293 inset, 0 0 0 0 transparent;
          box-shadow: 0 0 0 1px #a3c293 inset, 0 0 0 0 transparent; }

.noty_theme__nest.noty_bar {
  margin: 0 0 15px 0;
  overflow: hidden;
  border-radius: 2px;
  position: relative;
  -webkit-box-shadow: rgba(0, 0, 0, 0.098039) 5px 4px 10px 0;
          box-shadow: rgba(0, 0, 0, 0.098039) 5px 4px 10px 0; }
  .noty_theme__nest.noty_bar .noty_body {
    padding: 10px;
    font-size: 14px;
    text-shadow: 1px 1px 1px rgba(0, 0, 0, 0.1); }
  .noty_theme__nest.noty_bar .noty_buttons {
    padding: 10px; }

.noty_layout .noty_theme__nest.noty_bar {
  z-index: 5; }

.noty_layout .noty_theme__nest.noty_bar:nth-child(2) {
  position: absolute;
  top: 0;
  margin-top: 4px;
  margin-right: -4px;
  margin-left: 4px;
  z-index: 4;
  width: 100%; }

.noty_layout .noty_theme__nest.noty_bar:nth-child(3) {
  position: absolute;
  top: 0;
  margin-top: 8px;
  margin-right: -8px;
  margin-left: 8px;
  z-index: 3;
  width: 100%; }

.noty_layout .noty_theme__nest.noty_bar:nth-child(4) {
  position: absolute;
  top: 0;
  margin-top: 12px;
  margin-right: -12px;
  margin-left: 12px;
  z-index: 2;
  width: 100%; }

.noty_layout .noty_theme__nest.noty_bar:nth-child(5) {
  position: absolute;
  top: 0;
  margin-top: 16px;
  margin-right: -16px;
  margin-left: 16px;
  z-index: 1;
  width: 100%; }

.noty_layout .noty_theme__nest.noty_bar:nth-child(n+6) {
  position: absolute;
  top: 0;
  margin-top: 20px;
  margin-right: -20px;
  margin-left: 20px;
  z-index: -1;
  width: 100%; }

#noty_layout__bottomLeft .noty_theme__nest.noty_bar:nth-child(2),
#noty_layout__topLeft .noty_theme__nest.noty_bar:nth-child(2) {
  margin-top: 4px;
  margin-left: -4px;
  margin-right: 4px; }

#noty_layout__bottomLeft .noty_theme__nest.noty_bar:nth-child(3),
#noty_layout__topLeft .noty_theme__nest.noty_bar:nth-child(3) {
  margin-top: 8px;
  margin-left: -8px;
  margin-right: 8px; }

#noty_layout__bottomLeft .noty_theme__nest.noty_bar:nth-child(4),
#noty_layout__topLeft .noty_theme__nest.noty_bar:nth-child(4) {
  margin-top: 12px;
  margin-left: -12px;
  margin-right: 12px; }

#noty_layout__bottomLeft .noty_theme__nest.noty_bar:nth-child(5),
#noty_layout__topLeft .noty_theme__nest.noty_bar:nth-child(5) {
  margin-top: 16px;
  margin-left: -16px;
  margin-right: 16px; }

#noty_layout__bottomLeft .noty_theme__nest.noty_bar:nth-child(n+6),
#noty_layout__topLeft .noty_theme__nest.noty_bar:nth-child(n+6) {
  margin-top: 20px;
  margin-left: -20px;
  margin-right: 20px; }

.noty_theme__nest.noty_type__alert,
.noty_theme__nest.noty_type__notification {
  background-color: #073B4C;
  color: #fff; }
  .noty_theme__nest.noty_type__alert .noty_progressbar,
  .noty_theme__nest.noty_type__notification .noty_progressbar {
    background-color: #fff; }

.noty_theme__nest.noty_type__warning {
  background-color: #FFD166;
  color: #fff; }

.noty_theme__nest.noty_type__error {
  background-color: #EF476F;
  color: #fff; }
  .noty_theme__nest.noty_type__error .noty_progressbar {
    opacity: .4; }

.noty_theme__nest.noty_type__info,
.noty_theme__nest.noty_type__information {
  background-color: #118AB2;
  color: #fff; }
  .noty_theme__nest.noty_type__info .noty_progressbar,
  .noty_theme__nest.noty_type__information .noty_progressbar {
    opacity: .6; }

.noty_theme__nest.noty_type__success {
  background-color: #06D6A0;
  color: #fff; }

.noty_theme__light.noty_bar {
  margin: 4px 0;
  overflow: hidden;
  border-radius: 2px;
  position: relative; }
  .noty_theme__light.noty_bar .noty_body {
    padding: 10px; }
  .noty_theme__light.noty_bar .noty_buttons {
    border-top: 1px solid #e7e7e7;
    padding: 5px 10px; }

.noty_theme__light.noty_type__alert,
.noty_theme__light.noty_type__notification {
  background-color: #fff;
  border: 1px solid #dedede;
  color: #444; }

.noty_theme__light.noty_type__warning {
  background-color: #FFEAA8;
  border: 1px solid #FFC237;
  color: #826200; }
  .noty_theme__light.noty_type__warning .noty_buttons {
    border-color: #dfaa30; }

.noty_theme__light.noty_type__error {
  background-color: #ED7000;
  border: 1px solid #e25353;
  color: #FFF; }
  .noty_theme__light.noty_type__error .noty_buttons {
    border-color: darkred; }

.noty_theme__light.noty_type__info,
.noty_theme__light.noty_type__information {
  background-color: #78C5E7;
  border: 1px solid #3badd6;
  color: #FFF; }
  .noty_theme__light.noty_type__info .noty_buttons,
  .noty_theme__light.noty_type__information .noty_buttons {
    border-color: #0B90C4; }

.noty_theme__light.noty_type__success {
  background-color: #57C880;
  border: 1px solid #7cdd77;
  color: darkgreen; }
  .noty_theme__light.noty_type__success .noty_buttons {
    border-color: #50C24E; }</style><style type="text/css">.data-structure-viewer{width:100%;width:calc(100% - 30px)}.data-structure-viewer svg{width:100%}.data-structure-viewer .title-label{position:absolute;top:4%;left:4%;font-size:1.2em}.data-structure-viewer .error-message{position:absolute;top:50%;left:50%;-webkit-transform:translate(-50%, -50%);transform:translate(-50%, -50%);max-width:60%;opacity:0}.data-structure-viewer .tip{position:absolute;bottom:5%;right:4%;max-width:60%;opacity:0}</style><style type="text/css">.data-structure-viewer .node circle{fill:#ffffff;stroke:steelblue;stroke-width:3px}.data-structure-viewer .node text{font:1.8em sans-serif}.data-structure-viewer .link{fill:none;stroke:#cccccc;stroke-width:2px}</style><style type="text/css">.ds-viewer-container{position:relative;margin-top:21px}.ds-viewer-container .data-structure-viewer{-webkit-box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);border:#dddddd 1px solid;position:absolute;top:-5px;z-index:50;-webkit-transform:translate(0, -100%);transform:translate(0, -100%);border-radius:5px;background:rgba(255,255,255,0.8)}.ds-viewer-container .data-structure-viewer _::-webkit-full-page-media,.ds-viewer-container .data-structure-viewer _:future,:root .ds-viewer-container .data-structure-viewer{background-color:rgba(255,255,255,0.2);-webkit-backdrop-filter:blur(10px);backdrop-filter:blur(10px)}</style><style type="text/css">.reset-btn+.popover{white-space:nowrap;max-width:none}.reset-btn+.popover>.arrow{top:auto !important}</style><style type="text/css">.pad-left{padding-left:10px}.pad-right{padding-right:30px}.text-default{color:#333333}.testcase-label{color:#b25150;position:absolute;left:0}.testcase-info,.stdout-info{display:block;font-weight:bold;width:100%;-o-text-overflow:ellipsis;text-overflow:ellipsis;overflow:hidden;white-space:pre;cursor:pointer}.testcase-row-expand .testcase-info{max-height:80px;overflow-y:auto;white-space:pre-wrap;word-break:break-all;word-wrap:break-word;margin:-5px 0;padding:5px 0}.stdout-info{max-height:200px;overflow-y:auto;white-space:pre-wrap;word-break:break-all;word-wrap:break-word}.testcase-table-re,.testcase-table-wa{border:1px solid rgba(169,68,66,0.5);border-collapse:collapse;border-radius:4px;border-spacing:5px;overflow:hidden;padding:10px 23px 25px 23px;font-family:Menlo,Monaco,Consolas,'Courier New',monospace;font-size:14px;line-height:20px;background:transparent;-webkit-box-shadow:0 0 4px rgba(169,68,66,0.5);box-shadow:0 0 4px rgba(169,68,66,0.5)}.testcase-table-re .testcase-table-row{padding:3px 0 3px 15em}.testcase-table-wa .testcase-table-row{padding:3px 0 3px 8em}.testcase-table-wa .testcase-table-row,.testcase-table-re .testcase-table-row{position:relative;padding-top:10px;border-bottom:1px solid rgba(228,154,152,0.5);padding-bottom:14px}.btn-outline{border:1px solid #cfcfcf;background:0 0}.btn-alt{border-radius:2em;padding:8px 18px}#reveal-solution{margin-left:15px}.popover{font-size:13px;font-weight:400;line-height:1.2}.fade-in{-webkit-animation:fadeInLeft 1s;animation:fadeInLeft 1s}.next-challenge-list .label-H{background:#d9534f}.next-challenge-list .label-E{background:#5cb85c}.next-challenge-list .label-M{background:#f0ad4e}</style><style type="text/css">.result-panel-base .result-panel button.close{margin-top:5px}.result-panel-base .result-panel .runtime-result{margin-top:10px}.result-panel-base .result-panel .runtime-result h5{margin-bottom:0}.result-panel-base .result-panel .panel{-webkit-box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);-webkit-transition:-webkit-box-shadow .4s;transition:-webkit-box-shadow .4s;-o-transition:box-shadow .4s;transition:box-shadow .4s;transition:box-shadow .4s, -webkit-box-shadow .4s}.result-panel-base .result-panel .panel:hover{-webkit-box-shadow:0 15px 30px 0 rgba(0,0,0,0.15);box-shadow:0 15px 30px 0 rgba(0,0,0,0.15)}.result-panel-base .result-panel .panel pre{background:#fafafa;border:1px solid #dddddd}.result-panel-base .result-panel .panel .comment{margin-top:20px;font-size:12px}.submission-result-base .line{margin-left:15px;margin-right:15px}.submission-result-base .run-code-status h4{padding-top:5px;padding-bottom:5px}@media (max-width:767px){.submission-result-base .line{margin-top:20px}}</style><style type="text/css">.keyboard-shortcuts__sEqa{display:inline-block;margin-right:0}.key-item__3C07{color:#204d74;font-weight:500}.modal-body__2xeS{color:#5a5a5a}.shortcut-hotkey-tip__1rYD{padding:15px;border-bottom:1px solid #e5e5e5}.shortcut-list__1lA-{padding:15px}.shortcut-list-item__2g4L{display:-webkit-box;display:-ms-flexbox;display:flex}.shortcut-detail__2LTP,.shortcut-detail-name__3nL6{margin:7.5px 0;-webkit-box-flex:1;-ms-flex-positive:1;flex-grow:1;-ms-flex-negative:1;flex-shrink:1;-ms-flex-preferred-size:0;flex-basis:0}.shortcut-detail__2LTP{color:#204d74}</style><style type="text/css">.CodeMirror{border:1px solid #eeeeee;height:auto;padding:0;font:14px / normal 'Monaco','Menlo','Ubuntu Mono','Consolas','source-code-pro',monospace}div.CodeMirror.cm-s-textmate.CodeMirror-wrap{border-radius:5px}.CodeMirror-scroll{min-height:480px}.cm-matchhighlight{outline:1px #c8c8fa solid}@media (min-width:768px){.testcase-area-height-adjust{height:55px}}.testcase-input-base{margin-bottom:20px}.editor-base .Select-control{height:36px}.editor-base .playground-btn,.editor-base .setting-btn,.editor-base .reset-btn,.editor-base .code-btn{-webkit-box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);-webkit-transition:-webkit-box-shadow .4s;transition:-webkit-box-shadow .4s;-o-transition:box-shadow .4s;transition:box-shadow .4s;transition:box-shadow .4s, -webkit-box-shadow .4s;height:100%}.editor-base .playground-btn:hover,.editor-base .setting-btn:hover,.editor-base .reset-btn:hover,.editor-base .code-btn:hover{-webkit-box-shadow:0 15px 30px 0 rgba(0,0,0,0.15);box-shadow:0 15px 30px 0 rgba(0,0,0,0.15)}.editor-base .playground-btn:not(.playground-btn),.editor-base .setting-btn:not(.playground-btn),.editor-base .reset-btn:not(.playground-btn),.editor-base .code-btn:not(.playground-btn){padding-top:7px}.editor-base .btn-round,.editor-base .Select-control{-webkit-box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);-webkit-transition:-webkit-box-shadow .4s;transition:-webkit-box-shadow .4s;-o-transition:box-shadow .4s;transition:box-shadow .4s;transition:box-shadow .4s, -webkit-box-shadow .4s}.editor-base .btn-round:hover,.editor-base .Select-control:hover{-webkit-box-shadow:0 15px 30px 0 rgba(0,0,0,0.15);box-shadow:0 15px 30px 0 rgba(0,0,0,0.15)}.editor-base .editor-toolbar{height:36px;display:-webkit-box;display:-ms-flexbox;display:flex}.editor-base .editor-toolbar .editor-popover:not(:last-child){margin-right:10px}.editor-base .editor-toolbar .editor-btn:disabled{background-color:#fafafa;pointer-events:none}.editor-base .editor-toolbar .disabled-editor-popover{cursor:not-allowed !important}</style><style type="text/css">.discuss-list-base{margin-bottom:15px;line-height:1.7}.discuss-list-base .create-topic-btn{margin-top:10px;margin-bottom:-20px}.discuss-list-base .discuss-list{margin:auto}.discuss-list-base .discuss-item{position:relative;padding:15px 0 15px 15px;border-bottom:1px solid #dddddd;background:white;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-transition:.5s all;-o-transition:.5s all;transition:.5s all}.discuss-list-base .discuss-item.last-visited-topic-entering{background-color:#ddf3ff}.discuss-list-base .discuss-item.discuss-deleted-topic{opacity:.3;-webkit-transition:opacity .2s ease-in;-o-transition:opacity .2s ease-in;transition:opacity .2s ease-in}.discuss-list-base .discuss-item.discuss-deleted-topic:hover{opacity:1}.discuss-list-base a{color:inherit;text-decoration:none}.discuss-list-base .user-avatar{-webkit-box-flex:0;-ms-flex:0 0 30px;flex:0 0 30px;height:30px;margin-right:15px;margin-top:5px}.discuss-list-base .user-avatar .anonymous-avatar{font-size:30px;-webkit-box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);border-radius:50%}.discuss-list-base .info{-webkit-box-flex:1;-ms-flex:1 1 0%;flex:1 1 0%;position:relative;min-width:0}.discuss-list-base .info .title{margin-right:15px;font-weight:400;font-size:16px;max-width:100%;overflow:hidden;-o-text-overflow:ellipsis;text-overflow:ellipsis;white-space:pre;color:black}.discuss-list-base .info .title .discuss-topic-pinned-container{margin-right:6px}.discuss-list-base .info .title a:hover{color:#0088cc}.discuss-list-base .info .updates{margin-right:15px;margin-top:-2px;font-size:10px;color:grey}.discuss-list-base .info .updates a{color:black}.discuss-list-base .info .updates a:hover{color:#0088cc}.discuss-list-base .info .updates .discuss-topic-coin-container img{width:12px;height:12px;margin-bottom:2px}.discuss-list-base .info .updates .discuss-topic-coin-container .score{color:#fea116;margin-left:5px}.discuss-list-base .stats{-webkit-user-select:none;-moz-user-select:none;-ms-user-select:none;user-select:none;text-align:center;-webkit-box-flex:0;-ms-flex:0 0 auto;flex:0 0 auto}.discuss-list-base .stats .item{width:80px;display:inline-block;padding:0}.discuss-list-base .stats .name{color:grey;font-size:12px;font-weight:300}.discuss-list-base .stats .value{color:#337ab7;font-size:18px}@media (min-width:768px){.discuss-list-base .stats .item:not(:last-child){margin-right:-1px;border-right:1px dotted #dddddd}.discuss-list-base .stats .name{margin-top:2px}.discuss-list-base .stats .value{margin-top:-7px}}@media (max-width:767px){.discuss-list-base .discuss-list{margin:0 -15px}.discuss-list-base .discuss-item{padding:0 10px 0 15px}.discuss-list-base .info{margin-top:15px;margin-bottom:15px;width:calc(100% - 100px - 10px)}.discuss-list-base .stats{margin:auto;border-left:1px dotted #dddddd;padding-left:10px}.discuss-list-base .stats .item{width:100px;display:block}.discuss-list-base .stats .item:not(:last-child){border-bottom:1px dotted #dddddd}.discuss-list-base .stats .item:last-child{margin-bottom:-5px}.discuss-list-base .stats .item:not(:first-child){margin-top:5px}.discuss-list-base .stats .name,.discuss-list-base .stats .value{display:block}.discuss-list-base .stats .name.name,.discuss-list-base .stats .value.name{text-align:left}.discuss-list-base .stats .name.value,.discuss-list-base .stats .value.value{margin-top:-24px;text-align:right}}.editor-container{-webkit-transition:.4s all;-o-transition:.4s all;transition:.4s all}.editor-container.disappear,.editor-container.disappear *{visibility:hidden;display:none;opacity:0}ul.pagination{-webkit-user-select:none;-moz-user-select:none;-ms-user-select:none;user-select:none}ul.pagination li:not(.break) a{cursor:pointer}.discuss-tool-bar{display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-orient:horizontal;-webkit-box-direction:normal;-ms-flex-direction:row;flex-direction:row;margin:0 -5px;padding:10px 5px;position:relative;z-index:145;background:white;-webkit-box-shadow:0 5px 5px -5px rgba(0,0,0,0.15);box-shadow:0 5px 5px -5px rgba(0,0,0,0.15);height:60px}@media (max-width:767px){.discuss-tool-bar{padding-bottom:10px;margin:0 -15px !important;-ms-flex-wrap:wrap;flex-wrap:wrap}}@media (max-width:991px){.discuss-tool-bar.collapsible-tool-bar{-webkit-box-orient:vertical;-webkit-box-direction:normal;-ms-flex-direction:column;flex-direction:column;height:auto}}.discuss-tool-bar .discuss-menu{display:-webkit-inline-box;display:-ms-inline-flexbox;display:inline-flex;-webkit-box-orient:horizontal;-webkit-box-direction:normal;-ms-flex-direction:row;flex-direction:row;-webkit-box-flex:1;-ms-flex:1;flex:1;position:relative;min-width:0;color:grey}.discuss-tool-bar .discuss-menu>*{margin-top:8px}@media (max-width:991px){.discuss-tool-bar .discuss-menu>*{margin-bottom:8px}}.discuss-tool-bar .discuss-menu a{color:grey;text-decoration:none}.discuss-tool-bar .discuss-menu a:hover{color:#0088cc}.discuss-tool-bar .discuss-menu .nav-start{display:inline-block;margin-left:20px;-webkit-box-flex:0;-ms-flex:0 0 auto;flex:0 0 auto}.discuss-tool-bar .discuss-menu .discuss-search-div{margin-top:4px;padding-left:0}.discuss-tool-bar .discuss-menu .discuss-search-bar{border-radius:5px}.discuss-tool-bar .discuss-menu .discuss-search-input-group{width:100%}.discuss-tool-bar .discuss-menu #searchclear{position:absolute;right:5px;top:0;bottom:0;height:14px;margin:auto;font-size:14px;cursor:pointer;color:#cccccc}.discuss-tool-bar .discuss-menu .create-btn{display:inline-block;margin-top:4px;margin-bottom:4px;margin-left:auto;margin-right:5px;padding:3px 7px 3px 12px;cursor:pointer;border-radius:5px}.discuss-tool-bar .discuss-menu .topic-title{overflow:hidden;-o-text-overflow:ellipsis;text-overflow:ellipsis;white-space:pre;display:block;white-space:nowrap}.discuss-tool-bar .dropdown{margin-top:2px}.discuss-tool-bar .dropdown:hover button{color:#0088cc}.discuss-tool-bar .dropdown button{color:grey;background:none;-webkit-box-shadow:none;box-shadow:none}.discuss-tool-bar .dropdown .dropdown-menu{font-weight:400;cursor:pointer}.discuss-tool-bar .dropdown .dropdown-menu .filter-dropdown-menu-items div{padding:2px 10px}.discuss-tool-bar .dropdown .dropdown-menu .filter-dropdown-menu-items div:hover{color:#0088cc;background:#ecf0f1}.topic-editor-modal{width:1000px;max-width:100%}</style><style type="text/css">.options__45N- .radio{display:inline-block;width:170px}.options__45N- .radio input{margin-top:7px}</style><style type="text/css">.title__zzhw{font-size:16px}.title__zzhw[data-status='warn'] .fa{color:#f0ad4e}.title__zzhw[data-status='success'] .fa{color:#5cb85c}.title__zzhw[data-status='error'] .fa{color:#d9534f}.title__zzhw .fa{margin-right:.7em}.modal__3v5F{width:350px}.container__2PuL{padding:8px 15px;color:#666666}.container__2PuL .textarea__3Eoy{margin:15px 0;resize:none;height:150px}.btn-group__b69z{display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-pack:end;-ms-flex-pack:end;justify-content:flex-end}.btn-group__b69z button{padding:6px 10px;color:#00acff;font-weight:500;border-radius:4px;border:0;outline:0;cursor:pointer}.btn-group__b69z button:hover{background:#ecf0f1}.btn-group__b69z button+button{margin-left:4px}</style><style type="text/css">.mentions-input .mentions-input__highlighter{min-height:50px;max-height:300px;height:auto}.mentions-input .mentions-input__input{overflow:auto !important;width:100%;resize:none;border:none;background:none;outline:none;max-height:300px}.mentions-input .mentioned-username,.mentions-input .mentioned-question{background-color:#ecf0f1;border-radius:3px}.mentions-input .mentions-input__suggestions{background-color:transparent;border-radius:5px;border:1px solid #dddddd;z-index:11 !important;-webkit-box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);-webkit-transition:-webkit-box-shadow .4s;transition:-webkit-box-shadow .4s;-o-transition:box-shadow .4s;transition:box-shadow .4s;transition:box-shadow .4s, -webkit-box-shadow .4s}.mentions-input .mentions-input__suggestions:hover{-webkit-box-shadow:0 15px 30px 0 rgba(0,0,0,0.15);box-shadow:0 15px 30px 0 rgba(0,0,0,0.15)}.mentions-input .mentions-input__suggestions .mentions-input__suggestions__list .mentions-input__suggestions__item{border-bottom:1px solid #dddddd}.mentions-input .mentions-input__suggestions .mentions-input__suggestions__list .mentions-input__suggestions__item .mention-username-wrapper{padding:4px;height:38px;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-align:center;-ms-flex-align:center;align-items:center}.mentions-input .mentions-input__suggestions .mentions-input__suggestions__list .mentions-input__suggestions__item .mention-question-wrapper{padding:8px}.mentions-input .mentions-input__suggestions .mentions-input__suggestions__list .mentions-input__suggestions__item .mention-question-wrapper .mention-question-number{margin-right:5px;font-size:12px;color:#95a5a6}.mentions-input .mentions-input__suggestions .mentions-input__suggestions__list .mentions-input__suggestions__item .suggestion-avatar{max-width:30px;max-height:30px;margin-right:6px;border-radius:5px}.mentions-input .mentions-input__suggestions .mentions-input__suggestions__list .mentions-input__suggestions__item.mentions-input__suggestions__item--focused{background-color:#e6e6e6}.mentions-input .mentions-input__suggestions .mentions-input__suggestions__list .mentions-input__suggestions__item:first-child{border-top-left-radius:5px;border-top-right-radius:5px}.mentions-input .mentions-input__suggestions .mentions-input__suggestions__list .mentions-input__suggestions__item:last-child{border-bottom-left-radius:5px;border-bottom-right-radius:5px}</style><style type="text/css">.write-comment-base .create-comment .anonymous-new-commenter{font-size:50px;-webkit-box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);border-radius:50%}.write-comment-base .create-comment .comment-panel.reply-panel{background:white !important;padding:0 !important}.write-comment-base .create-comment .comment-panel.reply-panel .comment-editor{padding:10px 10px 5px 10px;border-bottom:1px solid #dddddd}.write-comment-base .create-comment .comment-panel.reply-panel .comment-toolbar{text-align:right}.write-comment-base .create-comment .comment-panel.reply-panel .comment-toolbar a,.write-comment-base .create-comment .comment-panel.reply-panel .comment-toolbar .btn-link,.write-comment-base .create-comment .comment-panel.reply-panel .comment-toolbar .btn{text-decoration:none;font-weight:500}.write-comment-base .create-comment .comment-panel.reply-panel .comment-toolbar .left{float:left}.write-comment-base .create-comment .comment-panel.reply-panel .comment-toolbar .preview-btn{color:#afafaf}.write-comment-base .create-comment .comment-panel.reply-panel .comment-toolbar .preview-btn:hover{color:grey}.write-comment-base .create-comment .comment-panel.reply-panel .comment-toolbar .preview-btn.active{color:#373737}.write-comment-base .create-comment .comment-panel.reply-panel .comment-toolbar .post-btn{color:#0088cc;height:34px;border:none;border-left:1px solid #dddddd;border-radius:0}.write-comment-base .create-comment .comment-panel.reply-panel .comment-toolbar .post-btn:last-child{border-bottom-right-radius:5px}</style><style type="text/css">.discuss-admin-badge-container{display:-webkit-inline-box;display:-ms-inline-flexbox;display:inline-flex}.discuss-admin-badge.discuss-admin-badge-small{color:#95a5a6;padding:1px 4px}.discuss-admin-badge.discuss-admin-badge-medium{background-color:#95a5a6;color:#fff;font-weight:500;text-transform:uppercase;padding:0px 5px;border-radius:3px;font-size:10px;margin-left:5px;height:18px;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-align:center;-ms-flex-align:center;align-items:center}</style><style type="text/css">@-webkit-keyframes highlight{from{background:#ddf3ff}to{background:white}}@keyframes highlight{from{background:#ddf3ff}to{background:white}}@-webkit-keyframes fadetrans{from{opacity:1}to{opacity:0}}@keyframes fadetrans{from{opacity:1}to{opacity:0}}.lc-comment a{text-decoration:none}.lc-comment a:hover .link{text-decoration:underline}.lc-comment.comment-base{display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-align:stretch;-ms-flex-align:stretch;align-items:stretch;margin-bottom:20px;width:100%;max-width:100%}@media (min-width:768px){.lc-comment.comment-base{padding-left:20px;padding-right:20px}}.lc-comment.comment-base .comment-avatar{-webkit-box-flex:0;-ms-flex:0 0 50px;flex:0 0 50px;margin-right:20px;margin-top:10px}@media (max-width:767px){.lc-comment.comment-base .comment-avatar{display:none}}.lc-comment.comment-base .comment-avatar .img-avatar{-webkit-box-shadow:none;box-shadow:none}.lc-comment.comment-base .comment-avatar .anonymous-commenter-avatar{font-size:50px;-webkit-box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);border-radius:50%}.lc-comment.comment-base .comment-panel{width:100%;background:white;margin:-5px;padding:5px;border-radius:5px}@media (max-width:767px){.lc-comment.comment-base .comment-panel{width:100%}}.lc-comment.comment-base .comment-panel.comment-not-open{opacity:.5;-webkit-transition:.2s all;-o-transition:.2s all;transition:.2s all}.lc-comment.comment-base .comment-panel.comment-not-open:hover{opacity:1}.lc-comment.comment-base .comment-panel.comment-not-open .read-more .trans{height:40px;background-image:-webkit-gradient(linear, left top, left bottom, from(rgba(255,255,255,0)), to(#ffffff));background-image:-webkit-linear-gradient(top, rgba(255,255,255,0), #ffffff);background-image:-o-linear-gradient(top, rgba(255,255,255,0), #ffffff);background-image:linear-gradient(to bottom, rgba(255,255,255,0), #ffffff)}.lc-comment.comment-base .comment-panel .comment-content p{margin-bottom:16px}.lc-comment.comment-base .comment-panel .comment-content p:last-child{margin-bottom:0}.lc-comment.comment-base .comment-panel.reply-panel{width:100%;background:#fafafa;-webkit-box-shadow:0 1px 1px rgba(0,0,0,0.075) inset;box-shadow:0 1px 1px rgba(0,0,0,0.075) inset;border:#dddddd 1px solid;padding:24px 0;border-radius:5px;min-width:0}.lc-comment.comment-base .comment-panel.reply-panel .comment-avatar{margin-top:0}.lc-comment .comment-replies-wrapper{display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-ms-flex-direction:column;flex-direction:column;-webkit-box-flex:1;-ms-flex:1 1 auto;flex:1 1 auto;min-width:0}.lc-comment .comment-replies-wrapper .comment-replies-panel{margin-top:10px;margin-left:5px}.lc-comment .comment-replies-wrapper .comment-replies-panel .show-replies-link{cursor:pointer;text-transform:uppercase;font-weight:500;font-size:13px}.lc-comment.comment-reply-base{width:calc(100% - 70px);margin-left:70px}@media (max-width:767px){.lc-comment.comment-reply-base{width:calc(100% - 30px);margin-left:30px}}.lc-comment .comment-info{margin:0 5px;width:100%;display:inline-block}.lc-comment .comment-info .username{display:inline-block}.lc-comment .comment-info .reputation{display:inline-block;margin-left:10px;color:#afafaf;font-size:12px;cursor:default}.lc-comment .comment-info .reputation:hover{color:#fbc12a}.lc-comment .comment-info .date,.lc-comment .comment-info .status{display:inline-block;margin-left:10px;font-size:12px;color:#afafaf}.lc-comment .comment-body{padding-top:5px;padding-bottom:5px;position:relative}.lc-comment .comment-body blockquote{font-size:12px;padding:0;margin:0 0 0 5px;color:grey}.lc-comment .comment-body pre{margin:10px 0}.lc-comment .comment-body p{line-height:1.5;margin:0 5px}.lc-comment .comment-body,.lc-comment .comment-body *{-webkit-transition:.4s all;-o-transition:.4s all;transition:.4s all}.lc-comment .comment-body .comment-content{height:auto;word-wrap:break-word;-webkit-transition:.2s all;-o-transition:.2s all;transition:.2s all}.lc-comment .comment-body .comment-content img{max-width:100% !important;max-height:1000px !important}.lc-comment .comment-body .read-more{-webkit-transition:.4s all;-o-transition:.4s all;transition:.4s all;position:absolute;bottom:0;left:0;width:100%;margin:0}.lc-comment .comment-body .read-more .trans{height:40px;background-image:-webkit-gradient(linear, left top, left bottom, from(rgba(255,255,255,0)), to(white));background-image:-webkit-linear-gradient(top, rgba(255,255,255,0), white);background-image:-o-linear-gradient(top, rgba(255,255,255,0), white);background-image:linear-gradient(to bottom, rgba(255,255,255,0), white);position:relative;z-index:1}.lc-comment .comment-body .read-more .trans::before{background-image:-webkit-gradient(linear, left top, left bottom, from(rgba(255,255,255,0)), to(#ddf3ff));background-image:-webkit-linear-gradient(top, rgba(255,255,255,0), #ddf3ff);background-image:-o-linear-gradient(top, rgba(255,255,255,0), #ddf3ff);background-image:linear-gradient(to bottom, rgba(255,255,255,0), #ddf3ff);content:'';display:block;height:100%;position:absolute;top:0;left:0;opacity:0;width:100%;z-index:0}.lc-comment .comment-body .read-more .trans.blue-trans::before{-webkit-animation:fadetrans 3s;animation:fadetrans 3s}.lc-comment .comment-body .read-more .opaque-block{background-color:white;width:100%;position:absolute}.lc-comment .comment-body .read-more[data-status='exiting']{opacity:0}.lc-comment .comment-body .read-more[data-status='exited']{opacity:0;display:none}.lc-comment .comment-body.has-read-more.shrink-size .comment-content{min-height:5px;max-height:100px;overflow:hidden}.lc-comment .comment-footer .read-more-text-container{display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-pack:center;-ms-flex-pack:center;justify-content:center;margin-bottom:5px}@media (max-width:767px){.lc-comment .comment-footer .read-more-text-container{-webkit-box-pack:end;-ms-flex-pack:end;justify-content:flex-end}}.lc-comment .comment-footer .read-more-text-container .read-more-text{color:#bdc3c7;font-size:12px;padding:0 8px;cursor:pointer;-webkit-transition:.2s all;-o-transition:.2s all;transition:.2s all}.lc-comment .comment-footer .read-more-text-container .read-more-text:hover{color:#95a5a6}.lc-comment .comment-tool{padding-left:5px}.lc-comment .comment-tool .vote{display:inline-block;font-weight:600;color:#afafaf}.lc-comment .comment-tool .vote>span:not(:first-child){margin-left:10px}.lc-comment .comment-tool .vote .vote-up-active{color:#0088cc}.lc-comment .comment-tool .vote .vote-dn-active{color:#d9534f}.lc-comment .comment-tool .comment-separator{border-left:#afafaf 1px dotted;margin-left:10px;margin-right:10px}.lc-comment .comment-tool .reply-btn,.lc-comment .comment-tool .share-btn{color:#afafaf;font-size:12px;cursor:pointer}.lc-comment .comment-tool .reply-btn:hover,.lc-comment .comment-tool .share-btn:hover{color:#0088cc}.lc-comment .comment-tool .reply-btn .discuss-bottom-bar-icon,.lc-comment .comment-tool .share-btn .discuss-bottom-bar-icon{margin-right:5px}.lc-comment:hover .title-toolbar .report-btn,.lc-comment:hover .title-toolbar .delete-btn,.lc-comment:hover .title-toolbar .edit-btn,.lc-comment:hover .title-toolbar .restore-btn{opacity:1}.lc-comment .title-toolbar .mobile-menu-container .discuss-comment-menu-toggle{padding:0 15px 0 10px}.lc-comment .title-toolbar .mobile-menu-container .discuss-mobile-menu{color:#bdc3c7}.lc-comment .title-toolbar .mobile-menu-container .discuss-mobile-menu>li>a{padding:5px 10px}.lc-comment .title-toolbar .mobile-menu-container .discuss-mobile-menu .discuss-mobile-menu-icon{margin-right:8px}.lc-comment .title-toolbar .mobile-menu-container .discuss-mobile-menu .discuss-mobile-menu-icon.discuss-mobile-report-icon{color:#d9534f}.lc-comment .title-toolbar .mobile-menu-container .discuss-mobile-menu .discuss-mobile-menu-icon.discuss-mobile-delete-icon{color:#d9534f}.lc-comment .title-toolbar .mobile-menu-container .discuss-mobile-menu .discuss-mobile-menu-icon.discuss-mobile-edit-icon,.lc-comment .title-toolbar .mobile-menu-container .discuss-mobile-menu .discuss-mobile-menu-icon.discuss-mobile-restore-icon{color:#0088cc}.lc-comment .title-toolbar .report-btn,.lc-comment .title-toolbar .delete-btn,.lc-comment .title-toolbar .edit-btn,.lc-comment .title-toolbar .restore-btn{-webkit-transition:.4s all;-o-transition:.4s all;transition:.4s all;opacity:0;cursor:pointer;color:#afafaf;margin-left:5px;margin-right:5px}@media (max-width:767px){.lc-comment .title-toolbar .report-btn,.lc-comment .title-toolbar .delete-btn,.lc-comment .title-toolbar .edit-btn,.lc-comment .title-toolbar .restore-btn{opacity:1}}.lc-comment .title-toolbar .edit-btn:hover .edit-btn-icon,.lc-comment .title-toolbar .restore-btn:hover .edit-btn-icon,.lc-comment .title-toolbar .edit-btn:hover .edit-btn-text,.lc-comment .title-toolbar .restore-btn:hover .edit-btn-text,.lc-comment .title-toolbar .edit-btn:hover .restore-btn-icon,.lc-comment .title-toolbar .restore-btn:hover .restore-btn-icon,.lc-comment .title-toolbar .edit-btn:hover .restore-btn-text,.lc-comment .title-toolbar .restore-btn:hover .restore-btn-text{color:#0088cc}.lc-comment .title-toolbar .delete-btn:hover .delete-btn-icon,.lc-comment .title-toolbar .delete-btn:hover .delete-btn-text{color:#d9534f}.lc-comment .title-toolbar .report-btn:hover .report-btn-icon,.lc-comment .title-toolbar .report-btn:hover .report-btn-text{color:#d9534f}.lc-comment .title-toolbar .edit-btn-text,.lc-comment .title-toolbar .delete-btn-text,.lc-comment .title-toolbar .report-btn-text,.lc-comment .title-toolbar .restore-btn-text{font-size:12px;font-weight:500;color:#afafaf}.lc-comment .title-toolbar .edit-btn-icon,.lc-comment .title-toolbar .delete-btn-icon,.lc-comment .title-toolbar .report-btn-icon,.lc-comment .title-toolbar .restore-btn-icon{margin-right:4px}</style><style type="text/css">@media (min-width:768px){.comment-pager-base{margin-left:90px}}.comment-pager-base ul.pagination{-webkit-user-select:none;-moz-user-select:none;-ms-user-select:none;user-select:none}.comment-pager-base ul.pagination li a{position:relative;border-radius:1020px;height:22px;width:22px;padding:2px;font-size:80%;text-align:center;outline:none}.comment-pager-base ul.pagination li a:hover{background:#ecf0f1}.comment-pager-base ul.pagination li.active a{background:#0088cc}.comment-pager-base ul.pagination li:not(:first-child) a{margin-left:5px}.comment-pager-base ul.pagination .break a{border:none !important;background:none !important;cursor:default}</style><style type="text/css">@media (max-width:767px){.discuss-main-topic-base{margin:0 -15px}}.discuss-main-topic-base .discuss-topic-title{display:-webkit-box;display:-ms-flexbox;display:flex}.discuss-main-topic-base .discuss-topic-title .discuss-topic-pinned-container{margin-right:10px}.discuss-main-topic-base .discuss-topic-title .discuss-topic-pinned-container .discuss-topic-pin{color:#95a5a6}.discuss-main-topic-base .discuss-topic-title .discuss-topic-pinned-container .discuss-topic-pin-active{color:#0088cc}.discuss-main-topic-base .discuss-topic-coin-container{color:#bdc3c7}.discuss-main-topic-base .discuss-topic-coin-container img{width:12px;height:12px;margin-bottom:2px}.discuss-main-topic-base .discuss-topic-coin-container .score{color:#fea116;margin-left:5px}.discuss-main-topic-base .side-block{height:65px}.discuss-main-topic-base .header-bar-base{height:66px;background:#fafafa;border-bottom:1px solid #dddddd}.discuss-main-topic-base .header-bar-base .title{max-width:100%;overflow:hidden;-o-text-overflow:ellipsis;text-overflow:ellipsis;white-space:pre;margin-left:20px;margin-right:20px;margin-top:17px;font-size:18px;font-weight:500}.discuss-main-topic-base .statistics{margin-top:10px;position:relative;text-align:center}.discuss-main-topic-base .statistics .statistic-block{width:50%;display:inline-block;height:45px}.discuss-main-topic-base .statistics .value{color:#337ab7;font-size:18px}.discuss-main-topic-base .statistics .name{color:black;opacity:.5;font-size:12px;font-weight:300;margin-top:-5px}.post-base{display:-webkit-box;display:-ms-flexbox;display:flex;position:relative}.post-base .info-panel{width:60px;background:#fafafa}@media (max-width:767px){.post-base .info-panel{width:40px}}.post-base .info-panel .vote-system{text-align:center;color:#afafaf}.post-base .info-panel .vote-system .icon{font-size:25px;padding:0}.post-base .info-panel .vote-system .icon:not(.disabled){cursor:pointer}.post-base .info-panel .vote-system .icon.disabled{opacity:.3;cursor:not-allowed}.post-base .info-panel .vote-system .vote-up-active{color:#0088cc}.post-base .info-panel .vote-system .vote-dn-active{color:#d9534f}.post-base .info-panel .vote-system .vote-count{position:relative;margin-top:-10px;font-weight:500;font-size:16px}.post-base .info-panel .vote-system .vote-dn{position:relative;margin-top:-10px}.post-base .post-panel{padding:10px 20px;width:calc(100% - 60px);word-wrap:break-word}@media (max-width:767px){.post-base .post-panel{width:calc(100% - 40px)}}.post-base .post-panel .post-info-bar{border-bottom:#dddddd 1px dotted;margin-bottom:20px;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-pack:justify;-ms-flex-pack:justify;justify-content:space-between}@media (max-width:767px){.post-base .post-panel .post-info-bar{-webkit-box-orient:vertical;-webkit-box-direction:normal;-ms-flex-direction:column;flex-direction:column}.post-base .post-panel .post-info-bar .user-info{-ms-flex-item-align:end;align-self:flex-end}}.post-base .post-panel .post-info-bar .post-info{color:#afafaf;font-size:12px}.post-base .post-panel .post-info-bar .user-info{position:relative;top:-2px;display:-webkit-box;display:-ms-flexbox;display:flex}.post-base .post-panel .post-info-bar .user-info .discuss-topic-admin-badge-wrapper{margin-top:0}.post-base .post-panel .post-info-bar .user-info .username{overflow:hidden;-o-text-overflow:ellipsis;text-overflow:ellipsis;white-space:pre;max-width:120px;margin-left:5px}.post-base .post-panel .post-info-bar .user-info .reputation{display:inline-block;margin-left:10px;color:#afafaf;font-size:12px;cursor:default}.post-base .post-panel .post-info-bar .user-info .reputation:hover{color:#fbc12a}.post-base .post-panel .post-info-bar .user-info .reputation-tip{width:40px}.post-base .post-panel .post-info-bar .user-info .anonymous-avatar{font-size:20px;-webkit-box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);border-radius:50%;height:20px;width:20px}.post-base .post-panel img{max-width:100% !important;max-height:1000px !important}.post-base .post-panel .discuss-topic-view-tag-list{color:#bdc3c7;font-size:12px}.post-base .post-panel .discuss-topic-view-tag-list .discuss-topic-view-tag,.post-base .post-panel .discuss-topic-view-tag-list .discuss-topic-view-tag-icon{margin:5px}</style><style type="text/css">.discuss-comment-section{position:relative;-webkit-box-shadow:0 -5px 5px -5px rgba(0,0,0,0.15);box-shadow:0 -5px 5px -5px rgba(0,0,0,0.15)}.discuss-comment-section .comment-title{padding-top:10px;padding-bottom:15px}.discuss-comment-section .comment-title .title{font-weight:500;font-size:20px}.discuss-comment-section .comment-title .dropdown{margin-top:2px}.discuss-comment-section .comment-title .dropdown:hover button{color:#0088cc}.discuss-comment-section .comment-title .dropdown button{color:grey;outline:none;background:none;-webkit-box-shadow:none;box-shadow:none}.discuss-comment-section .comment-title .dropdown .dropdown-menu{font-weight:400;cursor:pointer}.discuss-comment-section .comment-title .dropdown .dropdown-menu .filter-dropdown-menu-items div{padding:2px 10px}.discuss-comment-section .comment-title .dropdown .dropdown-menu .filter-dropdown-menu-items div:hover{color:#0088cc;background:#ecf0f1}</style><style type="text/css">.discuss-layout-background-wrapper{background:#fafafa;position:fixed;top:0;left:0;width:100%;height:100%;z-index:-1}body.topic-editor .discuss-container{padding-bottom:calc(50vh - 80px)}.discuss-header{display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-align:center;-ms-flex-align:center;align-items:center;-webkit-box-pack:justify;-ms-flex-pack:justify;justify-content:space-between;margin-bottom:30px;margin-top:30px}.discuss-header .container{display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-pack:center;-ms-flex-pack:center;justify-content:center;-webkit-box-orient:vertical;-webkit-box-direction:normal;-ms-flex-direction:column;flex-direction:column;color:white;margin-bottom:20px;max-width:100%}.discuss-header .container .discuss-back-link{margin-bottom:20px}.discuss-header .container .discuss-back-link a{color:white;font-size:16px;font-weight:500}.discuss-header .container .discuss-back-link a:hover{color:white;text-decoration:none}@media (max-width:767px){.discuss-header .container{padding-top:0;-webkit-box-orient:vertical;-webkit-box-direction:normal;-ms-flex-direction:column;flex-direction:column}}.discuss-layout-body{display:-webkit-box;display:-ms-flexbox;display:flex}.discuss-layout-body .discuss-layout-body-main{min-height:600px;background:white;border-radius:5px;margin-bottom:50px;font-size:14px;padding:20px 30px;-webkit-box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);-webkit-transition:-webkit-box-shadow .4s;transition:-webkit-box-shadow .4s;-o-transition:box-shadow .4s;transition:box-shadow .4s;transition:box-shadow .4s, -webkit-box-shadow .4s;-webkit-box-flex:1;-ms-flex:1;flex:1;min-width:0px}.discuss-layout-body .discuss-layout-body-main:hover{-webkit-box-shadow:0 15px 30px 0 rgba(0,0,0,0.15);box-shadow:0 15px 30px 0 rgba(0,0,0,0.15)}.discuss-layout-body .discuss-layout-body-right{-webkit-box-flex:0;-ms-flex:0 0 200px;flex:0 0 200px;margin-left:35px}</style><style type="text/css">.base-header .base-header-back-to{color:#95a5a6;font-size:14px}.base-header .base-header-title{font-size:24px;font-weight:500}.base-header a,.base-header a:link,.base-header a:visited,.base-header a:hover,.base-header a:active{color:inherit;text-decoration:inherit;font-weight:inherit}</style><style type="text/css">.discuss-dropdown{max-width:100%;z-index:150}.discuss-dropdown .discuss-dropdown-nav-container{max-width:100%;font-size:18px;font-weight:500;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-align:center;-ms-flex-align:center;align-items:center;margin-top:15px}.discuss-dropdown .discuss-dropdown-nav-container .discuss-nav-dropdown:first-child{margin-right:5px}.discuss-dropdown .discuss-dropdown-nav-container .discuss-nav-dropdown{display:inline-block;width:220px;font-size:14px;font-weight:400}.discuss-dropdown .discuss-dropdown-nav-container .discuss-nav-dropdown .Select-control>.Select-clear-zone>.Select-clear{font-weight:400}.discuss-dropdown .discuss-dropdown-nav-container .discuss-nav-dropdown .Select-menu-outer{z-index:5}</style><style type="text/css">.category-switch-wrapper{display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-pack:end;-ms-flex-pack:end;justify-content:flex-end;-webkit-box-align:center;-ms-flex-align:center;align-items:center;padding:5px;background:lightgray;font-size:12px}</style><style type="text/css">.discuss-topic-view-base{line-height:1.7}.discuss-topic-view-base pre{border:none}.discuss-topic-view-base .side-block{float:left;width:100px;background:#fafafa;border-left:1px solid #dddddd}.discuss-topic-view-base .content-block{float:left;width:calc(100% - 100px)}.discuss-topic-view-base .header-tools-base{-webkit-box-flex:0;-ms-flex:0 0 auto;flex:0 0 auto;margin:5px 10px 5px 5px}@media (max-width:991px){.discuss-topic-view-base .header-tools-base{margin:0;width:100%}.discuss-topic-view-base .header-tools-base .btn-group{display:-webkit-box;display:-ms-flexbox;display:flex}.discuss-topic-view-base .header-tools-base .btn-group .btn{-webkit-box-flex:1;-ms-flex:1;flex:1;border-radius:0}.discuss-topic-view-base .header-tools-base .btn-group .btn:first-child{border-left:0px}.discuss-topic-view-base .header-tools-base .btn-group .btn:last-child{border-right:0px}}.discuss-topic-view-base .header-tools-base .share-btn .share-btn-text,.discuss-topic-view-base .header-tools-base .reply-btn .share-btn-text,.discuss-topic-view-base .header-tools-base .edit-btn .share-btn-text,.discuss-topic-view-base .header-tools-base .watch-btn .share-btn-text,.discuss-topic-view-base .header-tools-base .nodebb-btn .share-btn-text,.discuss-topic-view-base .header-tools-base .restore-btn .share-btn-text,.discuss-topic-view-base .header-tools-base .share-btn .reply-btn-text,.discuss-topic-view-base .header-tools-base .reply-btn .reply-btn-text,.discuss-topic-view-base .header-tools-base .edit-btn .reply-btn-text,.discuss-topic-view-base .header-tools-base .watch-btn .reply-btn-text,.discuss-topic-view-base .header-tools-base .nodebb-btn .reply-btn-text,.discuss-topic-view-base .header-tools-base .restore-btn .reply-btn-text,.discuss-topic-view-base .header-tools-base .share-btn .edit-btn-text,.discuss-topic-view-base .header-tools-base .reply-btn .edit-btn-text,.discuss-topic-view-base .header-tools-base .edit-btn .edit-btn-text,.discuss-topic-view-base .header-tools-base .watch-btn .edit-btn-text,.discuss-topic-view-base .header-tools-base .nodebb-btn .edit-btn-text,.discuss-topic-view-base .header-tools-base .restore-btn .edit-btn-text,.discuss-topic-view-base .header-tools-base .share-btn .watch-btn-text,.discuss-topic-view-base .header-tools-base .reply-btn .watch-btn-text,.discuss-topic-view-base .header-tools-base .edit-btn .watch-btn-text,.discuss-topic-view-base .header-tools-base .watch-btn .watch-btn-text,.discuss-topic-view-base .header-tools-base .nodebb-btn .watch-btn-text,.discuss-topic-view-base .header-tools-base .restore-btn .watch-btn-text,.discuss-topic-view-base .header-tools-base .share-btn .nodebb-btn-text,.discuss-topic-view-base .header-tools-base .reply-btn .nodebb-btn-text,.discuss-topic-view-base .header-tools-base .edit-btn .nodebb-btn-text,.discuss-topic-view-base .header-tools-base .watch-btn .nodebb-btn-text,.discuss-topic-view-base .header-tools-base .nodebb-btn .nodebb-btn-text,.discuss-topic-view-base .header-tools-base .restore-btn .nodebb-btn-text,.discuss-topic-view-base .header-tools-base .share-btn .restore-btn-text,.discuss-topic-view-base .header-tools-base .reply-btn .restore-btn-text,.discuss-topic-view-base .header-tools-base .edit-btn .restore-btn-text,.discuss-topic-view-base .header-tools-base .watch-btn .restore-btn-text,.discuss-topic-view-base .header-tools-base .nodebb-btn .restore-btn-text,.discuss-topic-view-base .header-tools-base .restore-btn .restore-btn-text{display:inline-block;margin-left:5px}.discuss-topic-view-base .header-tools-base .share-btn:hover,.discuss-topic-view-base .header-tools-base .reply-btn:hover,.discuss-topic-view-base .header-tools-base .edit-btn:hover,.discuss-topic-view-base .header-tools-base .watch-btn:hover,.discuss-topic-view-base .header-tools-base .nodebb-btn:hover,.discuss-topic-view-base .header-tools-base .restore-btn:hover{color:#0088cc}.discuss-topic-view-base .header-tools-base .delete-btn .delete-btn-text,.discuss-topic-view-base .header-tools-base .report-btn .delete-btn-text,.discuss-topic-view-base .header-tools-base .delete-btn .report-btn-text,.discuss-topic-view-base .header-tools-base .report-btn .report-btn-text{display:inline-block;margin-left:5px}.discuss-topic-view-base .header-tools-base .delete-btn:hover,.discuss-topic-view-base .header-tools-base .report-btn:hover{color:#d9534f}.discuss-topic-view-base .header-tools-base .btn-default{color:grey}.discuss-topic-view-base .header-tools-base .copy-alert-text{-webkit-transition:.4s all;-o-transition:.4s all;transition:.4s all;opacity:0;font-size:12px;font-weight:500;margin-right:10px;color:#5cb85c}.discuss-topic-view-base .header-tools-base .copy-alert-text.appear{opacity:1}.discuss-topic-view-base .topic-not-open-warning{margin-bottom:0}.discuss-topic-view-base .topic-not-open-warning .discuss-restore-text{font-weight:700;cursor:pointer}.post-base h1{font-size:22px}.post-base h2{font-size:20px}.post-base h3{font-size:16px}.post-base h4{font-size:15px}.post-base h5{font-size:14px}.post-base h6{font-size:12px}.post-base table{margin-bottom:16px}.post-base table th,.post-base table td{padding:6px 12px;border:1px solid #dddddd}.post-base table tr{border-top:1px solid #dddddd}.post-base table tr:nth-child(2n){background-color:#ecf0f1}.comment-content h1,.comment-content h2,.comment-content h3,.comment-content h4,.comment-content h5,.comment-content h6{font-size:inherit}.comment-content h1 .anchor,.comment-content h2 .anchor,.comment-content h3 .anchor,.comment-content h4 .anchor,.comment-content h5 .anchor,.comment-content h6 .anchor{display:none}pre code{white-space:pre;word-wrap:normal}</style><style type="text/css">.editor-title-input{-webkit-box-flex:1;-ms-flex:1;flex:1;max-width:500px;margin-right:10px}@media (max-width:767px){.editor-title-input{max-width:100%;margin-right:0}}</style><style type="text/css">.editor-category-select{-webkit-box-flex:1;-ms-flex:1;flex:1;min-width:200px}</style><style type="text/css">body.topic-editor .question-detail-container{padding-bottom:calc(50vh - 80px)}.visible-xss{display:none}@media (max-width:480px){.visible-xss{display:unset}}.hidden-xss{display:unset}@media (max-width:480px){.hidden-xss{display:none}}.topic-editor-base{height:100%;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-ms-flex-direction:column;flex-direction:column}.topic-editor-base .CodeMirror{font-family:monospace;height:300px;color:#000;direction:ltr}.topic-editor-base .CodeMirror-lines{padding:4px 0}.topic-editor-base .CodeMirror pre{padding:0 4px}.topic-editor-base .CodeMirror-gutter-filler,.topic-editor-base .CodeMirror-scrollbar-filler{background-color:#fff}.topic-editor-base .CodeMirror-gutters{border-right:1px solid #ddd;background-color:#f7f7f7;white-space:nowrap}.topic-editor-base .CodeMirror-linenumber{padding:0 3px 0 5px;min-width:20px;text-align:right;color:#999;white-space:nowrap}.topic-editor-base .CodeMirror-guttermarker{color:#000}.topic-editor-base .CodeMirror-guttermarker-subtle{color:#999}.topic-editor-base .CodeMirror-cursor{border-left:1px solid #000;border-right:none;width:0}.topic-editor-base .CodeMirror div.CodeMirror-secondarycursor{border-left:1px solid silver}.topic-editor-base .cm-fat-cursor .CodeMirror-cursor{width:auto;border:0!important;background:#7e7}.topic-editor-base .cm-fat-cursor div.CodeMirror-cursors{z-index:1}.topic-editor-base .cm-animate-fat-cursor{width:auto;border:0;-webkit-animation:blink 1.06s steps(1) infinite;animation:blink 1.06s steps(1) infinite;background-color:#7e7}@-webkit-keyframes blink{50%{background-color:transparent}}@keyframes blink{50%{background-color:transparent}}.topic-editor-base .cm-tab{display:inline-block;text-decoration:inherit}.topic-editor-base .CodeMirror-rulers{position:absolute;left:0;right:0;top:-50px;bottom:-20px;overflow:hidden}.topic-editor-base .CodeMirror-ruler{border-left:1px solid #ccc;top:0;bottom:0;position:absolute}.topic-editor-base .cm-s-default .cm-header{color:#00f}.topic-editor-base .cm-s-default .cm-quote{color:#090}.topic-editor-base .cm-negative{color:#d44}.topic-editor-base .cm-positive{color:#292}.topic-editor-base .cm-header,.topic-editor-base .cm-strong{font-weight:700}.topic-editor-base .cm-em{font-style:italic}.topic-editor-base .cm-link{text-decoration:underline}.topic-editor-base .cm-strikethrough{text-decoration:line-through}.topic-editor-base .cm-s-default .cm-keyword{color:#708}.topic-editor-base .cm-s-default .cm-atom{color:#219}.topic-editor-base .cm-s-default .cm-number{color:#164}.topic-editor-base .cm-s-default .cm-def{color:#00f}.topic-editor-base .cm-s-default .cm-variable-2{color:#05a}.topic-editor-base .cm-s-default .cm-type,.topic-editor-base .cm-s-default .cm-variable-3{color:#085}.topic-editor-base .cm-s-default .cm-comment{color:#a50}.topic-editor-base .cm-s-default .cm-string{color:#a11}.topic-editor-base .cm-s-default .cm-string-2{color:#f50}.topic-editor-base .cm-s-default .cm-meta{color:#555}.topic-editor-base .cm-s-default .cm-qualifier{color:#555}.topic-editor-base .cm-s-default .cm-builtin{color:#30a}.topic-editor-base .cm-s-default .cm-bracket{color:#997}.topic-editor-base .cm-s-default .cm-tag{color:#170}.topic-editor-base .cm-s-default .cm-attribute{color:#00c}.topic-editor-base .cm-s-default .cm-hr{color:#999}.topic-editor-base .cm-s-default .cm-link{color:#00c}.topic-editor-base .cm-s-default .cm-error{color:red}.topic-editor-base .cm-invalidchar{color:red}.topic-editor-base .CodeMirror-composing{border-bottom:2px solid}.topic-editor-base div.CodeMirror span.CodeMirror-matchingbracket{color:#0f0}.topic-editor-base div.CodeMirror span.CodeMirror-nonmatchingbracket{color:#f22}.topic-editor-base .CodeMirror-matchingtag{background:rgba(255,150,0,0.3)}.topic-editor-base .CodeMirror-activeline-background{background:#e8f2ff}.topic-editor-base .CodeMirror{position:relative;overflow:hidden;background:#fff}.topic-editor-base .CodeMirror-scroll{overflow:scroll!important;margin-bottom:-30px;margin-right:-30px;padding-bottom:30px;height:100%;outline:0;position:relative}.topic-editor-base .CodeMirror-sizer{position:relative;border-right:30px solid transparent}.topic-editor-base .CodeMirror-gutter-filler,.topic-editor-base .CodeMirror-hscrollbar,.topic-editor-base .CodeMirror-scrollbar-filler,.topic-editor-base .CodeMirror-vscrollbar{position:absolute;z-index:6;display:none}.topic-editor-base .CodeMirror-vscrollbar{right:0;top:0;overflow-x:hidden;overflow-y:scroll}.topic-editor-base .CodeMirror-hscrollbar{bottom:0;left:0;overflow-y:hidden;overflow-x:scroll}.topic-editor-base .CodeMirror-scrollbar-filler{right:0;bottom:0}.topic-editor-base .CodeMirror-gutter-filler{left:0;bottom:0}.topic-editor-base .CodeMirror-gutters{position:absolute;left:0;top:0;min-height:100%;z-index:3}.topic-editor-base .CodeMirror-gutter{white-space:normal;height:100%;display:inline-block;vertical-align:top;margin-bottom:-30px}.topic-editor-base .CodeMirror-gutter-wrapper{position:absolute;z-index:4;background:0 0!important;border:none !important}.topic-editor-base .CodeMirror-gutter-background{position:absolute;top:0;bottom:0;z-index:4}.topic-editor-base .CodeMirror-gutter-elt{position:absolute;cursor:default;z-index:4}.topic-editor-base .CodeMirror-gutter-wrapper ::-moz-selection{background-color:transparent}.topic-editor-base .CodeMirror-gutter-wrapper ::selection{background-color:transparent}.topic-editor-base .CodeMirror-gutter-wrapper ::-moz-selection{background-color:transparent}.topic-editor-base .CodeMirror-lines{cursor:text;min-height:1px}.topic-editor-base .CodeMirror pre{border-radius:0;border-width:0;background:0 0;font-family:inherit;font-size:inherit;margin:0;white-space:pre;word-wrap:normal;line-height:inherit;color:inherit;z-index:2;position:relative;overflow:visible;-webkit-tap-highlight-color:transparent;-webkit-font-variant-ligatures:contextual;font-variant-ligatures:contextual}.topic-editor-base .CodeMirror-wrap pre{word-wrap:break-word;white-space:pre-wrap;word-break:normal}.topic-editor-base .CodeMirror-linebackground{position:absolute;left:0;right:0;top:0;bottom:0;z-index:0}.topic-editor-base .CodeMirror-linewidget{position:relative;z-index:2;overflow:auto}.topic-editor-base .CodeMirror-rtl pre{direction:rtl}.topic-editor-base .CodeMirror-code{outline:0}.topic-editor-base .CodeMirror-gutter,.topic-editor-base .CodeMirror-gutters,.topic-editor-base .CodeMirror-linenumber,.topic-editor-base .CodeMirror-scroll,.topic-editor-base .CodeMirror-sizer{-webkit-box-sizing:content-box;box-sizing:content-box}.topic-editor-base .CodeMirror-measure{position:absolute;width:100%;height:0;overflow:hidden;visibility:hidden}.topic-editor-base .CodeMirror-cursor{position:absolute;pointer-events:none}.topic-editor-base .CodeMirror-measure pre{position:static}.topic-editor-base div.CodeMirror-cursors{visibility:hidden;position:relative;z-index:3}.topic-editor-base div.CodeMirror-dragcursors{visibility:visible}.topic-editor-base .CodeMirror-focused div.CodeMirror-cursors{visibility:visible}.topic-editor-base .CodeMirror-selected{background:#d9d9d9}.topic-editor-base .CodeMirror-focused .CodeMirror-selected{background:#d7d4f0}.topic-editor-base .CodeMirror-crosshair{cursor:crosshair}.topic-editor-base .CodeMirror-line::-moz-selection,.topic-editor-base .CodeMirror-line>span::-moz-selection,.topic-editor-base .CodeMirror-line>span>span::-moz-selection{background:#d7d4f0}.topic-editor-base .CodeMirror-line::selection,.topic-editor-base .CodeMirror-line>span::selection,.topic-editor-base .CodeMirror-line>span>span::selection{background:#d7d4f0}.topic-editor-base .CodeMirror-line::-moz-selection,.topic-editor-base .CodeMirror-line>span::-moz-selection,.topic-editor-base .CodeMirror-line>span>span::-moz-selection{background:#d7d4f0}.topic-editor-base .cm-searching{background-color:#ffa;background-color:rgba(255,255,0,0.4)}.topic-editor-base .cm-force-border{padding-right:.1px}@media print{.topic-editor-base .CodeMirror div.CodeMirror-cursors{visibility:hidden}}.topic-editor-base .cm-tab-wrap-hack:after{content:''}.topic-editor-base span.CodeMirror-selectedtext{background:0 0}.topic-editor-base .CodeMirror{height:auto;min-height:300px;border:1px solid #ddd;border-bottom-left-radius:4px;border-bottom-right-radius:4px;padding:10px;font:inherit;z-index:1}.topic-editor-base .CodeMirror-scroll{min-height:300px}.topic-editor-base .CodeMirror-fullscreen{background:#fff;position:fixed!important;top:50px;left:0;right:0;bottom:0;height:auto;z-index:9}.topic-editor-base .CodeMirror-sided{width:50% !important}.topic-editor-base .editor-toolbar{position:relative;opacity:.6;-webkit-user-select:none;-moz-user-select:none;-ms-user-select:none;-o-user-select:none;user-select:none;padding:0 10px;border-top:1px solid #bbb;border-left:1px solid #bbb;border-right:1px solid #bbb;border-top-left-radius:4px;border-top-right-radius:4px}.topic-editor-base .editor-toolbar:after,.topic-editor-base .editor-toolbar:before{display:block;content:' ';height:1px}.topic-editor-base .editor-toolbar:before{margin-bottom:8px}.topic-editor-base .editor-toolbar:after{margin-top:8px}.topic-editor-base .editor-toolbar:hover,.topic-editor-base .editor-wrapper input.title:focus,.topic-editor-base .editor-wrapper input.title:hover{opacity:.8}.topic-editor-base .editor-toolbar.fullscreen{width:100%;height:50px;overflow-x:auto;overflow-y:hidden;white-space:nowrap;padding-top:10px;padding-bottom:10px;-webkit-box-sizing:border-box;box-sizing:border-box;background:#fff;border:0;position:fixed;top:0;left:0;opacity:1;z-index:9}.topic-editor-base .editor-toolbar.fullscreen::before{width:20px;height:50px;background:-webkit-gradient(linear, left top, right top, color-stop(0, #fff), color-stop(100%, rgba(255,255,255,0)));background:-webkit-linear-gradient(left, #fff 0, rgba(255,255,255,0) 100%);background:-o-linear-gradient(left, #fff 0, rgba(255,255,255,0) 100%);background:-webkit-gradient(linear, left top, right top, color-stop(0, #fff), to(rgba(255,255,255,0)));background:linear-gradient(to right, #fff 0, rgba(255,255,255,0) 100%);position:fixed;top:0;left:0;margin:0;padding:0}.topic-editor-base .editor-toolbar.fullscreen::after{width:20px;height:50px;background:-webkit-gradient(linear, left top, right top, color-stop(0, rgba(255,255,255,0)), color-stop(100%, #fff));background:-webkit-linear-gradient(left, rgba(255,255,255,0) 0, #fff 100%);background:-o-linear-gradient(left, rgba(255,255,255,0) 0, #fff 100%);background:-webkit-gradient(linear, left top, right top, color-stop(0, rgba(255,255,255,0)), to(#fff));background:linear-gradient(to right, rgba(255,255,255,0) 0, #fff 100%);position:fixed;top:0;right:0;margin:0;padding:0}.topic-editor-base .editor-toolbar a{display:inline-block;text-align:center;text-decoration:none!important;color:#2c3e50 !important;width:30px;height:30px;margin:0;border:1px solid transparent;border-radius:3px;cursor:pointer}.topic-editor-base .editor-toolbar a.active,.topic-editor-base .editor-toolbar a:hover{background:#fcfcfc;border-color:#95a5a6}.topic-editor-base .editor-toolbar a:before{line-height:30px}.topic-editor-base .editor-toolbar i.separator{display:inline-block;width:0;border-left:1px solid #d9d9d9;border-right:1px solid #fff;color:transparent;text-indent:-10px;margin:0 6px}.topic-editor-base .editor-toolbar a.fa-header-x:after{font-family:Arial,"Helvetica Neue",Helvetica,sans-serif;font-size:65%;vertical-align:text-bottom;position:relative;top:2px}.topic-editor-base .editor-toolbar a.fa-header-1:after{content:"1"}.topic-editor-base .editor-toolbar a.fa-header-2:after{content:"2"}.topic-editor-base .editor-toolbar a.fa-header-3:after{content:"3"}.topic-editor-base .editor-toolbar a.fa-header-bigger:after{content:"\25B2"}.topic-editor-base .editor-toolbar a.fa-header-smaller:after{content:"\25BC"}.topic-editor-base .editor-toolbar.disabled-for-preview a:not(.no-disable){pointer-events:none;background:#fff;border-color:transparent;text-shadow:inherit}@media only screen and (max-width:700px){.topic-editor-base .editor-toolbar a.no-mobile{display:none}}.topic-editor-base .editor-statusbar{padding:8px 10px;font-size:12px;color:#959694;text-align:right}.topic-editor-base .editor-statusbar span{display:inline-block;min-width:4em;margin-left:1em}.topic-editor-base .editor-statusbar .lines:before{content:'lines: '}.topic-editor-base .editor-statusbar .words:before{content:'words: '}.topic-editor-base .editor-statusbar .characters:before{content:'characters: '}.topic-editor-base .editor-preview{padding:10px;position:absolute;width:100%;height:100%;top:0;left:0;background:#fafafa;z-index:7;overflow:auto;display:none;-webkit-box-sizing:border-box;box-sizing:border-box}.topic-editor-base .editor-preview-side{padding:10px;position:fixed;bottom:0;width:50%;top:50px;right:0;background:#fafafa;z-index:9;overflow:auto;display:none;-webkit-box-sizing:border-box;box-sizing:border-box;border:1px solid #ddd}.topic-editor-base .editor-preview-active-side{display:block}.topic-editor-base .editor-preview-active{display:block}.topic-editor-base .editor-preview-side>p,.topic-editor-base .editor-preview>p{margin-top:0}.topic-editor-base .editor-preview pre,.topic-editor-base .editor-preview-side pre{background:#eee;margin-bottom:10px}.topic-editor-base .editor-preview table td,.topic-editor-base .editor-preview table th,.topic-editor-base .editor-preview-side table td,.topic-editor-base .editor-preview-side table th{border:1px solid #ddd;padding:5px}.topic-editor-base .CodeMirror .CodeMirror-code .cm-tag{color:#63a35c}.topic-editor-base .CodeMirror .CodeMirror-code .cm-attribute{color:#795da3}.topic-editor-base .CodeMirror .CodeMirror-code .cm-string{color:#183691}.topic-editor-base .CodeMirror .CodeMirror-selected{background:#d9d9d9}.topic-editor-base .CodeMirror .CodeMirror-code .cm-header-1{font-size:200%;line-height:200%}.topic-editor-base .CodeMirror .CodeMirror-code .cm-header-2{font-size:160%;line-height:160%}.topic-editor-base .CodeMirror .CodeMirror-code .cm-header-3{font-size:125%;line-height:125%}.topic-editor-base .CodeMirror .CodeMirror-code .cm-header-4{font-size:110%;line-height:110%}.topic-editor-base .CodeMirror .CodeMirror-code .cm-comment{background:rgba(0,0,0,0.05);border-radius:2px}.topic-editor-base .CodeMirror .CodeMirror-code .cm-link{color:#7f8c8d}.topic-editor-base .CodeMirror .CodeMirror-code .cm-url{color:#aab2b3}.topic-editor-base .CodeMirror .CodeMirror-code .cm-strikethrough{text-decoration:line-through}.topic-editor-base .CodeMirror .CodeMirror-placeholder{opacity:.5}.topic-editor-base .CodeMirror-hints{position:absolute;z-index:2147483647;overflow:hidden;list-style:none;margin:0;padding:2px;-webkit-box-shadow:2px 3px 5px rgba(0,0,0,0.2);box-shadow:2px 3px 5px rgba(0,0,0,0.2);border-radius:3px;border:1px solid silver;background:#fff;max-height:20em;overflow-y:auto}.topic-editor-base .CodeMirror-hint{margin:0;padding:0 4px;border-radius:2px;white-space:pre;color:#000;cursor:pointer}.topic-editor-base li.CodeMirror-hint-active{background:#08f;color:#fff}.topic-editor-base .CodeMirror .cm-spell-error:not(.cm-url):not(.cm-comment):not(.cm-tag):not(.cm-word){background:rgba(255,0,0,0.15)}.topic-editor-base .editor-content{display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-ms-flex-direction:column;flex-direction:column;-webkit-box-flex:1;-ms-flex:1;flex:1;margin-bottom:10px;min-height:0}.topic-editor-base .editor-content .content-input{-webkit-box-flex:1;-ms-flex:1;flex:1;width:100%;margin-bottom:10px;min-height:0}.topic-editor-base .editor-content .content-input>:first-child{display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-ms-flex-direction:column;flex-direction:column;height:100%}.topic-editor-base .editor-content .content-input .editor-toolbar{border:1px solid #cfd8dc;max-height:50px;opacity:1}.topic-editor-base .editor-content .content-input .editor-toolbar>a,.topic-editor-base .editor-content .content-input .editor-toolbar>span{opacity:.6}.topic-editor-base .editor-content .content-input .editor-preview-wrapper{display:-webkit-box;display:-ms-flexbox;display:flex;position:relative;height:100%}.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview-container{-webkit-box-flex:1;-ms-flex:1 1 0px;flex:1 1 0;height:100%;min-width:0}.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview-container.preview-container-invisible[data-status='exiting']{position:absolute;width:50%;top:0;right:0;z-index:2}.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview-container[data-status='exited']{display:none}.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview{-webkit-transition:.2s opacity;-o-transition:.2s opacity;transition:.2s opacity;background-color:white;border-bottom-right-radius:4px;-webkit-box-flex:1;-ms-flex:1;flex:1;border-width:0 1px 1px 0;border-style:solid;border-color:#cfd8dc;padding:10px;height:100%;opacity:1;overflow:scroll}.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview.preview-placeholder{display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-pack:center;-ms-flex-pack:center;justify-content:center;-webkit-box-align:center;-ms-flex-align:center;align-items:center}.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview.preview-placeholder .preview-placeholder-text{font-weight:bold;font-size:36px;color:#eceff1}.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview.preview-full{position:absolute;top:0;left:0;width:100%;height:100%;z-index:2;border-left-width:1px;border-bottom-left-radius:4px}.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview[data-status='exiting']{opacity:0;border-left-width:1px}.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview[data-status='exited']{opacity:0;display:none}.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview[data-status='entering']{opacity:0}.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview.no-transition{-webkit-transition:none;-o-transition:none;transition:none}.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview hr{border:1px solid #eceff1;background-color:#eceff1}.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview a{pointer-events:auto;color:#607d8b;text-decoration:none;padding-bottom:1px;border-bottom:1px solid transparent;-webkit-transition:border-bottom-color .3s;-o-transition:border-bottom-color .3s;transition:border-bottom-color .3s}.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview a:hover{border-bottom-color:#607d8b}.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview pre{background:#f7f9fa;padding:10px 15px;color:#263238;line-height:1.6;font-size:13px;border-radius:3px}.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview pre code{padding:0;color:inherit;background-color:transparent;-moz-tab-size:4;-o-tab-size:4;tab-size:4;font-family:'SFMono-Regular',Consolas,'Liberation Mono',Menlo,Courier,monospace}.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview code{color:#546e7a;background-color:#f7f9fa;padding:2px 4px;font-size:13px;border-radius:3px;font-family:monospace}.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview table{margin-bottom:16px}.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview table th,.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview table td{padding:6px 12px;border:1px solid #dddddd}.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview table tr{border-top:1px solid #dddddd}.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview table tr:nth-child(2n){background-color:#f7f9fa}.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview blockquote{padding-left:15px;border-left:5px solid #eceff1;color:#616161}.topic-editor-base .editor-content .content-input .editor-preview-wrapper .code-mirror-wrapper{-webkit-box-flex:1;-ms-flex:1 1 0px;flex:1 1 0}.topic-editor-base .editor-content .content-input .editor-preview-wrapper .code-mirror-wrapper .CodeMirror{border-top-width:0;border-bottom-right-radius:0;height:100%}.topic-editor-base .editor-content .content-input .error-icon{display:none}.topic-editor-base .editor-content .content-input[data-error='true'] .error-icon{position:absolute;display:block;top:8px;right:8px;color:#d05451}.topic-editor-base .editor-content .content-input .CodeMirror{min-height:100px}.topic-editor-base .editor-content .content-input .CodeMirror-scroll{padding-bottom:0 !important;min-height:100px !important}.topic-editor-base .editor-content .content-input .content-preview{height:100%;margin-left:10px;overflow:auto;-webkit-box-flex:1;-ms-flex:1;flex:1}.topic-editor-base .editor-content .content-input .editor-wrapper{height:100%}.topic-editor-base .editor-content .Select-menu-outer{position:absolute !important;top:auto !important;bottom:calc(100% - 1px) !important;border-bottom-left-radius:0 !important;border-bottom-right-radius:0 !important;border-top-left-radius:5px !important;border-top-right-radius:5px !important}.topic-editor-base .editor-content .is-open .Select-control{border-top-right-radius:0 !important;border-top-left-radius:0 !important;border-bottom-right-radius:5px !important;border-bottom-left-radius:5px !important}.topic-editor-base .editor-header{margin-top:47px;margin-bottom:15px;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-pack:justify;-ms-flex-pack:justify;justify-content:space-between}.topic-editor-base .editor-header button.btn{border-radius:5px;margin-left:10px;-webkit-box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);-webkit-transition:-webkit-box-shadow .4s;transition:-webkit-box-shadow .4s;-o-transition:box-shadow .4s;transition:box-shadow .4s;transition:box-shadow .4s, -webkit-box-shadow .4s}.topic-editor-base .editor-header button.btn:hover{-webkit-box-shadow:0 15px 30px 0 rgba(0,0,0,0.15);box-shadow:0 15px 30px 0 rgba(0,0,0,0.15)}.topic-editor-base .editor-header .editor-header-tool{display:-webkit-box;display:-ms-flexbox;display:flex}@media (max-width:767px){.topic-editor-base .editor-header .editor-header-tool{-webkit-box-pack:justify;-ms-flex-pack:justify;justify-content:space-between;margin-bottom:10px}}@media (max-width:480px){.topic-editor-base .editor-header button.btn{width:34px;height:34px;text-align:center;padding:6px 0}}.topic-editor-base .editor-header-with-category{margin-top:47px;margin-bottom:15px;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-pack:justify;-ms-flex-pack:justify;justify-content:space-between}.topic-editor-base .editor-header-with-category button.btn{border-radius:5px;margin-left:10px;-webkit-box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);-webkit-transition:-webkit-box-shadow .4s;transition:-webkit-box-shadow .4s;-o-transition:box-shadow .4s;transition:box-shadow .4s;transition:box-shadow .4s, -webkit-box-shadow .4s}.topic-editor-base .editor-header-with-category button.btn:hover{-webkit-box-shadow:0 15px 30px 0 rgba(0,0,0,0.15);box-shadow:0 15px 30px 0 rgba(0,0,0,0.15)}.topic-editor-base .editor-header-with-category .editor-header-tool{display:-webkit-box;display:-ms-flexbox;display:flex}@media (max-width:767px){.topic-editor-base .editor-header-with-category .editor-header-tool{-webkit-box-pack:justify;-ms-flex-pack:justify;justify-content:space-between;margin-bottom:10px}}@media (max-width:480px){.topic-editor-base .editor-header-with-category button.btn{width:34px;height:34px;text-align:center;padding:6px 0}}@media (max-width:767px){.topic-editor-base .editor-header-with-category{-webkit-box-orient:vertical;-webkit-box-direction:reverse;-ms-flex-direction:column-reverse;flex-direction:column-reverse}}</style><style type="text/css">.question-title .row{min-height:38px}.question{padding:30px}.question p,.question li{font-size:14px;line-height:28px}.question code,.question pre{font-size:13px;line-height:18px}.select2-drop .select2-results{max-height:350px}.loading-center img{margin-left:12px;max-width:34px}.btn-pad{padding:6px 20px;font-size:16px}.text-bold{font-weight:bold}.hint{display:none}.hidebutton{display:none}.btn-left-space{margin-left:15px}.dropdown-inline{display:inline}#dLabel{text-decoration:none}#test_mode{margin-bottom:10px}.custom-textcase{margin-top:8px}.contribute-btn{display:inline;margin-left:5px}.contribute-btn a{text-decoration:none;font-weight:bold;cursor:pointer;font-size:100%}.ng-scope hr{margin-bottom:12px}footer hr{margin-top:9px}@media (min-width:768px){footer hr{margin-top:0px}}@media (min-width:768px){.editor-container.container{height:605px}}.submission-warning{margin-left:0 !important}.submission-warning a{padding-left:0}@media (min-width:768px){.submission-warning a{padding-bottom:27px}}.editor-base .control-btn-bar{margin-top:15px;margin-bottom:15px}.editor-base .form-control.pull-right-sm,.editor-base .wrapper{margin-left:10px}.editor-base .debug-btn-wrapper{margin-right:10px}.playground-btn{padding-left:10px;padding-right:11px}.playground-btn img.terminal-icon{height:15px}.select-wrapper{display:inline-block;width:230px}.select-wrapper *>.Select-control{border-radius:5px !important}.select-wrapper .Select-control:hover{cursor:pointer}.select-wrapper .Select-menu-outer{border:1px solid #dddddd;-webkit-box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);margin-top:5px;min-width:150px;border-radius:5px;z-index:6}.select-wrapper .Select-menu-outer .Select-option:first-child{border-top-left-radius:5px;border-top-right-radius:5px}.select-wrapper.language-select-wrapper .Select-value{margin-left:18px}@media (max-width:767px){.select-wrapper{width:140px}.select-wrapper.language-select-wrapper .Select-value{margin-left:0px}.select-wrapper.theme-select-wrapper .Select-menu-outer{right:0}}@media (max-width:767px) and (max-width:478px){.select-wrapper{width:95px !important}}.select-wrapper .Select-arrow-zone{background-color:#fff}.learn-more-wrapper{position:absolute;top:7px;left:25px;color:#95a5a6}.learn-more-wrapper:hover{color:#373737}.popover,popover-content{max-width:none !important;white-space:nowrap;z-index:7}.action{margin-top:20px}.action div.col-md-4.col-sm-5{padding-left:0}#dLabel.menu-links{padding-bottom:20px}.last-submission-loading-alert{padding-top:7px;padding-bottom:10px;padding-right:10px;padding-left:10px;margin-left:10px}.testcase-help-label{margin-top:10px;margin-bottom:10px}</style><style type="text/css">.content-base .question-base{position:relative;overflow-y:auto;-webkit-overflow-scrolling:touch;height:100%}.content-base .question-base .testcase-area{max-width:555px}.content-base .question-base .content-title{display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-align:center;-ms-flex-align:center;align-items:center}.content-base .question-base .toggle-btn-wrapper{margin-left:auto}.content-base .question-base .toggle-btn{width:auto;font-size:18px;font-weight:500;cursor:pointer;color:black;padding:6px 12px 6px 12px;border-radius:8px;border:solid 1px #ccc;min-width:197px;background-color:white}.content-base .question-base .toggle-btn:focus{outline:0}.content-base .question-base .toggle-btn:hover{background-color:#ddd}.content-base .question-base .toggle-discuss{min-width:180px}.content-base .question-base .toggle-discuss .fa-comments{color:#1da09c}.content-base .question-base .toggle-question{min-width:197px}.content-base .question-base .toggle-question .fa-book{color:#1da09c}.content-base .question-base .question-wrapper{display:block}.content-base .question-base .question-wrapper .content-title{padding:35px 20px 15px 20px;font-size:24px}.content-base .question-base .question-wrapper .question-title{padding-left:20px;margin-right:40px;margin-bottom:0}.content-base .question-base .discuss-wrapper{display:block;margin-left:auto;margin-right:auto;max-width:945px;padding-left:20px;padding-right:20px}.content-base .question-base .discuss-wrapper .discuss-title{padding-left:20px;margin-right:40px;margin-bottom:0}.content-base .question-base .discuss-wrapper .content-title{font-size:24px;padding:35px 0px 15px 0px}.content-base .question-base .discuss-wrapper .discuss-area{-webkit-box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);box-shadow:0 5px 15px 0 rgba(0,0,0,0.08);-webkit-transition:-webkit-box-shadow .4s;transition:-webkit-box-shadow .4s;-o-transition:box-shadow .4s;transition:box-shadow .4s;transition:box-shadow .4s, -webkit-box-shadow .4s;margin-top:20px;border-radius:15px;background-color:white;margin-left:auto;margin-right:auto;padding:20px 30px 20px 30px}.content-base .question-base .discuss-wrapper .discuss-area:hover{-webkit-box-shadow:0 15px 30px 0 rgba(0,0,0,0.15);box-shadow:0 15px 30px 0 rgba(0,0,0,0.15)}.content-base .question-base .discuss-wrapper .discuss-area .discuss-tool-bar{z-index:1}.content-base .question-base .small-content-title{display:block;margin-right:0}.content-base .question-base .small-toggle-btn{width:100%;border:none;background:transparent;margin-top:20px}.content-base .question-base .question-area{padding:20px}.content-base .question-base .question-area .question-detail{padding:20px;border-radius:15px;background:white}.content-base .question-base .editor-area{padding:0 20px 20px 20px}.content-base .question-base .editor-area .submission-result-base hr.line{margin-top:20px}.trans-link{font-size:14px;color:#777;-webkit-transition:all .4s;-o-transition:all .4s;transition:all .4s}.trans-link:hover{color:#333;text-decoration:none}</style><style type="text/css">.dia-container__T7JA{position:relative;margin-top:30px;margin-bottom:30px}.controls-container__2krD{position:absolute;margin:0 5px;top:50%;bottom:50%;right:0;left:0;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-orient:horizontal;-webkit-box-direction:normal;-ms-flex-direction:row;flex-direction:row;-webkit-box-align:center;-ms-flex-align:center;align-items:center;-webkit-box-pack:justify;-ms-flex-pack:justify;justify-content:space-between}.play-container__1ZB9{width:80px;height:80px;background-color:rgba(0,0,0,0.5);display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-pack:center;-ms-flex-pack:center;justify-content:center;-webkit-box-align:center;-ms-flex-align:center;align-items:center;border-radius:50%}.play-container__1ZB9>.fa-play__PWqu{margin-left:5px}.play-container__1ZB9:hover{cursor:pointer}.control-group__16z9{color:#999}.control-group__16z9.toggle-play__3DqW{font-size:22px}.control-group__16z9:hover{cursor:pointer;color:white}.diaporama__1x84{position:relative;display:-webkit-box;display:-ms-flexbox;display:flex}.fa-step-forward__2yS4,.fa-step-backward__yNrc{font-size:15px;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-align:center;-ms-flex-align:center;align-items:center}.dia-controls__1L3Y{display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-align:center;-ms-flex-align:center;align-items:center;-ms-flex-pack:distribute;justify-content:space-around;text-align:center;height:26px;background-color:gray;-webkit-box-orient:horizontal;-webkit-box-direction:normal;-ms-flex-direction:row;flex-direction:row;color:black}.controls__1q0X{display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-pack:justify;-ms-flex-pack:justify;justify-content:space-between;-webkit-box-align:center;-ms-flex-align:center;align-items:center;width:100px}.control-panel__zPwY{padding:5px;background-color:black;height:32px;display:-webkit-box;display:-ms-flexbox;display:flex;-ms-flex-pack:distribute;justify-content:space-around;position:relative;-webkit-box-align:center;-ms-flex-align:center;align-items:center}.frame-counter__1YA2{position:absolute;right:0;margin-right:10px;font-size:12px;color:#c8c8c8}.initial-play__3FKu{font-size:35px;color:#c8c8c8}.initial-play-wrapper__1tcs{top:0;bottom:0;left:0;right:0;position:absolute;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-align:center;-ms-flex-align:center;align-items:center;-webkit-box-pack:center;-ms-flex-pack:center;justify-content:center}.dia-img__3-yE{width:100%;height:100%}</style><style type="text/css">body{background-color:#fafafa;line-height:1.7;display:block}.MathJax .mo,.MathJax .mi{color:inherit}.article-base{background-color:white}.article-body{margin-bottom:40px}.page-header .btn-group{margin-top:10px}.taglist a{margin-left:3px}.taglist a:first-child{margin-left:20px}.entry-meta{display:inline-block}.block-markdown{font-size:16px;font-weight:400}.block-markdown p,.block-markdown li{color:#5a5a5a}.question>:first-child{margin-top:0 !important}.block-markdown h2{font-size:30px;font-weight:400;line-height:1.7;margin-top:40px;margin-bottom:20px}.block-markdown h4{font-size:20px;font-weight:400;margin-top:1.275em;margin-bottom:.85em;line-height:1.7}.block-markdown h5{font-size:1em;font-weight:400;margin-top:1.275em;margin-bottom:.85em;line-height:1.7}.block-markdown blockquote{border-radius:5px;font-size:16px;border:none;border-left:6px solid #ccc;background-color:#f5f5f5;margin:20px 0;padding:20px 15px 20px 35px}.block-markdown img{max-width:100%;display:block}.block-markdown pre{border:none;background:#f5f5f5;margin:20px 0;padding:.85em 1em;overflow-x:auto;word-wrap:normal;white-space:pre}.block-markdown hr{height:1px;padding:0;margin:10px 0;overflow:hidden;background-color:#dddddd;border:none}.block-markdown table{display:table;width:100%;border-collapse:collapse;border-spacing:0;overflow:auto;margin-bottom:.85em}.block-markdown table th[align="right"]{text-align:right}.block-markdown table th[align="center"]{text-align:center}.block-markdown table th,.block-markdown table td{padding:6px 13px;border:1px solid #ddd}.rating .star-ratings p{font-size:10px !important;color:grey !important}.rating.rating-bottom{display:inline-block;position:absolute}.rating.rating-bottom .star-ratings{margin-left:5px;margin-top:2px}.rating.rating-bottom p{display:none}.rate-header{font-size:18px;font-weight:500;margin-top:10px;margin-bottom:20px}.col-sm-4.pages{text-align:center}.col-sm-4.next{text-align:right}.entry-meta{color:#999;font-size:14px}.pager .glyphicon{font-size:.8em}.pager li a,.pager li>span{font-weight:300;border-radius:1020px;padding:5px 10px}@media (min-width:768px){.question-detail-container .toc{float:right;margin-right:-10px;margin-top:-10px;border:10px white solid;border-radius:15px}}.toc{border-radius:5px;background-color:#fafafa;padding:15px 15px 5px 15px;margin-top:20px;font-size:95%}.toc h2{display:inline;padding-left:7px;font-size:100%;font-family:sans-serif}.article-reader-app .container{max-width:800px}.article-reader-app .navigation-base{background:#fafafa}.solution-body{margin:auto;position:relative;max-width:800px}.solution-nav ul,.toc ul,.solution-nav li,.toc li{list-style-type:none;line-height:normal;padding-left:0}.solution-nav:not(.one-level)>ul ul,.toc:not(.one-level)>ul ul{margin-left:10px;margin-top:10px}.solution-nav li,.toc li{margin-bottom:10px}.solution-nav:not(.one-level)>ul>li,.toc:not(.one-level)>ul>li{font-size:16px;font-weight:500;margin-bottom:20px}.solution-nav:not(.one-level)>ul>li>a,.toc:not(.one-level)>ul>li>a{color:black}.solution-nav:not(.one-level)>ul>li>a:hover,.toc:not(.one-level)>ul>li>a:hover{color:grey;text-decoration:none}.solution-nav ul>li,.toc ul>li{font-size:14px;font-weight:400}.solution-nav ul>li a,.toc ul>li a{color:#0088cc}.solution-nav ul>li a:hover,.toc ul>li a:hover{color:#0088cc;text-decoration:underline}.navigation-dropdown{min-width:300px;margin-top:10px;margin-left:-2px}.navigation-dropdown .solution-nav>ul>li{padding-top:10px;padding-right:20px;padding-left:20px !important}.navigation-dropdown .solution-nav:not(.one-level)>ul>li:not(:first-child){border-top:1px solid #dddddd}</style><style type="text/css">.video-base{position:relative}.video-base .video-player iframe{width:100%;background:black}.video-base .show-hide-content{border:2px solid white !important;background:none !important;color:white !important;font-weight:500;opacity:.8}.video-base .show-hide-content:hover{opacity:.6}.video-base .player-wrapper{-webkit-transition:.4s all;-o-transition:.4s all;transition:.4s all}.video-base .player-wrapper:hover .content-title{opacity:1}.video-base .video-player,.video-base .video-player *{height:100%}.video-base .content-title{background:rgba(0,0,0,0);background:-webkit-gradient(linear, left top, left bottom, from(#000), to(rgba(0,0,0,0)));background:-webkit-linear-gradient(#000, rgba(0,0,0,0));background:-o-linear-gradient(#000, rgba(0,0,0,0));background:linear-gradient(#000, rgba(0,0,0,0));-webkit-transition:.4s all;-o-transition:.4s all;transition:.4s all;opacity:0;position:absolute;width:100%;top:0;left:0;padding:35px 40px;text-shadow:0 10px 30px rgba(0,0,0,0.6)}.video-base .content-title .title{color:white}.video-base.no-content{height:100%}.video-base.no-content .player-wrapper{height:100%}.video-base .content-viewer{-webkit-box-shadow:0 -3px 3px 0 rgba(0,0,0,0.08);box-shadow:0 -3px 3px 0 rgba(0,0,0,0.08);height:30% !important;-webkit-overflow-scrolling:touch;overflow-y:auto}.video-base .content-viewer .inner{padding:20px}.video-base.show-content{position:relative;height:100%}.video-base.show-content .player-wrapper{height:calc(100% - 30%) !important;position:relative}.video-base.hide-content{height:100%;position:relative}.video-base.hide-content .player-wrapper{position:relative;height:100%}@media (max-width:767px){.video-base.viewer-base.show-content .player-wrapper{height:300px !important}.video-base.viewer-base.show-content .content-viewer{height:calc(100% - 300px) !important}}.discuss-wrapper{padding-bottom:120px}</style><style type="text/css">.webpage-base{height:100%;width:100%}.webpage-base>div:not(.content-title){overflow:auto;-webkit-overflow-scrolling:touch;height:100%}.webpage-base iframe{margin-bottom:-7px}body.webpage-view{overflow:hidden}</style><style type="text/css">.content-base{position:relative;height:100%}.content-base .content-title{font-size:30px;font-weight:600}.content-base .article-base{background:#fafafa;margin-bottom:120px}.content-base .article-base .block-markdown{background:#fafafa}.content-base .viewer-base{margin-bottom:0}.content-base .article-base{height:100%;overflow-y:auto;-webkit-overflow-scrolling:touch;padding:0 20px}.content-base .article-base .article-inner{margin:auto;padding:20px;margin-top:20px;margin-bottom:20px;max-width:840px;background:white;border-radius:15px}.content-base .article-base .block-markdown{background:white}</style><style type="text/css">.site-footer.content-viewer-footer{display:none}.no-scrollbar{overflow:hidden}.no-scrollbar #explore-app{padding-bottom:0}div.content-wrapper.content-viewer-wrapper{margin-bottom:0;padding-bottom:0 !important;height:100vh}#base_content{height:calc(100% - 52px);overflow:hidden}#explore-app,.content-viewer-base,.view-controller{height:100%}.content-viewer-base{-webkit-transition:.2s all;-o-transition:.2s all;transition:.2s all;background:#f5f5f5;overflow-y:hidden;position:relative}.content-viewer-base .view-controller{width:100%;height:100%}.content-viewer-base .view-controller .chapter-list-view{position:relative;z-index:6;float:left;width:300px;height:100%;overflow-y:auto;-webkit-overflow-scrolling:touch;-webkit-transition:.4s all;-o-transition:.4s all;transition:.4s all;-webkit-box-shadow:inset 0 4px 7px 1px #ffffff,inset 0 -5px 20px rgba(173,186,204,0.25),0 2px 6px rgba(0,21,64,0.14),0 10px 20px rgba(0,21,64,0.05);box-shadow:inset 0 4px 7px 1px #ffffff,inset 0 -5px 20px rgba(173,186,204,0.25),0 2px 6px rgba(0,21,64,0.14),0 10px 20px rgba(0,21,64,0.05);background:white}.content-viewer-base .view-controller .chapter-list-view:hover{-webkit-box-shadow:inset 0 4px 7px 1px #ffffff,inset 0 -5px 20px rgba(173,186,204,0.25),0 0 20px rgba(0,21,64,0.14),0 0 40px rgba(0,0,0,0.2);box-shadow:inset 0 4px 7px 1px #ffffff,inset 0 -5px 20px rgba(173,186,204,0.25),0 0 20px rgba(0,21,64,0.14),0 0 40px rgba(0,0,0,0.2)}.content-viewer-base .view-controller .content-viewer-view{float:left;width:calc(100% - 300px);height:100%;position:relative}.content-viewer-base .content-base{height:calc(100% - 47px)}.content-viewer-toolbar-base{height:47px;background:white;-webkit-box-shadow:0 3px 3px 0 rgba(0,0,0,0.08);box-shadow:0 3px 3px 0 rgba(0,0,0,0.08);position:relative;z-index:1;padding:6px 6px 0 0}.content-viewer-toolbar-base button.btn{border-radius:0;background:white;outline:none !important;-webkit-box-shadow:none;box-shadow:none;font-size:20px;padding-top:0;padding-bottom:0;margin-top:3px;-webkit-transition:.1s all;-o-transition:.1s all;transition:.1s all;color:grey}.content-viewer-toolbar-base button.btn:hover{color:#0088cc}.content-viewer-toolbar-base button.btn.menu-btn{border-right:1px solid #dddddd;margin-top:1px}.content-viewer-toolbar-base button.btn.prev,.content-viewer-toolbar-base button.btn.next{font-size:25px;margin-top:-2px}.content-viewer-toolbar-base button.btn.prev span,.content-viewer-toolbar-base button.btn.next span{position:relative;top:-3px;font-size:14px}.content-viewer-toolbar-base button.btn.next{margin-left:-5px}.content-viewer-toolbar-base button.btn[disabled]{opacity:.5;pointer-events:none}.content-viewer-toolbar-base .left-side *:not(:first-child){margin-left:5px}.content-viewer-toolbar-base .right-side *:not(:last-child){margin-right:5px}.content-viewer-toolbar-base .center{position:absolute;left:50%;-webkit-transform:translateX(-50%);transform:translateX(-50%)}.chapter-list-view{-webkit-transition:.4s all;-o-transition:.4s all;transition:.4s all;left:0}.content-viewer-base[data-show-chapter-list='false'] .content-viewer-view{width:100%}.content-viewer-base[data-show-chapter-list='false'] .chapter-list-view{position:absolute;left:-300px;opacity:0}.content-viewer-base[data-show-chapter-list='false'] .chapter-list-cover-sheet{opacity:0;display:none !important}@media (max-width:767px){.content-viewer-base .view-controller .chapter-list-view{position:absolute}.content-viewer-base .view-controller .content-viewer-view{width:100%}}.chapter-list-cover-sheet{-webkit-transition:.4s all;-o-transition:.4s all;transition:.4s all;opacity:1;position:absolute;z-index:5;width:100%;height:100%;-webkit-backdrop-filter:blur(5px);backdrop-filter:blur(5px);background:rgba(0,0,0,0.5)}</style><style type="text/css">.navbar.navbar-extra{margin-bottom:0px}.page-heading{margin-top:40px}.explore-heading .title,.page-heading .title{margin-top:5px;font-size:30px;font-weight:600;margin-bottom:15px}.explore-heading .back-label,.page-heading .back-label,.explore-heading .page-label,.page-heading .page-label{color:#afafaf}.explore-heading .back-label a,.page-heading .back-label a,.explore-heading .page-label a,.page-heading .page-label a{color:#afafaf;text-decoration:none}.explore-heading .back-label a:hover,.page-heading .back-label a:hover,.explore-heading .page-label a:hover,.page-heading .page-label a:hover{color:#0088cc}.explore-heading .back-to-home-label,.page-heading .back-to-home-label{color:white}.explore-heading .back-to-home-label a,.page-heading .back-to-home-label a{text-decoration:none;-webkit-transition:.4s all;-o-transition:.4s all;transition:.4s all;opacity:.85;color:white}.explore-heading .back-to-home-label a:hover,.page-heading .back-to-home-label a:hover{opacity:1}.explore-heading .back-label,.page-heading .back-label,.explore-heading .page-label,.page-heading .page-label,.explore-heading .back-to-home-label,.page-heading .back-to-home-label{font-weight:500;line-height:18px;font-size:16px}.content-icon.fa-font{color:#8365cd}.content-icon.fa-font.html{color:#3fbbff}.content-icon.fa-file-code-o{color:#1da09c}.content-icon.fa-globe{color:#3fbbff}.content-icon.fa-video-camera{color:#d05451}.card-label{display:inline-block;margin-left:5px;padding:0px 6px;float:right;text-align:center;border-radius:1020px;-webkit-box-shadow:0 1px 15px 0 rgba(0,0,0,0.2);box-shadow:0 1px 15px 0 rgba(0,0,0,0.2);font-size:12px}.card-label.premium{background:#fea116;color:white}.card-label.popular{background:#d9534f;color:white}.card-label.editorchoice{background:black;color:white}.card-label.sponsored{background:#0088cc;color:white}.scratch-bar{display:inline-block;position:relative;top:2px;left:1px;height:14px;width:180px;max-width:300px;background:grey;border-radius:3px}#explore-app .background-rvs{position:fixed;left:0;top:0;height:650px;z-index:-1;width:100%;-webkit-transform:skewY(-12deg);transform:skewY(-12deg);-webkit-transform-origin:0%;transform-origin:0%;background:#fdfdfd}#explore-app .background-rvs *{-webkit-box-sizing:border-box;box-sizing:border-box}</style><link rel="icon" type="image/png" href="https://leetcode.com/favicon-16x16.png" sizes="16x16" data-react-helmet="true"><link rel="icon" type="image/png" href="https://leetcode.com/favicon-32x32.png" sizes="32x32" data-react-helmet="true"><link rel="icon" type="image/png" href="https://leetcode.com/favicon-96x96.png" sizes="96x96" data-react-helmet="true"><link rel="icon" type="image/png" href="https://leetcode.com/favicon-160x160.png" sizes="160x160" data-react-helmet="true"><link rel="icon" type="image/png" href="https://leetcode.com/favicon-192x192.png" sizes="192x192" data-react-helmet="true"><style type="text/css">.MathJax_Preview {color: #888}
#MathJax_Message {position: fixed; left: 1em; bottom: 1.5em; background-color: #E6E6E6; border: 1px solid #959595; margin: 0px; padding: 2px 8px; z-index: 102; color: black; font-size: 80%; width: auto; white-space: nowrap}
#MathJax_MSIE_Frame {position: absolute; top: 0; left: 0; width: 0px; z-index: 101; border: 0px; margin: 0px; padding: 0px}
.MathJax_Error {color: #CC0000; font-style: italic}
</style><style type="text/css">.MathJax_Preview .MJXf-math {color: inherit!important}
</style><style type="text/css">#MathJax_Zoom {position: absolute; background-color: #F0F0F0; overflow: auto; display: block; z-index: 301; padding: .5em; border: 1px solid black; margin: 0; font-weight: normal; font-style: normal; text-align: left; text-indent: 0; text-transform: none; line-height: normal; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; -webkit-box-sizing: content-box; -moz-box-sizing: content-box; box-sizing: content-box; box-shadow: 5px 5px 15px #AAAAAA; -webkit-box-shadow: 5px 5px 15px #AAAAAA; -moz-box-shadow: 5px 5px 15px #AAAAAA; -khtml-box-shadow: 5px 5px 15px #AAAAAA; filter: progid:DXImageTransform.Microsoft.dropshadow(OffX=2, OffY=2, Color='gray', Positive='true')}
#MathJax_ZoomOverlay {position: absolute; left: 0; top: 0; z-index: 300; display: inline-block; width: 100%; height: 100%; border: 0; padding: 0; margin: 0; background-color: white; opacity: 0; filter: alpha(opacity=0)}
#MathJax_ZoomFrame {position: relative; display: inline-block; height: 0; width: 0}
#MathJax_ZoomEventTrap {position: absolute; left: 0; top: 0; z-index: 302; display: inline-block; border: 0; padding: 0; margin: 0; background-color: white; opacity: 0; filter: alpha(opacity=0)}
</style><style type="text/css">#MathJax_About {position: fixed; left: 50%; width: auto; text-align: center; border: 3px outset; padding: 1em 2em; background-color: #DDDDDD; color: black; cursor: default; font-family: message-box; font-size: 120%; font-style: normal; text-indent: 0; text-transform: none; line-height: normal; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; z-index: 201; border-radius: 15px; -webkit-border-radius: 15px; -moz-border-radius: 15px; -khtml-border-radius: 15px; box-shadow: 0px 10px 20px #808080; -webkit-box-shadow: 0px 10px 20px #808080; -moz-box-shadow: 0px 10px 20px #808080; -khtml-box-shadow: 0px 10px 20px #808080; filter: progid:DXImageTransform.Microsoft.dropshadow(OffX=2, OffY=2, Color='gray', Positive='true')}
#MathJax_About.MathJax_MousePost {outline: none}
.MathJax_Menu {position: absolute; background-color: white; color: black; width: auto; padding: 2px; border: 1px solid #CCCCCC; margin: 0; cursor: default; font: menu; text-align: left; text-indent: 0; text-transform: none; line-height: normal; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; z-index: 201; box-shadow: 0px 10px 20px #808080; -webkit-box-shadow: 0px 10px 20px #808080; -moz-box-shadow: 0px 10px 20px #808080; -khtml-box-shadow: 0px 10px 20px #808080; filter: progid:DXImageTransform.Microsoft.dropshadow(OffX=2, OffY=2, Color='gray', Positive='true')}
.MathJax_MenuItem {padding: 2px 2em; background: transparent}
.MathJax_MenuArrow {position: absolute; right: .5em; padding-top: .25em; color: #666666; font-size: .75em}
.MathJax_MenuActive .MathJax_MenuArrow {color: white}
.MathJax_MenuArrow.RTL {left: .5em; right: auto}
.MathJax_MenuCheck {position: absolute; left: .7em}
.MathJax_MenuCheck.RTL {right: .7em; left: auto}
.MathJax_MenuRadioCheck {position: absolute; left: 1em}
.MathJax_MenuRadioCheck.RTL {right: 1em; left: auto}
.MathJax_MenuLabel {padding: 2px 2em 4px 1.33em; font-style: italic}
.MathJax_MenuRule {border-top: 1px solid #CCCCCC; margin: 4px 1px 0px}
.MathJax_MenuDisabled {color: GrayText}
.MathJax_MenuActive {background-color: Highlight; color: HighlightText}
.MathJax_MenuDisabled:focus, .MathJax_MenuLabel:focus {background-color: #E8E8E8}
.MathJax_ContextMenu:focus {outline: none}
.MathJax_ContextMenu .MathJax_MenuItem:focus {outline: none}
#MathJax_AboutClose {top: .2em; right: .2em}
.MathJax_Menu .MathJax_MenuClose {top: -10px; left: -10px}
.MathJax_MenuClose {position: absolute; cursor: pointer; display: inline-block; border: 2px solid #AAA; border-radius: 18px; -webkit-border-radius: 18px; -moz-border-radius: 18px; -khtml-border-radius: 18px; font-family: 'Courier New',Courier; font-size: 24px; color: #F0F0F0}
.MathJax_MenuClose span {display: block; background-color: #AAA; border: 1.5px solid; border-radius: 18px; -webkit-border-radius: 18px; -moz-border-radius: 18px; -khtml-border-radius: 18px; line-height: 0; padding: 8px 0 6px}
.MathJax_MenuClose:hover {color: white!important; border: 2px solid #CCC!important}
.MathJax_MenuClose:hover span {background-color: #CCC!important}
.MathJax_MenuClose:hover:focus {outline: none}
</style><style type="text/css">.MJX_Assistive_MathML {position: absolute!important; top: 0; left: 0; clip: rect(1px, 1px, 1px, 1px); padding: 1px 0 0 0!important; border: 0!important; height: 1px!important; width: 1px!important; overflow: hidden!important; display: block!important; -webkit-touch-callout: none; -webkit-user-select: none; -khtml-user-select: none; -moz-user-select: none; -ms-user-select: none; user-select: none}
.MJX_Assistive_MathML.MJX_Assistive_MathML_Block {width: 100%!important}
</style><style id="erd_scroll_detection_scrollbar_style">/* Created by the element-resize-detector library. */
.erd_scroll_detection_container > div::-webkit-scrollbar { display: none; }

.erd_scroll_detection_container_animation_active { -webkit-animation-duration: 0.1s; animation-duration: 0.1s; -webkit-animation-name: erd_scroll_detection_container_animation; animation-name: erd_scroll_detection_container_animation; }
@-webkit-keyframes erd_scroll_detection_container_animation { 0% { opacity: 1; } 50% { opacity: 0; } 100% { opacity: 1; } }
@keyframes erd_scroll_detection_container_animation { 0% { opacity: 1; } 50% { opacity: 0; } 100% { opacity: 1; } }</style></head>
  <body data-gr-c-s-loaded="true" class="no-scrollbar"><div id="MathJax_Message" style="display: none;"></div>
    <script src="./circularQueue_files/bootstrap.min.js.download"></script>
    <script src="./circularQueue_files/bootstrap-table.min.js.download"></script>
    <script type="text/javascript" src="./circularQueue_files/2fa54da6e16d.js.download"></script>

    <script type="text/javascript" src="./circularQueue_files/runtime.54f916ddf.js.download"></script>
    <script type="text/javascript" src="./circularQueue_files/global.fb195eb5e.js.download"></script>
    <script type="text/javascript" src="./circularQueue_files/index.90a38fc6a.js.download"></script>
    <script type="text/javascript" src="./circularQueue_files/vendor-libs.8eff2597b.js.download"></script>
    <script type="text/javascript" src="./circularQueue_files/common-libs.4dc337e7b.js.download"></script>
    <script type="text/javascript" src="./circularQueue_files/new-libs.d82af6026.js.download"></script>

    
    
    
  <div class="content-wrapper content-viewer-wrapper" style="padding-bottom: 64px;">

     
       
     

    

    <div id="lc_navbar" class="navbar navbar-inverse navbar-extra fluid-nav"><div class="container"><div class="navbar-header"><div id="nav-user-mobile-app"><div class="dropdown nav-user-mobile-base visible-xs"><span data-toggle="dropdown" title="summerswu" class="nav-user-icon-base pull-right"><img class="avatar" src="./circularQueue_files/f85a10db30647f3297bdd1f5aac199c5.jpg" alt="summerswu"></span><ul class="dropdown-menu dropdown-content user-dropdown"><div class="square"></div><div class="dropdown-view"><li class="account-info nav-user-app"><div class="user-info"><div title="Profile" class="username"><i class="fa fa-user" aria-hidden="true"></i>&nbsp;&nbsp;<b>summerswu</b></div><div title="My Subscription" class="pull-right"><div class="member-status false">Member</div></div></div></li><li class="app-box nav-user-app"><div class="row"><div class="col-xs-4 app nav-user-app"><div class="app-base notebook"><div class="app-icon"><i class="fa fa-sticky-note-o" aria-hidden="true"></i></div><div class="app-name">Notebook</div></div></div><div class="col-xs-4 app nav-user-app"><div class="app-base list"><div class="app-icon"><i class="fa fa-heart-o" aria-hidden="true"></i></div><div class="app-name">My List</div></div></div><div class="col-xs-4 app nav-user-app"><div class="app-base submission"><div class="app-icon"><i class="fa fa-file-code-o" aria-hidden="true"></i></div><div class="app-name">Submissions</div></div></div><div class="col-xs-4 app nav-user-app"><div class="app-base session"><div class="app-icon"><i class="fa fa-tasks" aria-hidden="true"></i></div><div class="app-name">Sessions</div></div></div><div class="col-xs-4 app nav-user-app"><div class="app-base user-progress"><div class="app-icon"><i class="fa fa-pie-chart" aria-hidden="true"></i></div><div class="app-name">Progress</div></div></div><div class="col-xs-4 app nav-user-app"><div class="app-base points"><div class="app-icon"><i class="fa fa-database" aria-hidden="true"></i></div><div class="app-name">Points</div></div></div></div></li><hr class="line"><li class="option-list nav-user-app"><div class="list-item"><span>Manage Subscription</span></div><div class="list-item"><span>Change Password</span></div><div class="list-item"><span class="text-danger">Sign out</span></div></li></div></ul></div></div><button type="button" class="navbar-toggle pull-left " data-toggle="collapse" data-target=".navbar-collapse"><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button><a class="navbar-brand" href="https://leetcode.com/"><img src="./circularQueue_files/LeetCode_nav.4d940ca72.png" height="30px" alt="LeetCode"></a></div><div class="navbar-collapse collapse"><ul class="nav navbar-nav"><li id="subscribe" class="subscribe-sm"><a href="https://leetcode.com/subscribe/"><i class="fa fa-star" aria-hidden="true"></i> &nbsp;Premium</a></li><li><a href="https://leetcode.com/explore/">Explore</a></li><li><a href="https://leetcode.com/problemset/all/">Problems</a></li><li><div class="nav-item-badge">New</div><a href="https://leetcode.com/interview/">Mock</a></li><li><a href="https://leetcode.com/contest/">Contest</a></li><li><a href="https://leetcode.com/articles/">Articles</a></li><li id="discussNav"><a href="https://leetcode.com/discuss/" target="_self">Discuss</a></li><li class="visible-xs"><a href="https://leetcode.com/playground/">Playground</a></li><li id="storeNav" class="dropdown hidden-sm"><a href="https://leetcode.com/explore/learn/card/queue-stack/228/first-in-first-out-data-structure/1337/#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><span class="navitem-highlight"><i class="fa fa-gift" aria-hidden="true"></i>&nbsp;Store&nbsp;<span class="caret"></span></span></a><ul class="dropdown-menu store-dropdown"><li><a href="https://leetcode.com/store/"><span class="text-orange">Redeem</span></a></li><li><a href="https://leetcode.com/subscribe/"><span class="text-orange">Premium</span></a></li><li><a href="https://leetcode.com/book/"><span class="text-orange">Book</span></a></li></ul></li></ul><ul id="navbar-right" class="nav navbar-nav navbar-right nav-user-module hidden-xs"><li id="subscribe" class="subscribe-btn hidden-sm"><a class="subscribe text-white" href="https://leetcode.com/subscribe/"><i class="fa fa-star" aria-hidden="true"></i>&nbsp;Premium</a></li><li id="playgroundNav" class="hidden-xs"><div class="dropdown playground-create-btn-dropdown"><div data-toggle="dropdown" class="playground-create-new-btn-base icon-base"><div class="add-icon"><i class="fa fa-plus-circle" aria-hidden="true"></i></div><img src="./circularQueue_files/LeetCode_Playground.png" height="26px" alt="New Playground" class="img-rounded"></div><ul class="dropdown-menu dropdown-content"><div class="square"></div><div class="dropdown-view"><div class="select-title">Playground</div><div class="selection selection-left"><div class="selector" data-toggle="modal" data-target="#newPlaygroundwModal"><div class="new-icon icon"><span>+</span></div><div class="title">New</div></div></div><div class="selection"><div class="selector"><div class="manage-icon icon"><i class="fa fa-list-ul" aria-hidden="true"></i></div><div class="title">Saved</div></div></div></div></ul></div></li><li id="notifications"><span class="dropdown notification-btn-dropdown"><span data-toggle="dropdown" title="Notifications" class="notification-btn-base icon-base"><i class="fa fa-bell notification-btn "></i></span><ul class="dropdown-menu dropdown-content notification-dropdown"></ul></span></li><li id="nav-user-app"><span class="dropdown nav-user-base"><span data-toggle="dropdown" title="summerswu" class="nav-user-icon-base"><img class="avatar img-rounded" src="./circularQueue_files/f85a10db30647f3297bdd1f5aac199c5.jpg" alt="summerswu"><i class="caret" aria-hidden="true"></i></span><ul class="dropdown-menu dropdown-content user-dropdown"><div class="square"></div><div class="dropdown-view"><li class="account-info nav-user-app"><div class="user-info"><div title="Profile" class="username"><i class="fa fa-user" aria-hidden="true"></i>&nbsp;&nbsp;<b>summerswu</b></div><div title="My Subscription" class="pull-right"><div class="member-status false">Member</div></div></div></li><li class="app-box nav-user-app"><div class="row"><div class="col-xs-4 app nav-user-app"><div class="app-base notebook"><div class="app-icon"><i class="fa fa-sticky-note-o" aria-hidden="true"></i></div><div class="app-name">Notebook</div></div></div><div class="col-xs-4 app nav-user-app"><div class="app-base list"><div class="app-icon"><i class="fa fa-heart-o" aria-hidden="true"></i></div><div class="app-name">My List</div></div></div><div class="col-xs-4 app nav-user-app"><div class="app-base submission"><div class="app-icon"><i class="fa fa-file-code-o" aria-hidden="true"></i></div><div class="app-name">Submissions</div></div></div><div class="col-xs-4 app nav-user-app"><div class="app-base session"><div class="app-icon"><i class="fa fa-tasks" aria-hidden="true"></i></div><div class="app-name">Sessions</div></div></div><div class="col-xs-4 app nav-user-app"><div class="app-base user-progress"><div class="app-icon"><i class="fa fa-pie-chart" aria-hidden="true"></i></div><div class="app-name">Progress</div></div></div><div class="col-xs-4 app nav-user-app"><div class="app-base points"><div class="app-icon"><i class="fa fa-database" aria-hidden="true"></i></div><div class="app-name">Points</div></div></div></div></li><hr class="line"><li class="option-list nav-user-app"><div class="list-item"><span>Manage Subscription</span></div><div class="list-item"><span>Change Password</span></div><div class="list-item"><span class="text-danger">Sign out</span></div></li></div></ul></span></li></ul></div></div></div>
    <div id="lc_navbar_placeholder"></div>
    <div id="base_content">
      
<div id="explore-app"><div class="content-viewer-base" data-fullscreen="false" data-show-chapter-list="true"><div style="position: absolute; left: 0px; top: 0px; right: 0px; bottom: 0px; overflow: hidden; z-index: -1; visibility: hidden;"><div style="position: absolute; left: 0px; top: 0px; right: 0px; bottom: 0px; overflow: hidden; z-index: -1; visibility: hidden;"><div style="position: absolute; left: 0px; top: 0px; width: 966px; height: 835px;"></div></div><div style="position: absolute; left: 0px; top: 0px; right: 0px; bottom: 0px; overflow: hidden; z-index: -1; visibility: hidden;"><div style="position: absolute; left: 0px; top: 0px; width: 200%; height: 200%;"></div></div></div><div class="view-controller"><div class="chapter-list-cover-sheet visible-xs"></div><div class="chapter-list-view"><div class="expandable-chapter-list"><div class="expandable-chapter-list-base"><div class="list-group"><div class="list-group-item back-btn"><div class="close-list-base pull-right visible-xs"><div class="close-btn"><i class="fa fa-caret-square-o-left" aria-hidden="true"></i></div></div><div class="real-back-btn"><i class="fa fa-caret-left" aria-hidden="true"></i>&nbsp; Back to Chapter</div></div><div class="list-group-item chapter-item"><div class="chapter-base opened active"><div class="progress-status"><div class="progress-chart-wrapper" style="display: inline-block;"><div class="doughnut-chart-base" style="width: 32px; height: 32px;"><div class="chartjs-size-monitor" style="position: absolute; left: 0px; top: 0px; right: 0px; bottom: 0px; overflow: hidden; pointer-events: none; visibility: hidden; z-index: -1;"><div class="chartjs-size-monitor-expand" style="position:absolute;left:0;top:0;right:0;bottom:0;overflow:hidden;pointer-events:none;visibility:hidden;z-index:-1;"><div style="position:absolute;width:1000000px;height:1000000px;left:0;top:0"></div></div><div class="chartjs-size-monitor-shrink" style="position:absolute;left:0;top:0;right:0;bottom:0;overflow:hidden;pointer-events:none;visibility:hidden;z-index:-1;"><div style="position:absolute;width:200%;height:200%;left:0; top:0"></div></div></div><canvas height="32" width="32" class="chartjs-render-monitor" style="display: block; width: 32px; height: 32px;"></canvas></div></div></div><div class="chapter"><div class="pull-right expand-list-btn"><i class="fa fa-caret-down expand" aria-hidden="true"></i></div><div class="title">Queue: First-in-first-out Data Structure</div><div class="description">In this chapter, we will first introduce First-in-first-out (FIFO) and how it works in a queue.
The goal of this chapter is to help you:

Understand the definition of FIFO and queue;
Be able to implement a queue by yourself;
Be familiar with the built-in queue structure;
Use queue to solve simple problems.
</div></div></div><div class="list-group item-list-group"><div class="list-group-item false accessible"><div class="info-icon pull-right" title="HTML Article"><span></span></div><div class="check-mark completed "><i class="fa fa-check-square-o" aria-hidden="true"></i></div><div class="title"><i title="HTML Article" class="fa content-icon fa-font html" aria-hidden="true"></i> &nbsp;<span title="First-in-first-out Data Structure">First-in-first-out Data Structure</span></div></div><div class="list-group-item false accessible"><div class="info-icon pull-right" title="HTML Article"><span></span></div><div class="check-mark completed "><i class="fa fa-check-square-o" aria-hidden="true"></i></div><div class="title"><i title="HTML Article" class="fa content-icon fa-font html" aria-hidden="true"></i> &nbsp;<span title="Queue - Implementation">Queue - Implementation</span></div></div><div class="list-group-item false accessible"><div class="info-icon pull-right" title="Article"><span></span></div><div class="check-mark completed "><i class="fa fa-check-square-o" aria-hidden="true"></i></div><div class="title"><i title="Article" class="fa content-icon fa-font" aria-hidden="true"></i> &nbsp;<span title="Circular Queue">Circular Queue</span></div></div><div class="list-group-item selected accessible"><div class="info-icon pull-right" title="Coding Question"><span></span></div><div class="check-mark incomplete show-prev-complete"><i class="fa fa-square-o" aria-hidden="true"></i></div><div class="title"><i title="Coding Question" class="fa content-icon fa-file-code-o" aria-hidden="true"></i> &nbsp;<span title="Design Circular Queue">Design Circular Queue</span></div></div><div class="list-group-item false accessible"><div class="info-icon pull-right" title="HTML Article"><span></span></div><div class="check-mark incomplete show-prev-complete"><i class="fa fa-square-o" aria-hidden="true"></i></div><div class="title"><i title="HTML Article" class="fa content-icon fa-font html" aria-hidden="true"></i> &nbsp;<span title="Circular Queue - Implementation">Circular Queue - Implementation</span></div></div><div class="list-group-item false accessible"><div class="info-icon pull-right" title="HTML Article"><span></span></div><div class="check-mark incomplete show-prev-complete"><i class="fa fa-square-o" aria-hidden="true"></i></div><div class="title"><i title="HTML Article" class="fa content-icon fa-font html" aria-hidden="true"></i> &nbsp;<span title="Queue - Usage">Queue - Usage</span></div></div><div class="list-group-item false disable"><div class="info-icon pull-right" title="Coding Question"><span><span><span class="" data-toggle="tooltip" data-placement="top" data-original-title="Subscribe to unlock" aria-hidden="true" style="cursor: pointer;"><i class="fa fa-lock"></i></span></span></span></div><div class="check-mark incomplete show-prev-complete"><i class="fa fa-square-o" aria-hidden="true"></i></div><div class="title"><i title="Coding Question" class="fa content-icon fa-file-code-o" aria-hidden="true"></i> &nbsp;<span title="Moving Average from Data Stream">Moving Average from Data Stream</span></div></div></div></div><div class="list-group-item chapter-item"><div class="chapter-base false undefined"><div class="progress-status"><div class="progress-chart-wrapper" style="display: inline-block;"><div class="doughnut-chart-base" style="width: 32px; height: 32px;"><div class="chartjs-size-monitor" style="position: absolute; left: 0px; top: 0px; right: 0px; bottom: 0px; overflow: hidden; pointer-events: none; visibility: hidden; z-index: -1;"><div class="chartjs-size-monitor-expand" style="position:absolute;left:0;top:0;right:0;bottom:0;overflow:hidden;pointer-events:none;visibility:hidden;z-index:-1;"><div style="position:absolute;width:1000000px;height:1000000px;left:0;top:0"></div></div><div class="chartjs-size-monitor-shrink" style="position:absolute;left:0;top:0;right:0;bottom:0;overflow:hidden;pointer-events:none;visibility:hidden;z-index:-1;"><div style="position:absolute;width:200%;height:200%;left:0; top:0"></div></div></div><canvas height="32" width="32" class="chartjs-render-monitor" style="display: block; width: 32px; height: 32px;"></canvas></div></div></div><div class="chapter"><div class="pull-right expand-list-btn"><i class="fa fa-caret-down false" aria-hidden="true"></i></div><div class="title">Queue and BFS</div><div class="description">Prerequisite: Tree Level-order Traversal
Breadth-first search (BFS) is an algorithm to traverse or search in data structures like a tree or a graph.
As we mentioned, we can use BFS to do level-order traversal in a tree.
We can also use BFS to traverse a graph. For example, we can use BFS to find a path, especially the shortest path, from a start node to a target node.
We can use BFS, in even more abstract scenarios, to traverse all the possible statuses. In this case, we can regard the statuses as the nodes in the graph while the legal transition paths as the edges in the graph.
In this chapter, we will briefly review how BFS works and focus more on how a queue helps us implement the BFS algorithm. We will also provide some exercise for you to design and implement BFS by yourself.</div></div></div></div><div class="list-group-item chapter-item"><div class="chapter-base false undefined"><div class="progress-status"><div class="progress-chart-wrapper" style="display: inline-block;"><div class="doughnut-chart-base" style="width: 32px; height: 32px;"><div class="chartjs-size-monitor" style="position: absolute; left: 0px; top: 0px; right: 0px; bottom: 0px; overflow: hidden; pointer-events: none; visibility: hidden; z-index: -1;"><div class="chartjs-size-monitor-expand" style="position:absolute;left:0;top:0;right:0;bottom:0;overflow:hidden;pointer-events:none;visibility:hidden;z-index:-1;"><div style="position:absolute;width:1000000px;height:1000000px;left:0;top:0"></div></div><div class="chartjs-size-monitor-shrink" style="position:absolute;left:0;top:0;right:0;bottom:0;overflow:hidden;pointer-events:none;visibility:hidden;z-index:-1;"><div style="position:absolute;width:200%;height:200%;left:0; top:0"></div></div></div><canvas height="32" width="32" class="chartjs-render-monitor" style="display: block; width: 32px; height: 32px;"></canvas></div></div></div><div class="chapter"><div class="pull-right expand-list-btn"><i class="fa fa-caret-down false" aria-hidden="true"></i></div><div class="title">Stack: Last-in-first-out Data Structure</div><div class="description">In this chapter, we are going to introduce another processing order, Last-in-First-out (LIFO), and the corresponding data structure, Stack.
After this chapter, you should:

Understand the definition of LIFO and Stack;
Be able to implement a stack using dynamic array;
Be familiar with the built-in stack structure;
Be able to use a stack to solve problems.
</div></div></div></div><div class="list-group-item chapter-item"><div class="chapter-base false undefined"><div class="progress-status"><div class="progress-chart-wrapper" style="display: inline-block;"><div class="doughnut-chart-base" style="width: 32px; height: 32px;"><div class="chartjs-size-monitor" style="position: absolute; left: 0px; top: 0px; right: 0px; bottom: 0px; overflow: hidden; pointer-events: none; visibility: hidden; z-index: -1;"><div class="chartjs-size-monitor-expand" style="position:absolute;left:0;top:0;right:0;bottom:0;overflow:hidden;pointer-events:none;visibility:hidden;z-index:-1;"><div style="position:absolute;width:1000000px;height:1000000px;left:0;top:0"></div></div><div class="chartjs-size-monitor-shrink" style="position:absolute;left:0;top:0;right:0;bottom:0;overflow:hidden;pointer-events:none;visibility:hidden;z-index:-1;"><div style="position:absolute;width:200%;height:200%;left:0; top:0"></div></div></div><canvas height="32" width="32" class="chartjs-render-monitor" style="display: block; width: 32px; height: 32px;"></canvas></div></div></div><div class="chapter"><div class="pull-right expand-list-btn"><i class="fa fa-caret-down false" aria-hidden="true"></i></div><div class="title">Stack and DFS</div><div class="description">Prerequisite: Tree Traversal
Similar to BFS, depth-first search (DFS) is another important algorithm to traverse/search in a tree/graph. And also it can be used in more abstract scenarios.
As mentioned in tree traversal, we can use DFS to do pre-order, in-order and post-order traversal. There is a common feature among these three traversal orders: we never trace back unless we reach the deepest node.
That is also the largest difference between DFS and BFS, BFS never go deeper unless it has already visited all nodes at the current level.
Typically, we implement DFS using recursion. Stack plays an important role in recursion. We will explain the role of the stack when doing recursion in this chapter. We will also show you what's the drawback of recursion and provide another implementation of DFS without recursion.
DFS is an important topic when preparing for the interview. The actual design of DFS varies from problem to problem. This chapter focuses on how stack is applied in DFS and helps you to understand the principle of DFS better. To be a master of DFS algorithm, you still need lots of practice.</div></div></div></div><div class="list-group-item chapter-item"><div class="chapter-base false undefined"><div class="progress-status"><div class="progress-chart-wrapper" style="display: inline-block;"><div class="doughnut-chart-base" style="width: 32px; height: 32px;"><div class="chartjs-size-monitor" style="position: absolute; left: 0px; top: 0px; right: 0px; bottom: 0px; overflow: hidden; pointer-events: none; visibility: hidden; z-index: -1;"><div class="chartjs-size-monitor-expand" style="position:absolute;left:0;top:0;right:0;bottom:0;overflow:hidden;pointer-events:none;visibility:hidden;z-index:-1;"><div style="position:absolute;width:1000000px;height:1000000px;left:0;top:0"></div></div><div class="chartjs-size-monitor-shrink" style="position:absolute;left:0;top:0;right:0;bottom:0;overflow:hidden;pointer-events:none;visibility:hidden;z-index:-1;"><div style="position:absolute;width:200%;height:200%;left:0; top:0"></div></div></div><canvas height="32" width="32" class="chartjs-render-monitor" style="display: block; width: 32px; height: 32px;"></canvas></div></div></div><div class="chapter"><div class="pull-right expand-list-btn"><i class="fa fa-caret-down false" aria-hidden="true"></i></div><div class="title">Conclusion</div><div class="description">In previous chapters, we have introduced two data structures: Queue and Stack.
1. Queue
Queue is a FIFO data structure: the first element will be processed first. There are two important operations: enqueue and dequeue. We can use a dynamic array with two pointers to implement a queue. 
We can use a queue to implement Breadth-first Search (BFS).
There are also some important extensions of the queue. For example,

Dequeue
Priority Queue

We will introduce these structures in later cards.

2. Stack
Stack is a LIFO data structure: the last element will be processed first. There are two important operations: push and pop. The implementation of stack is quite simple. A dynamic array will be enough to implement a stack.
We use stack when LIFO principle is satisfied. Depth-first Search (DFS) is an important applications of stack.

3. Summary
To summarize, you should be able to understand and compare the following concepts:

FIFO and LIFO;
Queue and Stack;
BFS and DFS.

The best way to be comfortable with this topic is to practice. We provide some more exercise for you in this chapter.</div></div></div></div><div class="list-group-item chapter-item"><a href="https://leetcode.com/discuss/explore/queue-stack" class="discuss-category-link" target="_blank"><div class="chapter-base"><div class="discuss-icon-container"><i class="fa fa-comment-o discuss-icon"></i></div><div class="chapter"><div class="title">Discuss</div><div class="description">4 topics</div></div></div></a></div></div></div></div></div><div class="content-viewer-view"><div class="content-viewer-toolbar-base"><div class="right-side pull-right"><button class="btn"><i class="fa fa-expand" aria-hidden="true"></i></button></div><div class="left-side"><button class="btn menu-btn"><i class="fa fa-bars" aria-hidden="true"></i></button><button class="btn prev"><i class="fa fa-angle-left" aria-hidden="true"></i><span> Previous</span></button><button class="btn next"><span>Next </span><i class="fa fa-angle-right" aria-hidden="true"></i></button></div></div><div class="content-base"><div class="question-base viewer-base"><div class="question-wrapper"><div class="content-title small-content-title"><div class="question-title"><span><i title="Coding Question" class="fa fa-file-code-o content-icon" aria-hidden="true"></i> &nbsp;</span>Design Circular Queue</div><div class="toggle-btn-wrapper"><a href="https://leetcode.com/explore/learn/card/queue-stack/228/first-in-first-out-data-structure/1337/discuss"><button class="toggle-btn toggle-discuss small-toggle-btn"><i class="fa fa-comments"></i>&nbsp;&nbsp;Go to Discuss</button></a></div></div><div class="question-area"><div class="question-detail"><div class="question-description__3U1T"><div><p>Design your implementation of the circular queue. The circular queue is a linear data structure in which the operations are performed based on FIFO (First In First Out) principle and the last position is connected back to the first position to make a circle. It is also called "Ring Buffer".</p>

<p>One of the benefits of the circular queue is that we can make use of the spaces in front of the queue. In a normal queue, once the queue becomes full, we cannot insert the next element even if there is a space in front of the queue. But using the circular queue, we can use the space to store new values.</p>

<p>Your implementation should support following operations:</p>

<ul>
	<li><code>MyCircularQueue(k)</code>: Constructor, set the size of the queue to be k.</li>
	<li><code>Front</code>: Get the front item from the queue. If the queue is empty, return -1.</li>
	<li><code>Rear</code>: Get the last item from the queue. If the queue is empty, return -1.</li>
	<li><code>enQueue(value)</code>: Insert an element into the circular queue. Return true if the operation is successful.</li>
	<li><code>deQueue()</code>: Delete an element from the circular queue. Return true if the operation is successful.</li>
	<li><code>isEmpty()</code>: Checks whether the circular queue is empty or not.</li>
	<li><code>isFull()</code>: Checks whether the circular queue is full or not.</li>
</ul>

<p>&nbsp;</p>

<p><strong>Example:</strong></p>

<pre>MyCircularQueue circularQueue = new MyCircularQueue(3); // set the size to be 3
circularQueue.enQueue(1); &nbsp;// return true
circularQueue.enQueue(2); &nbsp;// return true
circularQueue.enQueue(3); &nbsp;// return true
circularQueue.enQueue(4); &nbsp;// return false, the queue is full
circularQueue.Rear(); &nbsp;// return 3
circularQueue.isFull(); &nbsp;// return true
circularQueue.deQueue(); &nbsp;// return true
circularQueue.enQueue(4); &nbsp;// return true
circularQueue.Rear(); &nbsp;// return 4
</pre>
&nbsp;

<p><strong>Note:</strong></p>

<ul>
	<li>All values will be in the range of [0, 1000].</li>
	<li>The number of operations will be in the range of&nbsp;[1, 1000].</li>
	<li>Please do not use the built-in Queue library.</li>
</ul>
</div></div></div></div><div class="editor-area"><div tabindex="-1" style="outline: 0px;"><div class="question-detail-bottom "><div class="editor-base"><hr class="line solid"><div class="row control-btn-bar"><div class="col-md-12"><div class="language-select-wrapper pull-left select-wrapper"><div class="Select has-value Select--single"><input name="lang-select" type="hidden" value="java"><div class="Select-control"><span class="Select-multi-value-wrapper" id="react-select-2--value"><div class="Select-value"><span class="Select-value-label" role="option" aria-selected="true" id="react-select-2--value-item">Java</span></div><div aria-expanded="false" aria-owns="" aria-activedescendant="react-select-2--value" aria-disabled="false" class="Select-input" role="combobox" tabindex="0" style="border: 0px; width: 1px; display: inline-block;"></div></span><span class="Select-arrow-zone"><span class="Select-arrow"></span></span></div></div></div><span class="hidden-xs learn-more-wrapper"><span data-toggle="modal"><span class="" data-toggle="popover" data-trigger="hover" data-placement="top" data-content="Learn more about our Java environment" data-container="body" aria-hidden="true" style="cursor: pointer;" data-original-title="" title=""><span class="learn-more-btn fa fa-question-circle"></span></span></span></span><span class="pull-right editor-toolbar"><span class="hidden-xs"></span><span class="editor-popover" data-toggle="popover" data-trigger="hover" data-placement="top" data-content="Retrieve last submitted code" data-container="" aria-hidden="true" style="cursor: pointer;" data-original-title="" title=""><button class="editor-btn code-btn btn btn-default "><i class="fa fa-file-code-o"></i></button></span><span class="editor-popover" data-toggle="popover" data-trigger="hover" data-placement="top" data-content="Reset to default code definition" data-container="" aria-hidden="true" style="cursor: pointer;" data-original-title="" title=""><button class="editor-btn reset-btn btn btn-default"><i class="fa fa-refresh"></i></button></span><span class="editor-popover disabled-editor-popover" data-toggle="popover" data-trigger="hover" data-placement="top" data-content="Playground unavailable for this question/language" data-container="" aria-hidden="true" style="cursor: pointer;" data-original-title="" title=""><button disabled="" class="editor-btn playground-btn btn btn-default"><img class="terminal-icon" src="./circularQueue_files/terminal.png" alt=""></button></span><span class="pull-right"><span class="block-popover__Bye8" data-toggle="popover" data-trigger="hover" data-placement="top" data-content="Code Editor Settings" data-container="body" aria-hidden="true" style="cursor: pointer;" data-original-title="" title=""><button class="btn btn-default setting-btn__2v2k editor-btn setting-btn"><span class="fa fa-cog"></span></button></span></span><form id="playground_form" target="_blank" method="post" action="https://leetcode.com/playground/new/empty" style="display: none;"><input id="playground_form_csrf" name="csrfmiddlewaretoken" type="hidden"><input id="playground_form_code" name="code" type="hidden"><input id="playground_form_question" name="question" type="hidden"><input id="playground_form_testcase" name="testcase" type="hidden"><input id="playground_form_lang" name="lang" type="hidden"><input id="playground_form_from_sub_res" name="from_submission_result" type="hidden"></form></span></div></div><div class="ReactCodeMirror"><textarea name="lc-codemirror" autocomplete="off" style="display: none;">class MyCircularQueue {

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */</textarea><div class="CodeMirror cm-s-monokai CodeMirror-wrap"><div style="overflow: hidden; position: relative; width: 3px; height: 0px; top: 5px; left: 44px;"><textarea autocorrect="off" autocapitalize="off" spellcheck="false" style="position: absolute; bottom: -1em; padding: 0px; width: 1000px; height: 1em; outline: none;" tabindex="0"></textarea></div><div class="CodeMirror-vscrollbar" tabindex="-1" cm-not-content="true" style="bottom: 0px;"><div style="min-width: 1px; height: 0px;"></div></div><div class="CodeMirror-hscrollbar" tabindex="-1" cm-not-content="true"><div style="height: 100%; min-height: 1px; width: 0px;"></div></div><div class="CodeMirror-scrollbar-filler" cm-not-content="true"></div><div class="CodeMirror-gutter-filler" cm-not-content="true"></div><div class="CodeMirror-scroll" tabindex="-1"><div class="CodeMirror-sizer" style="margin-left: 39px; margin-bottom: -17px; border-right-width: 13px; min-height: 875px; padding-right: 0px; padding-bottom: 0px;"><div style="position: relative; top: 0px;"><div class="CodeMirror-lines" role="presentation"><div role="presentation" style="position: relative; outline: none;"><div class="CodeMirror-measure"><span><span>​</span>x</span></div><div class="CodeMirror-measure"></div><div style="position: relative; z-index: 1;"></div><div class="CodeMirror-cursors"><div class="CodeMirror-cursor" style="left: 4px; top: 0px; height: 17px;">&nbsp;</div></div><div class="CodeMirror-code" role="presentation" style=""><div class="CodeMirror-activeline" style="position: relative;"><div class="CodeMirror-activeline-background CodeMirror-linebackground"></div><div class="CodeMirror-gutter-background CodeMirror-activeline-gutter" style="left: -39px; width: 39px;"></div><div class="CodeMirror-gutter-wrapper CodeMirror-activeline-gutter" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">1</div><div class="CodeMirror-gutter-elt" style="left: 29px; width: 10px;"><div class="CodeMirror-foldgutter-open CodeMirror-guttermarker-subtle"></div></div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span class="cm-keyword">class</span> <span class="cm-def">MyCircularQueue</span> {</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">2</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span cm-text="">​</span></span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">3</div><div class="CodeMirror-gutter-elt" style="left: 29px; width: 10px;"><div class="CodeMirror-foldgutter-open CodeMirror-guttermarker-subtle"></div></div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp;<span class="cm-comment">/** Initialize your data structure here. Set the size of the queue to be k. */</span></span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">4</div><div class="CodeMirror-gutter-elt" style="left: 29px; width: 10px;"><div class="CodeMirror-foldgutter-open CodeMirror-guttermarker-subtle"></div></div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp;<span class="cm-keyword">public</span> <span class="cm-variable">MyCircularQueue</span>(<span class="cm-type">int</span> <span class="cm-variable">k</span>) {</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">5</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp;</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">6</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp;  }</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">7</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp;</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">8</div><div class="CodeMirror-gutter-elt" style="left: 29px; width: 10px;"><div class="CodeMirror-foldgutter-open CodeMirror-guttermarker-subtle"></div></div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp;<span class="cm-comment">/** Insert an element into the circular queue. Return true if the operation is successful. */</span></span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">9</div><div class="CodeMirror-gutter-elt" style="left: 29px; width: 10px;"><div class="CodeMirror-foldgutter-open CodeMirror-guttermarker-subtle"></div></div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp;<span class="cm-keyword">public</span> <span class="cm-type">boolean</span> <span class="cm-variable">enQueue</span>(<span class="cm-type">int</span> <span class="cm-variable">value</span>) {</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">10</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp;</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">11</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp;  }</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">12</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp;</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">13</div><div class="CodeMirror-gutter-elt" style="left: 29px; width: 10px;"><div class="CodeMirror-foldgutter-open CodeMirror-guttermarker-subtle"></div></div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp;<span class="cm-comment">/** Delete an element from the circular queue. Return true if the operation is successful. */</span></span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">14</div><div class="CodeMirror-gutter-elt" style="left: 29px; width: 10px;"><div class="CodeMirror-foldgutter-open CodeMirror-guttermarker-subtle"></div></div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp;<span class="cm-keyword">public</span> <span class="cm-type">boolean</span> <span class="cm-variable">deQueue</span>() {</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">15</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp;</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">16</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp;  }</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">17</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp;</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">18</div><div class="CodeMirror-gutter-elt" style="left: 29px; width: 10px;"><div class="CodeMirror-foldgutter-open CodeMirror-guttermarker-subtle"></div></div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp;<span class="cm-comment">/** Get the front item from the queue. */</span></span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">19</div><div class="CodeMirror-gutter-elt" style="left: 29px; width: 10px;"><div class="CodeMirror-foldgutter-open CodeMirror-guttermarker-subtle"></div></div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp;<span class="cm-keyword">public</span> <span class="cm-type">int</span> <span class="cm-variable">Front</span>() {</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">20</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp;</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">21</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp;  }</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">22</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp;</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">23</div><div class="CodeMirror-gutter-elt" style="left: 29px; width: 10px;"><div class="CodeMirror-foldgutter-open CodeMirror-guttermarker-subtle"></div></div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp;<span class="cm-comment">/** Get the last item from the queue. */</span></span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">24</div><div class="CodeMirror-gutter-elt" style="left: 29px; width: 10px;"><div class="CodeMirror-foldgutter-open CodeMirror-guttermarker-subtle"></div></div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp;<span class="cm-keyword">public</span> <span class="cm-type">int</span> <span class="cm-variable">Rear</span>() {</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">25</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp;</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">26</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp;  }</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">27</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp;</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">28</div><div class="CodeMirror-gutter-elt" style="left: 29px; width: 10px;"><div class="CodeMirror-foldgutter-open CodeMirror-guttermarker-subtle"></div></div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp;<span class="cm-comment">/** Checks whether the circular queue is empty or not. */</span></span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">29</div><div class="CodeMirror-gutter-elt" style="left: 29px; width: 10px;"><div class="CodeMirror-foldgutter-open CodeMirror-guttermarker-subtle"></div></div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp;<span class="cm-keyword">public</span> <span class="cm-type">boolean</span> <span class="cm-variable">isEmpty</span>() {</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">30</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp;</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">31</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp;  }</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">32</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp;</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">33</div><div class="CodeMirror-gutter-elt" style="left: 29px; width: 10px;"><div class="CodeMirror-foldgutter-open CodeMirror-guttermarker-subtle"></div></div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp;<span class="cm-comment">/** Checks whether the circular queue is full or not. */</span></span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">34</div><div class="CodeMirror-gutter-elt" style="left: 29px; width: 10px;"><div class="CodeMirror-foldgutter-open CodeMirror-guttermarker-subtle"></div></div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp;<span class="cm-keyword">public</span> <span class="cm-type">boolean</span> <span class="cm-variable">isFull</span>() {</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">35</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp;</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">36</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp;  }</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">37</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;">}</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">38</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span cm-text="">​</span></span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">39</div><div class="CodeMirror-gutter-elt" style="left: 29px; width: 10px;"><div class="CodeMirror-foldgutter-open CodeMirror-guttermarker-subtle"></div></div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span class="cm-comment">/**</span></span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">40</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> <span class="cm-comment">* Your MyCircularQueue object will be instantiated and called as such:</span></span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">41</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> <span class="cm-comment">* MyCircularQueue obj = new MyCircularQueue(k);</span></span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">42</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> <span class="cm-comment">* boolean param_1 = obj.enQueue(value);</span></span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">43</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> <span class="cm-comment">* boolean param_2 = obj.deQueue();</span></span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">44</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> <span class="cm-comment">* int param_3 = obj.Front();</span></span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">45</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> <span class="cm-comment">* int param_4 = obj.Rear();</span></span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">46</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> <span class="cm-comment">* boolean param_5 = obj.isEmpty();</span></span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">47</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> <span class="cm-comment">* boolean param_6 = obj.isFull();</span></span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -39px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">48</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> <span class="cm-comment">*/</span></span></pre></div></div></div></div></div></div><div style="position: absolute; height: 13px; width: 1px; border-bottom: 0px solid transparent; top: 875px;"></div><div class="CodeMirror-gutters" style="height: 888px; left: 0px;"><div class="CodeMirror-gutter CodeMirror-linenumbers" style="width: 29px;"></div><div class="CodeMirror-gutter CodeMirror-foldgutter"></div></div></div></div></div><div class="action"><div class="row"><div class="col-sm-6"><div class="testcase-area"><div class=""><div class="custom-textcase"><label for="custom_testcase"><input type="checkbox" id="custom_testcase" name="custom_testcase"><span>&nbsp; Custom Testcase</span></label><div class="contribute-btn "><span>(&nbsp;<a style="font-weight: bold; cursor: pointer;">Contribute&nbsp;<span class="fa fa-exclamation-circle" data-toggle="tooltip" data-placement="top" data-original-title="Contribute missing testcases and get rewarded!" aria-hidden="true" style="cursor: pointer;"></span></a>&nbsp;)</span></div></div><div class="row"><div class="ds-viewer-container col-lg-12"><div id="ds-viewer"></div><div class="hidden testcase-input-base"><textarea class="form-control testCaseInputArea" rows="5" id="textArea">["MyCircularQueue","enQueue","enQueue","enQueue","enQueue","Rear","isFull","deQueue","enQueue","Rear"]
[[3],[1],[2],[3],[4],[],[],[],[4],[]]</textarea><div class="row"><div class="col-lg-12 testcase-help-label"><div class="dropdown dropdown-inline"><a id="dLabel" class="menu-links" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><i class="fa fa-question-circle" aria-hidden="true"></i>&nbsp;How to create a testcase<span class="caret"></span></a><ul class="dropdown-menu pull-right" aria-labelledby="dLabel"><li><a href="https://support.leetcode.com/hc/en-us/articles/360011883654-What-does-1-null-2-3-mean-in-binary-tree-representation-">Binary tree</a></li></ul></div></div></div></div></div></div></div></div></div><div class="col-sm-6"><div class="pull-right"><span class="hidden-xs"><div class="keyboard-shortcuts__sEqa"><span><span class="" data-toggle="popover" data-trigger="hover" data-placement="top" data-content="Show code editor shortcuts." data-container="" aria-hidden="true" style="cursor: pointer;" data-original-title="" title=""><div class="btn round"><i class="fa fa-question-circle"></i></div></span></span></div></span><span class="" data-toggle="tooltip" data-placement="top" data-original-title="Shortcut: Ctrl + &#39;" aria-hidden="true" style="cursor: pointer;"><button class="btn btn-default btn-round" type="button" style="margin-right: 10px;"><span><i class="fa fa-play-circle" aria-hidden="true"></i>&nbsp;<span>Run<span class="hidden-xs"> Code</span></span></span></button></span><span class="" data-toggle="tooltip" data-placement="top" data-original-title="Shortcut: Ctrl + enter" aria-hidden="true" style="cursor: pointer;"><button class="btn btn-primary btn-round" type="button"><span><i class="fa fa-cloud-upload" aria-hidden="true"></i>&nbsp;<span>Submit<span class="hidden-xs"> Solution</span></span></span></button></span></div></div></div><div><div id="submit_error" class="text-danger hidden">Submit failed, try again please.</div><div id="submit_warning" class="text-danger"></div></div><div class="submission-result-base"><div class="row animated hidden"><hr class="line"><div class="col-lg-12 run-code-status"><h4><span><span>Run Code<span class="hidden-xs"> Status</span>:&nbsp;</span></span><span class=""><span id="result_state" class="text-info"></span><span id="submit_wait" class="loading-center hidden"><img src="./circularQueue_files/loading.gif" class="img-rounded loading-image" alt="loading" width="15"></span></span></h4></div><div class="col-lg-12"><div class="text-danger"></div></div></div></div></div></div></div></div></div></div><div style="position: absolute; left: 0px; top: 0px; right: 0px; bottom: 0px; overflow: hidden; z-index: -1; visibility: hidden;"><div style="position: absolute; left: 0px; top: 0px; right: 0px; bottom: 0px; overflow: hidden; z-index: -1; visibility: hidden;"><div style="position: absolute; left: 0px; top: 0px; width: 649px; height: 788px;"></div></div><div style="position: absolute; left: 0px; top: 0px; right: 0px; bottom: 0px; overflow: hidden; z-index: -1; visibility: hidden;"><div style="position: absolute; left: 0px; top: 0px; width: 200%; height: 200%;"></div></div></div></div></div></div></div></div></div>

    </div>

  </div>

  
  <footer class="site-footer content-viewer-footer" id="lc-footer" style="margin-top: -64px;">
    <div class="container">
      <hr>
      <div class="row">
        
        <div class="col-sm-4 copyright">
          <span>Copyright © 2019 LeetCode</span>
        </div>
        
        <div class="text-right col-sm-8 region-us">
          <div class="links">
            <a href="https://leetcode.com/support/">Help Center</a>
            &nbsp;|&nbsp;
            
              <span class="hidden-xs hidden-sm" id="Join_LeetCode">
                <a href="https://leetcode.com/jobs/">Jobs</a>
                &nbsp;|&nbsp;
              </span>
            
            
            <span class="hidden-xs hidden-sm" id="Join_LeetCode">
              <a href="https://leetcode.com/bugbounty/">Bug Bounty</a>
              &nbsp;|&nbsp;
            </span>
            
            
            <a href="https://leetcode.com/terms/">Terms</a>
            &nbsp;|&nbsp;
            <a href="https://leetcode.com/privacy/">Privacy<span class="hide-too-small">  Policy</span></a>
            
              <span class="region-base">
                
                  <span class="hidden-xs space">&nbsp; &nbsp; </span>
                  <br class="visible-xs newline">
                  <a href="https://leetcode.com/region/" class="choose-region us">
                    <img src="./circularQueue_files/us.svg" height="14">
                    <span class="hidden-md">United States</span>
                  </a>
                
              </span>
            
          </div>
        </div>
      </div>
      
    </div>
  </footer>

  <div class="modal fade simple-modal" id="supportModal" role="dialog">
    <div class="modal-center">
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
            <span class="text-lg text-300">&nbsp;How can we help you?</span>
          </div>

          <div class="modal-body">
            <div class="row text-center">
              <div class="col-sm-4">
                <a class="support-module btn btn-default" href="mailto:billing@leetcode.com?subject=Billing%20Issue&amp;body=Name:%0D%0A%0D%0AUsername:%0D%0A%0D%0AMessage:%0D%0A%0D%0A" target="_blank">
                  <i class="fa fa-credit-card text-xl" aria-hidden="true"></i>
                  <br><span class="text">Billing &amp; Account</span>
                </a>
              </div>
              <div class="col-sm-4">
                <a class="support-module btn btn-default" href="mailto:support@leetcode.com?subject=General%20Support&amp;body=Name:%0D%0A%0D%0AUsername:%0D%0A%0D%0AMessage:%0D%0A%0D%0A" target="_blank">
                  <i class="fa fa-life-ring text-xl" aria-hidden="true"></i>
                  <br><span class="text">General Support</span>
                </a>
              </div>
              <div class="col-sm-4">
                <a class="support-module btn btn-default" href="mailto:feedback@leetcode.com?subject=Other%20Inquiries&amp;body=Name:%0D%0A%0D%0AUsername:%0D%0A%0D%0AMessage:%0D%0A%0D%0A" target="_blank">
                  <i class="fa fa-question-circle text-xl" aria-hidden="true"></i>
                  <br><span class="text">Other Inquiries</span>
                </a>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  

  <script type="text/javascript" src="./circularQueue_files/index.f6c33a7c6.js.download"></script><div></div><div></div>
  <script type="text/javascript" src="./circularQueue_files/eb02df0bc0e3.js.download"></script>

  <script>
    (function($, w, d){
      
      

      $(function() {
        $('#navbar-right img').addClass('img-rounded');
        setFooterStyles();
      });

      function setFooterStyles() {
        var $footer = $('#lc-footer'),
            height = $footer.outerHeight();
        if (!$footer.parent().is('body')) return ;
        $footer.css('margin-top', -height);
        $('.content-wrapper').css('padding-bottom', height);
      }

    }(jQuery, window, document));
    try {
      ace.config.set("basePath", "/static/ace-builds/src-noconflict/")
    } catch(err) {}
  </script>


    <script>
      (function($, w, d){

        $('#exit-mock-user-btn').click(function() {
          $.ajax({
            type: 'POST',
            url: "/api/exit_mock_user/",
            data: $('#exit-mock-user-form').serialize(),
            success: function() {
              window.location = window.location.href.split("?")[0];
            }
          });
        });
      }(jQuery, window, document));
    </script>
    
<script type="text/javascript">
  var subscribeUrl = '';
  
    subscribeUrl = "/subscribe/";
  
  var pageData = {
    loginUrl: "/accounts/login/",
    subscribeUrl: subscribeUrl,
    mathjaxUrl: "/static/mathjax/MathJax.js",
    katexUrl: "/static/katex/dist/katex.min.js",
    reverseUrl: {
      latest_submission: "/submissions/latest/",
      account_login: "/accounts/login/",
      maintenance: "/maintenance/",
      profile: "/profile/"
    },
  };
</script>
<script type="text/javascript" src="./circularQueue_files/index.6999f0471.js.download"></script>
<script src="./circularQueue_files/d3.min.js.download"></script><div class="CreateModal-base"><div class=" modal fade" id="newPlaygroundwModal" tabindex="-1" role="dialog" data-backdrop="true"><div class="modal-center"><div class="modal-dialog"><div class="modal-content"><div class="modal-header text-left"><button type="button" class="close" data-dismiss="modal">×</button><h4 class="modal-title"><i class="fa fa-file-code-o" aria-hidden="true"></i>&nbsp; Create a New Playground</h4></div><div class="modal-body row"><h4>Console Application</h4><div class="row"><div class="element-base col-xs-6 col-sm-4"><div class="element-touch-event text-center" data-dismiss="modal"><div class="element-object"><div class="object"><img alt="" class="object-img" src="./circularQueue_files/card-empty.jpg"></div></div><div class="element-name">New</div></div></div><div class="element-base col-xs-6 col-sm-4"><div class="element-touch-event text-center" data-dismiss="modal"><div class="element-object"><div class="object"><img alt="" class="object-img" src="./circularQueue_files/card-linked-list.jpg"></div></div><div class="element-name">Linked List</div></div></div><div class="element-base col-xs-6 col-sm-4"><div class="element-touch-event text-center" data-dismiss="modal"><div class="element-object"><div class="object"><img alt="" class="object-img" src="./circularQueue_files/card-binary-tree.jpg"></div></div><div class="element-name">Binary Tree</div></div></div></div><br><h4>Frontend</h4><div class="row"><div class="element-base col-xs-6 col-sm-4"><div class="element-touch-event text-center" data-dismiss="modal"><div class="element-object"><div class="object"><img alt="" class="object-img" src="./circularQueue_files/card-react.jpg"></div></div><div class="element-name">React</div></div></div></div><br></div><div class="modal-footer"><button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button></div></div></div></div></div></div>
<script src="./circularQueue_files/circle-progress.js.download"></script>

    
      <script type="text/javascript">
    var URL = 'https://leetcode.com/discuss/compensation/';
    var CONTENT = '🎁Got an offer? 💰';

    function getHashCode(str) {
        var hash = 0, i, chr;
        if (str.length === 0) return hash;
        for (i = 0; i < str.length; i++) {
            chr = str.charCodeAt(i);
            hash = ((hash << 5) - hash) + chr;
            hash |= 0;
        }
        return hash;
    }

    var LOCAL_STORAGE_KEY = 'feedback-tab:' + getHashCode(URL + CONTENT);
    var CLOSE_BUTTON_CLICKED = false;

    var CLOSE_BUTTON_HTML = '\
        <?xml version="1.0" encoding="UTF-8"?>\
        <svg id="close-icon-svg" width="24px" height="24px" viewBox="0 0 24 24" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink">\
            <title>icon/close</title>\
            <defs></defs>\
            <g id="close-icon" stroke="none" stroke-width="1" fill="none" fill-rule="evenodd">\
                <polygon id="path-1" points="19 6.41 17.59 5 12 10.59 6.41 5 5 6.41 10.59 12 5 17.59 6.41 19 12 13.41 17.59 19 19 17.59 13.41 12"></polygon>\
            </g>\
        </svg>\
    ';

    function onClickClose(e) {
        e.preventDefault();
        document.querySelector('.feedback-anchor').classList.add('feedback-anchor-closing');
        window.localStorage.setItem(LOCAL_STORAGE_KEY, Date.now());
        CLOSE_BUTTON_CLICKED = true;
    }

    function onTransitionEnd(event) {
        if (event.target && CLOSE_BUTTON_CLICKED && event.propertyName === 'opacity') {
            event.target.remove();
        }
    }

    function createFeedbackTab() {
        var closeButton = document.createElement('span');
        closeButton.classList.add('feedback-tab-close-button');
        closeButton.innerHTML = CLOSE_BUTTON_HTML;
        closeButton.addEventListener('click', onClickClose);

        var feedbackTabContent = document.createElement('span');
        feedbackTabContent.innerHTML = CONTENT;

        var feedbackTab = document.createElement('div');
        feedbackTab.classList.add('feedback-tab');

        feedbackTab.appendChild(feedbackTabContent);
        feedbackTab.appendChild(closeButton);

        var feedbackAnchor = document.createElement('a');
        feedbackAnchor.classList.add('feedback-anchor');
        feedbackAnchor.setAttribute('href', URL);
        feedbackAnchor.setAttribute('target', '_blank');
        feedbackAnchor.appendChild(feedbackTab);
        feedbackAnchor.addEventListener('transitionend', onTransitionEnd);
        return feedbackAnchor;
    }

    function insertFeedbackTab() {
        var feedbackTab = createFeedbackTab();
        var navbarRightContainer = document.getElementById('navbar-right-container');
        if (navbarRightContainer) {
            navbarRightContainer.insertBefore(feedbackTab, navbarRightContainer.firstChild);
        }
    }

    window.onload = function() {
        if (!window.localStorage.getItem(LOCAL_STORAGE_KEY)) {
            setTimeout(insertFeedbackTab, 500);
        }
    }
</script>

<style>
    .feedback-tab {
        position: absolute;
        display: flex;
        align-items: center;
        top: 0px;
        right: 270px;
        background-color: #455a64;
        color: white;
        opacity: 0.6;
        border-radius: 0 0 3px 3px;
        padding: 5px 10px;
        cursor: pointer;
        z-index: 2;
        transition: all 0.3s ease-in-out;
    }
    .feedback-tab:hover {
        opacity: 1;
    }
    .feedback-tab-close-button {
        margin-left: 5px;
        height: 1em;
        width: 1em;
        display: inline-flex;
        align-items: center;
        justify-content: center;
    }
    .feedback-anchor:focus {
        text-decoration: none;
    }
    .feedback-anchor-closing {
        opacity: 0;
        transition: opacity 0.3s ease-in-out;
    }
    #close-icon-svg {
        opacity: 0.5;
        transition: all 0.3s ease-in-out;
    }
    #close-icon-svg:hover {
        opacity: 1;
    }
    #close-icon {
        fill: white;
    }
</style>
    

    
  

<script src="./circularQueue_files/katex.min.js.download"></script><script src="./circularQueue_files/MathJax.js.download"></script><div id="lc-alert-container"><div class="lc-alert-base__GTOx" data-status="exited"><div class=" bg-cover__251O"></div><div class="lc-alert__2567"><div class=" alert-content__2Ke2"><div class="inner__3Zl8"><div class=" inner-content__3Pbg"><div class="close-modal-btn__1W8e"><div class="cross__UZjL"></div><div class="cross__UZjL"></div></div><div class="lc-alert-content__4Rv0" data-show-close-button="true"><div class="lc-alert-title__3sym " data-status="entered"><h4>Java</h4></div><div class=" lc-alert-body__E0c3" data-status="entered"><div><p>Compiled with <code>java 1.8.0</code> taking advantage of the latest Java 8 features such as lambda expressions and stream API.</p>

<p>Most standard library headers are already included automatically for your convenience.</p></div></div><div class="lc-alert-button-group__2THN " data-status="entered"><span class="lc-alert-button__7Byx  ">OK</span></div></div></div></div></div></div></div></div></body><div><div class="gr_-editor gr-iframe-first-load" style="display: none;"><div class="gr_-editor_back"></div><iframe class="gr_-ifr gr-_dialog-content" src="./circularQueue_files/saved_resource.html"></iframe></div></div><grammarly-card><div></div></grammarly-card><span class="gr__tooltip"><span class="gr__tooltip-content"></span><i class="gr__tooltip-logo"></i><span class="gr__triangle"></span></span></html>