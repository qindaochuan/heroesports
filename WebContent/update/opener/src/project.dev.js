window.__require = function e(t, n, r) {
  function s(o, u) {
    if (!n[o]) {
      if (!t[o]) {
        var b = o.split("/");
        b = b[b.length - 1];
        if (!t[b]) {
          var a = "function" == typeof __require && __require;
          if (!u && a) return a(b, !0);
          if (i) return i(b, !0);
          throw new Error("Cannot find module '" + o + "'");
        }
      }
      var f = n[o] = {
        exports: {}
      };
      t[o][0].call(f.exports, function(e) {
        var n = t[o][1][e];
        return s(n || e);
      }, f, f.exports, e, t, n, r);
    }
    return n[o].exports;
  }
  var i = "function" == typeof __require && __require;
  for (var o = 0; o < r.length; o++) s(r[o]);
  return s;
}({
  App: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "02136TdN5tKLKFTBGSlpss0", "App");
    "use strict";
    var MyUser = require("MyUser");
    var App = new cc.EventTarget();
    App.myUser = MyUser;
    App.wsurl = "ws://192.168.0.55:8099/websocket";
    App.apiurl = "http://192.168.0.55:8088";
    App.token = "";
    App.requestToken = "";
    App.esportPlatformId = -1;
    App.xhrArray = [];
    App.connectServer = function() {
      App.ws = new WebSocket(App.wsurl);
      App.ws.onopen = function(evt) {
        App.emit("connectServerSuccess");
      };
      App.ws.onmessage = function(evt) {
        var jsonData = null;
        try {
          jsonData = JSON.parse(evt.data);
        } catch (e) {
          cc.log("parsing error: ", evt.data);
        }
        null != jsonData && App.emit("channel." + jsonData.channel, jsonData.data);
      };
      App.ws.onclose = function(evt) {
        App.emit("networkClosed");
      };
      App.ws.onerror = function(evt) {
        App.emit("networkError");
      };
    };
    App.sendMsg = function(msg) {
      App.ws.send(msg);
    };
    App.do_onreadystatechange = function(xhr, callback) {
      if (4 === xhr.readyState && 200 === xhr.status) {
        var indexOf = -1;
        for (var i = 0; i < App.xhrArray.length; i++) if (App.xhrArray[i] == xhr) {
          indexOf = i;
          break;
        }
        indexOf > -1 && App.xhrArray.splice(indexOf, 1);
        if (callback) {
          var jsonData = null;
          try {
            jsonData = JSON.parse(xhr.responseText);
          } catch (e) {
            cc.log("parsing error: ", xhr.responseText);
          }
          null != jsonData && callback(jsonData);
        }
      }
    };
    App.clearAllHttp = function() {
      for (var i = 0; i < App.xhrArray.length; i++) {
        App.xhrArray[i].abort();
        App.xhrArray[i] = null;
      }
      App.xhrArray = [];
    };
    App.post = function(cmd, data, callback) {
      var xhr = new XMLHttpRequest();
      xhr.open("POST", App.apiurl + cmd);
      xhr.setRequestHeader("Content-Type", "application/json");
      xhr.send(JSON.stringify(data));
      App.xhrArray.push(xhr);
      xhr.onreadystatechange = function() {
        App.do_onreadystatechange(xhr, callback);
      };
      xhr.ontimeout = function(e) {};
      xhr.onerror = function(e) {};
      xhr.onprogress = function(e) {};
    };
    App.postNone = function(cmd, callback) {
      var xhr = new XMLHttpRequest();
      xhr.open("POST", App.apiurl + cmd);
      xhr.send();
      xhr.onreadystatechange = function() {
        App.do_onreadystatechange(xhr, callback);
      };
      xhr.ontimeout = function(e) {};
      xhr.onerror = function(e) {};
      xhr.onprogress = function(e) {};
    };
    App.postWithToken = function(cmd, data, callback) {
      var xhr = new XMLHttpRequest();
      xhr.open("POST", App.apiurl + cmd);
      xhr.setRequestHeader("Content-Type", "application/json");
      xhr.setRequestHeader("Authorization", "Baer " + App.requestToken);
      xhr.send(JSON.stringify(data));
      xhr.onreadystatechange = function() {
        App.do_onreadystatechange(xhr, callback);
      };
      xhr.ontimeout = function(e) {};
      xhr.onerror = function(e) {};
      xhr.onprogress = function(e) {};
    };
    App.postImage = function(cmd, data, callback) {
      var xhr = new XMLHttpRequest();
      xhr.open("POST", App.apiurl + cmd);
      xhr.setRequestHeader("Content-Type", "application/octet-stream");
      xhr.setRequestHeader("Authorization", "Baer " + App.requestToken);
      xhr.send(data);
      xhr.onreadystatechange = function() {
        App.do_onreadystatechange(xhr, callback);
      };
      xhr.ontimeout = function(e) {};
      xhr.onerror = function(e) {};
      xhr.onprogress = function(e) {};
    };
    App.postTitle = function(path, dataArray, callback) {
      var xhr = new XMLHttpRequest();
      var url = App.apiurl + path + "?" + dataArray[0];
      for (var i = 1; i < dataArray.length; i++) url = url + "&" + dataArray[i];
      xhr.open("POST", url);
      xhr.setRequestHeader("Authorization", "Baer " + App.requestToken);
      xhr.send();
      xhr.onreadystatechange = function() {
        App.do_onreadystatechange(xhr, callback);
      };
      xhr.ontimeout = function(e) {};
      xhr.onerror = function(e) {};
      xhr.onprogress = function(e) {};
    };
    App.postNoneWithToken = function(cmd, callback) {
      var xhr = new XMLHttpRequest();
      xhr.open("POST", App.apiurl + cmd);
      xhr.setRequestHeader("Authorization", "Baer " + App.requestToken);
      xhr.send();
      xhr.onreadystatechange = function() {
        App.do_onreadystatechange(xhr, callback);
      };
      xhr.ontimeout = function(e) {};
      xhr.onerror = function(e) {};
      xhr.onprogress = function(e) {};
    };
    App.get = function(path, callback) {
      var xhr = new XMLHttpRequest();
      xhr.open("GET", App.apiurl + path);
      xhr.send();
      xhr.onreadystatechange = function() {
        App.do_onreadystatechange(xhr, callback);
      };
    };
    App.getWithToken = function(path, callback) {
      var xhr = new XMLHttpRequest();
      xhr.open("GET", App.apiurl + path);
      xhr.setRequestHeader("Authorization", "Baer " + App.requestToken);
      xhr.send();
      xhr.onreadystatechange = function() {
        App.do_onreadystatechange(xhr, callback);
      };
    };
    App.getWithData = function(path, dataArray, callback) {
      var xhr = new XMLHttpRequest();
      var url = App.apiurl + path + "?" + dataArray[0];
      for (var i = 1; i < dataArray.length; i++) url = url + "&" + dataArray[i];
      xhr.open("GET", url);
      xhr.send();
      xhr.onreadystatechange = function() {
        App.do_onreadystatechange(xhr, callback);
      };
    };
    App.getWithTokenData = function(path, dataArray, callback) {
      var xhr = new XMLHttpRequest();
      var url = App.apiurl + path + "?" + dataArray[0];
      for (var i = 1; i < dataArray.length; i++) url = url + "&" + dataArray[i];
      xhr.open("GET", url);
      xhr.setRequestHeader("Authorization", "Baer " + App.requestToken);
      xhr.send();
      xhr.onreadystatechange = function() {
        App.do_onreadystatechange(xhr, callback);
      };
    };
    App.getSecurityCodeUrl = function() {
      var url = App.apiurl + "/captcha?token=" + App.token + "&x=" + Math.floor(100 * Math.random());
      return url;
    };
    App.getHeadImageByUserId = function(userId) {
      var url = App.apiurl + "/users/avatar?userId=" + userId + "&x=" + Math.floor(100 * Math.random());
      return url;
    };
    App.getEimage = function(fileName) {
      var url = "http://192.168.0.169:8080/heroesports/eimage?file=" + fileName;
      return url;
    };
    module.exports = App;
    cc._RF.pop();
  }, {
    MyUser: "MyUser"
  } ],
  BankInfoBean: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "7ffd5phF11Pc6pD54gY12FA", "BankInfoBean");
    "use strict";
    var BankInfoBean = function BankInfoBean(totalBankcode) {
      if (!(this instanceof BankInfoBean)) return new BankInfoBean(totalBankcode);
      this.totalBankcode = totalBankcode;
      this.bankName = "";
      this.bankCode = "";
      this.reg = "";
      this.cardType;
      this.s1 = "^(621096|621098|622150|622151|622181|622188|622199|955100|621095|620062|621285|621798|621799|621797|620529|621622|621599|621674|623218|623219)\\d{13}$";
      this.s2 = "^(62215049|62215050|62215051|62218850|62218851|62218849)\\d{11}$";
      this.s3 = "^(622812|622810|622811|628310|625919)\\d{10}$";
      this.s4 = "^(620200|620302|620402|620403|620404|620406|620407|620409|620410|620411|620412|620502|620503|620405|620408|620512|620602|620604|620607|620611|620612|620704|620706|620707|620708|620709|620710|620609|620712|620713|620714|620802|620711|620904|620905|621001|620902|621103|621105|621106|621107|621102|621203|621204|621205|621206|621207|621208|621209|621210|621302|621303|621202|621305|621306|621307|621309|621311|621313|621211|621315|621304|621402|621404|621405|621406|621407|621408|621409|621410|621502|621317|621511|621602|621603|621604|621605|621608|621609|621610|621611|621612|621613|621614|621615|621616|621617|621607|621606|621804|621807|621813|621814|621817|621901|621904|621905|621906|621907|621908|621909|621910|621911|621912|621913|621915|622002|621903|622004|622005|622006|622007|622008|622010|622011|622012|621914|622015|622016|622003|622018|622019|622020|622102|622103|622104|622105|622013|622111|622114|622017|622110|622303|622304|622305|622306|622307|622308|622309|622314|622315|622317|622302|622402|622403|622404|622313|622504|622505|622509|622513|622517|622502|622604|622605|622606|622510|622703|622715|622806|622902|622903|622706|623002|623006|623008|623011|623012|622904|623015|623100|623202|623301|623400|623500|623602|623803|623901|623014|624100|624200|624301|624402|623700|624000)\\d{12}$";
      this.s5 = "^(622200|622202|622203|622208|621225|620058|621281|900000|621558|621559|621722|621723|620086|621226|621618|620516|621227|621288|621721|900010|623062|621670|621720|621379|621240|621724|621762|621414|621375|622926|622927|622928|622929|622930|622931|621733|621732|621372|621369|621763)\\d{13}$";
      this.s6 = "^(402791|427028|427038|548259|621376|621423|621428|621434|621761|621749|621300|621378|622944|622949|621371|621730|621734|621433|621370|621764|621464|621765|621750|621377|621367|621374|621731|621781)\\d{10}$";
      this.s7 = "^(9558)\\d{15}$";
      this.s8 = "^(370246|370248|370249|370247|370267|374738|374739)\\d{9}$";
      this.s9 = "^(427010|427018|427019|427020|427029|427030|427039|438125|438126|451804|451810|451811|458071|489734|489735|489736|510529|427062|524091|427064|530970|530990|558360|524047|525498|622230|622231|622232|622233|622234|622235|622237|622239|622240|622245|622238|451804|451810|451811|458071|628288|628286|622206|526836|513685|543098|458441|622246|544210|548943|356879|356880|356881|356882|528856|625330|625331|625332|622236|524374|550213|625929|625927|625939|625987|625930|625114|622159|625021|625022|625932|622889|625900|625915|625916|622171|625931|625113|625928|625914|625986|625925|625921|625926|625942|622158|625917|625922|625934|625933|625920|625924|625017|625018|625019)\\d{10}$";
      this.s10 = "^(45806|53098|45806|53098)\\d{11}$";
      this.s11 = "^(622210|622211|622212|622213|622214|622220|622223|622225|622229|622215|622224)\\d{10}$";
      this.s12 = "^(620054|620142|620184|620030|620050|620143|620149|620124|620183|620094|620186|620148|620185)\\d{10}$";
      this.s13 = "^(620114|620187|620046)\\d{13}$";
      this.s14 = "^(622841|622824|622826|622848|620059|621282|622828|622823|621336|621619|622821|622822|622825|622827|622845|622849|623018|623206|621671|622840|622843|622844|622846|622847|620501)\\d{13}$";
      this.s15 = "^(95595|95596|95597|95598|95599)\\d{14}$";
      this.s16 = "^(103)\\d{16}$";
      this.s17 = "^(403361|404117|404118|404119|404120|404121|463758|519412|519413|520082|520083|552599|558730|514027|622836|622837|628268|625996|625998|625997|622838|625336|625826|625827|544243|548478|628269)\\d{10}$";
      this.s18 = "^(622820|622830)\\d{10}$";
      this.s19 = "^(621660|621661|621662|621663|621665|621667|621668|621669|621666|456351|601382|621256|621212|621283|620061|621725|621330|621331|621332|621333|621297|621568|621569|621672|623208|621620|621756|621757|621758|621759|621785|621786|621787|621788|621789|621790|622273|622274|622771|622772|622770|621741|621041)\\d{13}$";
      this.s20 = "^(621293|621294|621342|621343|621364|621394|621648|621248|621215|621249|621231|621638|621334|621395|623040|622348)\\d{10}$";
      this.s21 = "^(625908|625910|625909|356833|356835|409665|409666|409668|409669|409670|409671|409672|512315|512316|512411|512412|514957|409667|438088|552742|553131|514958|622760|628388|518377|622788|628313|628312|622750|622751|625145|622479|622480|622789|625140|622346|622347)\\d{10}$";
      this.s22 = "^(518378|518379|518474|518475|518476|524865|525745|525746|547766|558868|622752|622753|622755|524864|622757|622758|622759|622761|622762|622763|622756|622754|622764|622765|558869|625905|625906|625907|625333)\\d{10}$";
      this.s23 = "^(53591|49102|377677)\\d{11}$";
      this.s24 = "^(620514|620025|620026|620210|620211|620019|620035|620202|620203|620048|620515|920000)\\d{10}$";
      this.s25 = "^(620040|620531|620513|921000|620038)\\d{13}$";
      this.s26 = "^(621284|436742|589970|620060|621081|621467|621598|621621|621700|622280|622700|623211|623668)\\d{13}$";
      this.s27 = "^(421349|434061|434062|524094|526410|552245|621080|621082|621466|621488|621499|622966|622988|622382|621487|621083|621084|620107)\\d{10}$";
      this.s28 = "^(436742193|622280193)\\d{10}$";
      this.s29 = "^(553242)\\d{12}$";
      this.s30 = "^(625362|625363|628316|628317|356896|356899|356895|436718|436738|436745|436748|489592|531693|532450|532458|544887|552801|557080|558895|559051|622166|622168|622708|625964|625965|625966|628266|628366|622381|622675|622676|622677)\\d{10}$";
      this.s31 = "^(5453242|5491031|5544033)\\d{11}$";
      this.s32 = "^(622725|622728|436728|453242|491031|544033|622707|625955|625956)\\d{10}$";
      this.s33 = "^(53242|53243)\\d{11}$";
      this.s34 = "^(622261|622260|622262|621002|621069|621436|621335)\\d{13}$";
      this.s35 = "^(620013)\\d{10}$";
      this.s36 = "^(405512|601428|405512|601428|622258|622259|405512|601428)\\d{11}$";
      this.s37 = "^(49104|53783)\\d{11}$";
      this.s38 = "^(434910|458123|458124|520169|522964|552853|622250|622251|521899|622253|622656|628216|622252|955590|955591|955592|955593|628218|625028|625029)\\d{10}$";
      this.s39 = "^(622254|622255|622256|622257|622284)\\d{10}$";
      this.s40 = "^(620021|620521)\\d{13}$";
      this.s41 = "^(402658|410062|468203|512425|524011|622580|622588|622598|622609|95555|621286|621483|621485|621486|621299)(\\d{10}|\\d{11})$";
      this.s42 = "^(690755)\\d{9}$";
      this.s43 = "^(690755)\\d{12}$";
      this.s44 = "^(356885|356886|356887|356888|356890|439188|439227|479228|479229|521302|356889|545620|545621|545947|545948|552534|552587|622575|622576|622577|622578|622579|545619|622581|622582|545623|628290|439225|518710|518718|628362|439226|628262|625802|625803)\\d{10}$";
      this.s45 = "^(370285|370286|370287|370289)\\d{9}$";
      this.s46 = "^(620520)\\d{13}$";
      this.s47 = "^(622615|622616|622618|622622|622617|622619|415599|421393|421865|427570|427571|472067|472068|622620)\\d{10}$";
      this.s48 = "^(545392|545393|545431|545447|356859|356857|407405|421869|421870|421871|512466|356856|528948|552288|622600|622601|622602|517636|622621|628258|556610|622603|464580|464581|523952|545217|553161|356858|622623|625912|625913|625911)\\d{10}$";
      this.s49 = "^(377155|377152|377153|377158)\\d{9}$";
      this.s50 = "^(303)\\d{13}$";
      this.s51 = "^(90030)\\d{11}$";
      this.s52 = "^(620535)\\d{13}$";
      this.s53 = "^(620085|622660|622662|622663|622664|622665|622666|622667|622669|622670|622671|622672|622668|622661|622674|622673|620518|621489|621492)\\d{10}$";
      this.s54 = "^(356837|356838|486497|622657|622685|622659|622687|625978|625980|625981|625979|356839|356840|406252|406254|425862|481699|524090|543159|622161|622570|622650|622655|622658|625975|625977|628201|628202|625339|625976)\\d{10}$";
      this.s55 = "^(433670|433680|442729|442730|620082|622690|622691|622692|622696|622698|622998|622999|433671|968807|968808|968809|621771|621767|621768|621770|621772|621773|622453|622456)\\d{10}$";
      this.s56 = "^(622459)\\d{11}$";
      this.s57 = "^(376968|376969|376966)\\d{9}$";
      this.s58 = "^(400360|403391|403392|404158|404159|404171|404172|404173|404174|404157|433667|433668|433669|514906|403393|520108|433666|558916|622678|622679|622680|622688|622689|628206|556617|628209|518212|628208|356390|356391|356392|622916|622918|622919)\\d{10}$";
      this.s59 = "^(622630|622631|622632|622633|999999|621222|623020|623021|623022|623023)\\d{10}$";
      this.s60 = "^(523959|528709|539867|539868|622637|622638|628318|528708|622636|625967|625968|625969)\\d{10}$";
      this.s61 = "^(621626|623058)\\d{13}$";
      this.s62 = "^(602907|622986|622989|622298|627069|627068|627066|627067|412963|415752|415753|622535|622536|622538|622539|998800|412962|622983)\\d{10}$";
      this.s63 = "^(531659|622157|528020|622155|622156|526855|356869|356868|625360|625361|628296|435744|435745|483536|622525|622526|998801|998802)\\d{10}$";
      this.s64 = "^(620010)\\d{10}$";
      this.s65 = "^(438589)\\d{12}$";
      this.s66 = "^(90592)\\d{11}$";
      this.s67 = "^(966666|622909|438588|622908)\\d{12}$";
      this.s68 = "^(461982|486493|486494|486861|523036|451289|527414|528057|622901|622902|622922|628212|451290|524070|625084|625085|625086|625087|548738|549633|552398|625082|625083|625960|625961|625962|625963)\\d{10}$";
      this.s69 = "^(620010)\\d{10}$";
      this.s70 = "^(621050|622172|622985|622987|620522|622267|622278|622279|622468|622892|940021)\\d{12}$";
      this.s71 = "^(438600)\\d{10}$";
      this.s72 = "^(356827|356828|356830|402673|402674|486466|519498|520131|524031|548838|622148|622149|622268|356829|622300|628230|622269|625099|625953)\\d{10}$";
      this.s73 = "^(622516|622517|622518|622521|622522|622523|984301|984303|621352|621793|621795|621796|621351|621390|621792|621791)\\d{10}$";
      this.s74 = "^(84301|84336|84373|84385|84390|87000|87010|87030|87040|84380|84361|87050|84342)\\d{11}$";
      this.s75 = "^(356851|356852|404738|404739|456418|498451|515672|356850|517650|525998|622177|622277|628222|622500|628221|622176|622276|622228|625957|625958|625993|625831)\\d{10}$";
      this.s76 = "^(622520|622519)\\d{10}$";
      this.s77 = "^(620530)\\d{13}$";
      this.s79 = "^(622568|6858001|6858009|621462)\\d{13}$";
      this.s80 = "^(9111)\\d{15}$";
      this.s81 = "^(406365|406366|428911|436768|436769|436770|487013|491032|491033|491034|491035|491036|491037|491038|436771|518364|520152|520382|541709|541710|548844|552794|493427|622555|622556|622557|622558|622559|622560|528931|558894|625072|625071|628260|628259|625805|625806|625807|625808|625809|625810)\\d{10}$";
      this.s82 = "^(685800|6858000)\\d{13}$";
      this.s83 = "^(621268|622684|622884|621453)\\d{10}$";
      this.s84 = "^(603445|622467|940016|621463)\\d{13}$";
      this.s85 = "^(622449|940051)\\d{10}$";
      this.s86 = "^(622450|628204)\\d{10}$";
      this.s87 = "^(621977)\\d{10}$";
      this.s88 = "^(622868|622899|628255)\\d{10}$";
      this.s89 = "^(622877|622879|621775|623203)\\d{13}$";
      this.s90 = "^(603601|622137|622327|622340|622366)\\d{11}$";
      this.s91 = "^(628251|622651|625828)\\d{10}$";
      this.s92 = "^(621076|622173|622131|621579|622876)\\d{13}$";
      this.s93 = "^(504923|622422|622447|940076)\\d{10}$";
      this.s94 = "^(628210|622283|625902)\\d{10}$";
      this.s95 = "^(621777|622305|621259)\\d{10}$";
      this.s96 = "^(622303|628242|622595|622596)\\d{10}$";
      this.s97 = "^(621279|622281|622316|940022)\\d{10}$";
      this.s98 = "^(621418)\\d{13}$";
      this.s99 = "^(625903|622778|628207|512431|520194|622282|622318)\\d{10}$";
      this.s100 = "^(625903|622778|628207|512431|520194|622282|622318)\\d{10}$";
      this.s101 = "^(522001|622163|622853|628203|622851|622852)\\d{10}$";
      this.s102 = "^(620088|621068|622138|621066|621560)\\d{13}$";
      this.s103 = "^(625526|625186|628336)\\d{10}$";
      this.s104 = "^(622946)\\d{10}$";
      this.s105 = "^(622406|621442)\\d{11}$";
      this.s106 = "^(622407|621443)\\d{13}$";
      this.s107 = "^(622360|622361|625034|625096|625098)\\d{10}$";
      this.s108 = "^(622948|621740|622942|622994)\\d{10}$";
      this.s109 = "^(622482|622483|622484)\\d{10}$";
      this.s110 = "^(621062|621063)\\d{10}$";
      this.s111 = "^(625076|625077|625074|625075|622371|625091)\\d{10}$";
      this.s112 = "^(622933|622938|623031|622943|621411)\\d{13}$";
      this.s113 = "^(622372|622471|622472|622265|622266|625972|625973)\\d{10}$";
      this.s114 = "^(622365)\\d{11}$";
      this.s115 = "^(621469|621625)\\d{13}$";
      this.s116 = "^(622128|622129|623035)\\d{10}$";
      this.s117 = "^(909810|940035|621522|622439)\\d{12}$";
      this.s118 = "^(622328|940062|623038)\\d{13}$";
      this.s119 = "^(625288|625888)\\d{10}$";
      this.s120 = "^(622333|940050)\\d{10}$";
      this.s121 = "^(621439|623010)\\d{13}$";
      this.s122 = "^(622888)\\d{10}$";
      this.s123 = "^(622302)\\d{10}$";
      this.s124 = "^(622477|622509|622510|622362|621018|621518)\\d{13}$";
      this.s125 = "^(622297|621277)\\d{10}$";
      this.s126 = "^(622375|622489)\\d{11}$";
      this.s127 = "^(622293|622295|622296|622373|622451|622294|625940)\\d{10}$";
      this.s128 = "^(622871|622958|622963|622957|622861|622932|622862|621298)\\d{10}$";
      this.s129 = "^(622798|625010|622775|622785)\\d{10}$";
      this.s130 = "^(621016|621015)\\d{13}$";
      this.s131 = "^(622487|622490|622491|622492)\\d{10}$";
      this.s132 = "^(622487|622490|622491|622492|621744|621745|621746|621747)\\d{11}$";
      this.s133 = "^(623078)\\d{13}$";
      this.s134 = "^(622384|940034)\\d{11}$";
      this.s135 = "^(940015|622331)\\d{12}$";
      this.s136 = "^(6091201)\\d{11}$";
      this.s137 = "^(622426|628205)\\d{10}$";
      this.s138 = "^(621019|622309|621019)\\d{13}$";
      this.s139 = "^(6223091100|6223092900|6223093310|6223093320|6223093330|6223093370|6223093380|6223096510|6223097910)\\d{9}$";
      this.s140 = "^(621213|621289|621290|621291|621292|621042|621743)\\d{13}$";
      this.s141 = "^(623041|622351)\\d{10}$";
      this.s142 = "^(625046|625044|625058|622349|622350)\\d{10}$";
      this.s143 = "^(620208|620209|625093|625095)\\d{10}$";
      this.s144 = "^(622393|940023)\\d{10}$";
      this.s145 = "^(6886592)\\d{11}$";
      this.s146 = "^(623019|621600|)\\d{13}$";
      this.s147 = "^(622388)\\d{10}$";
      this.s148 = "^(621267|623063)\\d{12}$";
      this.s149 = "^(620043|)\\d{12}$";
      this.s150 = "^(622865|623131)\\d{13}$";
      this.s151 = "^(940012)\\d{10}$";
      this.s152 = "^(622178|622179|628358)\\d{10}$";
      this.s153 = "^(990027)\\d{12}$";
      this.s154 = "^(622325|623105|623029)\\d{10}$";
      this.s155 = "^(566666)\\d{12}$";
      this.s156 = "^(622455|940039)\\d{13}$";
      this.s157 = "^(623108|623081)\\d{10}$";
      this.s158 = "^(622466|628285)\\d{10}$";
      this.s159 = "^(603708)\\d{11}$";
      this.s160 = "^(622993|623069|623070|623172|623173)\\d{13}$";
      this.s161 = "^(622383|622385|628299)\\d{10}$";
      this.s162 = "^(622498|622499|623000|940046)\\d{13}$";
      this.s163 = "^(622921|628321)\\d{10}$";
      this.s164 = "^(621751|622143|940001|621754)\\d{13}$";
      this.s165 = "^(622476|628278)\\d{10}$";
      this.s166 = "^(622486)\\d{10}$";
      this.s167 = "^(603602|623026|623086)\\d{12}$";
      this.s168 = "^(628291)\\d{10}$";
      this.s169 = "^(622152|622154|622996|622997|940027|622153|622135|621482|621532)\\d{13}$";
      this.s170 = "^(622442)\\d{11}$";
      this.s171 = "^(940053)\\d{12}$";
      this.s172 = "^(622442|623099)\\d{13}$";
      this.s173 = "^(622421)\\d{13}$";
      this.s174 = "^(940056)\\d{11}$";
      this.s175 = "^(96828)\\d{11}$";
      this.s176 = "^(621529|622429|621417|623089|623200)\\d{13}$";
      this.s177 = "^(628214|625529|622428)\\d{10}$";
      this.s178 = "^(9896)\\d{12}$";
      this.s179 = "^(622134|940018|623016)\\d{10}$";
      this.s180 = "^(621577|622425)\\d{13}$";
      this.s181 = "^(940049)\\d{12}$";
      this.s182 = "^(622425)\\d{11}$";
      this.s183 = "^(622139|940040|628263)\\d{10}$";
      this.s184 = "^(621242|621538|621496)\\d{13}$";
      this.s185 = "^(621252|622146|940061|628239)\\d{10}$";
      this.s186 = "^(621419|623170)\\d{13}$";
      this.s187 = "^(62249802|94004602)\\d{11}$";
      this.s188 = "^(621237|623003)\\d{13}$";
      this.s189 = "^(622310|940068)\\d{11}$";
      this.s190 = "^(622817|628287|625959)\\d{10}$";
      this.s191 = "^(62536601)\\d{8}$";
      this.s192 = "^(622427)\\d{10}$";
      this.s193 = "^(940069)\\d{11}$";
      this.s194 = "^(623039)\\d{13}$";
      this.s195 = "^(622321|628273)\\d{10}$";
      this.s196 = "^(625001)\\d{10}$";
      this.s197 = "^(694301)\\d{12}$";
      this.s198 = "^(940071|622368|621446)\\d{13}$";
      this.s199 = "^(625901|622898|622900|628281|628282|622806|628283)\\d{10}$";
      this.s200 = "^(620519)\\d{13}$";
      this.s201 = "^(683970|940074)\\d{12}$";
      this.s202 = "^(622370)\\d{13}$";
      this.s203 = "^(621437)\\d{13}$";
      this.s204 = "^(628319)\\d{10}$";
      this.s205 = "^(622336|621760)\\d{11}$";
      this.s206 = "^(622165)\\d{10}$";
      this.s207 = "^(622315|625950|628295)\\d{10}$";
      this.s208 = "^(621037|621097|621588|622977)\\d{13}$";
      this.s209 = "^(62321601)\\d{11}$";
      this.s210 = "^(622860)\\d{10}$";
      this.s211 = "^(622644|628333)\\d{10}$";
      this.s212 = "^(622478|940013|621495)\\d{10}$";
      this.s213 = "^(625500)\\d{10}$";
      this.s214 = "^(622611|622722|628211|625989)\\d{10}$";
      this.s215 = "^(622717)\\d{10}$";
      this.s216 = "^(628275|622565|622287)\\d{10}$";
      this.s217 = "^(622147|621633)\\d{13}$";
      this.s218 = "^(628252)\\d{10}$";
      this.s219 = "^(623001)\\d{10}$";
      this.s220 = "^(628227)\\d{10}$";
      this.s221 = "^(621456)\\d{11}$";
      this.s222 = "^(621562)\\d{13}$";
      this.s223 = "^(628219)\\d{10}$";
      this.s224 = "^(621037|621097|621588|622977)\\d{13}$";
      this.s225 = "^(62321601)\\d{11}$";
      this.s226 = "^(622475|622860)\\d{10}$";
      this.s227 = "^(625588)\\d{10}$";
      this.s228 = "^(622270|628368|625090|622644|628333)\\d{10}$";
      this.s229 = "^(623088)\\d{13}$";
      this.s230 = "^(622829|628301|622808|628308)\\d{10}$";
      this.s231 = "^(622127|622184|621701|621251|621589|623036)\\d{13}$";
      this.s232 = "^(628232|622802|622290)\\d{10}$";
      this.s233 = "^(622531|622329)\\d{13}$";
      this.s234 = "^(622829|628301)\\d{10}$";
      this.s235 = "^(621578|623066|622452|622324)\\d{13}$";
      this.s236 = "^(622815|622816|628226)\\d{10}$";
      this.s237 = "^(622906|628386|625519|625506)\\d{10}$";
      this.s238 = "^(621592)\\d{10}$";
      this.s239 = "^(628392)\\d{10}$";
      this.s240 = "^(621748)\\d{13}$";
      this.s241 = "^(628271)\\d{10}$";
      this.s242 = "^(621366|621388)\\d{13}$";
      this.s243 = "^(628328)\\d{10}$";
      this.s244 = "^(621239|623068)\\d{13}$";
      this.s245 = "^(621653004)\\d{10}$";
      this.s246 = "^(622169|621519|621539|623090)\\d{13}$";
      this.s247 = "^(621238|620528)\\d{13}$";
      this.s248 = "^(628382|625158)\\d{10}$";
      this.s249 = "^(621004)\\d{12}$";
      this.s250 = "^(628217)\\d{10}$";
      this.s251 = "^(621416)\\d{10}$";
      this.s252 = "^(628217)\\d{10}$";
      this.s253 = "^(622937)\\d{13}$";
      this.s254 = "^(628397)\\d{10}$";
      this.s254 = "^(628397)\\d{10}$";
      this.s255 = "^(622469|628307)\\d{10}$";
      this.s256 = "^(622292|622291|621412)\\d{12}$";
      this.s257 = "^(622880|622881)\\d{10}$";
      this.s258 = "^(62829)\\d{10}$";
      this.s259 = "^(623102)\\d{10}$";
      this.s260 = "^(628234)\\d{10}$";
      this.s261 = "^(628306)\\d{10}$";
      this.s262 = "^(622391|940072)\\d{10}$";
      this.s263 = "^(628391)\\d{10}$";
      this.s264 = "^(622967|940073)\\d{13}$";
      this.s265 = "^(628233)\\d{10}$";
      this.s266 = "^(628257)\\d{10}$";
      this.s267 = "^(621269|622275)\\d{10}$";
      this.s268 = "^(940006)\\d{11}$";
      this.s269 = "^(628305)\\d{11}$";
      this.s270 = "^(622133|621735)\\d{13}$";
      this.s271 = "^(888)\\d{13}$";
      this.s272 = "^(628213)\\d{10}$";
      this.s273 = "^(622990|940003)\\d{11}$";
      this.s274 = "^(628261)\\d{10}$";
      this.s275 = "^(622311|940057)\\d{11}$";
      this.s276 = "^(628311)\\d{10}$";
      this.s277 = "^(622363|940048)\\d{13}$";
      this.s278 = "^(628270)\\d{10}$";
      this.s279 = "^(622398|940054)\\d{10}$";
      this.s280 = "^(940055)\\d{11}$";
      this.s281 = "^(622397)\\d{11}$";
      this.s282 = "^(603367|622878)\\d{12}$";
      this.s283 = "^(622397)\\d{11}$";
      this.s284 = "^(603506)\\d{13}$";
      this.s285 = "^(622399|940043)\\d{11}$";
      this.s286 = "^(622420|940041)\\d{11}$";
      this.s287 = "^(622338)\\d{13}$";
      this.s288 = "^(940032)\\d{10}$";
      this.s289 = "^(622394|940025)\\d{10}$";
      this.s290 = "^(621245)\\d{10}$";
      this.s291 = "^(621328)\\d{13}$";
      this.s292 = "^(621651)\\d{13}$";
      this.s293 = "^(621077)\\d{10}$";
      this.s294 = "^(622409|621441)\\d{13}$";
      this.s295 = "^(622410|621440)\\d{11}$";
      this.s296 = "^(622950|622951)\\d{10}$";
      this.s297 = "^(625026|625024|622376|622378|622377|625092)\\d{10}$";
      this.s298 = "^(622359|940066)\\d{13}$";
      this.s299 = "^(622886)\\d{10}$";
      this.s300 = "^(940008|622379)\\d{13}";
      this.s301 = "^(628379)\\d{10}$";
      this.s302 = "^(620011|620027|620031|620039|620103|620106|620120|620123|620125|620220|620278|620812|621006|621011|621012|621020|621023|621025|621027|621031|620132|621039|621078|621220|621003)\\d{10}$";
      this.s303 = "^(625003|625011|625012|625020|625023|625025|625027|625031|621032|625039|625078|625079|625103|625106|625006|625112|625120|625123|625125|625127|625131|625032|625139|625178|625179|625220|625320|625111|625132|625244)\\d{10}$";
      this.s304 = "^(622355|623042)\\d{10}$";
      this.s305 = "^(621043|621742)\\d{13}$";
      this.s306 = "^(622352|622353|625048|625053|625060)\\d{10}$";
      this.s307 = "^(620206|620207)\\d{10}$";
      this.s308 = "^(622547|622548|622546)\\d{13}$";
      this.s309 = "^(625198|625196|625147)\\d{10}$";
      this.s310 = "^(620072)\\d{13}$";
      this.s311 = "^(620204|620205)\\d{10}$";
      this.s312 = "^(621064|622941|622974)\\d{10}$";
      this.s313 = "^(622493)\\d{10}$";
      this.s314 = "^(621274|621324)\\d{13}$";
    };
    BankInfoBean.prototype.getBankName = function() {
      return new RegExp(this.s1).test(this.totalBankcode) || new RegExp(this.s2).test(this.totalBankcode) || new RegExp(this.s3).test(this.totalBankcode) ? "\u90ae\u50a8\u94f6\u884c" : new RegExp(this.s4).test(this.totalBankcode) || new RegExp(this.s5).test(this.totalBankcode) || new RegExp(this.s6).test(this.totalBankcode) || new RegExp(this.s7).test(this.totalBankcode) || new RegExp(this.s8).test(this.totalBankcode) || new RegExp(this.s9).test(this.totalBankcode) || new RegExp(this.s10).test(this.totalBankcode) || new RegExp(this.s11).test(this.totalBankcode) || new RegExp(this.s12).test(this.totalBankcode) || new RegExp(this.s13).test(this.totalBankcode) ? "\u5de5\u5546\u94f6\u884c" : new RegExp(this.s14).test(this.totalBankcode) || new RegExp(this.s15).test(this.totalBankcode) || new RegExp(this.s16).test(this.totalBankcode) || new RegExp(this.s17).test(this.totalBankcode) || new RegExp(this.s18).test(this.totalBankcode) ? "\u519c\u4e1a\u94f6\u884c" : new RegExp(this.s19).test(this.totalBankcode) || new RegExp(this.s20).test(this.totalBankcode) || new RegExp(this.s21).test(this.totalBankcode) || new RegExp(this.s22).test(this.totalBankcode) || new RegExp(this.s23).test(this.totalBankcode) || new RegExp(this.s24).test(this.totalBankcode) || new RegExp(this.s25).test(this.totalBankcode) ? "\u4e2d\u56fd\u94f6\u884c" : new RegExp(this.s26).test(this.totalBankcode) || new RegExp(this.s27).test(this.totalBankcode) || new RegExp(this.s28).test(this.totalBankcode) || new RegExp(this.s29).test(this.totalBankcode) || new RegExp(this.s30).test(this.totalBankcode) || new RegExp(this.s31).test(this.totalBankcode) || new RegExp(this.s32).test(this.totalBankcode) || new RegExp(this.s33).test(this.totalBankcode) ? "\u5efa\u8bbe\u94f6\u884c" : new RegExp(this.s34).test(this.totalBankcode) || new RegExp(this.s35).test(this.totalBankcode) || new RegExp(this.s36).test(this.totalBankcode) || new RegExp(this.s37).test(this.totalBankcode) || new RegExp(this.s38).test(this.totalBankcode) || new RegExp(this.s39).test(this.totalBankcode) || new RegExp(this.s40).test(this.totalBankcode) ? "\u4ea4\u901a\u94f6\u884c" : new RegExp(this.s41).test(this.totalBankcode) || new RegExp(this.s42).test(this.totalBankcode) || new RegExp(this.s43).test(this.totalBankcode) || new RegExp(this.s44).test(this.totalBankcode) || new RegExp(this.s45).test(this.totalBankcode) || new RegExp(this.s46).test(this.totalBankcode) ? "\u62db\u5546\u94f6\u884c" : new RegExp(this.s47).test(this.totalBankcode) || new RegExp(this.s48).test(this.totalBankcode) || new RegExp(this.s49).test(this.totalBankcode) ? "\u6c11\u751f\u94f6\u884c" : new RegExp(this.s50).test(this.totalBankcode) || new RegExp(this.s51).test(this.totalBankcode) || new RegExp(this.s52).test(this.totalBankcode) || new RegExp(this.s53).test(this.totalBankcode) || new RegExp(this.s54).test(this.totalBankcode) ? "\u5149\u5927\u94f6\u884c" : new RegExp(this.s55).test(this.totalBankcode) || new RegExp(this.s56).test(this.totalBankcode) || new RegExp(this.s57).test(this.totalBankcode) || new RegExp(this.s58).test(this.totalBankcode) ? "\u4e2d\u4fe1\u94f6\u884c" : new RegExp(this.s59).test(this.totalBankcode) || new RegExp(this.s60).test(this.totalBankcode) ? "\u534e\u590f\u94f6\u884c" : new RegExp(this.s61).test(this.totalBankcode) || new RegExp(this.s62).test(this.totalBankcode) || new RegExp(this.s63).test(this.totalBankcode) || new RegExp(this.s64).test(this.totalBankcode) ? "\u5e73\u5b89\u94f6\u884c" : new RegExp(this.s65).test(this.totalBankcode) || new RegExp(this.s66).test(this.totalBankcode) || new RegExp(this.s67).test(this.totalBankcode) || new RegExp(this.s68).test(this.totalBankcode) || new RegExp(this.s69).test(this.totalBankcode) ? "\u5174\u4e1a\u94f6\u884c" : new RegExp(this.s70).test(this.totalBankcode) || new RegExp(this.s71).test(this.totalBankcode) || new RegExp(this.s72).test(this.totalBankcode) ? "\u4e0a\u6d77\u94f6\u884c" : new RegExp(this.s73).test(this.totalBankcode) || new RegExp(this.s74).test(this.totalBankcode) || new RegExp(this.s75).test(this.totalBankcode) || new RegExp(this.s76).test(this.totalBankcode) || new RegExp(this.s77).test(this.totalBankcode) ? "\u6d66\u53d1\u94f6\u884c" : new RegExp(this.s79).test(this.totalBankcode) || new RegExp(this.s80).test(this.totalBankcode) || new RegExp(this.s81).test(this.totalBankcode) || new RegExp(this.s82).test(this.totalBankcode) ? "\u5e7f\u53d1\u94f6\u884c" : new RegExp(this.s83).test(this.totalBankcode) ? "\u6e24\u6d77\u94f6\u884c" : new RegExp(this.s84).test(this.totalBankcode) ? "\u5e7f\u5dde\u94f6\u884c" : new RegExp(this.s85).test(this.totalBankcode) || new RegExp(this.s86).test(this.totalBankcode) ? "\u91d1\u534e\u94f6\u884c" : new RegExp(this.s87).test(this.totalBankcode) || new RegExp(this.s88).test(this.totalBankcode) ? "\u6e29\u5dde\u94f6\u884c" : new RegExp(this.s89).test(this.totalBankcode) || new RegExp(this.s90).test(this.totalBankcode) || new RegExp(this.s91).test(this.totalBankcode) ? "\u5fbd\u5546\u94f6\u884c" : new RegExp(this.s92).test(this.totalBankcode) || new RegExp(this.s93).test(this.totalBankcode) || new RegExp(this.s94).test(this.totalBankcode) ? "\u6c5f\u82cf\u94f6\u884c" : new RegExp(this.s95).test(this.totalBankcode) || new RegExp(this.s96).test(this.totalBankcode) ? "\u5357\u4eac\u94f6\u884c" : new RegExp(this.s97).test(this.totalBankcode) || new RegExp(this.s98).test(this.totalBankcode) || new RegExp(this.s99).test(this.totalBankcode) ? "\u5b81\u6ce2\u94f6\u884c" : new RegExp(this.s100).test(this.totalBankcode) || new RegExp(this.s101).test(this.totalBankcode) ? "\u5317\u4eac\u94f6\u884c" : new RegExp(this.s102).test(this.totalBankcode) || new RegExp(this.s103).test(this.totalBankcode) ? "\u5317\u4eac\u519c\u6751\u5546\u4e1a\u94f6\u884c" : new RegExp(this.s104).test(this.totalBankcode) || new RegExp(this.s105).test(this.totalBankcode) || new RegExp(this.s106).test(this.totalBankcode) || new RegExp(this.s107).test(this.totalBankcode) ? "\u6c47\u4e30\u94f6\u884c" : new RegExp(this.s108).test(this.totalBankcode) || new RegExp(this.s109).test(this.totalBankcode) ? "\u6e23\u6253\u94f6\u884c" : new RegExp(this.s110).test(this.totalBankcode) || new RegExp(this.s111).test(this.totalBankcode) ? "\u82b1\u65d7\u94f6\u884c" : new RegExp(this.s112).test(this.totalBankcode) || new RegExp(this.s113).test(this.totalBankcode) || new RegExp(this.s114).test(this.totalBankcode) ? "\u4e1c\u4e9a\u94f6\u884c" : new RegExp(this.s115).test(this.totalBankcode) ? "\u5e7f\u4e1c\u534e\u5174\u94f6\u884c" : new RegExp(this.s116).test(this.totalBankcode) ? "\u6df1\u5733\u519c\u6751\u5546\u4e1a\u94f6\u884c" : new RegExp(this.s117).test(this.totalBankcode) ? "\u5e7f\u5dde\u519c\u6751\u5546\u4e1a\u94f6\u884c" : new RegExp(this.s118).test(this.totalBankcode) || new RegExp(this.s119).test(this.totalBankcode) ? "\u4e1c\u839e\u519c\u6751\u5546\u4e1a\u94f6\u884c" : new RegExp(this.s120).test(this.totalBankcode) || new RegExp(this.s121).test(this.totalBankcode) || new RegExp(this.s122).test(this.totalBankcode) ? "\u4e1c\u839e\u5e02\u5546\u4e1a\u94f6\u884c" : new RegExp(this.s123).test(this.totalBankcode) || new RegExp(this.s124).test(this.totalBankcode) ? "\u5e7f\u4e1c\u7701\u519c\u6751\u4fe1\u7528\u793e\u8054\u5408\u793e" : new RegExp(this.s125).test(this.totalBankcode) || new RegExp(this.s126).test(this.totalBankcode) || new RegExp(this.s127).test(this.totalBankcode) ? "\u5927\u65b0\u94f6\u884c" : new RegExp(this.s128).test(this.totalBankcode) || new RegExp(this.s129).test(this.totalBankcode) ? "\u6c38\u4eab\u94f6\u884c" : new RegExp(this.s130).test(this.totalBankcode) || new RegExp(this.s131).test(this.totalBankcode) || new RegExp(this.s132).test(this.totalBankcode) ? "\u661f\u5c55\u94f6\u884c\u9999\u6e2f\u6709\u9650\u516c\u53f8" : new RegExp(this.s133).test(this.totalBankcode) || new RegExp(this.s134).test(this.totalBankcode) ? "\u6052\u4e30\u94f6\u884c" : new RegExp(this.s136).test(this.totalBankcode) || new RegExp(this.s135).test(this.totalBankcode) | new RegExp(this.s137).test(this.totalBankcode) ? "\u5929\u6d25\u5e02\u5546\u4e1a\u94f6\u884c" : new RegExp(this.s138).test(this.totalBankcode) || new RegExp(this.s139).test(this.totalBankcode) ? "\u6d59\u5546\u94f6\u884c" : new RegExp(this.s140).test(this.totalBankcode) || new RegExp(this.s141).test(this.totalBankcode) || new RegExp(this.s142).test(this.totalBankcode) || new RegExp(this.s143).test(this.totalBankcode) ? "\u5357\u6d0b\u5546\u4e1a\u94f6\u884c" : new RegExp(this.s144).test(this.totalBankcode) || new RegExp(this.s145).test(this.totalBankcode) || new RegExp(this.s146).test(this.totalBankcode) ? "\u53a6\u95e8\u94f6\u884c" : new RegExp(this.s147).test(this.totalBankcode) || new RegExp(this.s148).test(this.totalBankcode) || new RegExp(this.s149).test(this.totalBankcode) ? "\u798f\u5efa\u6d77\u5ce1\u94f6\u884c" : new RegExp(this.s150).test(this.totalBankcode) || new RegExp(this.s151).test(this.totalBankcode) || new RegExp(this.s152).test(this.totalBankcode) ? "\u5409\u6797\u94f6\u884c" : new RegExp(this.s153).test(this.totalBankcode) || new RegExp(this.s154).test(this.totalBankcode) ? "\u6c49\u53e3\u94f6\u884c" : new RegExp(this.s155).test(this.totalBankcode) || new RegExp(this.s156).test(this.totalBankcode) || new RegExp(this.s157).test(this.totalBankcode) || new RegExp(this.s158).test(this.totalBankcode) ? "\u76db\u4eac\u94f6\u884c" : new RegExp(this.s159).test(this.totalBankcode) || new RegExp(this.s160).test(this.totalBankcode) || new RegExp(this.s161).test(this.totalBankcode) ? "\u5927\u8fde\u94f6\u884c" : new RegExp(this.s162).test(this.totalBankcode) || new RegExp(this.s163).test(this.totalBankcode) ? "\u6cb3\u5317\u94f6\u884c" : new RegExp(this.s164).test(this.totalBankcode) || new RegExp(this.s165).test(this.totalBankcode) ? "\u4e4c\u9c81\u6728\u9f50\u5546\u4e1a\u94f6\u884c" : new RegExp(this.s166).test(this.totalBankcode) || new RegExp(this.s167).test(this.totalBankcode) || new RegExp(this.s168).test(this.totalBankcode) ? "\u7ecd\u5174\u94f6\u884c" : new RegExp(this.s169).test(this.totalBankcode) ? "\u6210\u90fd\u5546\u4e1a\u94f6\u884c" : new RegExp(this.s170).test(this.totalBankcode) || new RegExp(this.s171).test(this.totalBankcode) || new RegExp(this.s172).test(this.totalBankcode) ? "\u629a\u987a\u94f6\u884c" : new RegExp(this.s173).test(this.totalBankcode) || new RegExp(this.s174).test(this.totalBankcode) || new RegExp(this.s175).test(this.totalBankcode) ? "\u90d1\u5dde\u94f6\u884c" : new RegExp(this.s176).test(this.totalBankcode) || new RegExp(this.s177).test(this.totalBankcode) ? "\u5b81\u590f\u94f6\u884c" : new RegExp(this.s178).test(this.totalBankcode) || new RegExp(this.s179).test(this.totalBankcode) ? "\u91cd\u5e86\u94f6\u884c" : new RegExp(this.s180).test(this.totalBankcode) || new RegExp(this.s181).test(this.totalBankcode) || new RegExp(this.s182).test(this.totalBankcode) ? "\u54c8\u5c14\u6ee8\u94f6\u884c" : new RegExp(this.s183).test(this.totalBankcode) || new RegExp(this.s184).test(this.totalBankcode) ? "\u5170\u5dde\u94f6\u884c" : new RegExp(this.s185).test(this.totalBankcode) || new RegExp(this.s186).test(this.totalBankcode) ? "\u9752\u5c9b\u94f6\u884c" : new RegExp(this.s187).test(this.totalBankcode) || new RegExp(this.s188).test(this.totalBankcode) ? "\u79e6\u7687\u5c9b\u5e02\u5546\u4e1a\u94f6\u884c" : new RegExp(this.s189).test(this.totalBankcode) || new RegExp(this.s190).test(this.totalBankcode) || new RegExp(this.s191).test(this.totalBankcode) ? "\u9752\u6d77\u94f6\u884c" : new RegExp(this.s192).test(this.totalBankcode) || new RegExp(this.s193).test(this.totalBankcode) || new RegExp(this.s194).test(this.totalBankcode) || new RegExp(this.s195).test(this.totalBankcode) || new RegExp(this.s196).test(this.totalBankcode) ? "\u53f0\u5dde\u94f6\u884c" : new RegExp(this.s197).test(this.totalBankcode) || new RegExp(this.s198).test(this.totalBankcode) || new RegExp(this.s199).test(this.totalBankcode) || new RegExp(this.s200).test(this.totalBankcode) ? "\u957f\u6c99\u94f6\u884c" : new RegExp(this.s201).test(this.totalBankcode) || new RegExp(this.s202).test(this.totalBankcode) || new RegExp(this.s203).test(this.totalBankcode) || new RegExp(this.s204).test(this.totalBankcode) ? "\u6cc9\u5dde\u94f6\u884c" : new RegExp(this.s205).test(this.totalBankcode) || new RegExp(this.s206).test(this.totalBankcode) || new RegExp(this.s207).test(this.totalBankcode) ? "\u5305\u5546\u94f6\u884c" : new RegExp(this.s208).test(this.totalBankcode) || new RegExp(this.s209).test(this.totalBankcode) || new RegExp(this.s210).test(this.totalBankcode) || new RegExp(this.s211).test(this.totalBankcode) ? "\u9f99\u6c5f\u94f6\u884c" : new RegExp(this.s212).test(this.totalBankcode) || new RegExp(this.s213).test(this.totalBankcode) || new RegExp(this.s214).test(this.totalBankcode) ? "\u4e0a\u6d77\u519c\u5546\u94f6\u884c" : new RegExp(this.s215).test(this.totalBankcode) || new RegExp(this.s216).test(this.totalBankcode) ? "\u6d59\u6c5f\u6cf0\u9686\u5546\u4e1a\u94f6\u884c" : new RegExp(this.s217).test(this.totalBankcode) || new RegExp(this.s218).test(this.totalBankcode) ? "\u5185\u8499\u53e4\u94f6\u884c" : new RegExp(this.s219).test(this.totalBankcode) || new RegExp(this.s220).test(this.totalBankcode) ? "\u5e7f\u897f\u5317\u90e8\u6e7e\u94f6\u884c" : new RegExp(this.s221).test(this.totalBankcode) || new RegExp(this.s222).test(this.totalBankcode) || new RegExp(this.s223).test(this.totalBankcode) ? "\u6842\u6797\u94f6\u884c" : new RegExp(this.s224).test(this.totalBankcode) || new RegExp(this.s225).test(this.totalBankcode) || new RegExp(this.s226).test(this.totalBankcode) || new RegExp(this.s227).test(this.totalBankcode) || new RegExp(this.s228).test(this.totalBankcode) ? "\u9f99\u6c5f\u94f6\u884c" : new RegExp(this.s229).test(this.totalBankcode) || new RegExp(this.s230).test(this.totalBankcode) ? "\u6210\u90fd\u519c\u6751\u5546\u4e1a\u94f6\u884c" : new RegExp(this.s231).test(this.totalBankcode) || new RegExp(this.s232).test(this.totalBankcode) ? "\u798f\u5efa\u7701\u519c\u6751\u4fe1\u7528\u793e\u8054\u5408\u793e" : new RegExp(this.s233).test(this.totalBankcode) || new RegExp(this.s234).test(this.totalBankcode) ? "\u5929\u6d25\u519c\u6751\u5546\u4e1a\u94f6\u884c" : new RegExp(this.s235).test(this.totalBankcode) || new RegExp(this.s236).test(this.totalBankcode) ? "\u6c5f\u82cf\u7701\u519c\u6751\u4fe1\u7528\u793e\u8054\u5408\u793e" : new RegExp(this.s237).test(this.totalBankcode) ? "\u6e56\u5357\u7701\u519c\u6751\u4fe1\u7528\u793e\u8054\u5408\u793e" : new RegExp(this.s238).test(this.totalBankcode) || new RegExp(this.s239).test(this.totalBankcode) ? "\u6c5f\u897f\u7701\u519c\u6751\u4fe1\u7528\u793e\u8054\u5408\u793e" : new RegExp(this.s240).test(this.totalBankcode) || new RegExp(this.s241).test(this.totalBankcode) ? "\u5546\u4e18\u5e02\u5546\u4e1a\u94f6\u884c" : new RegExp(this.s242).test(this.totalBankcode) || new RegExp(this.s243).test(this.totalBankcode) ? "\u534e\u878d\u6e58\u6c5f\u94f6\u884c" : new RegExp(this.s244).test(this.totalBankcode) ? "\u8861\u6c34\u5e02\u5546\u4e1a\u94f6\u884c" : new RegExp(this.s245).test(this.totalBankcode) ? "\u91cd\u5e86\u5357\u5ddd\u77f3\u94f6\u6751\u9547\u94f6\u884c" : new RegExp(this.s246).test(this.totalBankcode) ? "\u6e56\u5357\u7701\u519c\u6751\u4fe1\u7528\u793e\u8054\u5408\u793e" : new RegExp(this.s247).test(this.totalBankcode) ? "\u90a2\u53f0\u94f6\u884c" : new RegExp(this.s248).test(this.totalBankcode) ? "\u4e34\u6c7e\u5e02\u5c27\u90fd\u533a\u519c\u6751\u4fe1\u7528\u5408\u4f5c\u8054\u793e" : new RegExp(this.s249).test(this.totalBankcode) || new RegExp(this.s250).test(this.totalBankcode) ? "\u4e1c\u8425\u94f6\u884c" : new RegExp(this.s251).test(this.totalBankcode) || new RegExp(this.s252).test(this.totalBankcode) ? "\u4e0a\u9976\u94f6\u884c" : new RegExp(this.s253).test(this.totalBankcode) || new RegExp(this.s254).test(this.totalBankcode) ? "\u5fb7\u5dde\u94f6\u884c" : new RegExp(this.s254).test(this.totalBankcode) ? "\u627f\u5fb7\u94f6\u884c" : new RegExp(this.s255).test(this.totalBankcode) ? "\u4e91\u5357\u519c\u6751\u4fe1\u7528\u793e" : new RegExp(this.s257).test(this.totalBankcode) || new RegExp(this.s258).test(this.totalBankcode) || new RegExp(this.s256).test(this.totalBankcode) ? "\u67f3\u5dde\u94f6\u884c" : new RegExp(this.s259).test(this.totalBankcode) || new RegExp(this.s260).test(this.totalBankcode) ? "\u5a01\u6d77\u5e02\u5546\u4e1a\u94f6\u884c" : new RegExp(this.s261).test(this.totalBankcode) ? "\u6e56\u5dde\u94f6\u884c" : new RegExp(this.s262).test(this.totalBankcode) || new RegExp(this.s263).test(this.totalBankcode) ? "\u6f4d\u574a\u94f6\u884c" : new RegExp(this.s264).test(this.totalBankcode) || new RegExp(this.s265).test(this.totalBankcode) ? "\u8d63\u5dde\u94f6\u884c" : new RegExp(this.s266).test(this.totalBankcode) ? "\u65e5\u7167\u94f6\u884c" : new RegExp(this.s267).test(this.totalBankcode) || new RegExp(this.s268).test(this.totalBankcode) || new RegExp(this.s269).test(this.totalBankcode) ? "\u5357\u660c\u94f6\u884c" : new RegExp(this.s270).test(this.totalBankcode) || new RegExp(this.s271).test(this.totalBankcode) || new RegExp(this.s272).test(this.totalBankcode) ? "\u8d35\u9633\u94f6\u884c" : new RegExp(this.s273).test(this.totalBankcode) || new RegExp(this.s274).test(this.totalBankcode) ? "\u9526\u5dde\u94f6\u884c" : new RegExp(this.s275).test(this.totalBankcode) || new RegExp(this.s276).test(this.totalBankcode) ? "\u9f50\u5546\u94f6\u884c" : new RegExp(this.s277).test(this.totalBankcode) || new RegExp(this.s278).test(this.totalBankcode) ? "\u73e0\u6d77\u534e\u6da6\u94f6\u884c" : new RegExp(this.s279).test(this.totalBankcode) ? "\u846b\u82a6\u5c9b\u5e02\u5546\u4e1a\u94f6\u884c" : new RegExp(this.s280).test(this.totalBankcode) || new RegExp(this.s281).test(this.totalBankcode) ? "\u5b9c\u660c\u5e02\u5546\u4e1a\u94f6\u884c" : new RegExp(this.s282).test(this.totalBankcode) || new RegExp(this.s283).test(this.totalBankcode) ? "\u676d\u5dde\u5546\u4e1a\u94f6\u884c" : new RegExp(this.s284).test(this.totalBankcode) ? "\u82cf\u5dde\u5e02\u5546\u4e1a\u94f6\u884c" : new RegExp(this.s285).test(this.totalBankcode) ? "\u8fbd\u9633\u94f6\u884c" : new RegExp(this.s286).test(this.totalBankcode) ? "\u6d1b\u9633\u94f6\u884c" : new RegExp(this.s287).test(this.totalBankcode) || new RegExp(this.s288).test(this.totalBankcode) ? "\u7126\u4f5c\u5e02\u5546\u4e1a\u94f6\u884c" : new RegExp(this.s289).test(this.totalBankcode) ? "\u9547\u6c5f\u5e02\u5546\u4e1a\u94f6\u884c" : new RegExp(this.s290).test(this.totalBankcode) ? "\u6cd5\u56fd\u5174\u4e1a\u94f6\u884c" : new RegExp(this.s291).test(this.totalBankcode) ? "\u5927\u534e\u94f6\u884c" : new RegExp(this.s292).test(this.totalBankcode) ? "\u4f01\u4e1a\u94f6\u884c" : new RegExp(this.s293).test(this.totalBankcode) ? "\u534e\u4fa8\u94f6\u884c" : new RegExp(this.s294).test(this.totalBankcode) || new RegExp(this.s295).test(this.totalBankcode) || new RegExp(this.s296).test(this.totalBankcode) || new RegExp(this.s297).test(this.totalBankcode) ? "\u6052\u751f\u94f6\u884c" : new RegExp(this.s298).test(this.totalBankcode) ? "\u4e34\u6c82\u5546\u4e1a\u94f6\u884c" : new RegExp(this.s299).test(this.totalBankcode) ? "\u70df\u53f0\u5546\u4e1a\u94f6\u884c" : new RegExp(this.s300).test(this.totalBankcode) || new RegExp(this.s301).test(this.totalBankcode) ? "\u9f50\u9c81\u94f6\u884c" : new RegExp(this.s302).test(this.totalBankcode) || new RegExp(this.s303).test(this.totalBankcode) ? "BC\u5361\u516c\u53f8" : new RegExp(this.s304).test(this.totalBankcode) || new RegExp(this.s305).test(this.totalBankcode) || new RegExp(this.s306).test(this.totalBankcode) || new RegExp(this.s307).test(this.totalBankcode) ? "\u96c6\u53cb\u94f6\u884c" : new RegExp(this.s308).test(this.totalBankcode) || new RegExp(this.s309).test(this.totalBankcode) || new RegExp(this.s310).test(this.totalBankcode) || new RegExp(this.s311).test(this.totalBankcode) ? "\u5927\u4e30\u94f6\u884c" : new RegExp(this.s312).test(this.totalBankcode) || new RegExp(this.s313).test(this.totalBankcode) ? "AEON\u4fe1\u8d37\u8d22\u52a1\u4e9a\u6d32\u6709\u9650\u516c\u53f8" : new RegExp(this.s314).test(this.totalBankcode) ? "\u6fb3\u95e8BDA" : "\u672a\u77e5";
    };
    module.exports = BankInfoBean;
    cc._RF.pop();
  }, {} ],
  CryptoJS: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "8a8e7LR6UlMzZV6C5z19ALg", "CryptoJS");
    "use strict";
    var CryptoJS = CryptoJS || function(u, p) {
      var d = {}, l = d.lib = {}, s = function s() {}, t = l.Base = {
        extend: function extend(a) {
          s.prototype = this;
          var c = new s();
          a && c.mixIn(a);
          c.hasOwnProperty("init") || (c.init = function() {
            c.$super.init.apply(this, arguments);
          });
          c.init.prototype = c;
          c.$super = this;
          return c;
        },
        create: function create() {
          var a = this.extend();
          a.init.apply(a, arguments);
          return a;
        },
        init: function init() {},
        mixIn: function mixIn(a) {
          for (var c in a) a.hasOwnProperty(c) && (this[c] = a[c]);
          a.hasOwnProperty("toString") && (this.toString = a.toString);
        },
        clone: function clone() {
          return this.init.prototype.extend(this);
        }
      }, r = l.WordArray = t.extend({
        init: function init(a, c) {
          a = this.words = a || [];
          this.sigBytes = c != p ? c : 4 * a.length;
        },
        toString: function toString(a) {
          return (a || v).stringify(this);
        },
        concat: function concat(a) {
          var c = this.words, e = a.words, j = this.sigBytes;
          a = a.sigBytes;
          this.clamp();
          if (j % 4) for (var k = 0; k < a; k++) c[j + k >>> 2] |= (e[k >>> 2] >>> 24 - k % 4 * 8 & 255) << 24 - (j + k) % 4 * 8; else if (65535 < e.length) for (k = 0; k < a; k += 4) c[j + k >>> 2] = e[k >>> 2]; else c.push.apply(c, e);
          this.sigBytes += a;
          return this;
        },
        clamp: function clamp() {
          var a = this.words, c = this.sigBytes;
          a[c >>> 2] &= 4294967295 << 32 - c % 4 * 8;
          a.length = u.ceil(c / 4);
        },
        clone: function clone() {
          var a = t.clone.call(this);
          a.words = this.words.slice(0);
          return a;
        },
        random: function random(a) {
          for (var c = [], e = 0; e < a; e += 4) c.push(4294967296 * u.random() | 0);
          return new r.init(c, a);
        }
      }), w = d.enc = {}, v = w.Hex = {
        stringify: function stringify(a) {
          var c = a.words;
          a = a.sigBytes;
          for (var e = [], j = 0; j < a; j++) {
            var k = c[j >>> 2] >>> 24 - j % 4 * 8 & 255;
            e.push((k >>> 4).toString(16));
            e.push((15 & k).toString(16));
          }
          return e.join("");
        },
        parse: function parse(a) {
          for (var c = a.length, e = [], j = 0; j < c; j += 2) e[j >>> 3] |= parseInt(a.substr(j, 2), 16) << 24 - j % 8 * 4;
          return new r.init(e, c / 2);
        }
      }, b = w.Latin1 = {
        stringify: function stringify(a) {
          var c = a.words;
          a = a.sigBytes;
          for (var e = [], j = 0; j < a; j++) e.push(String.fromCharCode(c[j >>> 2] >>> 24 - j % 4 * 8 & 255));
          return e.join("");
        },
        parse: function parse(a) {
          for (var c = a.length, e = [], j = 0; j < c; j++) e[j >>> 2] |= (255 & a.charCodeAt(j)) << 24 - j % 4 * 8;
          return new r.init(e, c);
        }
      }, x = w.Utf8 = {
        stringify: function stringify(a) {
          try {
            return decodeURIComponent(escape(b.stringify(a)));
          } catch (c) {
            throw Error("Malformed UTF-8 data");
          }
        },
        parse: function parse(a) {
          return b.parse(unescape(encodeURIComponent(a)));
        }
      }, q = l.BufferedBlockAlgorithm = t.extend({
        reset: function reset() {
          this._data = new r.init();
          this._nDataBytes = 0;
        },
        _append: function _append(a) {
          "string" == typeof a && (a = x.parse(a));
          this._data.concat(a);
          this._nDataBytes += a.sigBytes;
        },
        _process: function _process(a) {
          var c = this._data, e = c.words, j = c.sigBytes, k = this.blockSize, b = j / (4 * k), b = a ? u.ceil(b) : u.max((0 | b) - this._minBufferSize, 0);
          a = b * k;
          j = u.min(4 * a, j);
          if (a) {
            for (var q = 0; q < a; q += k) this._doProcessBlock(e, q);
            q = e.splice(0, a);
            c.sigBytes -= j;
          }
          return new r.init(q, j);
        },
        clone: function clone() {
          var a = t.clone.call(this);
          a._data = this._data.clone();
          return a;
        },
        _minBufferSize: 0
      });
      l.Hasher = q.extend({
        cfg: t.extend(),
        init: function init(a) {
          this.cfg = this.cfg.extend(a);
          this.reset();
        },
        reset: function reset() {
          q.reset.call(this);
          this._doReset();
        },
        update: function update(a) {
          this._append(a);
          this._process();
          return this;
        },
        finalize: function finalize(a) {
          a && this._append(a);
          return this._doFinalize();
        },
        blockSize: 16,
        _createHelper: function _createHelper(a) {
          return function(b, e) {
            return new a.init(e).finalize(b);
          };
        },
        _createHmacHelper: function _createHmacHelper(a) {
          return function(b, e) {
            return new n.HMAC.init(a, e).finalize(b);
          };
        }
      });
      var n = d.algo = {};
      return d;
    }(Math);
    (function() {
      var u = CryptoJS, p = u.lib.WordArray;
      u.enc.Base64 = {
        stringify: function stringify(d) {
          var l = d.words, p = d.sigBytes, t = this._map;
          d.clamp();
          d = [];
          for (var r = 0; r < p; r += 3) for (var w = (l[r >>> 2] >>> 24 - r % 4 * 8 & 255) << 16 | (l[r + 1 >>> 2] >>> 24 - (r + 1) % 4 * 8 & 255) << 8 | l[r + 2 >>> 2] >>> 24 - (r + 2) % 4 * 8 & 255, v = 0; 4 > v && r + .75 * v < p; v++) d.push(t.charAt(w >>> 6 * (3 - v) & 63));
          if (l = t.charAt(64)) for (;d.length % 4; ) d.push(l);
          return d.join("");
        },
        parse: function parse(d) {
          var l = d.length, s = this._map, t = s.charAt(64);
          t && (t = d.indexOf(t), -1 != t && (l = t));
          for (var t = [], r = 0, w = 0; w < l; w++) if (w % 4) {
            var v = s.indexOf(d.charAt(w - 1)) << w % 4 * 2, b = s.indexOf(d.charAt(w)) >>> 6 - w % 4 * 2;
            t[r >>> 2] |= (v | b) << 24 - r % 4 * 8;
            r++;
          }
          return p.create(t, r);
        },
        _map: "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/="
      };
    })();
    (function(u) {
      function p(b, n, a, c, e, j, k) {
        b = b + (n & a | ~n & c) + e + k;
        return (b << j | b >>> 32 - j) + n;
      }
      function d(b, n, a, c, e, j, k) {
        b = b + (n & c | a & ~c) + e + k;
        return (b << j | b >>> 32 - j) + n;
      }
      function l(b, n, a, c, e, j, k) {
        b = b + (n ^ a ^ c) + e + k;
        return (b << j | b >>> 32 - j) + n;
      }
      function s(b, n, a, c, e, j, k) {
        b = b + (a ^ (n | ~c)) + e + k;
        return (b << j | b >>> 32 - j) + n;
      }
      for (var t = CryptoJS, r = t.lib, w = r.WordArray, v = r.Hasher, r = t.algo, b = [], x = 0; 64 > x; x++) b[x] = 4294967296 * u.abs(u.sin(x + 1)) | 0;
      r = r.MD5 = v.extend({
        _doReset: function _doReset() {
          this._hash = new w.init([ 1732584193, 4023233417, 2562383102, 271733878 ]);
        },
        _doProcessBlock: function _doProcessBlock(q, n) {
          for (var a = 0; 16 > a; a++) {
            var c = n + a, e = q[c];
            q[c] = 16711935 & (e << 8 | e >>> 24) | 4278255360 & (e << 24 | e >>> 8);
          }
          var a = this._hash.words, c = q[n + 0], e = q[n + 1], j = q[n + 2], k = q[n + 3], z = q[n + 4], r = q[n + 5], t = q[n + 6], w = q[n + 7], v = q[n + 8], A = q[n + 9], B = q[n + 10], C = q[n + 11], u = q[n + 12], D = q[n + 13], E = q[n + 14], x = q[n + 15], f = a[0], m = a[1], g = a[2], h = a[3], f = p(f, m, g, h, c, 7, b[0]), h = p(h, f, m, g, e, 12, b[1]), g = p(g, h, f, m, j, 17, b[2]), m = p(m, g, h, f, k, 22, b[3]), f = p(f, m, g, h, z, 7, b[4]), h = p(h, f, m, g, r, 12, b[5]), g = p(g, h, f, m, t, 17, b[6]), m = p(m, g, h, f, w, 22, b[7]), f = p(f, m, g, h, v, 7, b[8]), h = p(h, f, m, g, A, 12, b[9]), g = p(g, h, f, m, B, 17, b[10]), m = p(m, g, h, f, C, 22, b[11]), f = p(f, m, g, h, u, 7, b[12]), h = p(h, f, m, g, D, 12, b[13]), g = p(g, h, f, m, E, 17, b[14]), m = p(m, g, h, f, x, 22, b[15]), f = d(f, m, g, h, e, 5, b[16]), h = d(h, f, m, g, t, 9, b[17]), g = d(g, h, f, m, C, 14, b[18]), m = d(m, g, h, f, c, 20, b[19]), f = d(f, m, g, h, r, 5, b[20]), h = d(h, f, m, g, B, 9, b[21]), g = d(g, h, f, m, x, 14, b[22]), m = d(m, g, h, f, z, 20, b[23]), f = d(f, m, g, h, A, 5, b[24]), h = d(h, f, m, g, E, 9, b[25]), g = d(g, h, f, m, k, 14, b[26]), m = d(m, g, h, f, v, 20, b[27]), f = d(f, m, g, h, D, 5, b[28]), h = d(h, f, m, g, j, 9, b[29]), g = d(g, h, f, m, w, 14, b[30]), m = d(m, g, h, f, u, 20, b[31]), f = l(f, m, g, h, r, 4, b[32]), h = l(h, f, m, g, v, 11, b[33]), g = l(g, h, f, m, C, 16, b[34]), m = l(m, g, h, f, E, 23, b[35]), f = l(f, m, g, h, e, 4, b[36]), h = l(h, f, m, g, z, 11, b[37]), g = l(g, h, f, m, w, 16, b[38]), m = l(m, g, h, f, B, 23, b[39]), f = l(f, m, g, h, D, 4, b[40]), h = l(h, f, m, g, c, 11, b[41]), g = l(g, h, f, m, k, 16, b[42]), m = l(m, g, h, f, t, 23, b[43]), f = l(f, m, g, h, A, 4, b[44]), h = l(h, f, m, g, u, 11, b[45]), g = l(g, h, f, m, x, 16, b[46]), m = l(m, g, h, f, j, 23, b[47]), f = s(f, m, g, h, c, 6, b[48]), h = s(h, f, m, g, w, 10, b[49]), g = s(g, h, f, m, E, 15, b[50]), m = s(m, g, h, f, r, 21, b[51]), f = s(f, m, g, h, u, 6, b[52]), h = s(h, f, m, g, k, 10, b[53]), g = s(g, h, f, m, B, 15, b[54]), m = s(m, g, h, f, e, 21, b[55]), f = s(f, m, g, h, v, 6, b[56]), h = s(h, f, m, g, x, 10, b[57]), g = s(g, h, f, m, t, 15, b[58]), m = s(m, g, h, f, D, 21, b[59]), f = s(f, m, g, h, z, 6, b[60]), h = s(h, f, m, g, C, 10, b[61]), g = s(g, h, f, m, j, 15, b[62]), m = s(m, g, h, f, A, 21, b[63]);
          a[0] = a[0] + f | 0;
          a[1] = a[1] + m | 0;
          a[2] = a[2] + g | 0;
          a[3] = a[3] + h | 0;
        },
        _doFinalize: function _doFinalize() {
          var b = this._data, n = b.words, a = 8 * this._nDataBytes, c = 8 * b.sigBytes;
          n[c >>> 5] |= 128 << 24 - c % 32;
          var e = u.floor(a / 4294967296);
          n[15 + (c + 64 >>> 9 << 4)] = 16711935 & (e << 8 | e >>> 24) | 4278255360 & (e << 24 | e >>> 8);
          n[14 + (c + 64 >>> 9 << 4)] = 16711935 & (a << 8 | a >>> 24) | 4278255360 & (a << 24 | a >>> 8);
          b.sigBytes = 4 * (n.length + 1);
          this._process();
          b = this._hash;
          n = b.words;
          for (a = 0; 4 > a; a++) c = n[a], n[a] = 16711935 & (c << 8 | c >>> 24) | 4278255360 & (c << 24 | c >>> 8);
          return b;
        },
        clone: function clone() {
          var b = v.clone.call(this);
          b._hash = this._hash.clone();
          return b;
        }
      });
      t.MD5 = v._createHelper(r);
      t.HmacMD5 = v._createHmacHelper(r);
    })(Math);
    (function() {
      var u = CryptoJS, p = u.lib, d = p.Base, l = p.WordArray, p = u.algo, s = p.EvpKDF = d.extend({
        cfg: d.extend({
          keySize: 4,
          hasher: p.MD5,
          iterations: 1
        }),
        init: function init(d) {
          this.cfg = this.cfg.extend(d);
        },
        compute: function compute(d, r) {
          for (var p = this.cfg, s = p.hasher.create(), b = l.create(), u = b.words, q = p.keySize, p = p.iterations; u.length < q; ) {
            n && s.update(n);
            var n = s.update(d).finalize(r);
            s.reset();
            for (var a = 1; a < p; a++) n = s.finalize(n), s.reset();
            b.concat(n);
          }
          b.sigBytes = 4 * q;
          return b;
        }
      });
      u.EvpKDF = function(d, l, p) {
        return s.create(p).compute(d, l);
      };
    })();
    CryptoJS.lib.Cipher || function(u) {
      var p = CryptoJS, d = p.lib, l = d.Base, s = d.WordArray, t = d.BufferedBlockAlgorithm, r = p.enc.Base64, w = p.algo.EvpKDF, v = d.Cipher = t.extend({
        cfg: l.extend(),
        createEncryptor: function createEncryptor(e, a) {
          return this.create(this._ENC_XFORM_MODE, e, a);
        },
        createDecryptor: function createDecryptor(e, a) {
          return this.create(this._DEC_XFORM_MODE, e, a);
        },
        init: function init(e, a, b) {
          this.cfg = this.cfg.extend(b);
          this._xformMode = e;
          this._key = a;
          this.reset();
        },
        reset: function reset() {
          t.reset.call(this);
          this._doReset();
        },
        process: function process(e) {
          this._append(e);
          return this._process();
        },
        finalize: function finalize(e) {
          e && this._append(e);
          return this._doFinalize();
        },
        keySize: 4,
        ivSize: 4,
        _ENC_XFORM_MODE: 1,
        _DEC_XFORM_MODE: 2,
        _createHelper: function _createHelper(e) {
          return {
            encrypt: function encrypt(b, k, d) {
              return ("string" == typeof k ? c : a).encrypt(e, b, k, d);
            },
            decrypt: function decrypt(b, k, d) {
              return ("string" == typeof k ? c : a).decrypt(e, b, k, d);
            }
          };
        }
      });
      d.StreamCipher = v.extend({
        _doFinalize: function _doFinalize() {
          return this._process(!0);
        },
        blockSize: 1
      });
      var b = p.mode = {}, x = function x(e, a, b) {
        var c = this._iv;
        c ? this._iv = u : c = this._prevBlock;
        for (var d = 0; d < b; d++) e[a + d] ^= c[d];
      }, q = (d.BlockCipherMode = l.extend({
        createEncryptor: function createEncryptor(e, a) {
          return this.Encryptor.create(e, a);
        },
        createDecryptor: function createDecryptor(e, a) {
          return this.Decryptor.create(e, a);
        },
        init: function init(e, a) {
          this._cipher = e;
          this._iv = a;
        }
      })).extend();
      q.Encryptor = q.extend({
        processBlock: function processBlock(e, a) {
          var b = this._cipher, c = b.blockSize;
          x.call(this, e, a, c);
          b.encryptBlock(e, a);
          this._prevBlock = e.slice(a, a + c);
        }
      });
      q.Decryptor = q.extend({
        processBlock: function processBlock(e, a) {
          var b = this._cipher, c = b.blockSize, d = e.slice(a, a + c);
          b.decryptBlock(e, a);
          x.call(this, e, a, c);
          this._prevBlock = d;
        }
      });
      b = b.CBC = q;
      q = (p.pad = {}).Pkcs7 = {
        pad: function pad(a, b) {
          for (var c = 4 * b, c = c - a.sigBytes % c, d = c << 24 | c << 16 | c << 8 | c, l = [], n = 0; n < c; n += 4) l.push(d);
          c = s.create(l, c);
          a.concat(c);
        },
        unpad: function unpad(a) {
          a.sigBytes -= 255 & a.words[a.sigBytes - 1 >>> 2];
        }
      };
      d.BlockCipher = v.extend({
        cfg: v.cfg.extend({
          mode: b,
          padding: q
        }),
        reset: function reset() {
          v.reset.call(this);
          var a = this.cfg, b = a.iv, a = a.mode;
          if (this._xformMode == this._ENC_XFORM_MODE) var c = a.createEncryptor; else c = a.createDecryptor, 
          this._minBufferSize = 1;
          this._mode = c.call(a, this, b && b.words);
        },
        _doProcessBlock: function _doProcessBlock(a, b) {
          this._mode.processBlock(a, b);
        },
        _doFinalize: function _doFinalize() {
          var a = this.cfg.padding;
          if (this._xformMode == this._ENC_XFORM_MODE) {
            a.pad(this._data, this.blockSize);
            var b = this._process(!0);
          } else b = this._process(!0), a.unpad(b);
          return b;
        },
        blockSize: 4
      });
      var n = d.CipherParams = l.extend({
        init: function init(a) {
          this.mixIn(a);
        },
        toString: function toString(a) {
          return (a || this.formatter).stringify(this);
        }
      }), b = (p.format = {}).OpenSSL = {
        stringify: function stringify(a) {
          var b = a.ciphertext;
          a = a.salt;
          return (a ? s.create([ 1398893684, 1701076831 ]).concat(a).concat(b) : b).toString(r);
        },
        parse: function parse(a) {
          a = r.parse(a);
          var b = a.words;
          if (1398893684 == b[0] && 1701076831 == b[1]) {
            var c = s.create(b.slice(2, 4));
            b.splice(0, 4);
            a.sigBytes -= 16;
          }
          return n.create({
            ciphertext: a,
            salt: c
          });
        }
      }, a = d.SerializableCipher = l.extend({
        cfg: l.extend({
          format: b
        }),
        encrypt: function encrypt(a, b, c, d) {
          d = this.cfg.extend(d);
          var l = a.createEncryptor(c, d);
          b = l.finalize(b);
          l = l.cfg;
          return n.create({
            ciphertext: b,
            key: c,
            iv: l.iv,
            algorithm: a,
            mode: l.mode,
            padding: l.padding,
            blockSize: a.blockSize,
            formatter: d.format
          });
        },
        decrypt: function decrypt(a, b, c, d) {
          d = this.cfg.extend(d);
          b = this._parse(b, d.format);
          return a.createDecryptor(c, d).finalize(b.ciphertext);
        },
        _parse: function _parse(a, b) {
          return "string" == typeof a ? b.parse(a, this) : a;
        }
      }), p = (p.kdf = {}).OpenSSL = {
        execute: function execute(a, b, c, d) {
          d || (d = s.random(8));
          a = w.create({
            keySize: b + c
          }).compute(a, d);
          c = s.create(a.words.slice(b), 4 * c);
          a.sigBytes = 4 * b;
          return n.create({
            key: a,
            iv: c,
            salt: d
          });
        }
      }, c = d.PasswordBasedCipher = a.extend({
        cfg: a.cfg.extend({
          kdf: p
        }),
        encrypt: function encrypt(b, c, d, l) {
          l = this.cfg.extend(l);
          d = l.kdf.execute(d, b.keySize, b.ivSize);
          l.iv = d.iv;
          b = a.encrypt.call(this, b, c, d.key, l);
          b.mixIn(d);
          return b;
        },
        decrypt: function decrypt(b, c, d, l) {
          l = this.cfg.extend(l);
          c = this._parse(c, l.format);
          d = l.kdf.execute(d, b.keySize, b.ivSize, c.salt);
          l.iv = d.iv;
          return a.decrypt.call(this, b, c, d.key, l);
        }
      });
    }();
    (function() {
      for (var u = CryptoJS, p = u.lib.BlockCipher, d = u.algo, l = [], s = [], t = [], r = [], w = [], v = [], b = [], x = [], q = [], n = [], a = [], c = 0; 256 > c; c++) a[c] = 128 > c ? c << 1 : c << 1 ^ 283;
      for (var e = 0, j = 0, c = 0; 256 > c; c++) {
        var k = j ^ j << 1 ^ j << 2 ^ j << 3 ^ j << 4, k = k >>> 8 ^ 255 & k ^ 99;
        l[e] = k;
        s[k] = e;
        var z = a[e], F = a[z], G = a[F], y = 257 * a[k] ^ 16843008 * k;
        t[e] = y << 24 | y >>> 8;
        r[e] = y << 16 | y >>> 16;
        w[e] = y << 8 | y >>> 24;
        v[e] = y;
        y = 16843009 * G ^ 65537 * F ^ 257 * z ^ 16843008 * e;
        b[k] = y << 24 | y >>> 8;
        x[k] = y << 16 | y >>> 16;
        q[k] = y << 8 | y >>> 24;
        n[k] = y;
        e ? (e = z ^ a[a[a[G ^ z]]], j ^= a[a[j]]) : e = j = 1;
      }
      var H = [ 0, 1, 2, 4, 8, 16, 32, 64, 128, 27, 54 ], d = d.AES = p.extend({
        _doReset: function _doReset() {
          for (var a = this._key, c = a.words, d = a.sigBytes / 4, a = 4 * ((this._nRounds = d + 6) + 1), e = this._keySchedule = [], j = 0; j < a; j++) if (j < d) e[j] = c[j]; else {
            var k = e[j - 1];
            j % d ? 6 < d && 4 == j % d && (k = l[k >>> 24] << 24 | l[k >>> 16 & 255] << 16 | l[k >>> 8 & 255] << 8 | l[255 & k]) : (k = k << 8 | k >>> 24, 
            k = l[k >>> 24] << 24 | l[k >>> 16 & 255] << 16 | l[k >>> 8 & 255] << 8 | l[255 & k], 
            k ^= H[j / d | 0] << 24);
            e[j] = e[j - d] ^ k;
          }
          c = this._invKeySchedule = [];
          for (d = 0; d < a; d++) j = a - d, k = d % 4 ? e[j] : e[j - 4], c[d] = 4 > d || 4 >= j ? k : b[l[k >>> 24]] ^ x[l[k >>> 16 & 255]] ^ q[l[k >>> 8 & 255]] ^ n[l[255 & k]];
        },
        encryptBlock: function encryptBlock(a, b) {
          this._doCryptBlock(a, b, this._keySchedule, t, r, w, v, l);
        },
        decryptBlock: function decryptBlock(a, c) {
          var d = a[c + 1];
          a[c + 1] = a[c + 3];
          a[c + 3] = d;
          this._doCryptBlock(a, c, this._invKeySchedule, b, x, q, n, s);
          d = a[c + 1];
          a[c + 1] = a[c + 3];
          a[c + 3] = d;
        },
        _doCryptBlock: function _doCryptBlock(a, b, c, d, e, j, l, f) {
          for (var m = this._nRounds, g = a[b] ^ c[0], h = a[b + 1] ^ c[1], k = a[b + 2] ^ c[2], n = a[b + 3] ^ c[3], p = 4, r = 1; r < m; r++) var q = d[g >>> 24] ^ e[h >>> 16 & 255] ^ j[k >>> 8 & 255] ^ l[255 & n] ^ c[p++], s = d[h >>> 24] ^ e[k >>> 16 & 255] ^ j[n >>> 8 & 255] ^ l[255 & g] ^ c[p++], t = d[k >>> 24] ^ e[n >>> 16 & 255] ^ j[g >>> 8 & 255] ^ l[255 & h] ^ c[p++], n = d[n >>> 24] ^ e[g >>> 16 & 255] ^ j[h >>> 8 & 255] ^ l[255 & k] ^ c[p++], g = q, h = s, k = t;
          q = (f[g >>> 24] << 24 | f[h >>> 16 & 255] << 16 | f[k >>> 8 & 255] << 8 | f[255 & n]) ^ c[p++];
          s = (f[h >>> 24] << 24 | f[k >>> 16 & 255] << 16 | f[n >>> 8 & 255] << 8 | f[255 & g]) ^ c[p++];
          t = (f[k >>> 24] << 24 | f[n >>> 16 & 255] << 16 | f[g >>> 8 & 255] << 8 | f[255 & h]) ^ c[p++];
          n = (f[n >>> 24] << 24 | f[g >>> 16 & 255] << 16 | f[h >>> 8 & 255] << 8 | f[255 & k]) ^ c[p++];
          a[b] = q;
          a[b + 1] = s;
          a[b + 2] = t;
          a[b + 3] = n;
        },
        keySize: 8
      });
      u.AES = p._createHelper(d);
    })();
    CryptoJS.pad.ZeroPadding = {
      pad: function pad(a, c) {
        var b = 4 * c;
        a.clamp();
        a.sigBytes += b - (a.sigBytes % b || b);
      },
      unpad: function unpad(a) {
        for (var c = a.words, b = a.sigBytes - 1; !(c[b >>> 2] >>> 24 - b % 4 * 8 & 255); ) b--;
        a.sigBytes = b + 1;
      }
    };
    module.exports = CryptoJS;
    cc._RF.pop();
  }, {} ],
  FadeMsg: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "555afaRYPZJt5GsbBsisw2k", "FadeMsg");
    "use strict";
    cc.Class({
      extends: cc.Component,
      properties: {
        bg: {
          default: null,
          type: cc.Node
        },
        msg: {
          default: null,
          type: cc.Label
        }
      },
      onLoad: function onLoad() {
        this.node.active = false;
        cc.game.addPersistRootNode(this.node);
      },
      start: function start() {},
      show: function show(msg, fadeTime) {
        this.node.active = true;
        this.node.opacity = 255;
        this.msg.string = msg;
        var t = 1;
        null != fadeTime && (t = fadeTime);
        var self = this;
        this.node.stopAllActions();
        this.node.runAction(cc.sequence(cc.delayTime(t), cc.fadeOut(t), cc.callFunc(function() {
          self.node.active = false;
        })));
      }
    });
    cc._RF.pop();
  }, {} ],
  Global: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "b2cb6I9ioRFP6u8S1YNlcRM", "Global");
    "use strict";
    cc.Class({
      extends: cc.Component,
      properties: {
        gameIndex: 0
      },
      onLoad: function onLoad() {
        cc.game.addPersistRootNode(this.node);
      },
      start: function start() {},
      getGameIndex: function getGameIndex() {
        return this.gameIndex;
      },
      setGameIndex: function setGameIndex(index) {
        this.gameIndex = index;
      }
    });
    cc._RF.pop();
  }, {} ],
  HallScene: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "39790DkgKNG1ozqAjKANVUQ", "HallScene");
    "use strict";
    var App = require("App");
    var Tools = require("Tools");
    cc.Class({
      extends: cc.Component,
      properties: {
        goldRankList: {
          default: null,
          type: cc.ScrollView
        },
        goldRankListExpand: {
          default: null,
          type: cc.ScrollView
        },
        goldRankItem: {
          default: null,
          type: cc.Prefab
        },
        goldRankItemExpand: {
          default: null,
          type: cc.Prefab
        },
        gameList: {
          default: null,
          type: cc.ScrollView
        },
        gameItem: {
          default: null,
          type: cc.Prefab
        },
        bg_gold_rank: {
          default: null,
          type: cc.Sprite
        },
        bg_gold_rank_expand: {
          default: null,
          type: cc.Sprite
        },
        signinPanel: {
          default: null,
          type: cc.Prefab
        },
        activityPanel: {
          default: null,
          type: cc.Prefab
        },
        strongboxPanel: {
          default: null,
          type: cc.Prefab
        },
        gameplazaPanel: {
          default: null,
          type: cc.Prefab
        },
        networkErrorPanel: {
          default: null,
          type: cc.Prefab
        },
        moreGamePanel: {
          default: null,
          type: cc.Prefab
        },
        rechargePanel: {
          default: null,
          type: cc.Prefab
        },
        personalInfoPanel: {
          default: null,
          type: cc.Prefab
        },
        settingPanel: {
          default: null,
          type: cc.Prefab
        },
        friendPanel: {
          default: null,
          type: cc.Prefab
        },
        noticePanel: {
          default: null,
          type: cc.Prefab
        },
        conversionPanel: {
          default: null,
          type: cc.Prefab
        },
        customerPanel: {
          default: null,
          type: cc.Prefab
        },
        gold: {
          default: null,
          type: cc.Label
        },
        nickName: {
          default: null,
          type: cc.Label
        },
        userId: {
          default: null,
          type: cc.Label
        },
        headImage: {
          default: null,
          type: cc.Sprite
        },
        level: {
          default: null,
          type: cc.Label
        },
        point: {
          default: null,
          type: cc.Label
        },
        levelupProgressBar: {
          default: null,
          type: cc.ProgressBar
        },
        settingButton: {
          default: null,
          type: cc.Button
        },
        myRank: {
          default: null,
          type: cc.Node
        }
      },
      onLoad: function onLoad() {
        cc.debug.setDisplayStats(false);
        cc.view.setOrientation(cc.macro.ORIENTATION_LANDSCAPE);
        var self = this;
        this.bg_gold_rank.node.active = true;
        this.bg_gold_rank_expand.node.active = false;
        for (var _i = 0; _i < 5; _i++) {
          var gameItem = cc.instantiate(this.gameItem);
          gameItem.on("enter", this.tapGameItem, this);
          this.gameList.content.addChild(gameItem);
        }
        this.gameList.node.getComponent("scrollItemScale").init();
        this.updateGold();
        this.updateUserInfo();
        this.updateAvatar();
        App.connectServer();
        App.on("connectServerSuccess", function() {
          cc.log("connectServerSuccess");
        });
        var postData = [ "categoryId=4" ];
        App.postTitle("/tasks", postData, function(data) {
          200 == parseInt(data.code);
        });
        var _postData = {
          endDate: Tools.todayStr,
          limit: 10,
          offset: 0,
          startDate: Tools.todayStr
        };
        App.post("/esbets/topUsers", _postData, function(data) {
          200 == parseInt(data.code) && self.updateGoldRankList(data.data.content);
        });
        App.getWithToken("/platforms/list", function(data) {
          cc.log(data);
          200 == parseInt(data.code) && (App.esportPlatformId = data.data[0].id);
        });
      },
      showCurTopUsers: function showCurTopUsers() {
        var self = this;
        App.post("/esbets/topUsers", {
          endDate: Tools.todayStr,
          limit: 10,
          offset: 0,
          startDate: Tools.todayStr
        }, function(data) {
          200 == parseInt(data.code) && self && self.updateGoldRankList(data.data.content);
        });
      },
      showAllTopUsers: function showAllTopUsers() {
        var self = this;
        App.post("/esbets/topUsers", {
          limit: 10,
          offset: 0
        }, function(data) {
          200 == parseInt(data.code) && self && self.updateGoldRankList(data.data.content);
        });
      },
      updateGoldRankList: function updateGoldRankList(data) {
        var _this = this;
        var medalIcon = [ "icon_gold_medal", "icon_silver_medal", "icon_copper_medal" ];
        this.goldRankList.content.removeAllChildren();
        var _loop = function _loop(_i2) {
          var goldRankItem = cc.instantiate(_this.goldRankItem);
          _this.goldRankList.content.addChild(goldRankItem);
          _i2 < 3 ? cc.loader.loadRes(medalIcon[_i2], cc.SpriteFrame, function(err, spriteFrame) {
            if (err) {
              cc.log("\u52a0\u8f7d\u5956\u724c\u56fe\u6807\u5931\u8d25");
              return;
            }
            goldRankItem.getChildByName("medal").getComponent(cc.Sprite).spriteFrame = spriteFrame;
          }) : goldRankItem.getChildByName("medal").active = false;
          1 == data[_i2].hasAvatar && cc.loader.load({
            url: App.getHeadImageByUserId(data[_i2].userId),
            type: "png"
          }, function(err, texture) {
            if (err) return;
            goldRankItem.getComponent(cc.Sprite).spriteFrame = new cc.SpriteFrame(texture);
          });
        };
        for (var _i2 = 0; _i2 < data.length; _i2++) _loop(_i2);
        this.goldRankListExpand.content.removeAllChildren();
        var _loop2 = function _loop2(_i3) {
          var goldRankItemExpand = cc.instantiate(_this.goldRankItemExpand);
          _this.goldRankListExpand.content.addChild(goldRankItemExpand);
          var medal = goldRankItemExpand.getChildByName("medal");
          var goldRank = goldRankItemExpand.getChildByName("goldRank");
          if (_i3 < 3) {
            cc.loader.loadRes(medalIcon[_i3], cc.SpriteFrame, function(err, spriteFrame) {
              if (err) {
                cc.log("\u52a0\u8f7d\u5956\u724c\u56fe\u6807\u5931\u8d25");
                return;
              }
              medal.getComponent(cc.Sprite).spriteFrame = spriteFrame;
            });
            medal.active = true;
            goldRank.active = false;
          } else {
            medal.active = false;
            goldRank.active = true;
            goldRank.getComponent(cc.Label).string = String(_i3 + 1);
          }
          var headImage = goldRankItemExpand.getChildByName("headImage");
          1 == data[_i3].hasAvatar && cc.loader.load({
            url: App.getHeadImageByUserId(data[_i3].userId),
            type: "png"
          }, function(err, texture) {
            if (err) return;
            headImage.getComponent(cc.Sprite).spriteFrame = new cc.SpriteFrame(texture);
          });
          goldRankItemExpand.getChildByName("nickName").getComponent(cc.Label).string = data[_i3].username;
          goldRankItemExpand.getChildByName("userId").getComponent(cc.Label).string = "ID: " + data[_i3].userId;
          goldRankItemExpand.getChildByName("gold").getComponent(cc.Label).string = data[_i3].totalWinAmount;
        };
        for (var _i3 = 0; _i3 < data.length; _i3++) _loop2(_i3);
        var myRankLevel = void 0;
        for (var _i4 = 0; _i4 < data.length; _i4++) if (data[_i4].userId == App.myUser.id) {
          myRankLevel = _i4;
          break;
        }
        void 0 != App.myUser.nickname ? this.myRank.getChildByName("nickName").getComponent(cc.Label).string = App.myUser.nickname : this.myRank.getChildByName("nickName").getComponent(cc.Label).string = App.myUser.username;
        this.myRank.getChildByName("userId").getComponent(cc.Label).string = "ID: " + App.myUser.id;
        if (myRankLevel >= 0 && myRankLevel <= 2) {
          var self = this;
          cc.loader.loadRes(medalIcon[i], cc.SpriteFrame, function(err, spriteFrame) {
            if (err) {
              cc.log("\u52a0\u8f7d\u5956\u724c\u56fe\u6807\u5931\u8d25");
              return;
            }
            self.myRank.getChildByName("medal").getComponent(cc.Sprite).spriteFrame = spriteFrame;
          });
          this.myRank.getChildByName("medal").active = true;
          this.myRank.getChildByName("goldRank").active = false;
          this.myRank.getChildByName("not_on_the_list").active = false;
          this.myRank.getChildByName("gold").getComponent(cc.Label).string = data[myRankLevel].totalWinAmount;
        } else if (myRankLevel) {
          this.myRank.getChildByName("medal").active = false;
          this.myRank.getChildByName("goldRank").active = true;
          this.myRank.getChildByName("goldRank").getComponent(cc.Label).string = String(myRankLevel + 1);
          this.myRank.getChildByName("not_on_the_list").active = false;
          this.myRank.getChildByName("gold").getComponent(cc.Label).string = data[myRankLevel].totalWinAmount;
        } else {
          this.myRank.getChildByName("medal").active = false;
          this.myRank.getChildByName("goldRank").active = false;
          this.myRank.getChildByName("not_on_the_list").active = true;
          this.myRank.getChildByName("gold").getComponent(cc.Label).string = App.myUser.balance;
        }
      },
      start: function start() {
        cc.find("Loading") && cc.find("Loading").getComponent("Loading").close();
      },
      tapHead: function tapHead(sender, customEventData) {
        var personalInfoPanel = cc.instantiate(this.personalInfoPanel);
        cc.find("Canvas").addChild(personalInfoPanel);
      },
      tapSignin: function tapSignin(sender, customEventData) {
        var signinPanel = cc.instantiate(this.signinPanel);
        cc.find("Canvas").addChild(signinPanel);
      },
      tapActivity: function tapActivity(sender, customEventData) {
        var activityPanel = cc.instantiate(this.activityPanel);
        cc.find("Canvas").addChild(activityPanel);
      },
      tapBank: function tapBank(sender, customEventData) {
        var strongboxPanel = cc.instantiate(this.strongboxPanel);
        cc.find("Canvas").addChild(strongboxPanel);
      },
      tapRecharge: function tapRecharge(sender, customEventData) {
        var rechargePanel = cc.instantiate(this.rechargePanel);
        cc.find("Canvas").addChild(rechargePanel);
      },
      tapCustomer: function tapCustomer(sender, customEventData) {
        var customerPanel = cc.instantiate(this.customerPanel);
        cc.find("Canvas").addChild(customerPanel);
      },
      tapNotice: function tapNotice(sender, customEventData) {
        var noticePanel = cc.instantiate(this.noticePanel);
        cc.find("Canvas").addChild(noticePanel);
      },
      tapConversion: function tapConversion(sender, customEventData) {
        var conversionPanel = cc.instantiate(this.conversionPanel);
        cc.find("Canvas").addChild(conversionPanel);
      },
      tapRegister: function tapRegister(sender, customEventData) {
        var activityPanel = cc.instantiate(this.activityPanel);
        cc.find("Canvas").addChild(activityPanel);
      },
      tapAgent: function tapAgent(sender, customEventData) {
        var activityPanel = cc.instantiate(this.activityPanel);
        cc.find("Canvas").addChild(activityPanel);
      },
      tapFriend: function tapFriend(sender, customEventData) {
        var friendPanel = cc.instantiate(this.friendPanel);
        cc.find("Canvas").addChild(friendPanel);
      },
      tapSettting: function tapSettting(sender, customEventData) {
        var settingPanel = cc.instantiate(this.settingPanel);
        cc.find("Canvas").addChild(settingPanel);
      },
      tapAddgold: function tapAddgold(sender, customEventData) {
        var rechargePanel = cc.instantiate(this.rechargePanel);
        cc.find("Canvas").addChild(rechargePanel);
      },
      tapCompetition: function tapCompetition(sender, customEventData) {
        var moreGamePanel = cc.instantiate(this.moreGamePanel);
        cc.find("Canvas").addChild(moreGamePanel);
      },
      tapEditNickName: function tapEditNickName(sender, customEventData) {
        var personalInfoPanel = cc.instantiate(this.personalInfoPanel);
        cc.find("Canvas").addChild(personalInfoPanel);
      },
      tapExpand: function tapExpand(sender, customEventData) {
        this.bg_gold_rank.node.active = !this.bg_gold_rank.node.active;
        this.bg_gold_rank_expand.node.active = !this.bg_gold_rank_expand.node.active;
      },
      tapGameItem: function tapGameItem(e) {
        var gameplazaPanel = cc.instantiate(this.gameplazaPanel);
        cc.find("Canvas").addChild(gameplazaPanel);
      },
      updateGold: function updateGold() {
        var self = this;
        App.getWithToken("/users/getUserBalance", function(data) {
          if (200 == parseInt(data.code)) {
            App.myUser.setup(data.data);
            self.gold.getComponent(cc.Label).string = data.data;
          }
        });
      },
      updateUserInfo: function updateUserInfo() {
        var self = this;
        App.getWithToken("/users", function(data) {
          if (200 == parseInt(data.code) && self) {
            App.myUser.setup(data.data);
            self.gold.getComponent(cc.Label).string = App.myUser.balance;
            void 0 != App.myUser.nickname ? self.nickName.getComponent(cc.Label).string = App.myUser.nickname : self.nickName.getComponent(cc.Label).string = App.myUser.username;
            self.userId.getComponent(cc.Label).string = "ID: " + App.myUser.id;
            self.level.getComponent(cc.Label).string = App.myUser.level;
            self.point.getComponent(cc.Label).string = App.myUser.point + "/" + App.myUser.nextLevelPoint;
            self.levelupProgressBar.getComponent(cc.ProgressBar).progress = App.myUser.point / App.myUser.nextLevelPoint;
          }
        });
      },
      updateAvatar: function updateAvatar() {
        var self = this;
        cc.loader.load({
          url: App.getHeadImageByUserId(App.myUser.id),
          type: "png"
        }, function(err, texture) {
          if (err) return;
          if (self) {
            var sp = new cc.SpriteFrame(texture);
            self.headImage.getComponent(cc.Sprite).spriteFrame = new cc.SpriteFrame(texture);
          }
        });
      },
      showSettingButton: function showSettingButton(show) {
        this.settingButton.node.active = show;
      },
      tapShishile: function tapShishile(sender, customEventData) {
        App.gameType = customEventData;
        cc.director.loadScene("ShishileScene");
      }
    });
    cc._RF.pop();
  }, {
    App: "App",
    Tools: "Tools"
  } ],
  HttpCenter: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "07b2elULH1NZoENLzIHuHOz", "HttpCenter");
    "use strict";
    var HttpCenter = function HttpCenter() {};
    module.exports = HttpCenter;
    cc._RF.pop();
  }, {} ],
  Loading: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "4746dnbek5CiJLD4CcFP2Gl", "Loading");
    "use strict";
    cc.Class({
      extends: cc.Component,
      properties: {
        root: {
          default: null,
          type: cc.Node
        }
      },
      onLoad: function onLoad() {
        cc.game.addPersistRootNode(this.node);
        this.node.active = false;
        this.node.runAction(cc.sequence(cc.delayTime(0), cc.callFunc(function() {
          this.node.active = false;
        }.bind(this))));
        this.node.on(cc.Node.EventType.TOUCH_START, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_MOVE, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_END, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_CANCEL, function(event, touch) {
          void 0 != event.stopProgagation && event.stopProgagation();
        });
        this.timeoutCallback = null;
      },
      start: function start() {},
      show: function show(time, timeoutCallback) {
        this.node.active = true;
        this.node.runAction(cc.sequence(cc.delayTime(0), cc.callFunc(function() {
          this.node.active = true;
        }.bind(this))));
        var animationComponent = this.root.getComponent(cc.Animation);
        animationComponent.play("loading");
        var t = 7;
        null != time && (t = time);
        if (null != this.timeoutCallback) {
          this.unschedule(this.timeoutCallback);
          this.timeoutCallback = null;
          this.close();
        }
        var self = this;
        this.timeoutCallback = function(dt) {
          null != timeoutCallback && timeoutCallback(dt);
          this.timeoutCallback = null;
          self.close();
        };
        this.scheduleOnce(this.timeoutCallback, t);
      },
      close: function close() {
        this.node.active = false;
        this.node.runAction(cc.sequence(cc.delayTime(0), cc.callFunc(function() {
          this.node.active = false;
        }.bind(this))));
        var animationComponent = this.root.getComponent(cc.Animation);
        var animState = animationComponent.getAnimationState("loading");
        animState.isPlaying && animationComponent.stop();
        if (null != this.timeoutCallback) {
          this.unschedule(this.timeoutCallback);
          this.timeoutCallback = null;
        }
      }
    });
    cc._RF.pop();
  }, {} ],
  LoginScene: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "b7b4bGrCCtP0YtX/JgAHpqB", "LoginScene");
    "use strict";
    var App = require("App");
    var CryptoJS = require("CryptoJS");
    cc.Class({
      extends: cc.Component,
      properties: {
        account: {
          default: null,
          type: cc.EditBox
        },
        password: {
          default: null,
          type: cc.EditBox
        },
        rememberPassword: {
          default: null,
          type: cc.Toggle
        },
        security: {
          default: null,
          type: cc.EditBox
        },
        bgSecurity: {
          default: null,
          type: cc.Sprite
        },
        getSecurityCode: {
          default: null,
          type: cc.Button
        },
        aeskey: "qianren2019",
        loginErrorCount: 0
      },
      onLoad: function onLoad() {
        cc.debug.setDisplayStats(false);
        cc.view.setOrientation(cc.macro.ORIENTATION_LANDSCAPE);
        var self = this;
        var account = this.account.getComponent(cc.EditBox);
        var password = this.password.getComponent(cc.EditBox);
        var localAccount = cc.sys.localStorage.getItem("account");
        var localPassword = cc.sys.localStorage.getItem("password");
        if (null != localAccount) {
          var rawAccount = CryptoJS.AES.decrypt(localAccount, this.aeskey).toString(CryptoJS.enc.Utf8);
          account.string = rawAccount;
        }
        if (null != localPassword) {
          var rawPassword = CryptoJS.AES.decrypt(localPassword, this.aeskey).toString(CryptoJS.enc.Utf8);
          password.string = rawPassword;
        }
        null != cc.sys.localStorage.getItem("loginErrorCount") && (self.loginErrorCount = parseInt(cc.sys.localStorage.getItem("loginErrorCount")));
        if (self.loginErrorCount >= 3) {
          self.bgSecurity.node.active = true;
          self.tapGetSecurityCode();
        }
        this.bgSecurity.node.active = false;
        App.get("/auth/countValidError", function(data) {
          if (200 == parseInt(data.code)) {
            App.token = data.data.token;
            true == data.data.showCaptcha && (self.bgSecurity.node.active = true);
          }
        });
      },
      start: function start() {},
      tapGetSecurityCode: function tapGetSecurityCode(sender, customEventData) {
        var self = this;
        cc.loader.load({
          url: App.getSecurityCodeUrl(),
          type: "png"
        }, function(err, texture) {
          var sp = new cc.SpriteFrame(texture);
          var background = self.getSecurityCode.node.getChildByName("Background");
          background.getComponent(cc.Sprite).spriteFrame = new cc.SpriteFrame(texture);
        });
      },
      tapClear: function tapClear(sender, customEventData) {
        cc.sys.localStorage.removeItem("account");
        cc.sys.localStorage.removeItem("password");
        var account = this.account.getComponent(cc.EditBox);
        var password = this.password.getComponent(cc.EditBox);
        account.string = "";
        password.string = "";
      },
      tapLogin: function tapLogin(sender, customEventData) {
        var self = this;
        var account = this.account.getComponent(cc.EditBox);
        var password = this.password.getComponent(cc.EditBox);
        var security = this.security.getComponent(cc.EditBox);
        if ("" == account.string) {
          cc.find("FadeMsg").getComponent("FadeMsg").show("\u7528\u6237\u540d\u4e0d\u80fd\u4e3a\u7a7a");
          return;
        }
        if ("" == this.password.string) {
          cc.find("FadeMsg").getComponent("FadeMsg").show("\u5bc6\u7801\u4e0d\u80fd\u4e3a\u7a7a");
          return;
        }
        if (true == self.bgSecurity.node.active && "" == security.string) {
          cc.find("FadeMsg").getComponent("FadeMsg").show("\u9a8c\u8bc1\u7801\u4e0d\u80fd\u4e3a\u7a7a");
          return;
        }
        cc.find("Loading").getComponent("Loading").show();
        var postData = {
          captcha: security.string,
          password: password.string,
          username: account.string,
          token: App.token
        };
        App.post("/auth/login", postData, function(data) {
          if (200 == parseInt(data.code)) {
            if (self.rememberPassword.getComponent(cc.Toggle).isChecked) {
              var saveAccount = String(CryptoJS.AES.encrypt(account.string, self.aeskey));
              var savePassword = String(CryptoJS.AES.encrypt(password.string, self.aeskey));
              cc.sys.localStorage.setItem("account", saveAccount);
              cc.sys.localStorage.setItem("password", savePassword);
            }
            App.myUser.setup(data.data);
            App.requestToken = data.data.token;
            self.loginErrorCount = 0;
            cc.sys.localStorage.setItem("loginErrorCount", 0);
            cc.director.loadScene("HallScene");
          } else {
            cc.log(JSON.stringify(data));
            cc.find("Loading").getComponent("Loading").close();
            cc.find("FadeMsg").getComponent("FadeMsg").show(data.message.zh);
            self.loginErrorCount++;
            cc.sys.localStorage.setItem("loginErrorCount", self.loginErrorCount);
            if (self.loginErrorCount >= 3) {
              self.bgSecurity.node.active = true;
              self.tapGetSecurityCode();
            }
          }
        });
      },
      tapRegister: function tapRegister(sender, customEventData) {
        cc.director.loadScene("RegisterScene");
      },
      checkRemberPassword: function checkRemberPassword(sender, customEventData) {},
      tapForgetPassword: function tapForgetPassword(sender, customEventData) {
        cc.director.loadScene("ResetPasswordScene");
      },
      tapButton: function tapButton(sender, customEventData) {
        cc.director.loadScene("HallScene");
      }
    });
    cc._RF.pop();
  }, {
    App: "App",
    CryptoJS: "CryptoJS"
  } ],
  MyUser: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "8bf8cRRnjRGjYsSeGlsPK0T", "MyUser");
    "use strict";
    var MyUser = {};
    MyUser.setup = function(data) {
      void 0 != data.username && (MyUser.username = data.username);
      void 0 != data.nickname && (MyUser.nickname = data.nickname);
      void 0 != data.truename && (MyUser.truename = data.truename);
      void 0 != data.point && (MyUser.point = data.point);
      void 0 != data.level && (MyUser.level = data.level);
      void 0 != data.nextLevelPoint && (MyUser.nextLevelPoint = data.nextLevelPoint);
      void 0 != data.coins && (MyUser.coins = data.coins);
      void 0 != data.hasAvatar && (MyUser.hasAvatar = data.hasAvatar);
      void 0 != data.balance && (MyUser.balance = data.balance);
      void 0 != data.lastLoginDate && (MyUser.lastLoginDate = data.lastLoginDate);
      void 0 != data.lastLoginLocation && (MyUser.lastLoginDate = data.lastLoginLocation);
      void 0 != data.deposit && (MyUser.deposit = data.deposit);
      void 0 != data.id && (MyUser.id = data.id);
      void 0 != data.email && (MyUser.email = data.email);
      void 0 != data.birthdate && (MyUser.birthdate = data.birthdate);
      void 0 != data.hasSecureCode && (MyUser.hasSecureCode = data.hasSecureCode);
      void 0 != data.profile && (MyUser.profile = data.profile);
      void 0 != data.telephone && (MyUser.telephone = data.telephone);
      MyUser.birthdate = data.birthdate;
      MyUser.sex = data.sex;
    };
    module.exports = MyUser;
    cc._RF.pop();
  }, {} ],
  RegisterScene: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "09cdcrIYqhHQ5U4X3TtzEKY", "RegisterScene");
    "use strict";
    var App = require("App");
    cc.Class({
      extends: cc.Component,
      properties: {
        account: {
          default: null,
          type: cc.EditBox
        },
        password: {
          default: null,
          type: cc.EditBox
        },
        confirmPassword: {
          default: null,
          type: cc.EditBox
        },
        security: {
          default: null,
          type: cc.EditBox
        },
        getSecurityCode: {
          default: null,
          type: cc.Button
        }
      },
      onLoad: function onLoad() {
        cc.debug.setDisplayStats(false);
        cc.view.setOrientation(cc.macro.ORIENTATION_LANDSCAPE);
      },
      start: function start() {},
      tapGetSecurityCode: function tapGetSecurityCode(sender, customEventData) {
        var self = this;
        cc.loader.load({
          url: App.getSecurityCodeUrl(),
          type: "png"
        }, function(err, texture) {
          var sp = new cc.SpriteFrame(texture);
          var background = self.getSecurityCode.node.getChildByName("Background");
          background.getComponent(cc.Sprite).spriteFrame = new cc.SpriteFrame(texture);
        });
      },
      tapRegister: function tapRegister(sender, customEventData) {
        var account = this.account.getComponent(cc.EditBox);
        var password = this.password.getComponent(cc.EditBox);
        var confirmPassword = this.confirmPassword.getComponent(cc.EditBox);
        var security = this.security.getComponent(cc.EditBox);
        if ("" == account.stirng) {
          cc.find("FadeMsg").getComponent("FadeMsg").show("\u7528\u6237\u540d\u4e0d\u80fd\u4e3a\u7a7a");
          return;
        }
        if ("" == security.string) {
          cc.find("FadeMsg").getComponent("FadeMsg").show("\u9a8c\u8bc1\u7801\u4e0d\u80fd\u4e3a\u7a7a");
          return;
        }
        if ("" == password.string) {
          cc.find("FadeMsg").getComponent("FadeMsg").show("\u5bc6\u7801\u4e0d\u80fd\u4e3a\u7a7a");
          return;
        }
        if ("" == confirmPassword.string) {
          cc.find("FadeMsg").getComponent("FadeMsg").show("\u5bc6\u7801\u4e0d\u80fd\u4e3a\u7a7a");
          return;
        }
        if (password.string != confirmPassword.string) {
          cc.find("FadeMsg").getComponent("FadeMsg").show("\u4e24\u6b21\u8f93\u5165\u7684\u5bc6\u7801\u4e0d\u4e00\u81f4");
          return;
        }
        var postData = {
          captcha: security.string,
          password: password.string,
          token: App.token,
          username: account.string
        };
        App.post("/auth", postData, function(data) {
          if (200 == parseInt(data.code)) cc.find("FadeMsg").getComponent("FadeMsg").show("\u6ce8\u518c\u6210\u529f"); else {
            cc.find("Loading").getComponent("Loading").close();
            void 0 != data.message.username ? cc.find("FadeMsg").getComponent("FadeMsg").show(data.message.username) : cc.find("FadeMsg").getComponent("FadeMsg").show(data.message.zh);
          }
        });
      },
      tapBack: function tapBack(sender, customEventData) {
        cc.director.loadScene("LoginScene");
      }
    });
    cc._RF.pop();
  }, {
    App: "App"
  } ],
  ResetPasswordScene: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "207502lKTpKkJ9WkqGNeJ7o", "ResetPasswordScene");
    "use strict";
    cc.Class({
      extends: cc.Component,
      properties: {},
      onLoad: function onLoad() {
        cc.debug.setDisplayStats(false);
        cc.view.setOrientation(cc.macro.ORIENTATION_LANDSCAPE);
      },
      start: function start() {},
      tapConfirm: function tapConfirm(sender, customEventData) {},
      tapBack: function tapBack(sender, customEventData) {
        cc.director.loadScene("LoginScene");
      }
    });
    cc._RF.pop();
  }, {} ],
  SDKNode: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "eabdbZ3z8BLbqcnzRbt7Omn", "SDKNode");
    "use strict";
    var SDKTools = require("SDKTools");
    var App = require("App");
    cc.Class({
      extends: cc.Component,
      properties: {},
      onLoad: function onLoad() {
        cc.game.addPersistRootNode(this.node);
        SDKTools.init();
      },
      start: function start() {},
      finishSelectImage: function finishSelectImage(savaPath, imageWidth, imageHeight) {
        App.emit("finishSelectImage", savaPath, imageWidth, imageHeight);
      },
      finishScanCard: function finishScanCard(cardNumber) {
        App.emit("finishScanCard", cardNumber);
      },
      finishCreateQRImage: function finishCreateQRImage(url, qrCodeSavePath, width, height) {
        App.emit("finishCreateQRImage", url, qrCodeSavePath, width, height);
      }
    });
    cc._RF.pop();
  }, {
    App: "App",
    SDKTools: "SDKTools"
  } ],
  SDKTools: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "b0dcbB2mXFP0KogXpSUUCmW", "SDKTools");
    "use strict";
    var SDKTools = function SDKTools() {};
    var CryptoJS = require("CryptoJS");
    var className = "";
    SDKTools.init = function() {
      cc.sys.isNative && cc.sys.os == cc.sys.OS_IOS ? className = "SDKTools" : cc.sys.isNative && cc.sys.os == cc.sys.OS_ANDROID && (className = "org/cocos/plugins/SDKTools");
    };
    SDKTools.selectAlbumImage = function() {
      if (cc.sys.isNative) {
        var now = new Date();
        var nowStr = String(now.getTime());
        var writablePath = jsb.fileUtils.getWritablePath();
        var savePath = writablePath + String(CryptoJS.MD5(nowStr));
        if (cc.sys.isNative && cc.sys.os == cc.sys.OS_IOS) {
          var ret = jsb.reflection.callStaticMethod(className, "selectAlbumImage:", savePath);
          return ret;
        }
        if (cc.sys.isNative && cc.sys.os == cc.sys.OS_ANDROID) {
          var _ret = jsb.reflection.callStaticMethod(className, "selectAlbumImage", "(Ljava/lang/String;)V", savePath);
          return _ret;
        }
      }
    };
    SDKTools.scanCard = function() {
      if (cc.sys.isNative && cc.sys.os == cc.sys.OS_ANDROID) {
        var ret = jsb.reflection.callStaticMethod(className, "scanCard", "(Ljava/lang/String;)V", "foo");
        return ret;
      }
    };
    SDKTools.copyToClipBoard = function(text) {
      if (cc.sys.isNative && cc.sys.os == cc.sys.OS_ANDROID) {
        var ret = jsb.reflection.callStaticMethod(className, "copyToClipBoard", "(Ljava/lang/String;)V", text);
        return ret;
      }
    };
    SDKTools.saveToPhotoAlbum = function() {
      if (cc.sys.isNative && cc.sys.os == cc.sys.OS_ANDROID) {
        var ret = jsb.reflection.callStaticMethod(className, "saveToPhotoAlbum", "(Ljava/lang/String;)V", "foo");
        return ret;
      }
    };
    SDKTools.createQRImage = function(url, width, height) {
      if (cc.sys.isNative) {
        var writablePath = jsb.fileUtils.getWritablePath();
        var qrCodeSavePath = writablePath + "qrcode.jpg";
        if (cc.sys.isNative && cc.sys.os == cc.sys.OS_ANDROID) {
          var ret = jsb.reflection.callStaticMethod(className, "createQRImage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", url, qrCodeSavePath, width, height);
          return ret;
        }
        cc.sys.isNative && cc.sys.OS_IOS;
      }
    };
    module.exports = SDKTools;
    cc._RF.pop();
  }, {
    CryptoJS: "CryptoJS"
  } ],
  ShaderHelper: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "49d0auleM9GkaUgf+inMFoR", "ShaderHelper");
    "use strict";
    var __extends = this && this.__extends || function() {
      var extendStatics = function(d, b) {
        extendStatics = Object.setPrototypeOf || {
          __proto__: []
        } instanceof Array && function(d, b) {
          d.__proto__ = b;
        } || function(d, b) {
          for (var p in b) b.hasOwnProperty(p) && (d[p] = b[p]);
        };
        return extendStatics(d, b);
      };
      return function(d, b) {
        extendStatics(d, b);
        function __() {
          this.constructor = d;
        }
        d.prototype = null === b ? Object.create(b) : (__.prototype = b.prototype, new __());
      };
    }();
    var __decorate = this && this.__decorate || function(decorators, target, key, desc) {
      var c = arguments.length, r = c < 3 ? target : null === desc ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
      if ("object" === typeof Reflect && "function" === typeof Reflect.decorate) r = Reflect.decorate(decorators, target, key, desc); else for (var i = decorators.length - 1; i >= 0; i--) (d = decorators[i]) && (r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r);
      return c > 3 && r && Object.defineProperty(target, key, r), r;
    };
    Object.defineProperty(exports, "__esModule", {
      value: true
    });
    var _a = cc._decorator, ccclass = _a.ccclass, property = _a.property, executeInEditMode = _a.executeInEditMode;
    var ShaderProperty = function() {
      function ShaderProperty() {
        this.key = "";
        this.value = 0;
      }
      __decorate([ property({
        readonly: true
      }) ], ShaderProperty.prototype, "key", void 0);
      __decorate([ property(cc.Float) ], ShaderProperty.prototype, "value", void 0);
      ShaderProperty = __decorate([ ccclass("ShaderProperty") ], ShaderProperty);
      return ShaderProperty;
    }();
    exports.ShaderProperty = ShaderProperty;
    var ShaderEnum = cc.Enum({});
    var ShaderHelper = function(_super) {
      __extends(ShaderHelper, _super);
      function ShaderHelper() {
        var _this = null !== _super && _super.apply(this, arguments) || this;
        _this._program = 0;
        _this._props = [];
        _this.material = null;
        return _this;
      }
      ShaderHelper_1 = ShaderHelper;
      Object.defineProperty(ShaderHelper.prototype, "program", {
        get: function() {
          return this._program;
        },
        set: function(value) {
          if (this._program === value) return;
          this._program = value;
          this.applyEffect();
        },
        enumerable: true,
        configurable: true
      });
      Object.defineProperty(ShaderHelper.prototype, "props", {
        get: function() {
          return this._props;
        },
        set: function(value) {
          this._props = value;
          this.applyEffect();
        },
        enumerable: true,
        configurable: true
      });
      ShaderHelper.prototype.start = function() {
        var _this = this;
        false;
        this.applyEffect();
      };
      ShaderHelper.prototype.applyEffect = function() {
        var sprite = this.node.getComponent(cc.Sprite) || this.node.getComponent(cc.Label);
        if (!sprite) return;
        var effectAsset = ShaderHelper_1.effectAssets[this.program];
        var material = new cc.Material();
        var defineUserTexture = !!effectAsset.shaders.find(function(shader) {
          return shader.defines.find(function(def) {
            return "USE_TEXTURE" === def.name;
          });
        });
        defineUserTexture && material.define("USE_TEXTURE", true);
        material.effectAsset = effectAsset;
        material.name = effectAsset.name;
        sprite.setMaterial(0, material);
        this.material = sprite.getMaterial(0);
        this.setProperty(effectAsset);
      };
      ShaderHelper.prototype.setProperty = function(effectAsset) {
        var _this = this;
        var oldProps;
        var keys;
        var values;
        var _loop_1;
        var this_1;
        var i;
        var shaderTimer;
        false;
        this._props.length && this._props.forEach(function(item) {
          return item.key && _this.material.setProperty(item.key, item.value || 0);
        });
        cc.Class.Attr.setClassAttr(ShaderHelper_1, "props", "visible", !!this._props.length);
      };
      ShaderHelper.prototype.next = function() {
        this.program = (this.program + 1) % ShaderHelper_1.effectAssets.length;
      };
      var ShaderHelper_1;
      ShaderHelper.effectAssets = null;
      __decorate([ property ], ShaderHelper.prototype, "_program", void 0);
      __decorate([ property({
        type: ShaderEnum
      }) ], ShaderHelper.prototype, "program", null);
      __decorate([ property({
        type: [ ShaderProperty ]
      }) ], ShaderHelper.prototype, "_props", void 0);
      __decorate([ property({
        type: [ ShaderProperty ]
      }) ], ShaderHelper.prototype, "props", null);
      ShaderHelper = ShaderHelper_1 = __decorate([ ccclass, executeInEditMode ], ShaderHelper);
      return ShaderHelper;
    }(cc.Component);
    exports.default = ShaderHelper;
    cc.game.on(cc.game.EVENT_ENGINE_INITED, function() {
      cc.loader.loadResDir("effects", cc.EffectAsset, function(error, res) {
        ShaderHelper.effectAssets = res;
        var array = ShaderHelper.effectAssets.map(function(item, i) {
          return {
            name: item._name,
            value: i
          };
        });
        cc.Class.Attr.setClassAttr(ShaderHelper, "program", "enumList", array);
      });
    });
    cc._RF.pop();
  }, {} ],
  ShaderNameLabel: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "4cd0ffQe75Ddod5dqnEgLHx", "ShaderNameLabel");
    "use strict";
    var __extends = this && this.__extends || function() {
      var extendStatics = function(d, b) {
        extendStatics = Object.setPrototypeOf || {
          __proto__: []
        } instanceof Array && function(d, b) {
          d.__proto__ = b;
        } || function(d, b) {
          for (var p in b) b.hasOwnProperty(p) && (d[p] = b[p]);
        };
        return extendStatics(d, b);
      };
      return function(d, b) {
        extendStatics(d, b);
        function __() {
          this.constructor = d;
        }
        d.prototype = null === b ? Object.create(b) : (__.prototype = b.prototype, new __());
      };
    }();
    var __decorate = this && this.__decorate || function(decorators, target, key, desc) {
      var c = arguments.length, r = c < 3 ? target : null === desc ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
      if ("object" === typeof Reflect && "function" === typeof Reflect.decorate) r = Reflect.decorate(decorators, target, key, desc); else for (var i = decorators.length - 1; i >= 0; i--) (d = decorators[i]) && (r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r);
      return c > 3 && r && Object.defineProperty(target, key, r), r;
    };
    Object.defineProperty(exports, "__esModule", {
      value: true
    });
    var ShaderHelper_1 = require("./ShaderHelper");
    var _a = cc._decorator, ccclass = _a.ccclass, property = _a.property, executeInEditMode = _a.executeInEditMode;
    var NewClass = function(_super) {
      __extends(NewClass, _super);
      function NewClass() {
        var _this = null !== _super && _super.apply(this, arguments) || this;
        _this.shaderHelper = null;
        return _this;
      }
      NewClass.prototype.start = function() {
        var _this = this;
        if (!this.shaderHelper) return;
        setTimeout(function() {
          var effectAsset = ShaderHelper_1.default.effectAssets[_this.shaderHelper.program];
          _this.getComponent(cc.Label).string = effectAsset.name;
        }, 1e3);
      };
      __decorate([ property(ShaderHelper_1.default) ], NewClass.prototype, "shaderHelper", void 0);
      NewClass = __decorate([ ccclass, executeInEditMode ], NewClass);
      return NewClass;
    }(cc.Component);
    exports.default = NewClass;
    cc._RF.pop();
  }, {
    "./ShaderHelper": "ShaderHelper"
  } ],
  ShaderTime: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "5866cn/yXtO664c25gnwSdk", "ShaderTime");
    "use strict";
    var __extends = this && this.__extends || function() {
      var extendStatics = function(d, b) {
        extendStatics = Object.setPrototypeOf || {
          __proto__: []
        } instanceof Array && function(d, b) {
          d.__proto__ = b;
        } || function(d, b) {
          for (var p in b) b.hasOwnProperty(p) && (d[p] = b[p]);
        };
        return extendStatics(d, b);
      };
      return function(d, b) {
        extendStatics(d, b);
        function __() {
          this.constructor = d;
        }
        d.prototype = null === b ? Object.create(b) : (__.prototype = b.prototype, new __());
      };
    }();
    var __decorate = this && this.__decorate || function(decorators, target, key, desc) {
      var c = arguments.length, r = c < 3 ? target : null === desc ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
      if ("object" === typeof Reflect && "function" === typeof Reflect.decorate) r = Reflect.decorate(decorators, target, key, desc); else for (var i = decorators.length - 1; i >= 0; i--) (d = decorators[i]) && (r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r);
      return c > 3 && r && Object.defineProperty(target, key, r), r;
    };
    Object.defineProperty(exports, "__esModule", {
      value: true
    });
    var _a = cc._decorator, ccclass = _a.ccclass, property = _a.property;
    var ShaderTime = function(_super) {
      __extends(ShaderTime, _super);
      function ShaderTime() {
        var _this = null !== _super && _super.apply(this, arguments) || this;
        _this._max = 65535;
        _this._start = 0;
        return _this;
      }
      Object.defineProperty(ShaderTime.prototype, "max", {
        get: function() {
          return this._max;
        },
        set: function(value) {
          this._max = value;
          true;
          return;
          var sprite;
          var material;
        },
        enumerable: true,
        configurable: true
      });
      ShaderTime.prototype.update = function(dt) {
        this._material = this.node.getComponent(cc.Sprite).sharedMaterials[0];
        this.node.active && this._material && this._material.effect._properties.time && this._setShaderTime(dt);
      };
      ShaderTime.prototype._setShaderTime = function(dt) {
        var start = this._start;
        start > this.max && (start = 0);
        start += .02;
        this._material.effect.setProperty("time", start);
        this._start = start;
      };
      __decorate([ property ], ShaderTime.prototype, "_max", void 0);
      __decorate([ property ], ShaderTime.prototype, "max", null);
      ShaderTime = __decorate([ ccclass ], ShaderTime);
      return ShaderTime;
    }(cc.Component);
    exports.default = ShaderTime;
    cc._RF.pop();
  }, {} ],
  ShishileScene: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "6bff3tNsTlPxKVgNOzXlBvv", "ShishileScene");
    "use strict";
    var App = require("App");
    var Tools = require("Tools");
    cc.Class({
      extends: cc.Component,
      properties: {
        mainPanel: {
          default: null,
          type: cc.Node
        },
        heroInfoPanel: {
          default: null,
          type: cc.Node
        },
        recordPanel: {
          default: null,
          type: cc.Node
        },
        bg: {
          default: null,
          type: cc.Sprite
        },
        title: {
          default: null,
          type: cc.Label
        },
        heroData: Object,
        winnerData: Object,
        winnerIcon: {
          default: null,
          type: cc.Sprite
        },
        winnerName: {
          default: null,
          type: cc.Label
        },
        winnnerNo: {
          default: null,
          type: cc.Label
        },
        winnerProfile: {
          default: null,
          type: cc.Label
        },
        eid: {
          default: null,
          type: cc.Label
        },
        eidValue: 0,
        countdown: {
          default: null,
          type: cc.Label
        },
        countdownValue: 0,
        countdownComponent: cc.Component,
        betOrderList: {
          default: null,
          type: cc.ScrollView
        },
        betOrderItem: {
          default: null,
          type: cc.Node
        },
        gokBet: {
          default: null,
          type: cc.Node
        },
        dotaBet: {
          default: null,
          type: cc.Node
        },
        rootBet: {
          default: null,
          type: cc.Node
        },
        betSuccessPanel: {
          default: null,
          type: cc.Prefab
        },
        heroInfoList: {
          default: null,
          type: cc.ScrollView
        },
        heroInfoItem: {
          default: null,
          type: cc.Node
        },
        gameType: "gok",
        lotteryRecordList: {
          default: null,
          type: cc.ScrollView
        },
        lotteryRecordItem: {
          default: null,
          type: cc.Node
        },
        lotteryAnimationRoot: {
          default: null,
          type: cc.Node
        },
        heroIconItem: {
          default: null,
          type: cc.Node
        }
      },
      getTime: function getTime() {
        cc.log(new Date().getTime() / 1e3);
      },
      onLoad: function onLoad() {
        cc.debug.setDisplayStats(false);
        cc.view.setOrientation(cc.macro.ORIENTATION_LANDSCAPE);
        this.mainPanel.active = true;
        this.heroInfoPanel.active = false;
        this.recordPanel.active = false;
        this.betOrderItem.active = false;
        this.gokBet.active = true;
        this.dotaBet.active = false;
        this.closeRollHero();
        this.heroIconItem.active = false;
        this.countdownComponent = new cc.Component();
        this.initWithGameType(App.gameType);
        var self = this;
        cc.game.on(cc.game.EVENT_HIDE, function() {});
        cc.game.on(cc.game.EVENT_SHOW, function(event) {
          self.requestGameInit();
        });
        this.heroIconSpriteFrameArray = new Array();
        var heroCount = {
          gok: 88,
          lol: 142,
          dota: 113
        };
        var heroIconPath = "/shishile/" + this.gameType + "/";
        var _loop = function _loop(i) {
          var url = heroIconPath + i;
          cc.loader.loadRes(url, cc.SpriteFrame, function(err, spriteFrame) {
            if (err) {
              cc.log(err);
              return;
            }
            self.heroIconSpriteFrameArray[i] = spriteFrame;
          });
        };
        for (var i = 1; i <= heroCount[this.gameType]; i++) _loop(i);
      },
      getGameIndex: function getGameIndex() {
        for (var i = 0; i < this.heroData.length; i++) if (this.heroData[i].lastWinner.game == this.gameType) return i;
        return null;
      },
      initWithGameType: function initWithGameType(gameType) {
        void 0 != gameType && (this.gameType = gameType);
        "lol" == this.gameType || "gok" == this.gameType ? this.rootBet = this.gokBet : "dota" == this.gameType && (this.rootBet = this.dotaBet);
        var bgPath = "/shishile/bg/" + this.gameType;
        var self = this;
        cc.loader.loadRes(bgPath, cc.SpriteFrame, function(err, spriteFrame) {
          if (err) return;
          self.bg.spriteFrame = spriteFrame;
        });
        this.requestGameInit();
      },
      requestGameInit: function requestGameInit() {
        var self = this;
        App.get("/games/shishile", function(data) {
          if (200 == parseInt(data.code)) {
            self.heroData = data.data;
            self.winnerData = self.heroData[self.getGameIndex()].lastWinner;
            self.eidValue = Number(self.heroData[self.getGameIndex()].eid);
            self.title.string = self.heroData[self.getGameIndex()].name;
            self.countdownValue = self.heroData[self.getGameIndex()].countDown;
            self.updateWinner();
            self.updateOtherInterface();
          } else cc.find("FadeMsg").getComponent("FadeMsg").show("\u7f51\u7edc\u9519\u8bef\uff0c\u8bf7\u8fd4\u56de\u5927\u5385");
        });
      },
      updateWinner: function updateWinner() {
        var self = this;
        var heroIconPath = "/shishile/" + this.gameType + "/";
        var url = heroIconPath + this.winnerData.no;
        cc.loader.loadRes(url, cc.SpriteFrame, function(err, spriteFrame) {
          if (err) return;
          self.winnerIcon.spriteFrame = spriteFrame;
        });
        this.winnerName.string = this.winnerData.name;
        this.winnnerNo.string = this.winnerData.no + "\u53f7";
        var profile = void 0;
        var sex = void 0;
        0 == this.winnerData.sex ? sex = "\u5973" : 1 == this.winnerData.sex && (sex = "\u7537");
        var hasMagic = void 0;
        1 == this.winnerData.hasMagic ? hasMagic = "\u6709\u9b54\u6cd5" : 0 == this.winnerData.hasMagic && (hasMagic = "\u65e0\u9b54\u6cd5");
        "gok" == this.gameType || "lol" == this.gameType ? profile = cc.js.formatStr("%s %s %s", sex, hasMagic, this.winnerData.attack) : "dota" == this.gameType && (profile = cc.js.formatStr("%s %s %s", this.winnerData.camp, this.winnerData.feature, this.winnerData.attack));
        this.winnerProfile.string = profile;
      },
      updateOtherInterface: function updateOtherInterface() {
        this.eid.string = cc.js.formatStr("\u7b2c %s \u671f\u706b\u70ed\u7ade\u731c\u4e2d", String(this.eidValue));
        var self = this;
        var firstOpenBetFlag = true;
        var firstCloseBetFlag = true;
        var firstShowRollHero = true;
        var firstCloseRollHero = true;
        var firstShowWinnerHero = true;
        this.countdownFunc && this.countdownComponent.unschedule(this.countdownFunc);
        this.countdownFunc = function(dt) {
          self.countdownValue -= dt;
          if (self.countdownValue <= 0) {
            self.countdownValue = 40 + self.countdownValue;
            firstOpenBetFlag = true;
            firstCloseBetFlag = true;
            firstShowRollHero = true;
            firstCloseRollHero = true;
            firstShowWinnerHero = true;
            self.eidValue = Number(self.eidValue) + Number(1);
            self.eid.string = cc.js.formatStr("\u7b2c %s \u671f\u706b\u70ed\u7ade\u731c\u4e2d", String(self.eidValue));
          }
          if (self.countdownValue >= 10) {
            self.countdown.string = Math.round(self.countdownValue - 10);
            if (firstOpenBetFlag) {
              self.openBet();
              firstOpenBetFlag = false;
            }
          } else {
            if (firstCloseBetFlag) {
              self.closeBet();
              firstCloseBetFlag = false;
            }
            if (firstShowRollHero) {
              self.showRollHero();
              firstShowRollHero = false;
            }
            var heroCount = {
              gok: 88,
              lol: 142,
              dota: 113
            };
            if (self.countdownValue >= 9) self.showLotteryAnimation(1334, 750, 4, 7, 1, .9, self.heroIconSpriteFrameArray, heroCount[self.gameType]); else if (self.countdownValue >= 8) self.showLotteryAnimation(1334, 750, 4, 7, 1, .9, self.heroIconSpriteFrameArray, heroCount[self.gameType]); else if (self.countdownValue >= 7) self.showLotteryAnimation(1334, 750, 4, 7, 1, .9, self.heroIconSpriteFrameArray, heroCount[self.gameType]); else if (self.countdownValue >= 6) self.showLotteryAnimation(1334, 750, 4, 7, 1, .9, self.heroIconSpriteFrameArray, heroCount[self.gameType]); else if (self.countdownValue >= 5) self.showLotteryAnimation(1334, 750, 4, 7, 1, .9, self.heroIconSpriteFrameArray, heroCount[self.gameType]); else {
              if (firstCloseRollHero) {
                self.closeRollHero();
                firstCloseRollHero = false;
              }
              if (firstShowWinnerHero) {
                self.showWinnerHero();
                firstShowWinnerHero = false;
              }
            }
          }
        };
        this.countdownComponent.schedule(this.countdownFunc, 1);
        if ("gok" == this.gameType || "lol" == this.gameType) {
          this.gokBet.active = true;
          this.dotaBet.active = false;
          this.setupBetPanel();
        } else if ("dota" == this.gameType) {
          this.gokBet.active = false;
          this.dotaBet.active = true;
          this.setupBetPanel();
        }
      },
      openBet: function openBet() {
        this.countdown.node.getParent().active = true;
        if ("gok" == this.gameType || "lol" == this.gameType) {
          this.gokBet.active = true;
          this.dotaBet.active = false;
          this.setupBetLock(true);
        } else if ("dota" == this.gameType) {
          this.gokBet.active = false;
          this.dotaBet.active = true;
          this.setupBetLock(true);
        }
      },
      closeBet: function closeBet() {
        this.countdown.node.getParent().active = false;
        if ("gok" == this.gameType || "lol" == this.gameType) {
          this.gokBet.active = true;
          this.dotaBet.active = false;
          this.setupBetLock(false);
        } else if ("dota" == this.gameType) {
          this.gokBet.active = false;
          this.dotaBet.active = true;
          this.setupBetLock(false);
        }
      },
      showRollHero: function showRollHero() {
        this.lotteryAnimationRoot.active = true;
        this.lotteryAnimationRoot.addComponent(cc.BlockInputEvents);
      },
      closeRollHero: function closeRollHero() {
        this.lotteryAnimationRoot.active = false;
        this.lotteryAnimationRoot.getComponent(cc.BlockInputEvents) && this.lotteryAnimationRoot.removeComponent(cc.BlockInputEvents);
      },
      showWinnerHero: function showWinnerHero() {
        var getData = [ "category=" + this.heroData[this.getGameIndex()].category, "eid=" + this.eidValue ];
        var self = this;
        App.getWithData("/games/shishileResult", getData, function(data) {
          if (200 == parseInt(data.code)) {
            self.winnerData = data.data;
            self.updateWinner();
          }
        });
      },
      setupBetLock: function setupBetLock(canBet) {
        var matches = this.heroData[this.getGameIndex()].matches;
        for (var i = 0; i < matches.length; i++) {
          var bet = this.rootBet.getChildByName("bet" + i);
          bet.getComponent(cc.Label).string = matches[i].name;
          for (var j = 0; j < matches[i].odds.length; j++) {
            var odds_lock = bet.getChildByName("option" + j).getChildByName("odds_lock");
            var toggle = bet.getChildByName("option" + j).getChildByName("toggle");
            if (canBet) {
              toggle.active = true;
              odds_lock.active = false;
            } else {
              toggle.active = false;
              odds_lock.active = true;
              toggle.getComponent(cc.Toggle).uncheck();
            }
          }
        }
      },
      setupBetPanel: function setupBetPanel() {
        var matches = this.heroData[this.getGameIndex()].matches;
        for (var i = 0; i < matches.length; i++) {
          var bet = this.rootBet.getChildByName("bet" + i);
          bet.getComponent(cc.Label).string = matches[i].name;
          for (var j = 0; j < matches[i].odds.length; j++) {
            bet.getChildByName("option" + j).getComponent(cc.Label).string = matches[i].odds[j].name;
            bet.getChildByName("option" + j).getChildByName("label").getComponent(cc.Label).string = matches[i].odds[j].odds;
            var toggle = bet.getChildByName("option" + j).getChildByName("toggle");
            toggle.getComponent(cc.Toggle).uncheck();
            if (0 == toggle.getComponent(cc.Toggle).checkEvents.length) {
              var checkEventHandler = new cc.Component.EventHandler();
              checkEventHandler.target = this.node;
              checkEventHandler.component = "ShishileScene";
              checkEventHandler.handler = "checkBetOption";
              checkEventHandler.customEventData = {
                betOption: matches[i].name + " " + matches[i].odds[j].name,
                odds: matches[i].odds[j].odds,
                id: matches[i].odds[j].id,
                toggle: toggle
              };
              toggle.getComponent(cc.Toggle).checkEvents.push(checkEventHandler);
            }
          }
        }
      },
      removeAllBetOrder: function removeAllBetOrder() {
        var matches = this.heroData[this.getGameIndex()].matches;
        for (var i = 0; i < matches.length; i++) {
          var bet = this.rootBet.getChildByName("bet" + i);
          bet.getComponent(cc.Label).string = matches[i].name;
          for (var j = 0; j < matches[i].odds.length; j++) {
            var toggle = bet.getChildByName("option" + j).getChildByName("toggle");
            toggle.getComponent(cc.Toggle).uncheck();
          }
        }
      },
      checkBetOption: function checkBetOption(sender, customEventData) {
        sender.isChecked ? this.addBetOrder(customEventData) : this.removeBetOrder(customEventData);
      },
      addBetOrder: function addBetOrder(customEventData) {
        var children = this.betOrderList.content.children;
        for (var i = 0; i < children.length; i++) if (children[i].id == customEventData.id) {
          cc.log("\u91cd\u590d\u6dfb\u52a0\u4e0b\u6ce8\u8ba2\u5355\uff01\uff01\uff01");
          return;
        }
        var betOrderItem = cc.instantiate(this.betOrderItem);
        betOrderItem.active = true;
        betOrderItem.setPosition(cc.v2(0, 0));
        betOrderItem.getChildByName("betOption").getComponent(cc.Label).string = customEventData.betOption;
        betOrderItem.getChildByName("eid").getComponent(cc.Label).string = this.eidValue + "\u671f";
        betOrderItem.getChildByName("gameTitle").getComponent(cc.Label).string = this.title.string;
        betOrderItem.getChildByName("betOption").getComponent(cc.Label).string = customEventData.betOption;
        betOrderItem.expectedReturn = betOrderItem.getChildByName("expectedReturn").getChildByName("expectedReturn");
        betOrderItem.expectedReturn.getComponent(cc.Label).string = 0;
        betOrderItem.getChildByName("odds_lock").active = false;
        var amountEditBox = betOrderItem.getChildByName("editbox").getComponent(cc.EditBox);
        var editboxTextChangedEventHandler = new cc.Component.EventHandler();
        editboxTextChangedEventHandler.target = this.node;
        editboxTextChangedEventHandler.component = "ShishileScene";
        editboxTextChangedEventHandler.handler = "onAmountTextChanged";
        editboxTextChangedEventHandler.customEventData = {
          root: betOrderItem
        };
        amountEditBox.textChanged.push(editboxTextChangedEventHandler);
        var closeButton = betOrderItem.getChildByName("close").getComponent(cc.Button);
        var clickEventHandler = new cc.Component.EventHandler();
        clickEventHandler.target = this.node;
        clickEventHandler.component = "ShishileScene";
        clickEventHandler.handler = "tapCloseBetOrderItem";
        clickEventHandler.customEventData = {
          id: customEventData.id,
          toggle: customEventData.toggle,
          odds: customEventData.odds
        };
        closeButton.clickEvents.push(clickEventHandler);
        betOrderItem.id = customEventData.id;
        betOrderItem.edit = this.eidValue;
        betOrderItem.odds = customEventData.odds;
        this.betOrderList.content.addChild(betOrderItem);
      },
      onAmountTextChanged: function onAmountTextChanged(text, editbox, customEventData) {
        var amountEditBox = customEventData.root.getChildByName("editbox").getComponent(cc.EditBox);
        var str = amountEditBox.string;
        var amount = false == Boolean(parseInt(str)).valueOf() ? 0 : parseInt(str);
        customEventData.root.expectedReturn.getComponent(cc.Label).string = Number(amount * customEventData.root.odds).toFixed(2);
      },
      removeBetOrder: function removeBetOrder(customEventData) {
        var children = this.betOrderList.content.children;
        for (var k = 0; k < children.length; k++) if (children[k].id == customEventData.id) {
          this.betOrderList.content.removeChild(children[k]);
          customEventData.toggle.getComponent(cc.Toggle).uncheck();
          break;
        }
      },
      tapCloseBetOrderItem: function tapCloseBetOrderItem(event, customEventData) {
        this.removeBetOrder(customEventData);
      },
      tapImmediatelyBet: function tapImmediatelyBet(sender, customEventData) {
        var children = this.betOrderList.content.children;
        var array = new Array();
        for (var k = 0; k < children.length; k++) {
          var str = children[k].getChildByName("editbox").getComponent(cc.EditBox).string;
          var amount = false == Boolean(parseInt(str)).valueOf() ? 0 : parseInt(str);
          array.push({
            amount: amount,
            oddsId: children[k].id,
            matchId: children[k].eid
          });
        }
        var self = this;
        App.postWithToken("/esbets/addMultiple", array, function(data) {
          if (200 == parseInt(data.code)) {
            App.myUser.setup({
              balance: data.data
            });
            var betSuccessPanel = cc.instantiate(self.betSuccessPanel);
            cc.find("Canvas").addChild(betSuccessPanel);
            self.removeAllBetOrder();
          } else {
            cc.log(data);
            cc.find("FadeMsg").getComponent("FadeMsg").show(data.message.zh);
          }
        });
      },
      start: function start() {},
      tapHeroInfo: function tapHeroInfo(sender, customEventData) {
        this.mainPanel.active = false;
        this.heroInfoPanel.active = true;
        this.recordPanel.active = false;
        this.heroInfoItem.active = false;
        var self = this;
        var getData = [ "game=" + this.gameType ];
        App.getWithData("/games/heros", getData, function(data) {
          if (200 == parseInt(data.code)) {
            self.heroInfoList.content.removeAllChildren();
            for (var i = 0; i < data.data.length; i += 4) {
              var heroInfoItem = cc.instantiate(self.heroInfoItem);
              heroInfoItem.active = true;
              heroInfoItem.setPosition(cc.v2(0, 0));
              for (var j = 0; j < 4; j++) {
                var item = heroInfoItem.getChildByName("item" + j);
                i + j < data.data.length ? function() {
                  var info = item.getChildByName("info");
                  var bg = item.getChildByName("bg");
                  var heroIconPath = "/shishile/" + self.gameType + "/";
                  var url = heroIconPath + data.data[i + j].no;
                  cc.loader.loadRes(url, cc.SpriteFrame, function(err, spriteFrame) {
                    if (err) return;
                    bg.getComponent(cc.Sprite).spriteFrame = spriteFrame;
                  });
                  info.getChildByName("name").getComponent(cc.Label).string = data.data[i + j].name;
                  info.getChildByName("no").getComponent(cc.Label).string = data.data[i + j].no;
                  var profile = void 0;
                  var sex = void 0;
                  0 == data.data[i + j].sex ? sex = "\u5973" : 1 == data.data[i + j].sex && (sex = "\u7537");
                  var hasMagic = void 0;
                  1 == data.data[i + j].hasMagic ? hasMagic = "\u6709\u9b54\u6cd5" : 0 == data.data[i + j].hasMagic && (hasMagic = "\u65e0\u9b54\u6cd5");
                  var no = void 0;
                  no = data.data[i + j].no % 2 == 0 ? "\u53cc" : "\u5355";
                  "gok" == self.gameType || "lol" == self.gameType ? profile = cc.js.formatStr("%s %s %s %s", sex, hasMagic, data.data[i + j].attack, no) : "dota" == self.gameType && (profile = cc.js.formatStr("%s %s %s %s", data.data[i + j].camp, data.data[i + j].feature, data.data[i + j].attack, no));
                  info.getChildByName("profile").getComponent(cc.Label).string = profile;
                }() : item.active = false;
              }
              self.heroInfoList.content.addChild(heroInfoItem);
            }
          }
        });
      },
      tapRecord: function tapRecord(sender, customEventData) {
        this.mainPanel.active = false;
        this.heroInfoPanel.active = false;
        this.recordPanel.active = true;
        this.lotteryRecordItem.active = false;
        var self = this;
        var category = void 0;
        "gok" == self.gameType || "lol" == self.gameType ? category = 3 : "dota" == self.gameType && (category = 1);
        var getData = [ "category=" + category, "eid=" + this.eidValue ];
        App.getWithData("/games/shishileRecords", getData, function(data) {
          if (200 == parseInt(data.code)) {
            self.lotteryRecordList.content.removeAllChildren();
            for (var i = 0; i < data.data.length; i++) {
              var lotteryRecordItem = cc.instantiate(self.lotteryRecordItem);
              lotteryRecordItem.active = true;
              lotteryRecordItem.setPosition(cc.v2(0, 0));
              lotteryRecordItem.getChildByName("eid").getComponent(cc.Label).string = data.data[i].eid;
              lotteryRecordItem.getChildByName("no").getComponent(cc.Label).string = data.data[i].no;
              lotteryRecordItem.getChildByName("name").getComponent(cc.Label).string = data.data[i].name;
              data.data[i].no % 2 == 0, lotteryRecordItem.getChildByName("even_or_odd").getComponent(cc.Label).string = "\u53cc";
              "gok" == self.gameType || "lol" == self.gameType ? 1 == data.data[i].sex ? lotteryRecordItem.getChildByName("sex").getComponent(cc.Label).string = "\u7537" : 0 == data.data[i].sex && (lotteryRecordItem.getChildByName("sex").getComponent(cc.Label).string = "\u5973") : "dota" == self.gameType && (lotteryRecordItem.getChildByName("sex").getComponent(cc.Label).string = data.data[i].camp);
              "gok" == self.gameType || "lol" == self.gameType ? 1 == data.data[i].hasMagic ? lotteryRecordItem.getChildByName("hasMagic").getComponent(cc.Label).string = "\u6709" : 0 == data.data[i].hasMagic && (lotteryRecordItem.getChildByName("hasMagic").getComponent(cc.Label).string = "\u65e0") : "dota" == self.gameType && (lotteryRecordItem.getChildByName("hasMagic").getComponent(cc.Label).string = data.data[i].feature);
              lotteryRecordItem.getChildByName("attackType").getComponent(cc.Label).string = data.data[i].attack;
              self.lotteryRecordList.content.addChild(lotteryRecordItem);
            }
          }
        });
      },
      tapCloseHeroInfo: function tapCloseHeroInfo(sender, customEventData) {
        this.mainPanel.active = true;
        this.heroInfoPanel.active = false;
        this.recordPanel.active = false;
      },
      tapCloseRecord: function tapCloseRecord(sender, customEventData) {
        this.mainPanel.active = true;
        this.heroInfoPanel.active = false;
        this.recordPanel.active = false;
      },
      tapBack: function tapBack(sender, customEventData) {
        cc.director.loadScene("HallScene");
      },
      checkBetOrderOrRecord: function checkBetOrderOrRecord(sender, customEventData) {},
      showLotteryAnimation: function showLotteryAnimation(width, height, row, col, step, duration, heroIconSpriteFrameArray, heroCount) {
        this.heroIconItem.active = false;
        var self = this;
        var rootWidth = width / col * (col + 2);
        var rootHeight = height / row * (row + 2);
        this.lotteryAnimationRoot.setContentSize(cc.size(rootWidth, rootHeight));
        this.lotteryAnimationRoot.setAnchorPoint(cc.v2(0, 0));
        this.lotteryAnimationRoot.setPosition(cc.v2(-rootWidth / 2, -rootHeight / 2));
        var mask = this.lotteryAnimationRoot.getChildByName("mask");
        mask.removeAllChildren();
        var heroIconPath = "/shishile/" + this.gameType + "/";
        for (var i = 0; i < row + 2; i++) for (var j = 0; j < col + 2; j++) {
          var heroIconItem = cc.instantiate(this.heroIconItem);
          heroIconItem.active = true;
          for (var k = 0; k < 9; k++) {
            var item = heroIconItem.getChildByName("item" + k);
            var url = heroIconPath + Tools.getRandomInt(1, heroCount);
            var no = Tools.getRandomInt(1, heroCount);
            item.getComponent(cc.Sprite).spriteFrame = heroIconSpriteFrameArray[no];
          }
          var posX = width / col * (j - step + .5);
          var posY = height / row * (i - step + .5);
          heroIconItem.setPosition(cc.v2(posX, posY));
          mask.addChild(heroIconItem);
        }
        var children = mask.children;
        for (var _i = 0; _i < children.length; _i++) {
          var randomSignX = Tools.getRandomInt(0, 2);
          var signX = void 0;
          0 == randomSignX ? signX = 0 : 1 == randomSignX ? signX = 1 : 2 == randomSignX && (signX = -1);
          var randomSignY = Tools.getRandomInt(0, 2);
          var signY = void 0;
          0 == randomSignY ? signY = 0 : 1 == randomSignY ? signY = 1 : 2 == randomSignY && (signY = -1);
          var _posX = signX * (width / col);
          var _posY = signY * (height / row);
          var moveBy = new cc.moveBy(duration, cc.v2(_posX, _posY));
        }
      },
      onDestroy: function onDestroy() {
        this.countdownFunc && this.countdownComponent.unschedule(this.countdownFunc);
        App.off("channel.LOTTEY");
        App.off("channel.LOTTEY_RESULT");
      }
    });
    cc._RF.pop();
  }, {
    App: "App",
    Tools: "Tools"
  } ],
  Tools: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "d8523KiWk9BIasgGUtZSTLo", "Tools");
    "use strict";
    var Tools = function Tools() {};
    Tools.isLeapYear = function(y) {
      return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
    };
    Tools.getMonthDays = function(y, m) {
      var t = void 0;
      t = Tools.isLeapYear(y) ? [ 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 ] : [ 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 ];
      return t[m];
    };
    Tools.getWeek = function(y, m, d) {
      if (1 == m || 2 == m) {
        m += 12;
        y--;
      }
      var w = (d + 2 * m + Math.floor(3 * (m + 1) / 5) + y + Math.floor(y / 4) - Math.floor(y / 100) + Math.floor(y / 400) + 1) % 7;
      return w;
    };
    Tools.getWeekStr = function(y, m, d) {
      var w = Tools.getWeek(y, m, d);
      var str = [ "\u5468\u65e5", "\u5468\u4e00", "\u5468\u4e8c", "\u5468\u4e09", "\u5468\u56db", "\u5468\u4e94", "\u5468\u516d" ];
      return str[w];
    };
    Tools.todayStr = function() {
      var today = new Date();
      var todayStr = today.getFullYear() + "-" + (today.getMonth() + 1) + "-" + today.getDate();
      return todayStr;
    };
    Tools.timeStr = function() {
      var time = new Date();
      var timeStr = time.getHours() + ":" + time.getMinutes() + ":" + time.getSeconds();
      return timeStr;
    };
    Tools.nextDateStr = function() {
      var curDate = new Date();
      var nextDate = new Date(curDate.getTime() + 864e5);
      var nextDateStr = nextDate.getFullYear() + "-" + (nextDate.getMonth() + 1) + "-" + nextDate.getDate();
      return nextDateStr;
    };
    Tools.getLowerArab = function(num) {
      var str = [ "\u96f6", "\u4e00", "\u4e8c", "\u4e09", "\u56db", "\u4e94", "\u516d", "\u4e03", "\u516b", "\u4e5d", "\u5341", "\u767e", "\u5343", "\u4e07" ];
      if (num >= 0 && num <= 10) return str[num];
      if (100 == num) return str[11];
      if (1e3 == num) return str[12];
      if (num = 1e4) return str[13];
    };
    Tools.getBankCardNumber = function(number) {
      var str = number;
      var reg = /^(\d{4})\d+(\d{4})$/;
      str = str.replace(reg, "$1 **** **** $2");
      return str;
    };
    Tools.findChildByName = function(root, name) {
      var child = root.getChildByName(name);
      if (child) return child;
      var children = root.children;
      for (var i = 0; i < children.length; i++) {
        var rightone = Tools.findChildByName(children[i], name);
        if (rightone) return rightone;
      }
      return null;
    };
    Tools.getRandomInt = function(min, max) {
      return Math.floor(Math.random() * (max - min + 1)) + min;
    };
    Tools.GetGameStateStr = function(state) {
      var stateStr = [ "\u7ade\u731c\u4e2d", "\u6bd4\u8d5b\u4e2d", "\u5df2\u53d6\u6d88", "\u5df2\u6682\u505c", "\u5df2\u7ed3\u675f", "\u5df2\u7ed3\u7b97" ];
      return stateStr[state];
    };
    module.exports = Tools;
    cc._RF.pop();
  }, {} ],
  UpdateScene: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "00403DL40xP/7qqcKP/ytIb", "UpdateScene");
    "use strict";
    cc.Class({
      extends: cc.Component,
      properties: {
        progressBar: {
          default: null,
          type: cc.ProgressBar
        },
        status: {
          default: null,
          type: cc.Label
        },
        percent: {
          default: null,
          type: cc.Label
        },
        updateServerUrl: "http://192.168.0.82:8080/heroesports",
        user: "opener",
        updateDir: "update",
        updateTempDir: "updateTemp"
      },
      onLoad: function onLoad() {
        cc.log("onLoad");
        cc.debug.setDisplayStats(false);
        cc.view.setOrientation(cc.macro.ORIENTATION_LANDSCAPE);
        var self = this;
        this.initUpdate();
        var xhr = new XMLHttpRequest();
        var url = this.updateServerUrl + "/update/appversion?user=" + this.user;
        xhr.open("GET", url);
        xhr.send();
        xhr.onreadystatechange = function() {
          if (4 === xhr.readyState && 200 === xhr.status) {
            var jsonData = null;
            try {
              jsonData = JSON.parse(xhr.responseText);
            } catch (e) {
              cc.log("parsing error: ", xhr.responseText);
            }
            if (200 == parseInt(jsonData.code)) {
              var major = jsonData.data.major;
              var minor = jsonData.data.minor;
              self.updateUrl = self.updateServerUrl + jsonData.data.updateUrl;
              self.forceUpdateUrl = jsonData.data.forceUpdateUrl;
              self.pakcageJsonUrl = jsonData.data.pakcageJsonUrl;
              self.checkNeedUpate(major, minor);
            }
          }
        };
      },
      initUpdate: function initUpdate() {
        var writeablePath = jsb.fileUtils.getWritablePath();
        this.updateDir = writeablePath + this.updateDir;
        if (false == jsb.fileUtils.isDirectoryExist(this.updateDir)) {
          var packageJson = jsb.fileUtils.getStringFromFile("res/package.json");
          var jsonData = JSON.parse(packageJson);
          jsb.fileUtils.createDirectory(this.updateDir);
          for (var filePath in jsonData.files) this.copyAssetFile(filePath);
          var fileData = jsb.fileUtils.getDataFromFile("res/package.json");
          jsb.fileUtils.writeDataToFile(fileData, this.updateDir + "/res/package.json");
        }
        this.updateTempDir = writeablePath + this.updateTempDir;
        false == jsb.fileUtils.isDirectoryExist(this.updateTempDir) && jsb.fileUtils.createDirectory(this.updateTempDir);
      },
      checkNeedUpate: function checkNeedUpate(remoteMajor, remoteMinor) {
        var packageJson = jsb.fileUtils.getStringFromFile(this.updateDir + "/res/package.json");
        var jsonData = JSON.parse(packageJson);
        var localMajor = jsonData.major;
        var localMinor = jsonData.minor;
        cc.log("\u672c\u5730\u7248\u672c\u53f7:", localMajor, localMinor);
        cc.log("\u670d\u52a1\u5668\u7248\u672c\u53f7:", remoteMajor, remoteMinor);
        localMajor < remoteMajor ? cc.sys.openURL(this.forceUpdateUrl) : localMajor > remoteMajor ? cc.director.loadScene("LoginScene") : (localMajor = remoteMajor) && (localMinor < remoteMinor ? this.fetchResourceList() : cc.director.loadScene("LoginScene"));
      },
      copyAssetFile: function copyAssetFile(filePath) {
        var dotIndex = filePath.lastIndexOf("/");
        var tempDir = filePath.substr(0, dotIndex);
        var dir = this.updateDir + "/" + tempDir;
        false == jsb.fileUtils.isDirectoryExist(dir) && jsb.fileUtils.createDirectory(dir);
        var fileData = jsb.fileUtils.getDataFromFile(filePath);
        jsb.fileUtils.writeDataToFile(fileData, this.updateDir + "/" + filePath);
      },
      fetchResourceList: function fetchResourceList() {
        var self = this;
        var path = this.updateTempDir + "/package.json";
        var url = this.updateServerUrl + this.pakcageJsonUrl;
        cc.log(path, url);
        mycc.HttpHelper.getInstance().fetch(url, path, function(ok, filename) {
          ok && self.compareFiles();
        });
      },
      compareFiles: function compareFiles() {
        var localPackageJson = jsb.fileUtils.getStringFromFile(this.updateDir + "/res/package.json");
        var localJsonData = JSON.parse(localPackageJson);
        var localFileList = localJsonData.files;
        var remotePackageJson = jsb.fileUtils.getStringFromFile(this.updateTempDir + "/package.json");
        var remoteJsonData = JSON.parse(remotePackageJson);
        var remoteFileList = remoteJsonData.files;
        this.needRemoveFiles = new Array();
        for (var file in localFileList) if (!remoteFileList[file]) {
          cc.log("need remove: ", file);
          this.needRemoveFiles.push(file);
        }
        this.needFetchFiles = new Array();
        for (var _file in remoteFileList) if (localFileList[_file] != remoteFileList[_file]) {
          cc.log("need fetch: ", _file);
          this.needFetchFiles.push(_file);
        }
        if (this.needFetchFiles.length > 0) {
          this.fetchIndex = 0;
          this.fetchOne();
        } else cc.director.loadScene("LoginScene");
      },
      fetchOne: function fetchOne() {
        var self = this;
        var filePath = this.needFetchFiles[this.fetchIndex];
        var url = this.updateUrl + "/" + filePath;
        var path = this.updateTempDir + "/" + filePath;
        cc.log(path, url, self.fetchIndex);
        var dotIndex = filePath.lastIndexOf("/");
        var tempDir = filePath.substr(0, dotIndex);
        var dir = this.updateTempDir + "/" + tempDir;
        false == jsb.fileUtils.isDirectoryExist(dir) && jsb.fileUtils.createDirectory(dir);
        mycc.HttpHelper.getInstance().fetch(url, path, function(ok, filename) {
          if (ok) if (self.fetchIndex < self.needFetchFiles.length - 1) {
            self.fetchIndex = self.fetchIndex + 1;
            self.fetchOne();
          } else self.tempToUpdate(); else cc.log("download error: ", url);
        });
      },
      tempToUpdate: function tempToUpdate() {
        for (var i = 0; i < this.needFetchFiles.length; i++) {
          var filePath = this.needFetchFiles[i];
          var dotIndex = filePath.lastIndexOf("/");
          var tempDir = filePath.substr(0, dotIndex);
          var dir = this.updateDir + "/" + tempDir;
          false == jsb.fileUtils.isDirectoryExist(dir) && jsb.fileUtils.createDirectory(dir);
          var srcFile = this.updateTempDir + "/" + filePath;
          var dstFile = this.updateDir + "/" + filePath;
          jsb.fileUtils.renameFile(srcFile, dstFile);
        }
        for (var _i = 0; _i < this.needRemoveFiles; _i++) {
          var file = this.updateDir + "/" + this.needRemoveFiles[_i];
          jsb.fileUtils.removeFile(file);
        }
        var srcPackageJson = this.updateTempDir + "/package.json";
        var dstPackageJson = this.updateDir + "/res/package.json";
        jsb.fileUtils.renameFile(srcPackageJson, dstPackageJson);
        cc.log("\u66f4\u65b0\u5b8c\u6bd5\uff0c\u91cd\u542f\u6e38\u620f");
        cc.director.loadScene("LoginScene");
      },
      start: function start() {}
    });
    cc._RF.pop();
  }, {} ],
  activity: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "00c31KcywNLfLCXYG10N8H2", "activity");
    "use strict";
    var App = require("App");
    cc.Class({
      extends: cc.Component,
      properties: {
        newbieTask: {
          default: null,
          type: cc.Node
        },
        newbieTaskList: {
          default: null,
          type: cc.ScrollView
        },
        taskItem: {
          default: null,
          type: cc.Node
        },
        todayTask: {
          default: null,
          type: cc.Node
        },
        todayTaskList: {
          default: null,
          type: cc.ScrollView
        },
        rechargeTask: {
          default: null,
          type: cc.Node
        },
        rechargeTaskList: {
          default: null,
          type: cc.ScrollView
        },
        taskLog: {
          default: null,
          type: cc.Node
        },
        taskLogList: {
          default: null,
          type: cc.ScrollView
        },
        taskLogItem: {
          default: null,
          type: cc.Prefab
        },
        registerSendGold: {
          default: null,
          type: cc.Node
        },
        allPeopleAgent: {
          default: null,
          type: cc.Node
        },
        shareDialog: {
          default: null,
          type: cc.Prefab
        },
        moreActivity: {
          default: null,
          type: cc.Node
        },
        activityList: {
          default: null,
          type: cc.ScrollView
        },
        activityDetail: {
          default: null,
          type: cc.Node
        },
        moreActivityItem: {
          default: null,
          type: cc.Node
        },
        webview: {
          default: null,
          type: cc.WebView
        }
      },
      onLoad: function onLoad() {
        this.node.on(cc.Node.EventType.TOUCH_START, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_MOVE, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_END, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_CANCEL, function(event, touch) {
          void 0 != event.stopProgagation && event.stopProgagation();
        });
        this.newbieTask.active = true;
        this.todayTask.active = false;
        this.taskLog.active = false;
        this.rechargeTask.active = false;
        this.registerSendGold.active = false;
        this.allPeopleAgent.active = false;
        this.moreActivity.active = false;
        this.activityDetail.active = false;
        this.moreActivityItem.active = false;
        this.taskItem.active = false;
        this.requestTaskList();
        this.requestMoreActivity();
      },
      start: function start() {},
      tapClose: function tapClose(sender, customEventData) {
        this.node.destroy();
      },
      checkActivity: function checkActivity(sender, customEventData) {
        var index = parseInt(customEventData);
        switch (index) {
         case 1:
          this.newbieTask.active = true;
          this.todayTask.active = false;
          this.taskLog.active = false;
          this.rechargeTask.active = false;
          this.registerSendGold.active = false;
          this.allPeopleAgent.active = false;
          this.moreActivity.active = false;
          break;

         case 2:
          this.newbieTask.active = false;
          this.todayTask.active = true;
          this.taskLog.active = false;
          this.rechargeTask.active = false;
          this.registerSendGold.active = false;
          this.allPeopleAgent.active = false;
          this.moreActivity.active = false;
          break;

         case 3:
          this.newbieTask.active = false;
          this.todayTask.active = false;
          this.taskLog.active = true;
          this.requestTaskLogList();
          this.rechargeTask.active = false;
          this.registerSendGold.active = false;
          this.allPeopleAgent.active = false;
          this.moreActivity.active = false;
          break;

         case 4:
          this.newbieTask.active = false;
          this.todayTask.active = false;
          this.taskLog.active = false;
          this.rechargeTask.active = true;
          this.registerSendGold.active = false;
          this.allPeopleAgent.active = false;
          this.moreActivity.active = false;
          break;

         case 5:
          this.newbieTask.active = false;
          this.todayTask.active = false;
          this.taskLog.active = false;
          this.rechargeTask.active = false;
          this.registerSendGold.active = true;
          this.allPeopleAgent.active = false;
          this.moreActivity.active = false;
          break;

         case 6:
          this.newbieTask.active = false;
          this.todayTask.active = false;
          this.taskLog.active = false;
          this.rechargeTask.active = false;
          this.registerSendGold.active = false;
          this.allPeopleAgent.active = true;
          this.moreActivity.active = false;
          var shareDialog = cc.instantiate(this.shareDialog);
          cc.find("Canvas").addChild(shareDialog);
          break;

         case 7:
          this.newbieTask.active = false;
          this.todayTask.active = false;
          this.taskLog.active = false;
          this.rechargeTask.active = false;
          this.registerSendGold.active = false;
          this.allPeopleAgent.active = false;
          this.moreActivity.active = true;
        }
      },
      updateTaskList: function updateTaskList(listRoot, data) {
        var _this = this;
        var _loop = function _loop(i) {
          var taskItem = cc.instantiate(_this.taskItem);
          taskItem.active = true;
          taskItem.setPosition(cc.v2(0, 0));
          if (3 == data[i].type) taskItem.getChildByName("name").getComponent(cc.RichText).string = data[i].name; else {
            var nameStr = cc.js.formatStr("<color=#BCD3F7>%s</c><color=#BCD3F7>", data[i].name);
            taskItem.getChildByName("name").getComponent(cc.RichText).string = nameStr;
          }
          var rewardStr = void 0;
          var rewardIconStr = void 0;
          if (1 == data[i].type) {
            rewardStr = cc.js.formatStr("<color=#BCD3F7>\u4efb\u52a1\u5956\u52b1:  </c><color=#BCD3F7>\u7ecf\u9a8c</c><color=#0000FF>%s</color><color=#BCD3F7>\u70b9</color>", data[i].amount);
            rewardIconStr = "icon_reward_vip";
          } else if (2 == data[i].type) {
            rewardStr = cc.js.formatStr("<color=#BCD3F7>\u4efb\u52a1\u5956\u52b1:  </c><color=#BCD3F7>\u91d1\u5e01</c><color=#0000FF>%s</color><color=#BCD3F7>\u4e2a</color>", data[i].amount);
            rewardIconStr = "icon_reward_gold";
          } else if (3 == data[i].type) {
            rewardStr = cc.js.formatStr("<color=#BCD3F7>\u4efb\u52a1\u5956\u52b1:  </c><color=#BCD3F7>\u91d1\u5e01</c><color=#0000FF>%s</color><color=#BCD3F7>\u4e2a</color>", data[i].amount);
            rewardIconStr = "icon_reward_gold";
          }
          taskItem.getChildByName("reward").getComponent(cc.RichText).string = rewardStr;
          cc.loader.loadRes(rewardIconStr, cc.SpriteFrame, function(err, spriteFrame) {
            if (err) {
              cc.log(err);
              return;
            }
            taskItem.getChildByName("bg_reward").getChildByName("icon_reward").getComponent(cc.Sprite).spriteFrame = spriteFrame;
          });
          var state = taskItem.getChildByName("state");
          var stateButton = state.getComponent(cc.Button);
          var stateLabel = state.getChildByName("Background").getChildByName("Label").getComponent(cc.Label);
          if (null == data[i].state) stateLabel.string = "\u53bb\u5b8c\u6210"; else if (1 == data[i].state) {
            stateLabel.string = "\u9886\u53d6\u5956\u52b1";
            clickEventHandler = new cc.Component.EventHandler();
            clickEventHandler.target = _this.node;
            clickEventHandler.component = "activity";
            clickEventHandler.handler = "tapGetReward";
            clickEventHandler.customEventData = {
              taskId: data[i].taskId,
              sender: taskItem
            };
            stateButton.clickEvents.push(clickEventHandler);
          } else if (2 == data[i].state) {
            stateButton.interactable = false;
            stateLabel.string = "\u5df2\u5b8c\u6210";
          }
          listRoot.content.addChild(taskItem);
        };
        for (var i = 0; i < data.length; i++) {
          var clickEventHandler;
          _loop(i);
        }
      },
      tapGetReward: function tapGetReward(eventTouch, customEventData) {
        var self = this;
        var postData = [ "taskId=" + customEventData.taskId ];
        App.postTitle("/tasks/apply", postData, function(data) {
          if (200 == parseInt(data.code)) {
            cc.find("FadeMsg").getComponent("FadeMsg").show("\u9886\u53d6\u6210\u529f");
            var progress = customEventData.sender.getChildByName("progress").getComponent(cc.Label);
            var progressBar = customEventData.sender.getChildByName("progressBar").getComponent(cc.ProgressBar);
            var state = customEventData.sender.getChildByName("state");
            var _stateButton = state.getComponent(cc.Button);
            var _stateLabel = state.getChildByName("Background").getChildByName("Label").getComponent(cc.Label);
            progress.string = "100%";
            progressBar.progress = 1;
            _stateButton.interactable = false;
            _stateLabel.string = "\u5df2\u5b8c\u6210";
          } else cc.find("FadeMsg").getComponent("FadeMsg").show(data.message.zh);
        });
      },
      requestTaskList: function requestTaskList() {
        var self = this;
        App.getWithToken("/tasks/list", function(data) {
          if (200 == parseInt(data.code)) {
            self.updateTaskList(self.newbieTaskList, data.data.fixedItems);
            self.updateTaskList(self.todayTaskList, data.data.todayItems);
            void 0 == data.data.rechargeItems && (data.data.rechargeItems = [ {
              type: 3,
              name: "<color=#BCD3F7>\u5b8c\u6210</c><color=#0000FF>\u9996\u6b21</color><color=#BCD3F7>\u5145\u503c</color>",
              amount: 1,
              state: 1,
              categoryId: 4,
              taskId: 218,
              link: null
            }, {
              type: 3,
              name: "<color=#BCD3F7>\u7d2f\u8ba1\u5145\u503c\u8fbe</c><color=#0000FF>10</color><color=#BCD3F7>\u5143</color>",
              amount: 2,
              state: 1,
              categoryId: 5,
              taskId: 221,
              link: "/sign"
            }, {
              type: 3,
              name: "<color=#BCD3F7>\u7d2f\u8ba1\u5145\u503c\u8fbe</c><color=#0000FF>50</color><color=#BCD3F7>\u5143</color>",
              amount: 5,
              state: null,
              categoryId: 6,
              taskId: null,
              link: "/account/deposit/?category=user"
            }, {
              type: 3,
              name: "<color=#BCD3F7>\u7d2f\u8ba1\u5145\u503c\u8fbe</c><color=#0000FF>100</color><color=#BCD3F7>\u5143</color>",
              amount: 10,
              state: null,
              categoryId: 7,
              taskId: null,
              link: "/account/deposit/withdrawal?category=user"
            }, {
              type: 3,
              name: "<color=#BCD3F7>\u7d2f\u8ba1\u5145\u503c\u8fbe</c><color=#0000FF>200</color><color=#BCD3F7>\u5143</color>",
              amount: 20,
              state: null,
              categoryId: 7,
              taskId: null,
              link: "/account/deposit/withdrawal?category=user"
            }, {
              type: 3,
              name: "<color=#BCD3F7>\u7d2f\u8ba1\u5145\u503c\u8fbe</c><color=#0000FF>500</color><color=#BCD3F7>\u5143</color>",
              amount: 50,
              state: null,
              categoryId: 7,
              taskId: null,
              link: "/account/deposit/withdrawal?category=user"
            } ]);
            self.updateTaskList(self.rechargeTaskList, data.data.rechargeItems);
          }
        });
      },
      requestTaskLogList: function requestTaskLogList() {
        var self = this;
        App.getWithToken("/tasks/query", function(data) {
          if (200 == parseInt(data.code)) for (var i = 0; i < data.data.content.length; i++) {
            var taskLogItem = cc.instantiate(self.taskLogItem);
            var time = taskLogItem.getChildByName("time").getComponent(cc.Label);
            var reward = taskLogItem.getChildByName("reward").getComponent(cc.Label);
            var name = taskLogItem.getChildByName("name").getComponent(cc.Label);
            time.string = data.data.content[i].createDate;
            2 == data.data.content[i].category.type && (reward.string = data.data.content[i].category.amount + "\u7ecf\u9a8c");
            name.string = data.data.content[i].category.name;
            self.taskLogList.content.addChild(taskLogItem);
          }
        });
      },
      requestMoreActivity: function requestMoreActivity() {
        var self = this;
        App.get("/promotionCategories/visible", function(data) {
          200 == parseInt(data.code) && self.updateMoreActivity(data.data);
        });
      },
      updateMoreActivity: function updateMoreActivity(data) {
        var _this2 = this;
        cc.log(data);
        var _loop2 = function _loop2(i) {
          var moreActivityItem = cc.instantiate(_this2.moreActivityItem);
          moreActivityItem.active = true;
          moreActivityItem.setPosition(cc.v2(0, 0));
          moreActivityItem.getChildByName("name").getComponent(cc.Label).string = data[i].name;
          data[i].img && cc.loader.load({
            url: data[i].img
          }, function(err, texture) {
            if (err) return;
            var sp = new cc.SpriteFrame(texture);
            moreActivityItem.getChildByName("img").getComponent(cc.Sprite).spriteFrame = new cc.SpriteFrame(texture);
          });
          var clickEventHandler = new cc.Component.EventHandler();
          clickEventHandler.target = _this2.node;
          clickEventHandler.component = "activity";
          clickEventHandler.handler = "tapViewDetail";
          clickEventHandler.customEventData = data[i].id;
          var button = moreActivityItem.getChildByName("button").getComponent(cc.Button);
          button.clickEvents.push(clickEventHandler);
          _this2.activityList.content.addChild(moreActivityItem);
        };
        for (var i = 0; i < data.length; i++) _loop2(i);
      },
      tapViewDetail: function tapViewDetail(evnet, customEventData) {
        cc.log(customEventData);
        this.activityDetail.active = true;
        this.activityList.node.active = false;
        this.webview.url = "http://192.168.0.55/api/promotionCategories/detail?id=" + customEventData;
      },
      tapCloseActivityDetail: function tapCloseActivityDetail(sender, customEventData) {
        this.activityDetail.active = false;
        this.activityList.node.active = true;
      }
    });
    cc._RF.pop();
  }, {
    App: "App"
  } ],
  bankList: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "1fa3dWyjYVIkr0zj3Onrb8R", "bankList");
    "use strict";
    module.exports = [ {
      name: "\u62db\u5546\u94f6\u884c",
      id: 1,
      icon: "zhaoshang",
      color: "#e60012"
    }, {
      name: "\u6c11\u751f\u94f6\u884c",
      id: 2,
      icon: "mingsheng",
      color: "#5aa572"
    }, {
      name: "\u5efa\u8bbe\u94f6\u884c",
      id: 3,
      icon: "jianshe",
      color: "#003b90"
    }, {
      name: "\u519c\u4e1a\u94f6\u884c",
      id: 4,
      icon: "nongye",
      color: "#009273"
    }, {
      name: "\u5de5\u5546\u94f6\u884c",
      id: 5,
      icon: "gongshang",
      color: "#e60012"
    }, {
      name: "\u4ea4\u901a\u94f6\u884c",
      id: 6,
      icon: "jiaotong",
      color: "#1d2088"
    }, {
      name: "\u6d66\u53d1\u94f6\u884c",
      id: 7,
      icon: "pufa",
      color: "#1d2088"
    }, {
      name: "\u5e7f\u53d1\u94f6\u884c",
      id: 8,
      icon: "fazhan",
      color: "#a61d2a"
    }, {
      name: "\u5317\u4eac\u94f6\u884c",
      id: 9,
      icon: "beijing",
      color: "#e4131b"
    }, {
      name: "\u5e73\u5b89\u94f6\u884c",
      id: 10,
      icon: "pingan",
      color: "#ff3301"
    }, {
      name: "\u5174\u4e1a\u94f6\u884c",
      id: 11,
      icon: "xingye",
      color: "#004186"
    }, {
      name: "\u4e2d\u4fe1\u94f6\u884c",
      id: 12,
      icon: "zhongxin",
      color: "#d91920"
    }, {
      name: "\u534e\u590f\u94f6\u884c",
      id: 13,
      icon: "huaxia",
      color: "#e60012"
    }, {
      name: "\u5149\u5927\u94f6\u884c",
      id: 14,
      icon: "guangda",
      color: "#fcea00"
    }, {
      name: "\u90ae\u653f\u50a8\u84c4",
      id: 15,
      icon: "youzheng",
      color: "#108c3e"
    }, {
      name: "\u4e2d\u56fd\u94f6\u884c",
      id: 16,
      icon: "zhongguo",
      color: "#b81c22"
    } ];
    cc._RF.pop();
  }, {} ],
  battleEnd: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "552ef6tkp9IlqyNjyjFeWBx", "battleEnd");
    "use strict";
    cc.Class({
      extends: cc.Component,
      properties: {
        settleInfoPanel: {
          default: null,
          type: cc.Prefab
        }
      },
      onLoad: function onLoad() {
        this.node.on(cc.Node.EventType.TOUCH_START, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_MOVE, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_END, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_CANCEL, function(event, touch) {
          void 0 != event.stopProgagation && event.stopProgagation();
        });
      },
      start: function start() {},
      tapBack: function tapBack(sender, customEventData) {
        this.node.destroy();
      },
      tapOk: function tapOk(sender, customEventData) {
        this.node.destroy();
      },
      tapSettleInfo: function tapSettleInfo(sender, customEventData) {
        var settleInfoPanel = cc.instantiate(this.settleInfoPanel);
        cc.find("Canvas").addChild(settleInfoPanel);
      }
    });
    cc._RF.pop();
  }, {} ],
  betSuccess: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "0d6defnuqZMgqZAytC7vMXs", "betSuccess");
    "use strict";
    cc.Class({
      extends: cc.Component,
      properties: {},
      onLoad: function onLoad() {
        this.node.on(cc.Node.EventType.TOUCH_START, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_MOVE, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_END, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_CANCEL, function(event, touch) {
          void 0 != event.stopProgagation && event.stopProgagation();
        });
      },
      start: function start() {},
      tapClose: function tapClose(sender, customEventData) {
        this.node.destroy();
      },
      tapOk: function tapOk(sender, customEventData) {
        this.node.destroy();
      }
    });
    cc._RF.pop();
  }, {} ],
  bet: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "ae990G/yE5DcJ+4eT2sF8zJ", "bet");
    "use strict";
    var App = require("App");
    var Tools = require("Tools");
    cc.Class({
      extends: cc.Component,
      properties: {
        betListContainer: {
          default: null,
          type: cc.Node
        },
        betList: {
          default: null,
          type: cc.Node
        },
        betItem: {
          default: null,
          type: cc.Node
        },
        betRound: {
          default: null,
          type: cc.Node
        },
        betSuccessPanel: {
          default: null,
          type: cc.Prefab
        },
        betOrderNode: {
          default: null,
          type: cc.Node
        },
        betRecordNode: {
          default: null,
          type: cc.Node
        },
        betRecordList: {
          default: null,
          type: cc.ScrollView
        },
        betRecordItem: {
          default: null,
          type: cc.Node
        },
        betOrderList: {
          default: null,
          type: cc.ScrollView
        },
        betOrderItem: {
          default: null,
          type: cc.Node
        },
        betData: Object,
        roundToggleContainer: {
          default: null,
          type: cc.ToggleContainer
        },
        roundItem: {
          default: null,
          type: cc.Node
        },
        currentRound: 0,
        id: 0,
        betOrderSum: {
          default: null,
          type: cc.RichText
        },
        myBetRecrodCount: {
          default: null,
          type: cc.Label
        },
        betRecordSum: {
          default: null,
          type: cc.RichText
        },
        betRecordProfitableSum: {
          default: null,
          type: cc.Label
        }
      },
      onLoad: function onLoad() {
        this.betOrderNode.active = true;
        this.betRecordNode.active = false;
        this.betList.active = false;
        this.betItem.active = false;
        this.betRound.active = false;
        this.betOrderItem.active = false;
        this.betRecordItem.active = false;
        var self = this;
        this.updateBetOrderSum();
        var postData = {
          betState: 0,
          endDate: Tools.todayStr,
          limit: 100,
          offset: 0,
          startDate: Tools.todayStr
        };
        App.postWithToken("/esbets/query", postData, function(data) {
          200 == parseInt(data.code) && (self.myBetRecrodCount.string = data.data.content.length);
        });
        App.on("channel.MATCH", function(data) {
          for (var i = 0; i < data.length; i++) if (data[i].matchId == self.matchId) {
            var state = self.node.getChildByName("state");
            state.getComponent(cc.Label).string = Tools.GetGameStateStr(data[i].state);
          }
        });
        App.on("channel.ODDS", function(data) {
          cc.log("channel.ODDS", data);
          for (var i = 0; i < data.length; i++) if (data[i].matchId == self.matchId) {
            var state = self.node.getChildByName("state");
            state.getComponent(cc.Label).string = Tools.GetGameStateStr(data[i].state);
          }
          for (var _i = 0; _i < data.length; _i++) if (data[_i].matchId == self.id) {
            var _state = self.node.getChildByName("state");
            _state.getComponent(cc.Label).string = Tools.GetGameStateStr([ data.state ]);
            for (var j = 0; j < data[_i].osdds.length; _i++) {
              var betListChildren = self.betListContainer.children;
              for (var a = 0; a < self.betData.myround.length; a++) {
                var betList = betListChildren[a].getComponent(cc.ScrollView);
                var betItemChildren = betList.content.children;
                for (var b = 0; b < betItemChildren.length; b++) if (betItemChildren[b].oddslen) for (var c = 0; c < betItemChildren[b].oddslen; c++) {
                  var party = betItemChildren[b].getChildByName("party" + c);
                  var toggle = party.getChildByName("toggle");
                  var odds = party.getChildByName("odds");
                  toggle.odssId == data[_i].odds[j] && (odds.getComponent(cc.Label).string = data[_i].odds[j]);
                }
              }
            }
          }
          for (var _i2 = 0; _i2 < data.length; _i2++) if (data[_i2].matchId == self.id) {
            var _state2 = self.node.getChildByName("state");
            _state2.getComponent(cc.Label).string = Tools.GetGameStateStr([ data.state ]);
            for (var _j = 0; _j < data[_i2].osdds.length; _i2++) {
              var _children = self.betOrderList.children;
              for (var _a = 0; _a < _children.length; _a++) {
                var betOrderItem = _children[_a];
                if (betOrderItem.oddsId == data[_i2].odds[_j]) {
                  betOrderItem.getChildByName("betRate").getComponent(cc.Label).string = data[_i2].odds[_j];
                  betOrderItem.betRate = data[_i2].odds[_j];
                  var amountEditBox = betOrderItem.getChildByName("amountEditBox").getComponent(cc.EditBox);
                  var str = amountEditBox.string;
                  var amount = false == Boolean(parseInt(str)).valueOf() ? 0 : parseInt(str);
                  var profitable = betOrderItem.getChildByName("profitable").getComponent(cc.Label);
                  profitable.string = Number(amount * data[_i2].odds[_j]).toFixed(2);
                  this.updateBetOrderSum();
                }
              }
            }
          }
        });
      },
      start: function start() {},
      tapBackHall: function tapBackHall(sender, customEventData) {
        this.node.destroy();
      },
      tapImmediatelyBet: function tapImmediatelyBet(sender, customEventData) {
        var array = new Array();
        var children = this.betOrderList.content.children;
        var length = children.length;
        for (var i = 0; i < length; i++) {
          var amountEditBox = children[i].getChildByName("amountEditBox").getComponent(cc.EditBox);
          var str = amountEditBox.string;
          var amount = false == Boolean(parseInt(str)).valueOf() ? 0 : parseInt(str);
          array.push({
            amount: amount,
            oddsId: children[i].oddsId,
            eid: children[i].eid
          });
        }
        var self = this;
        App.postWithToken("/esbets/addMultiple", array, function(data) {
          if (200 == parseInt(data.code)) {
            App.myUser.setup({
              balance: data.data
            });
            var betSuccessPanel = cc.instantiate(self.betSuccessPanel);
            cc.find("Canvas").addChild(betSuccessPanel);
            self.tapExpand();
            self.tapDeleteAll();
          } else {
            cc.log(data);
            cc.find("FadeMsg").getComponent("FadeMsg").show(data.message.zh);
          }
        });
      },
      tapDeleteAll: function tapDeleteAll(sender, customEventData) {
        var children = this.betOrderList.content.children;
        var length = children.length;
        for (var i = length - 1; i >= 0; i--) this.removeBetOrder(children[i]);
      },
      setupWithData: function setupWithData(data, gameId, matchId) {
        this.gameId = gameId;
        this.matchId = matchId;
        var partyLogo0 = this.node.getChildByName("icon_party_logo0");
        var partyLogo1 = this.node.getChildByName("icon_party_logo1");
        var url0 = "https://" + data.teams[0].eimage;
        cc.loader.load({
          url: url0,
          type: "png"
        }, function(err, texture) {
          var sp = new cc.SpriteFrame(texture);
          partyLogo0.getComponent(cc.Sprite).spriteFrame = sp;
        });
        var url1 = "https://" + data.teams[1].eimage;
        cc.loader.load({
          url: url1,
          type: "png"
        }, function(err, texture) {
          var sp = new cc.SpriteFrame(texture);
          partyLogo1.getComponent(cc.Sprite).spriteFrame = sp;
        });
        var partyName0 = this.node.getChildByName("partyName0");
        var partyName1 = this.node.getChildByName("partyName1");
        partyName0.getComponent(cc.Label).string = data.teams[0].name;
        partyName1.getComponent(cc.Label).string = data.teams[1].name;
        var round = this.node.getChildByName("round");
        round.getComponent(cc.Label).string = "BO" + data.round;
        var state = this.node.getChildByName("state");
        state.getComponent(cc.Label).string = Tools.GetGameStateStr([ data.state ]);
        this.betData = data;
        this.makeRound();
        this.setupRound();
      },
      makeRound: function makeRound() {
        var round = 0;
        this.betData.myround = [];
        this.betData.myround[0] = [];
        for (var i = 0; i < this.betData.matches.length; i++) if (this.betData.matches[i].round == round) this.betData.myround[round].push(this.betData.matches[i]); else {
          round++;
          this.betData.myround[round] = [];
        }
      },
      setupRound: function setupRound() {
        this.roundItem.active = false;
        var roundStr = [ "\u603b\u5c40", "\u7b2c\u4e00\u5c40", "\u7b2c\u4e8c\u5c40", "\u7b2c\u4e09\u5c40", "\u7b2c\u56db\u5c40", "\u7b2c\u4e94\u5c40", "\u7b2c\u516d\u5c40", "\u7b2c\u4e03\u5c40", "\u7b2c\u516b\u5c40", "\u7b2c\u4e5d\u5c40", "\u7b2c\u5341\u5c40" ];
        this.roundToggleContainer.node.removeAllChildren();
        for (var i = 0; i < this.betData.myround.length; i++) {
          var roundItem = cc.instantiate(this.roundItem);
          roundItem.active = true;
          roundItem.getChildByName("label").getComponent(cc.Label).string = roundStr[i];
          this.roundToggleContainer.node.addChild(roundItem);
          var betList = cc.instantiate(this.betList);
          betList.name = "betList" + i;
          betList.active = 0 == i;
          this.setupBetList(i, betList.getComponent(cc.ScrollView));
          this.betListContainer.addChild(betList);
          var toggle = roundItem.getComponent(cc.Toggle);
          if (0 == i) {
            toggle.getComponent(cc.Toggle).check();
            roundItem.getChildByName("label").color = new cc.Color(255, 255, 255);
          } else {
            toggle.getComponent(cc.Toggle).uncheck();
            roundItem.getChildByName("label").color = new cc.Color(36, 158, 210);
          }
          var checkEventHandler = new cc.Component.EventHandler();
          checkEventHandler.target = this.node;
          checkEventHandler.component = "bet";
          checkEventHandler.handler = "checkRound";
          checkEventHandler.customEventData = i;
          toggle.getComponent(cc.Toggle).checkEvents.push(checkEventHandler);
        }
      },
      checkRound: function checkRound(sender, customEventData) {
        if (sender.isChecked) {
          var roundChildren = this.roundToggleContainer.node.children;
          var betListChildren = this.betListContainer.children;
          for (var i = 0; i < roundChildren.length; i++) if (i == customEventData) {
            roundChildren[i].getChildByName("label").color = new cc.Color(255, 255, 255);
            betListChildren[i].active = true;
          } else {
            roundChildren[i].getChildByName("label").color = new cc.Color(36, 158, 210);
            betListChildren[i].active = false;
          }
        }
      },
      setupBetList: function setupBetList(round, betList) {
        if (0 == round) {
          betList.content.removeAllChildren();
          var node = new cc.Node();
          node.setContentSize(500, 60);
          node.setPosition(cc.v2(0, 0));
          betList.content.addChild(node);
          for (var i = 0; i < this.betData.myround.length; i++) {
            this.setupBetListByRound(i, betList);
            if (i < this.betData.myround.length - 1) {
              var betRound = cc.instantiate(this.betRound);
              betRound.setPosition(cc.v2(0, 0));
              betRound.active = true;
              betRound.getChildByName("label").getComponent(cc.Label).string = "\u7b2c" + Tools.getLowerArab(i + 1) + "\u5c40";
              betList.content.addChild(betRound);
            }
          }
          betList.scrollToTop(.1);
        } else {
          betList.content.removeAllChildren();
          var _node = new cc.Node();
          _node.setContentSize(500, 60);
          _node.setPosition(cc.v2(0, 0));
          betList.content.addChild(_node);
          this.setupBetListByRound(round, betList);
          betList.scrollToTop(.1);
        }
      },
      setupBetListByRound: function setupBetListByRound(round, betList) {
        if (void 0 == round) return;
        for (var i = 0; i < this.betData.myround[round].length; i++) {
          var betItem = cc.instantiate(this.betItem);
          betItem.active = true;
          betItem.setContentSize(cc.size(500, 116));
          betItem.setPosition(cc.v2(0, 0));
          var name = betItem.getChildByName("name");
          var nameStr = "<u>" + this.betData.myround[round][i].name + "</u>";
          name.getComponent(cc.RichText).string = nameStr;
          for (var k = 0; k < 8; k++) {
            var party = betItem.getChildByName("party" + k);
            party.active = false;
          }
          var oddslen = this.betData.myround[round][i].odds.length;
          betItem.oddslen = oddslen;
          for (var _k = 0; _k < oddslen; _k += 2) {
            this.setupBetItem(this.betData.myround[round][i], betItem, _k, round, i);
            _k + 1 < oddslen && this.setupBetItem(this.betData.myround[round][i], betItem, _k + 1, round, i);
          }
          1 == oddslen || 2 == oddslen ? betItem.setContentSize(cc.size(500, 116)) : 3 == oddslen || 4 == oddslen ? betItem.setContentSize(cc.size(500, 166)) : 5 == oddslen || 6 == oddslen ? betItem.setContentSize(cc.size(500, 230)) : 7 != oddslen && 8 != oddslen || betItem.setContentSize(cc.size(500, 300));
          betList.content.addChild(betItem);
        }
      },
      setupBetItem: function setupBetItem(matcheData, betItem, index, round, matchIndex) {
        var party = betItem.getChildByName("party" + index);
        party.active = true;
        party.getChildByName("partyName").getComponent(cc.Label).string = matcheData.odds[index].name;
        party.getChildByName("odds").getComponent(cc.Label).string = matcheData.odds[index].odds;
        var toggle = party.getChildByName("toggle");
        toggle.getComponent(cc.Toggle).uncheck();
        var oddsId = matcheData.odds[index].id;
        var checkEventHandler = new cc.Component.EventHandler();
        checkEventHandler.target = this.node;
        checkEventHandler.component = "bet";
        checkEventHandler.handler = "checkBet";
        checkEventHandler.customEventData = {
          matchId: matcheData.id,
          winner: matcheData.odds[index].name,
          matchName: matcheData.name,
          vs: this.betData.teams[0].name + " vs " + this.betData.teams[1].name,
          betName: this.betData.name,
          betRate: matcheData.odds[index].odds,
          oddsId: matcheData.odds[index].id,
          index: index,
          toggle: toggle,
          eid: matcheData.eid
        };
        toggle.oddsId = matcheData.odds[index].id;
        toggle.getComponent(cc.Toggle).checkEvents.push(checkEventHandler);
      },
      checkBet: function checkBet(sender, customEventData) {
        sender.isChecked ? this.addBetOrder(customEventData) : this.removeBetOrder(customEventData);
        this.updateAllRoundBetItem(sender.isChecked, customEventData.oddsId);
      },
      updateAllRoundBetItem: function updateAllRoundBetItem(isChecked, oddsId) {
        var betListChildren = this.betListContainer.children;
        for (var i = 0; i < this.betData.myround.length; i++) {
          var betList = betListChildren[i].getComponent(cc.ScrollView);
          var betItemChildren = betList.content.children;
          for (var j = 0; j < betItemChildren.length; j++) if (betItemChildren[j].oddslen) for (var k = 0; k < betItemChildren[j].oddslen; k++) {
            var party = betItemChildren[j].getChildByName("party" + k);
            var toggle = party.getChildByName("toggle");
            toggle.oddsId == oddsId && (isChecked ? toggle.getComponent(cc.Toggle).check() : toggle.getComponent(cc.Toggle).uncheck());
          }
        }
      },
      addBetOrder: function addBetOrder(customEventData) {
        var children = this.betOrderList.content.children;
        for (var i = 0; i < children.length; i++) if (children[i].oddsId == customEventData.oddsId) {
          cc.log("\u91cd\u590d\u6dfb\u52a0\u4e0b\u6ce8\u8ba2\u5355\uff01\uff01\uff01");
          return;
        }
        var betOrderItem = cc.instantiate(this.betOrderItem);
        betOrderItem.active = true;
        betOrderItem.setPosition(cc.v2(0, 0));
        betOrderItem.oddsId = customEventData.oddsId;
        betOrderItem.getChildByName("bg").setContentSize(440, 146);
        betOrderItem.setContentSize(440, 146);
        betOrderItem.setPosition(cc.v2(0, 0));
        betOrderItem.getChildByName("amountButton").active = false;
        betOrderItem.getChildByName("betRate").getComponent(cc.Label).string = customEventData.betRate;
        var amountEditBox = betOrderItem.getChildByName("amountEditBox").getComponent(cc.EditBox);
        var editboxDidBeganEventHandler = new cc.Component.EventHandler();
        editboxDidBeganEventHandler.target = this.node;
        editboxDidBeganEventHandler.component = "bet";
        editboxDidBeganEventHandler.handler = "onAmountEditDidBegan";
        editboxDidBeganEventHandler.customEventData = {
          root: betOrderItem
        };
        amountEditBox.editingDidBegan.push(editboxDidBeganEventHandler);
        var editboxTextChangedEventHandler = new cc.Component.EventHandler();
        editboxTextChangedEventHandler.target = this.node;
        editboxTextChangedEventHandler.component = "bet";
        editboxTextChangedEventHandler.handler = "onAmountTextChanged";
        editboxTextChangedEventHandler.customEventData = {
          root: betOrderItem
        };
        amountEditBox.textChanged.push(editboxTextChangedEventHandler);
        var above = betOrderItem.getChildByName("above").getComponent(cc.Button);
        var aboceClickEventHandler = new cc.Component.EventHandler();
        aboceClickEventHandler.target = this.node;
        aboceClickEventHandler.component = "bet";
        aboceClickEventHandler.handler = "tapAbove";
        aboceClickEventHandler.customEventData = {
          root: betOrderItem
        };
        above.clickEvents.push(aboceClickEventHandler);
        var deleteItem = betOrderItem.getChildByName("deleteItem").getComponent(cc.Button);
        var deleteItemClickEventHandler = new cc.Component.EventHandler();
        deleteItemClickEventHandler.target = this.node;
        deleteItemClickEventHandler.component = "bet";
        deleteItemClickEventHandler.handler = "tapDelete";
        deleteItemClickEventHandler.customEventData = {
          root: betOrderItem,
          oddsId: customEventData.oddsId,
          toggle: customEventData.toggle
        };
        deleteItem.clickEvents.push(deleteItemClickEventHandler);
        var amountButton = betOrderItem.getChildByName("amountButton");
        var value = [ 1, 2, 5, 10, 20, 50, 100, 200, 500, 1e3 ];
        for (var j = 0; j < value.length; j++) {
          var buttonName = "button" + value[j];
          var button = amountButton.getChildByName(buttonName).getComponent(cc.Button);
          var clickEventHandler = new cc.Component.EventHandler();
          clickEventHandler.target = this.node;
          clickEventHandler.component = "bet";
          clickEventHandler.handler = "tapAmount";
          clickEventHandler.customEventData = {
            root: betOrderItem,
            value: value[j]
          };
          betOrderItem.amountEditBox = amountEditBox;
          betOrderItem.betRate = customEventData.betRate;
          betOrderItem.oddsId = customEventData.oddsId;
          betOrderItem.eid = customEventData.eid;
          betOrderItem.toggle = customEventData.toggle;
          button.clickEvents.push(clickEventHandler);
        }
        betOrderItem.getChildByName("winner").getComponent(cc.Label).string = customEventData.winner;
        betOrderItem.getChildByName("matchName").getComponent(cc.Label).string = customEventData.matchName;
        betOrderItem.getChildByName("vs").getComponent(cc.Label).string = customEventData.vs;
        betOrderItem.getChildByName("betName").getComponent(cc.Label).string = customEventData.betName;
        betOrderItem.getChildByName("betRate").getComponent(cc.Label).string = customEventData.betRate;
        this.betOrderList.content.addChild(betOrderItem);
        this.updateBetOrderSum();
      },
      removeBetOrder: function removeBetOrder(customEventData) {
        var children = this.betOrderList.content.children;
        for (var k = 0; k < children.length; k++) if (children[k].oddsId == customEventData.oddsId) {
          this.betOrderList.content.removeChild(children[k]);
          this.updateBetOrderSum();
          customEventData.toggle.getComponent(cc.Toggle).uncheck();
          break;
        }
      },
      updateBetOrderSum: function updateBetOrderSum() {
        var children = this.betOrderList.content.children;
        var length = children.length;
        var amountSum = 0;
        var profitableSum = 0;
        for (var i = 0; i < length; i++) {
          var amountEditBox = children[i].getChildByName("amountEditBox").getComponent(cc.EditBox);
          var str = amountEditBox.string;
          var amount = false == Boolean(parseInt(str)).valueOf() ? 0 : parseInt(str);
          amountSum += amount;
          profitableSum += amount * children[i].betRate;
        }
        this.betOrderSum.string = cc.js.formatStr("<color=#999999>\u5171</color><color=#249ED2>%s</color><color=#999999>\u6ce8\uff0c\u5408\u8ba1:</color><color=#249ED2>%s</color>   <color=#999999>\u53ef\u8d62\u989d: %s</color>", length, amountSum, profitableSum.toFixed(2));
      },
      tapExpand: function tapExpand(sender, customEventData) {
        this.betOrderNode.active = false;
        this.betRecordNode.active = true;
        var postData = {
          betState: 0,
          endDate: Tools.todayStr,
          limit: 100,
          offset: 0,
          startDate: Tools.todayStr
        };
        var self = this;
        App.postWithToken("/esbets/query", postData, function(data) {
          200 == parseInt(data.code) && self.updateBetRecord(data.data);
        });
      },
      tapPackup: function tapPackup(sender, customEventData) {
        this.betOrderNode.active = true;
        this.betRecordNode.active = false;
      },
      updateBetRecord: function updateBetRecord(data) {
        this.myBetRecrodCount.string = data.content.length;
        this.betRecordList.content.removeAllChildren();
        var amountSum = 0;
        var profitableSum = 0;
        for (var i = 0; i < data.content.length; i++) {
          var betRecordItem = cc.instantiate(this.betRecordItem);
          betRecordItem.active = true;
          betRecordItem.setPosition(cc.v2(0, 0));
          this.betRecordList.content.addChild(betRecordItem);
          var wager = betRecordItem.getChildByName("wager");
          wager.getComponent(cc.Label).string = data.content[i].wager;
          var matchName = betRecordItem.getChildByName("matchName");
          matchName.getComponent(cc.Label).string = data.content[i].matchName;
          var vs = betRecordItem.getChildByName("vs");
          var vsStr = data.content[i].teamLeft + " vs " + data.content[i].teamRight;
          vs.getComponent(cc.Label).string = vsStr;
          var odds = betRecordItem.getChildByName("odds");
          odds.getComponent(cc.Label).string = data.content[i].odds;
          var amount = betRecordItem.getChildByName("amount");
          amount.getComponent(cc.Label).string = data.content[i].amount;
          var profitable = betRecordItem.getChildByName("profitable");
          profitable.getComponent(cc.Label).string = Number(data.content[i].odds * data.content[i].amount).toFixed(2);
          amountSum += data.content[i].amount;
          profitableSum += data.content[i].odds * data.content[i].amount;
        }
        this.betRecordSum.string = cc.js.formatStr("<color=#999999>\u5171</color><color=#249ED2>%s</color><color=#999999>\u6ce8\uff0c\u5408\u8ba1:</color><color=#C5A978>%s</color>   ", data.content.length, amountSum);
        this.betRecordProfitableSum.string = profitableSum.toFixed(2);
      },
      onAmountEditDidBegan: function onAmountEditDidBegan(editbox, customEventData) {
        customEventData.root.getChildByName("bg").setContentSize(440, 224);
        customEventData.root.setContentSize(440, 224);
        customEventData.root.getChildByName("amountButton").active = true;
        this.betOrderList.content.getComponent(cc.Layout).updateLayout();
      },
      onAmountTextChanged: function onAmountTextChanged(text, editbox, customEventData) {
        var amountEditBox = customEventData.root.getChildByName("amountEditBox").getComponent(cc.EditBox);
        var str = amountEditBox.string;
        var amount = false == Boolean(parseInt(str)).valueOf() ? 0 : parseInt(str);
        var profitable = customEventData.root.getChildByName("profitable").getComponent(cc.Label);
        profitable.string = Number(amount * customEventData.root.betRate).toFixed(2);
        this.updateBetOrderSum();
      },
      tapAbove: function tapAbove(event, customEventData) {
        customEventData.root.getChildByName("bg").setContentSize(440, 146);
        customEventData.root.setContentSize(440, 146);
        customEventData.root.getChildByName("amountButton").active = false;
        this.betOrderList.content.getComponent(cc.Layout).updateLayout();
      },
      tapAmount: function tapAmount(event, customEventData) {
        var amountEditBox = customEventData.root.getChildByName("amountEditBox").getComponent(cc.EditBox);
        amountEditBox.string = customEventData.value;
        var profitable = customEventData.root.getChildByName("profitable").getComponent(cc.Label);
        profitable.string = Number(amountEditBox.string * customEventData.root.betRate).toFixed(2);
        this.updateBetOrderSum();
      },
      tapDelete: function tapDelete(event, customEventData) {
        this.removeBetOrder(customEventData);
      },
      tapReload: function tapReload(sender, customEventData) {
        var getData = [ "id=" + this.gameId ];
        var self = this;
        cc.find("Loading").getComponent("Loading").show();
        App.getWithData("/games/detail", getData, function(data) {
          cc.find("Loading").getComponent("Loading").close();
          200 == parseInt(data.code) && self.setupWithData(data.data, self.id);
        });
      },
      checkCanbet: function checkCanbet() {
        for (var i = 0; i < children.length; i++) {
          var betOrderItem = children[i];
          var amountEditBox = betOrderItem.getChildByName("amountEditBox").getComponent(cc.EditBox);
          var str = amountEditBox.string;
          var amount = false == Boolean(parseInt(str)).valueOf() ? 0 : parseInt(str);
        }
      },
      onDestroy: function onDestroy() {
        App.off("channel.MATCH");
        App.off("channel.ODDS");
      }
    });
    cc._RF.pop();
  }, {
    App: "App",
    Tools: "Tools"
  } ],
  billManager: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "93fcfzFQMVHQaZcjyqZvaZX", "billManager");
    "use strict";
    var __extends = this && this.__extends || function() {
      var extendStatics = function(d, b) {
        extendStatics = Object.setPrototypeOf || {
          __proto__: []
        } instanceof Array && function(d, b) {
          d.__proto__ = b;
        } || function(d, b) {
          for (var p in b) b.hasOwnProperty(p) && (d[p] = b[p]);
        };
        return extendStatics(d, b);
      };
      return function(d, b) {
        extendStatics(d, b);
        function __() {
          this.constructor = d;
        }
        d.prototype = null === b ? Object.create(b) : (__.prototype = b.prototype, new __());
      };
    }();
    var __decorate = this && this.__decorate || function(decorators, target, key, desc) {
      var c = arguments.length, r = c < 3 ? target : null === desc ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
      if ("object" === typeof Reflect && "function" === typeof Reflect.decorate) r = Reflect.decorate(decorators, target, key, desc); else for (var i = decorators.length - 1; i >= 0; i--) (d = decorators[i]) && (r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r);
      return c > 3 && r && Object.defineProperty(target, key, r), r;
    };
    Object.defineProperty(exports, "__esModule", {
      value: true
    });
    var App = require("../../script/App");
    var itemManager_1 = require("../../alter/script/itemManager");
    var _a = cc._decorator, ccclass = _a.ccclass, property = _a.property;
    var BillManager = function(_super) {
      __extends(BillManager, _super);
      function BillManager() {
        var _this = null !== _super && _super.apply(this, arguments) || this;
        _this.listTitle = [ null ];
        _this.content = null;
        _this.item = null;
        _this.text = "hello";
        return _this;
      }
      BillManager.prototype.onLoad = function() {
        this.config = [ [ {
          v: "\u8d26\u6237\u7c7b\u578b",
          pl: 86
        }, {
          v: "\u8d26\u6237\u8be6\u60c5",
          pl: 378
        }, {
          v: "\u65f6\u95f4",
          pl: 699
        }, {
          v: "\u76c8\u4e8f",
          pl: 883
        } ], [ {
          v: "\u6295\u6ce8\u91d1\u989d",
          pl: 86
        }, {
          v: "\u5145\u503c\u91d1\u989d",
          pl: 352
        }, {
          v: "\u63d0\u73b0\u91d1\u989d",
          pl: 617
        }, {
          v: "\u76c8\u4e8f\u6c47\u603b",
          pl: 883
        } ], [ {
          v: "\u6295\u6ce8\u8d5b\u4e8b",
          pl: 81
        }, {
          v: "\u4e0b\u6ce8\u8be6\u60c5",
          pl: 333
        }, {
          v: "\u4e0b\u6ce8\u91d1\u989d",
          pl: 563
        }, {
          v: "\u65f6\u95f4",
          pl: 734
        }, {
          v: "\u76c8\u4e8f",
          pl: 878
        } ], [ {
          v: "\u652f\u4ed8\u7c7b\u578b",
          pl: 91
        }, {
          v: "\u8ba2\u5355\u53f7",
          pl: 346
        }, {
          v: "\u91d1\u989d",
          pl: 557
        }, {
          v: "\u65f6\u95f4",
          pl: 724
        }, {
          v: "\u72b6\u6001",
          pl: 868
        } ], [ {
          v: "\u5151\u6362\u7f16\u53f7",
          pl: 92
        }, {
          v: "\u5f00\u6237\u94f6\u884c",
          pl: 365
        }, {
          v: "\u91d1\u989d",
          pl: 577
        }, {
          v: "\u65f6\u95f4",
          pl: 724
        }, {
          v: "\u72b6\u6001",
          pl: 868
        } ], [ {
          v: "\u767b\u5f55\u65f6\u95f4",
          pl: 141
        }, {
          v: "IP",
          pl: 525
        }, {
          v: "\u5f52\u5c5e\u5730",
          pl: 807
        } ] ];
        this.setListTab(this.config[0]);
        cc.log(App);
      };
      BillManager.prototype.onClose = function() {
        this.node.destroy();
      };
      BillManager.prototype.setListTab = function(v) {
        this.listTitle.forEach(function(e, i) {
          if (v[i]) {
            e.node.active = true;
            e.node.x = v[i].pl;
            e.string = v[i].v;
          } else e.node.active = false;
        });
      };
      BillManager.prototype.getList = function(i) {
        var _this = this;
        var keys = [ null, "/users/statis", null, null, null, "/messages/logs" ];
        this.content.children.forEach(function(e) {
          e.destroy();
        });
        switch (i) {
         case "0":
          break;

         case "1":
          App.postTitle(keys[i], this.getListOfDate(), function(data) {
            _this.addItem([ data.data ], i);
          });
          break;

         case "2":
          App.postWithToken("/esbets/query", {
            limit: 100,
            startDate: this.getDate
          }, function(v) {
            cc.log(v);
          });
          break;

         case "3":
         case "4":
          break;

         case "5":
          App.getWithToken(keys[i], function(data) {
            200 == parseInt(data.code) && _this.addItem(data.data, i);
          });
        }
      };
      BillManager.prototype.add0 = function(v) {
        return 2 != v.length ? "0" + v : v;
      };
      BillManager.prototype.getDate = function() {
        var d = new Date();
        return d.getFullYear() + "-" + this.add0(d.getMonth() + "") + "-" + this.add0(d.getDate() + "");
      };
      BillManager.prototype.getListOfDate = function() {
        var d = new Date();
        var data = [ "date=" + d.getFullYear() + "-" + this.add0(d.getMonth() + "") + "-" + this.add0(d.getDate() + "") ];
        cc.log(data);
        return data;
      };
      BillManager.prototype.addItem = function(list, i) {
        var _this = this;
        list.forEach(function(e) {
          var node = cc.instantiate(_this.item).getComponent(itemManager_1.default);
          node.updateData(e, i);
          node.node.parent = _this.content;
        });
      };
      BillManager.prototype.onClickTab = function(e, d) {
        var list = this.config[d];
        this.setListTab(list);
        this.getList(d);
      };
      __decorate([ property(cc.Label) ], BillManager.prototype, "listTitle", void 0);
      __decorate([ property(cc.Node) ], BillManager.prototype, "content", void 0);
      __decorate([ property(cc.Prefab) ], BillManager.prototype, "item", void 0);
      __decorate([ property ], BillManager.prototype, "text", void 0);
      BillManager = __decorate([ ccclass ], BillManager);
      return BillManager;
    }(cc.Component);
    exports.default = BillManager;
    cc._RF.pop();
  }, {
    "../../alter/script/itemManager": "itemManager",
    "../../script/App": "App"
  } ],
  bindAlipay: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "01da9G3HEZJ6bwQC41nHoLu", "bindAlipay");
    "use strict";
    cc.Class({
      extends: cc.Component,
      properties: {
        bindSuccessPanel: {
          default: null,
          type: cc.Prefab
        }
      },
      onLoad: function onLoad() {
        this.node.on(cc.Node.EventType.TOUCH_START, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_MOVE, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_END, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_CANCEL, function(event, touch) {
          void 0 != event.stopProgagation && event.stopProgagation();
        });
      },
      start: function start() {},
      tapClose: function tapClose(sender, customEventData) {
        this.node.destroy();
      },
      tapBind: function tapBind(sender, customEventData) {
        var bindSuccessPanel = cc.instantiate(this.bindSuccessPanel);
        cc.find("Canvas").addChild(bindSuccessPanel);
      }
    });
    cc._RF.pop();
  }, {} ],
  bindDebitCard: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "fa02c6z2aJHD72COYFuWFSf", "bindDebitCard");
    "use strict";
    cc.Class({
      extends: cc.Component,
      properties: {
        bindSuccessPanel: {
          default: null,
          type: cc.Prefab
        }
      },
      onLoad: function onLoad() {
        this.node.on(cc.Node.EventType.TOUCH_START, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_MOVE, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_END, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_CANCEL, function(event, touch) {
          void 0 != event.stopProgagation && event.stopProgagation();
        });
      },
      start: function start() {},
      tapClose: function tapClose(sender, customEventData) {
        this.node.destroy();
      },
      tapBind: function tapBind(sender, customEventData) {
        var bindSuccessPanel = cc.instantiate(this.bindSuccessPanel);
        cc.find("Canvas").addChild(bindSuccessPanel);
      }
    });
    cc._RF.pop();
  }, {} ],
  bindSuccess: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "d776ewPZQ9NoqXQZLWx/re/", "bindSuccess");
    "use strict";
    cc.Class({
      extends: cc.Component,
      properties: {},
      onLoad: function onLoad() {
        this.node.on(cc.Node.EventType.TOUCH_START, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_MOVE, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_END, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_CANCEL, function(event, touch) {
          void 0 != event.stopProgagation && event.stopProgagation();
        });
      },
      start: function start() {},
      tapClose: function tapClose(sender, customEventData) {
        this.node.destroy();
      },
      tapOk: function tapOk(sender, customEventData) {
        this.node.destroy();
      }
    });
    cc._RF.pop();
  }, {} ],
  conversion: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "ec28cxVsA1HOYe4MfTcZ7Do", "conversion");
    "use strict";
    cc.Class({
      extends: cc.Component,
      properties: {
        conversionToDebitCard: {
          default: null,
          type: cc.Node
        },
        conversionToAlipay: {
          default: null,
          type: cc.Node
        },
        conversionRecord: {
          default: null,
          type: cc.Node
        },
        conversionRecordList: {
          default: null,
          type: cc.ScrollView
        },
        conversionRecordItem: {
          default: null,
          type: cc.Prefab
        },
        bindDebitCardPanel: {
          default: null,
          type: cc.Prefab
        },
        bindAlipayPanel: {
          default: null,
          type: cc.Prefab
        }
      },
      onLoad: function onLoad() {
        this.node.on(cc.Node.EventType.TOUCH_START, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_MOVE, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_END, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_CANCEL, function(event, touch) {
          void 0 != event.stopProgagation && event.stopProgagation();
        });
        this.conversionToDebitCard.active = true;
        this.conversionToAlipay.active = false;
        this.conversionRecord.active = false;
      },
      start: function start() {},
      tapClose: function tapClose(sender, customEventData) {
        this.node.destroy();
      },
      checkConversion: function checkConversion(sender, customEventData) {
        var index = parseInt(customEventData);
        switch (index) {
         case 1:
          this.conversionToDebitCard.active = true;
          this.conversionToAlipay.active = false;
          this.conversionRecord.active = false;
          break;

         case 2:
          this.conversionToDebitCard.active = false;
          this.conversionToAlipay.active = true;
          this.conversionRecord.active = false;
          break;

         case 3:
          this.conversionToDebitCard.active = false;
          this.conversionToAlipay.active = false;
          this.conversionRecord.active = true;
          for (var i = 0; i < 10; i++) this.conversionRecordList.content.addChild(cc.instantiate(this.conversionRecordItem));
        }
      },
      tapBindDebitCard: function tapBindDebitCard(sender, customEventData) {
        var bindDebitCardPanel = cc.instantiate(this.bindDebitCardPanel);
        cc.find("Canvas").addChild(bindDebitCardPanel);
      },
      tapBindAlipay: function tapBindAlipay(sender, customEventData) {
        var bindAlipayPanel = cc.instantiate(this.bindAlipayPanel);
        cc.find("Canvas").addChild(bindAlipayPanel);
      }
    });
    cc._RF.pop();
  }, {} ],
  createRoom: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "1cd38Qv7GlKKpKgTR/ejrti", "createRoom");
    "use strict";
    cc.Class({
      extends: cc.Component,
      properties: {
        friendBattleRoomPanel: {
          default: null,
          type: cc.Prefab
        }
      },
      onLoad: function onLoad() {
        this.node.on(cc.Node.EventType.TOUCH_START, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_MOVE, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_END, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_CANCEL, function(event, touch) {
          void 0 != event.stopProgagation && event.stopProgagation();
        });
      },
      start: function start() {},
      tapClose: function tapClose(sender, customEventData) {
        this.node.destroy();
      },
      tapNumber: function tapNumber(sender, customEventData) {
        if (11 == parseInt(customEventData)) {
          var friendBattleRoomPanel = cc.instantiate(this.friendBattleRoomPanel);
          cc.find("Canvas").addChild(friendBattleRoomPanel);
          this.node.destroy();
        }
      },
      tapSkip: function tapSkip(sender, customEventData) {}
    });
    cc._RF.pop();
  }, {} ],
  customer: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "7aad3DCMFdM7IKQGqdqYJ22", "customer");
    "use strict";
    cc.Class({
      extends: cc.Component,
      properties: {
        onlineCustomer: {
          default: null,
          type: cc.Node
        },
        leaveConsult: {
          default: null,
          type: cc.Node
        }
      },
      onLoad: function onLoad() {
        this.node.on(cc.Node.EventType.TOUCH_START, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_MOVE, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_END, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_CANCEL, function(event, touch) {
          void 0 != event.stopProgagation && event.stopProgagation();
        });
        this.onlineCustomer.active = true;
        this.leaveConsult.active = false;
      },
      start: function start() {},
      tapClose: function tapClose(sender, customEventData) {
        this.node.destroy();
      },
      checkCustomer: function checkCustomer(sender, customEventData) {
        var index = parseInt(customEventData);
        switch (index) {
         case 1:
          this.onlineCustomer.active = true;
          this.leaveConsult.active = false;
          break;

         case 2:
          this.onlineCustomer.active = false;
          this.leaveConsult.active = true;
        }
      }
    });
    cc._RF.pop();
  }, {} ],
  datePick: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "3fcd8hHOMJGXafDgAIsvmnj", "datePick");
    "use strict";
    cc.Class({
      extends: cc.Component,
      properties: {
        mask: {
          default: null,
          type: cc.Sprite
        },
        yearPageView: {
          default: null,
          type: cc.PageView
        },
        yearItem: {
          default: null,
          type: cc.Prefab
        },
        monthPageView: {
          default: null,
          type: cc.PageView
        },
        monthItem: {
          default: null,
          type: cc.Prefab
        },
        dayPageView: {
          default: null,
          type: cc.PageView
        },
        dayItem: {
          default: null,
          type: cc.Prefab
        }
      },
      onLoad: function onLoad() {
        this.node.on(cc.Node.EventType.TOUCH_START, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_MOVE, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_END, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_CANCEL, function(event, touch) {
          void 0 != event.stopProgagation && event.stopProgagation();
        });
        var self = this;
        this.mask.node.on(cc.Node.EventType.TOUCH_END, function(event, touch) {
          self.node.destroy();
        });
        for (var i = 0; i < 10; i++) this.yearPageView.content.addChild(cc.instantiate(this.yearItem));
        this.yearPageView.getComponent(cc.PageView).scrollToTop();
        for (var _i = 0; _i < 12; _i++) {
          var monthItem = cc.instantiate(this.monthItem);
          monthItem.getComponent(cc.Label).string = String(_i + 1);
          this.monthPageView.content.addChild(monthItem);
        }
        this.monthPageView.getComponent(cc.PageView).scrollToTop();
        for (var _i2 = 0; _i2 < 10; _i2++) this.dayPageView.content.addChild(cc.instantiate(this.dayItem));
        this.dayPageView.getComponent(cc.PageView).scrollToTop();
      },
      start: function start() {},
      pageYear: function pageYear(sender, customEventData) {}
    });
    cc._RF.pop();
  }, {} ],
  friendBattleRoom: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "cc479KDpHNDx5aWy3SydVVC", "friendBattleRoom");
    "use strict";
    cc.Class({
      extends: cc.Component,
      properties: {
        inviteFriendPanel: {
          default: null,
          type: cc.Prefab
        },
        goldPoolPanel: {
          default: null,
          type: cc.Prefab
        },
        battleEndPanel: {
          default: null,
          type: cc.Prefab
        }
      },
      onLoad: function onLoad() {
        this.node.on(cc.Node.EventType.TOUCH_START, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_MOVE, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_END, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_CANCEL, function(event, touch) {
          void 0 != event.stopProgagation && event.stopProgagation();
        });
      },
      start: function start() {},
      tapBack: function tapBack(sender, customEventData) {
        this.node.destroy();
      },
      tapInviteFriend: function tapInviteFriend(sender, customEventData) {
        var inviteFriendPanel = cc.instantiate(this.inviteFriendPanel);
        cc.find("Canvas").addChild(inviteFriendPanel);
      },
      tapChat: function tapChat(sender, customEventData) {},
      tapStartGame: function tapStartGame(sender, customEventData) {
        var battleEndPanel = cc.instantiate(this.battleEndPanel);
        cc.find("Canvas").addChild(battleEndPanel);
      },
      tapNumber: function tapNumber(sender, customEventData) {},
      tapBet: function tapBet(sender, customEventData) {},
      tapGoldPool: function tapGoldPool(sender, customEventData) {
        var goldPoolPanel = cc.instantiate(this.goldPoolPanel);
        cc.find("Canvas").addChild(goldPoolPanel);
      }
    });
    cc._RF.pop();
  }, {} ],
  friendBattle: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "7a332fc3cNOKbUH8m9KTeO+", "friendBattle");
    "use strict";
    cc.Class({
      extends: cc.Component,
      properties: {
        mask: {
          default: null,
          type: cc.Sprite
        },
        createRoomPanel: {
          default: null,
          type: cc.Prefab
        },
        joinRoomPanel: {
          default: null,
          type: cc.Prefab
        }
      },
      onLoad: function onLoad() {
        this.node.on(cc.Node.EventType.TOUCH_START, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_MOVE, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_END, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_CANCEL, function(event, touch) {
          void 0 != event.stopProgagation && event.stopProgagation();
        });
        var self = this;
        this.mask.node.on(cc.Node.EventType.TOUCH_END, function(event, touch) {
          self.node.destroy();
        });
      },
      start: function start() {},
      tapBack: function tapBack(sender, customEventData) {
        this.node.destroy();
      },
      tapCreateRoom: function tapCreateRoom(sender, customEventData) {
        var createRoomPanel = cc.instantiate(this.createRoomPanel);
        cc.find("Canvas").addChild(createRoomPanel);
      },
      tapJoinRoom: function tapJoinRoom(sender, customEventData) {
        var joinRoomPanel = cc.instantiate(this.joinRoomPanel);
        cc.find("Canvas").addChild(joinRoomPanel);
      }
    });
    cc._RF.pop();
  }, {} ],
  friend: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "717dd1vh0lHa7RloHmclK3k", "friend");
    "use strict";
    cc.Class({
      extends: cc.Component,
      properties: {
        friendList: {
          default: null,
          type: cc.ScrollView
        },
        friendItem: {
          default: null,
          type: cc.Prefab
        },
        inviteInfoList: {
          default: null,
          type: cc.ScrollView
        },
        inviteInfoItem: {
          default: null,
          type: cc.Prefab
        },
        recentlyPartyList: {
          default: null,
          type: cc.ScrollView
        },
        recentlyPartyItem: {
          default: null,
          type: cc.Prefab
        },
        addFriend: {
          default: null,
          type: cc.Node
        },
        searchFriendList: {
          default: null,
          type: cc.ScrollView
        },
        searchFriendItem: {
          default: null,
          type: cc.Prefab
        }
      },
      onLoad: function onLoad() {
        this.node.on(cc.Node.EventType.TOUCH_START, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_MOVE, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_END, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_CANCEL, function(event, touch) {
          void 0 != event.stopProgagation && event.stopProgagation();
        });
        this.friendList.node.active = true;
        this.inviteInfoList.node.active = false;
        this.recentlyPartyList.node.active = false;
        this.addFriend.active = false;
        for (var i = 0; i < 10; i++) this.friendList.content.addChild(cc.instantiate(this.friendItem));
      },
      start: function start() {},
      tapClose: function tapClose(sender, customEventData) {
        this.node.destroy();
      },
      checkFriend: function checkFriend(sender, customEventData) {
        var index = parseInt(customEventData);
        switch (index) {
         case 1:
          this.friendList.node.active = true;
          this.inviteInfoList.node.active = false;
          this.recentlyPartyList.node.active = false;
          this.addFriend.active = false;
          for (var i = 0; i < 10; i++) this.friendList.content.addChild(cc.instantiate(this.friendItem));
          break;

         case 2:
          this.friendList.node.active = false;
          this.inviteInfoList.node.active = true;
          this.recentlyPartyList.node.active = false;
          this.addFriend.active = false;
          for (var _i = 0; _i < 10; _i++) this.inviteInfoList.content.addChild(cc.instantiate(this.inviteInfoItem));
          break;

         case 3:
          this.friendList.node.active = false;
          this.inviteInfoList.node.active = false;
          this.recentlyPartyList.node.active = true;
          this.addFriend.active = false;
          for (var _i2 = 0; _i2 < 10; _i2++) this.recentlyPartyList.content.addChild(cc.instantiate(this.recentlyPartyItem));
          break;

         case 4:
          this.friendList.node.active = false;
          this.inviteInfoList.node.active = false;
          this.recentlyPartyList.node.active = false;
          this.addFriend.active = true;
          for (var _i3 = 0; _i3 < 10; _i3++) this.searchFriendList.content.addChild(cc.instantiate(this.searchFriendItem));
        }
      }
    });
    cc._RF.pop();
  }, {} ],
  gameLogo: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "6ed178dob1F1LA3essUIY4N", "gameLogo");
    "use strict";
    module.exports = [ {
      selected: "moregame/icon_all_selected",
      unselected: "moregame/icon_all_unselected"
    }, {
      selected: "moregame/icon_dota2_selected",
      unselected: "moregame/icon_dota2_unselected"
    }, {
      selected: "moregame/icon_csgo_selected",
      unselected: "moregame/icon_csgo_unselected"
    }, {
      selected: "moregame/icon_lol_selected",
      unselected: "moregame/icon_lol_unselected"
    }, {
      selected: "moregame/icon_wangzherongyao_selected",
      unselected: "moregame/icon_wangzherongyao_unselected"
    }, {
      selected: "moregame/icon_dota2_selected",
      unselected: "moregame/icon_dota2_unselected"
    }, {
      selected: "moregame/icon_dota2_selected",
      unselected: "moregame/icon_dota2_unselected"
    }, {
      selected: "moregame/icon_dota2_selected",
      unselected: "moregame/icon_dota2_unselected"
    }, {
      selected: "moregame/icon_dota2_selected",
      unselected: "moregame/icon_dota2_unselected"
    }, {
      selected: "moregame/icon_cf_selected",
      unselected: "moregame/icon_cf_unselected"
    }, {
      selected: "moregame/icon_overwatch_selected",
      unselected: "moregame/icon_overwatch_unselected"
    }, {
      selected: "moregame/icon_star_craft_selected",
      unselected: "moregame/icon_star_craft_unselected"
    }, {
      selected: "moregame/icon_rocket_league_selected",
      unselected: "moregame/icon_rocket_league_unselected"
    }, {
      selected: "moregame/icon_rainbow_six_selected",
      unselected: "moregame/icon_rainbow_six_unselected"
    }, {
      selected: "moregame/icon_hearth_stone_selected",
      unselected: "moregame/icon_hearth_stone_unselected"
    }, {
      selected: "moregame/icon_dota2_selected",
      unselected: "moregame/icon_dota2_unselected"
    }, {
      selected: "moregame/icon_dota2_selected",
      unselected: "moregame/icon_dota2_unselected"
    }, {
      selected: "moregame/icon_dota2_selected",
      unselected: "moregame/icon_dota2_unselected"
    }, {
      selected: "moregame/icon_call_of_duty_selected",
      unselected: "moregame/icon_call_of_duty_unselected"
    }, {
      selected: "moregame/icon_pubg_selected",
      unselected: "moregame/icon_pubg_unselected"
    }, {
      selected: "moregame/icon_heroes_selected",
      unselected: "moregame/icon_heroes_unselected"
    }, {
      selected: "moregame/icon_dota2_selected",
      unselected: "moregame/icon_dota2_unselected"
    } ];
    cc._RF.pop();
  }, {} ],
  gameplaza: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "d4764OD6eBOl6T6Hu4BiZYm", "gameplaza");
    "use strict";
    cc.Class({
      extends: cc.Component,
      properties: {
        competitionList: {
          default: null,
          type: cc.ScrollView
        },
        competitionItem: {
          default: null,
          type: cc.Prefab
        },
        betPanel: {
          default: null,
          type: cc.Prefab
        },
        datePickPanel: {
          default: null,
          type: cc.Prefab
        },
        friendBattlePanel: {
          default: null,
          type: cc.Prefab
        },
        moreGamePanel: {
          default: null,
          type: cc.Prefab
        }
      },
      onLoad: function onLoad() {
        this.node.on(cc.Node.EventType.TOUCH_START, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_MOVE, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_END, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_CANCEL, function(event, touch) {
          void 0 != event.stopProgagation && event.stopProgagation();
        });
        for (var i = 0; i < 10; i++) {
          var competitionItem = cc.instantiate(this.competitionItem);
          this.competitionList.content.addChild(competitionItem);
          var clickEventHandler = new cc.Component.EventHandler();
          clickEventHandler.target = this.node;
          clickEventHandler.component = "gameplaza";
          clickEventHandler.handler = "tapCompetition";
          clickEventHandler.customEventData = i;
          var button = competitionItem.getChildByName("button").getComponent(cc.Button);
          button.clickEvents.push(clickEventHandler);
        }
      },
      start: function start() {},
      tapHallBack: function tapHallBack(sender, customEventData) {
        this.node.destroy();
      },
      tapCompetition: function tapCompetition(sender, customEventData) {
        var betPanel = cc.instantiate(this.betPanel);
        cc.find("Canvas").addChild(betPanel);
      },
      tapDatePick: function tapDatePick(sender, customEventData) {
        var datePickPanel = cc.instantiate(this.datePickPanel);
        cc.find("Canvas").addChild(datePickPanel);
      },
      tapFriendBattle: function tapFriendBattle(sender, customEventData) {
        var friendBattlePanel = cc.instantiate(this.friendBattlePanel);
        cc.find("Canvas").addChild(friendBattlePanel);
      },
      tapMoreGame: function tapMoreGame(sender, customEventData) {
        var moreGamePanel = cc.instantiate(this.moreGamePanel);
        cc.find("Canvas").addChild(moreGamePanel);
      }
    });
    cc._RF.pop();
  }, {} ],
  goldPool: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "845389IsghFAoXo+TAgrPsh", "goldPool");
    "use strict";
    cc.Class({
      extends: cc.Component,
      properties: {
        goldPoolList: {
          default: null,
          type: cc.ScrollView
        },
        goldPoolItem: {
          default: null,
          type: cc.Prefab
        }
      },
      onLoad: function onLoad() {
        this.node.on(cc.Node.EventType.TOUCH_START, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_MOVE, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_END, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_CANCEL, function(event, touch) {
          void 0 != event.stopProgagation && event.stopProgagation();
        });
        for (var i = 0; i < 10; i++) this.goldPoolList.content.addChild(cc.instantiate(this.goldPoolItem));
      },
      start: function start() {},
      tapClose: function tapClose(sender, customEventData) {
        this.node.destroy();
      }
    });
    cc._RF.pop();
  }, {} ],
  inviteFriend: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "cfa5eTx/1xFJYru1VpmufW6", "inviteFriend");
    "use strict";
    cc.Class({
      extends: cc.Component,
      properties: {
        friendList: {
          default: null,
          type: cc.ScrollView
        },
        friendItem: {
          default: null,
          type: cc.Prefab
        }
      },
      onLoad: function onLoad() {
        this.node.on(cc.Node.EventType.TOUCH_START, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_MOVE, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_END, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_CANCEL, function(event, touch) {
          void 0 != event.stopProgagation && event.stopProgagation();
        });
        for (var i = 0; i < 10; i++) this.friendList.content.addChild(cc.instantiate(this.friendItem));
      },
      start: function start() {},
      tapClose: function tapClose(sender, customEventData) {
        this.node.destroy();
      }
    });
    cc._RF.pop();
  }, {} ],
  itemManager: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "d0c576dL6lOf7poIPPQYOW5", "itemManager");
    "use strict";
    var __extends = this && this.__extends || function() {
      var extendStatics = function(d, b) {
        extendStatics = Object.setPrototypeOf || {
          __proto__: []
        } instanceof Array && function(d, b) {
          d.__proto__ = b;
        } || function(d, b) {
          for (var p in b) b.hasOwnProperty(p) && (d[p] = b[p]);
        };
        return extendStatics(d, b);
      };
      return function(d, b) {
        extendStatics(d, b);
        function __() {
          this.constructor = d;
        }
        d.prototype = null === b ? Object.create(b) : (__.prototype = b.prototype, new __());
      };
    }();
    var __decorate = this && this.__decorate || function(decorators, target, key, desc) {
      var c = arguments.length, r = c < 3 ? target : null === desc ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
      if ("object" === typeof Reflect && "function" === typeof Reflect.decorate) r = Reflect.decorate(decorators, target, key, desc); else for (var i = decorators.length - 1; i >= 0; i--) (d = decorators[i]) && (r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r);
      return c > 3 && r && Object.defineProperty(target, key, r), r;
    };
    Object.defineProperty(exports, "__esModule", {
      value: true
    });
    var _a = cc._decorator, ccclass = _a.ccclass, property = _a.property;
    var itemManager = function(_super) {
      __extends(itemManager, _super);
      function itemManager() {
        var _this = null !== _super && _super.apply(this, arguments) || this;
        _this.labelList = [];
        _this.text = "hello";
        _this.listX = [];
        return _this;
      }
      itemManager.prototype.updateData = function(data, i) {
        var _this = this;
        this.listX = [ [ -415, -125, 305, 200, 380 ], [ -415, -150, 115, 380 ], [ -424, -172, 60, 230, 380 ], [ -413, -157, 54, 220, 366 ], [ -413, -140, 74, 220, 366 ], [ -365, 20, 305 ] ];
        this.labelList.forEach(function(e, index) {
          e.node.active = false;
          if (_this.listX[i][index]) {
            e.node.active = true;
            e.node.x = _this.listX[i][index];
          }
        });
        this.setData(data, i);
      };
      itemManager.prototype.setData = function(v, i) {
        switch (i) {
         case "0":
          break;

         case "1":
          this.labelList[0].string = v.betAmount;
          this.labelList[1].string = v.depositAmount;
          this.labelList[2].string = v.rebateAmount;
          this.labelList[3].string = v.winAmount;
          break;

         case "2":
         case "3":
         case "4":
          break;

         case "5":
          this.labelList[0].string = v.createDate;
          this.labelList[1].string = v.createIp;
          this.labelList[2].string = v.remark;
        }
      };
      __decorate([ property(cc.Label) ], itemManager.prototype, "labelList", void 0);
      __decorate([ property ], itemManager.prototype, "text", void 0);
      itemManager = __decorate([ ccclass ], itemManager);
      return itemManager;
    }(cc.Component);
    exports.default = itemManager;
    cc._RF.pop();
  }, {} ],
  joinRoom: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "36cadl/wgBHoJpOD/u5jumy", "joinRoom");
    "use strict";
    cc.Class({
      extends: cc.Component,
      properties: {},
      onLoad: function onLoad() {
        this.node.on(cc.Node.EventType.TOUCH_START, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_MOVE, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_END, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_CANCEL, function(event, touch) {
          void 0 != event.stopProgagation && event.stopProgagation();
        });
      },
      start: function start() {},
      tapClose: function tapClose(sender, customEventData) {
        this.node.destroy();
      },
      tapNumber: function tapNumber(sender, customEventData) {}
    });
    cc._RF.pop();
  }, {} ],
  moreGame: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "b0782WZWRVPRae+1dF9mT1d", "moreGame");
    "use strict";
    var App = require("App");
    var Tools = require("Tools");
    var gameLogo = require("gameLogo");
    cc.Class({
      extends: cc.Component,
      properties: {
        gameList: {
          default: null,
          type: cc.ScrollView
        },
        gameItem: {
          default: null,
          type: cc.Node
        },
        gameCategoryMask: {
          default: null,
          type: cc.Sprite
        },
        gameCategory: {
          default: null,
          type: cc.ToggleContainer
        },
        gameCategoryItem: {
          default: null,
          type: cc.Node
        },
        previousGameCategoryItem: {
          default: null,
          type: cc.Node
        },
        gameCategoryItemArray: [ cc.Prefab ],
        expandGameCategory: {
          default: null,
          type: cc.Toggle
        },
        betPanel: {
          default: null,
          type: cc.Prefab
        },
        week: {
          default: null,
          type: cc.ToggleContainer
        },
        weekCount: 0,
        today: {
          default: null,
          type: cc.Toggle
        },
        checkTypeType: 1,
        category: null,
        startDate: "",
        gameType: {
          default: null,
          type: cc.ToggleContainer
        }
      },
      onLoad: function onLoad() {
        this.gameCategory.node.removeAllChildren();
        var self = this;
        App.get("/games/category", function(data) {
          if (200 == parseInt(data.code)) {
            self.updateGameCategory(data.data);
            self.expandGameCategory.getComponent(cc.Toggle).uncheck();
          }
        });
        this.requestCheckType();
        var today = new Date();
        self.showWeek(today);
        this.today.node.on("click", function(button) {
          self.weekCount = 0;
          self.showWeek(today);
          self.week.node.getChildByName("toggle1").getComponent(cc.Toggle).check();
        });
        this.gameCategoryItem.active = false;
        this.gameItem.active = false;
        cc.find("Canvas").getComponent("HallScene").showSettingButton(false);
      },
      showWeek: function showWeek(date) {
        for (var i = 0; i < 7; i++) {
          var newDate = new Date(date.getTime() + 24 * i * 60 * 60 * 1e3);
          var year = newDate.getFullYear();
          var month = newDate.getMonth() + 1;
          var day = newDate.getDate();
          var dayStr = month + "-" + day + " " + Tools.getWeekStr(year, month, day);
          this.week.node.getChildByName("toggle" + (i + 1)).getChildByName("label").getComponent(cc.Label).string = dayStr;
          var checkEventHandler = new cc.Component.EventHandler();
          checkEventHandler.target = this.node;
          checkEventHandler.component = "moreGame";
          checkEventHandler.handler = "checkWeek";
          checkEventHandler.customEventData = {
            date: year + "-" + month + "-" + day,
            index: i
          };
          this.week.node.getChildByName("toggle" + (i + 1)).getComponent(cc.Toggle).checkEvents.push(checkEventHandler);
        }
        this.week.node.getChildByName("toggle1").getComponent(cc.Toggle).check();
      },
      checkWeek: function checkWeek(sender, customEventData) {
        this.startDate = customEventData.date;
        for (var i = 0; i < 7; i++) i == customEventData.index && sender.isChecked ? this.week.node.getChildByName("toggle" + (i + 1)).getChildByName("label").color = new cc.Color(36, 158, 210) : this.week.node.getChildByName("toggle" + (i + 1)).getChildByName("label").color = new cc.Color(167, 173, 175);
        this.requestCheckType();
      },
      requestCheckType: function requestCheckType() {
        this.gameList.content.removeAllChildren();
        var self = this;
        var postData = void 0;
        switch (this.checkTypeType) {
         case 1:
          postData = {
            startDate: Tools.todayStr() + " " + Tools.timeStr(),
            endDate: Tools.nextDateStr(),
            status: 0,
            type: 0,
            offset: 0,
            category: this.category,
            categoryType: 0
          };
          break;

         case 2:
          postData = {
            state: 1,
            type: 0,
            offset: 0,
            category: this.category,
            categoryType: 0
          };
          break;

         case 3:
          postData = {
            startDate: this.startDate,
            state: 0,
            type: 1,
            offset: 0,
            category: this.category,
            categoryType: 0
          };
          break;

         case 4:
          postData = {
            state: 4,
            type: 0,
            offset: 0,
            limit: 30,
            category: this.category,
            categoryType: 0
          };
        }
        cc.find("Loading").getComponent("Loading").show();
        App.post("/games/list", postData, function(data) {
          cc.find("Loading").getComponent("Loading").close();
          200 == parseInt(data.code) ? self.updateMoreGame(data.data) : cc.find("FadeMsg").getComponent("FadeMsg").show(data.message.zh);
        });
      },
      checkType: function checkType(sender, customEventData) {
        switch (parseInt(customEventData)) {
         case 1:
          this.weekCount = 0;
          this.checkTypeType = 1;
          var today = new Date();
          this.showWeek(today);
          break;

         case 2:
          this.checkTypeType = 2;
          break;

         case 3:
          this.checkTypeType = 3;
          break;

         case 4:
          this.checkTypeType = 4;
        }
        for (var i = 1; i <= 4; i++) i == parseInt(customEventData) ? this.gameType.node.getChildByName("toggle" + i).getChildByName("name").color = new cc.Color(255, 255, 255) : this.gameType.node.getChildByName("toggle" + i).getChildByName("name").color = new cc.Color(137, 203, 255);
        this.requestCheckType();
      },
      updateGameCategory: function updateGameCategory(data) {
        var _this = this;
        this.gameCategory.node.removeAllChildren();
        var sum = 0;
        for (var i = 0; i < data.length; i++) sum += data[i].total;
        var gameCategoryItem = cc.instantiate(this.gameCategoryItem);
        gameCategoryItem.active = true;
        var title = gameCategoryItem.getChildByName("title");
        var total = gameCategoryItem.getChildByName("total");
        gameCategoryItem.setPosition(cc.v2(0, 0));
        title.getComponent(cc.Label).string = "\u5168\u90e8";
        total.getComponent(cc.Label).string = 100;
        this.gameCategory.node.addChild(gameCategoryItem);
        this.gameCategoryItemArray.push(gameCategoryItem);
        var _loop = function _loop(_i) {
          var gameCategoryItem = cc.instantiate(_this.gameCategoryItem);
          gameCategoryItem.active = true;
          var stepX = (_i + 1) % 5;
          var setpY = parseInt((_i + 1) / 5);
          var pos = cc.v2(212 * stepX, -60 * setpY);
          gameCategoryItem.setPosition(pos);
          _this.gameCategory.node.addChild(gameCategoryItem);
          _this.gameCategoryItemArray.push(gameCategoryItem);
          var title = gameCategoryItem.getChildByName("title");
          var total = gameCategoryItem.getChildByName("total");
          cc.loader.loadRes(gameLogo[_i + 1].unselected, cc.SpriteFrame, function(err, spriteFrame) {
            if (err) return;
            gameCategoryItem.getChildByName("logo").getComponent(cc.Sprite).spriteFrame = spriteFrame;
          });
          title.getComponent(cc.Label).string = data[_i].title;
          total.getComponent(cc.Label).string = data[_i].total;
          title.color = new cc.Color(36, 158, 210);
        };
        for (var _i = 0; _i < data.length; _i++) _loop(_i);
        for (var _i2 = 0; _i2 < this.gameCategoryItemArray.length; _i2++) {
          var checkEventHandler = new cc.Component.EventHandler();
          checkEventHandler.target = this.node;
          checkEventHandler.component = "moreGame";
          checkEventHandler.handler = "checkGameCategoryItem";
          checkEventHandler.customEventData = 0 == _i2 ? {
            category: null,
            categoryType: 0,
            index: _i2
          } : {
            category: data[_i2 - 1].id,
            categoryType: data[_i2 - 1].sport,
            index: _i2
          };
          var toggle = this.gameCategoryItemArray[_i2].getComponent(cc.Toggle);
          toggle.checkEvents.push(checkEventHandler);
        }
      },
      checkGameCategoryItem: function checkGameCategoryItem(sender, customEventData) {
        var self = this;
        this.category = customEventData.category;
        this.requestCheckType();
        if (sender.isChecked) {
          sender.node.getChildByName("title").color = new cc.Color(255, 255, 255);
          cc.loader.loadRes(gameLogo[customEventData.index].selected, cc.SpriteFrame, function(err, spriteFrame) {
            if (err) return;
            sender.node.getChildByName("logo").getComponent(cc.Sprite).spriteFrame = spriteFrame;
          });
        } else sender.node.getChildByName("title").color = new cc.Color(36, 158, 210);
        null != this.previousGameCategoryItem && (this.previousGameCategoryItem.node.getChildByName("title").color = new cc.Color(36, 158, 210));
        var _loop2 = function _loop2(i) {
          i !== customEventData.index && cc.loader.loadRes(gameLogo[i].unselected, cc.SpriteFrame, function(err, spriteFrame) {
            if (err) return;
            self.gameCategoryItemArray[i].getChildByName("logo").getComponent(cc.Sprite).spriteFrame = spriteFrame;
          });
        };
        for (var i = 0; i < this.gameCategoryItemArray.length; i++) _loop2(i);
        this.previousGameCategoryItem = sender;
      },
      start: function start() {},
      tapBack: function tapBack(sender, customEventData) {
        this.node.destroy();
      },
      checkExpandGameCategory: function checkExpandGameCategory(sender, customEventData) {
        if (sender.isChecked) {
          for (var i = 0; i < this.gameCategoryItemArray.length; i++) this.gameCategoryItemArray[i].active = true;
          var height = 62 + 60 * parseInt(this.gameCategoryItemArray.length / 5);
          this.gameCategoryMask.node.setContentSize(1214, height);
          this.expandGameCategory.node.getChildByName("Background").active = false;
        } else {
          for (var _i3 = 0; _i3 < 5; _i3++) this.gameCategoryItemArray[_i3].active = true;
          for (var _i4 = 5; _i4 < this.gameCategoryItemArray.length; _i4++) this.gameCategoryItemArray[_i4].active = false;
          this.gameCategoryMask.node.setContentSize(1214, 62);
          this.expandGameCategory.node.getChildByName("Background").active = true;
        }
      },
      updateMoreGame: function updateMoreGame(data) {
        this.gameList.content.removeAllChildren();
        for (var i = 0; i < data.content.length; i += 2) {
          var gameItem = cc.instantiate(this.gameItem);
          gameItem.active = true;
          gameItem.setPosition(cc.v2(0, 0));
          this.gameList.content.addChild(gameItem);
          var bg0 = gameItem.getChildByName("bg_competition_item0");
          var bg1 = gameItem.getChildByName("bg_competition_item1");
          this.setupGameItem(data, bg0, i);
          i + 1 < data.content.length ? this.setupGameItem(data, bg1, i + 1) : bg1.active = false;
        }
      },
      setupGameItem: function setupGameItem(data, root, index) {
        var partyLogo0 = root.getChildByName("icon_party_logo0");
        var partyLogo1 = root.getChildByName("icon_party_logo1");
        var url0 = void 0;
        var regStr;
        var reg;
        var result;
        false;
        url0 = "https://" + data.content[index].teams[0].eimage;
        cc.loader.load({
          url: url0,
          type: "png"
        }, function(err, texture) {
          var sp = new cc.SpriteFrame(texture);
          partyLogo0.getComponent(cc.Sprite).spriteFrame = sp;
        });
        var url1 = void 0;
        var _regStr;
        var _reg;
        var _result;
        false;
        url1 = "https://" + data.content[index].teams[1].eimage;
        cc.loader.load({
          url: url1,
          type: "png"
        }, function(err, texture) {
          var sp = new cc.SpriteFrame(texture);
          partyLogo1.getComponent(cc.Sprite).spriteFrame = sp;
        });
        var partyName0 = root.getChildByName("partyName0");
        var partyName1 = root.getChildByName("partyName1");
        var name = root.getChildByName("name");
        var state = root.getChildByName("state");
        partyName0.getComponent(cc.Label).string = data.content[index].teams[0].name;
        partyName1.getComponent(cc.Label).string = data.content[index].teams[1].name;
        name.getComponent(cc.Label).string = data.content[index].name;
        state.getComponent(cc.Label).string = Tools.GetGameStateStr([ data.content[index].state ]);
        var buttonNode = root.getChildByName("button");
        var clickEventHandler = new cc.Component.EventHandler();
        clickEventHandler.target = this.node;
        clickEventHandler.component = "moreGame";
        clickEventHandler.handler = "tapGame";
        data.content[index].matches.length > 0 ? clickEventHandler.customEventData = {
          gameId: data.content[index].id,
          matchId: data.content[index].matches[0].id
        } : clickEventHandler.customEventData = {
          gameId: data.content[index].id,
          matchId: void 0
        };
        var button = buttonNode.getComponent(cc.Button);
        button.clickEvents.push(clickEventHandler);
      },
      tapGame: function tapGame(sender, customEventData) {
        var getData = [ "id=" + customEventData.gameId ];
        var self = this;
        App.getWithData("/games/detail", getData, function(data) {
          if (200 == parseInt(data.code)) {
            var betPanel = cc.instantiate(self.betPanel);
            cc.find("Canvas").addChild(betPanel);
            betPanel.getComponent("bet").setupWithData(data.data, customEventData.gameId, customEventData.matchId);
          }
        });
      },
      tapPreviousWeek: function tapPreviousWeek(sender, customEventData) {
        this.weekCount++;
        var today = new Date();
        this.showWeek(new Date(today.getTime() + 7 * this.weekCount * 24 * 60 * 60 * 1e3));
      },
      tapNextWeek: function tapNextWeek(sender, customEventData) {
        this.weekCount--;
        var today = new Date();
        this.showWeek(new Date(today.getTime() + 7 * this.weekCount * 24 * 60 * 60 * 1e3));
      },
      onDestroy: function onDestroy() {
        cc.find("Canvas").getComponent("HallScene").showSettingButton(true);
      }
    });
    cc._RF.pop();
  }, {
    App: "App",
    Tools: "Tools",
    gameLogo: "gameLogo"
  } ],
  networkError: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "95ccbosyAVCaYg0gudLFiRP", "networkError");
    "use strict";
    cc.Class({
      extends: cc.Component,
      properties: {},
      onLoad: function onLoad() {
        this.node.on(cc.Node.EventType.TOUCH_START, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_MOVE, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_END, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_CANCEL, function(event, touch) {
          void 0 != event.stopProgagation && event.stopProgagation();
        });
      },
      start: function start() {},
      tapClose: function tapClose(sender, customEventData) {
        this.node.destroy();
      },
      tapOk: function tapOk(sender, customEventData) {
        this.node.destroy();
      }
    });
    cc._RF.pop();
  }, {} ],
  noticeView: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "1cd50ey8MhJXLf1LYhgj1ke", "noticeView");
    "use strict";
    var App = require("App");
    cc.Class({
      extends: cc.Component,
      properties: {
        noticeContentList: {
          default: null,
          type: cc.ScrollView
        },
        noticeContent: {
          default: null,
          type: cc.Prefab
        },
        noticeViewData: Object
      },
      onLoad: function onLoad() {
        this.node.on(cc.Node.EventType.TOUCH_START, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_MOVE, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_END, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_CANCEL, function(event, touch) {
          void 0 != event.stopProgagation && event.stopProgagation();
        });
      },
      tapRead: function tapRead(sender, customEventData) {
        var getData = [ "id=" + this.noticeViewData.id ];
        var self = this;
        App.getWithTokenData("/messages/get", getData, function(data) {
          200 == parseInt(data.code);
        });
        this.node.destroy();
      },
      setup: function setup(data) {
        this.noticeViewData = data;
        var noticeContent = cc.instantiate(this.noticeContent);
        this.noticeContentList.content.addChild(noticeContent);
        noticeContent.getComponent(cc.RichText).string = "<color=#99C1F5FF>" + data.content + "</c>";
      },
      start: function start() {},
      tapClose: function tapClose(sender, customEventData) {
        this.node.destroy();
      }
    });
    cc._RF.pop();
  }, {
    App: "App"
  } ],
  notice: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "1bab5QRHLZORL0XwTFVVd0G", "notice");
    "use strict";
    var App = require("App");
    cc.Class({
      extends: cc.Component,
      properties: {
        mailList: {
          default: null,
          type: cc.ScrollView
        },
        mailItem: {
          default: null,
          type: cc.Prefab
        },
        noticeViewPanel: {
          default: null,
          type: cc.Prefab
        },
        mailData: Object,
        checkTypeType: 1,
        loginLogNode: {
          default: null,
          type: cc.Node
        },
        loginLogList: {
          default: null,
          type: cc.ScrollView
        },
        loginLogItem: {
          default: null,
          type: cc.Prefab
        }
      },
      onLoad: function onLoad() {
        this.node.on(cc.Node.EventType.TOUCH_START, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_MOVE, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_END, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_CANCEL, function(event, touch) {
          void 0 != event.stopProgagation && event.stopProgagation();
        });
        this.checkTypeType = 1;
        this.mailList.active = true;
        this.loginLogNode.active = false;
        var self = this;
        var getData = [ "offset=0" ];
        var _self = this;
        App.getWithTokenData("/messages/list", getData, function(data) {
          if (200 == parseInt(data.code)) {
            _self.mailData = data;
            _self.updateMailList();
          }
        });
      },
      updateMailList: function updateMailList() {
        var _this = this;
        this.mailList.content.removeAllChildren();
        var _loop = function _loop(i) {
          if (1 == _this.checkTypeType) ; else if (2 == _this.checkTypeType) {
            if (0 != _this.mailData.data.content[i].state) return "continue";
          } else {
            if (3 != _this.checkTypeType) return "continue";
            if (1 != _this.mailData.data.content[i].state) return "continue";
          }
          var mailItem = cc.instantiate(_this.mailItem);
          _this.mailList.content.addChild(mailItem);
          var bg = void 0;
          0 == _this.mailData.data.content[i].state ? bg = "bg_notice_item_unread" : 1 == _this.mailData.data.content[i].state && (bg = "bg_notice_item_read");
          cc.loader.loadRes(bg, cc.SpriteFrame, function(err, spriteFrame) {
            if (err) {
              cc.log(err);
              return;
            }
            mailItem.getComponent(cc.Sprite).spriteFrame = spriteFrame;
          });
          mailItem.getChildByName("sender").getComponent(cc.Label).string = "\u53d1\u4fe1\u4eba: " + _this.mailData.data.content[i].user;
          mailItem.getChildByName("content").getComponent(cc.Label).string = _this.mailData.data.content[i].title;
          mailItem.getChildByName("time").getComponent(cc.Label).string = _this.mailData.data.content[i].createDate;
          var viewNode = mailItem.getChildByName("view");
          clickEventHandler = new cc.Component.EventHandler();
          clickEventHandler.target = _this.node;
          clickEventHandler.component = "notice";
          clickEventHandler.handler = "tapView";
          clickEventHandler.customEventData = i;
          button = viewNode.getComponent(cc.Button);
          button.clickEvents.push(clickEventHandler);
        };
        for (var i = 0; i < this.mailData.data.content.length; i++) {
          var clickEventHandler;
          var button;
          var _ret = _loop(i);
          if ("continue" === _ret) continue;
        }
      },
      updateLoginLogList: function updateLoginLogList(data) {
        this.loginLogList.content.removeAllChildren();
        for (var i = 0; i < data.length; i++) {
          var loginLogItem = cc.instantiate(this.loginLogItem);
          loginLogItem.getChildByName("time").getComponent(cc.Label).string = data[i].createDate;
          loginLogItem.getChildByName("ip").getComponent(cc.Label).string = data[i].createIp;
          this.loginLogList.content.addChild(loginLogItem);
        }
      },
      checkType: function checkType(sender, customEventData) {
        this.checkTypeType = customEventData;
        if (1 == this.checkTypeType || 2 == this.checkTypeType || 3 == this.checkTypeType) {
          this.updateMailList();
          this.mailList.active = true;
          this.loginLogNode.active = false;
        } else {
          var self = this;
          this.mailList.active = false;
          this.loginLogNode.active = true;
          App.getWithToken("/messages/logs", function(data) {
            200 == parseInt(data.code) && self.updateLoginLogList(data.data);
          });
        }
      },
      start: function start() {},
      tapClose: function tapClose(sender, customEventData) {
        this.node.destroy();
      },
      tapView: function tapView(sender, customEventData) {
        var noticeViewPanel = cc.instantiate(this.noticeViewPanel);
        noticeViewPanel.getComponent("noticeView").setup(this.mailData.data.content[customEventData]);
        cc.find("Canvas").addChild(noticeViewPanel);
      }
    });
    cc._RF.pop();
  }, {
    App: "App"
  } ],
  openBank: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "ed021wjL8FE5LZ1hjimjJHy", "openBank");
    "use strict";
    cc.Class({
      extends: cc.Component,
      properties: {},
      onLoad: function onLoad() {
        this.node.on(cc.Node.EventType.TOUCH_START, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_MOVE, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_END, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_CANCEL, function(event, touch) {
          void 0 != event.stopProgagation && event.stopProgagation();
        });
      },
      start: function start() {},
      tapClose: function tapClose(sender, customEventData) {
        this.node.destroy();
      },
      tapOk: function tapOk(sender, customEventData) {
        this.node.destroy();
      }
    });
    cc._RF.pop();
  }, {} ],
  personalInfo: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "4c294YMZppLZ6hvCInQ8fnt", "personalInfo");
    "use strict";
    var SDKTools = require("SDKTools");
    var App = require("App");
    cc.Class({
      extends: cc.Component,
      properties: {
        headImage: {
          default: null,
          type: cc.Sprite
        }
      },
      onLoad: function onLoad() {
        this.node.on(cc.Node.EventType.TOUCH_START, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_MOVE, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_END, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_CANCEL, function(event, touch) {
          void 0 != event.stopProgagation && event.stopProgagation();
        });
        var self = this;
        cc.loader.load({
          url: App.getHeadImageByUserId(App.myUser.id),
          type: "png"
        }, function(err, texture) {
          if (err) return;
          var sp = new cc.SpriteFrame(texture);
          self.headImage.getComponent(cc.Sprite).spriteFrame = new cc.SpriteFrame(texture);
        });
        App.on("finishSelectImage", function(savePath, imageWidth, imageHeight) {
          cc.loader.load({
            url: savePath,
            type: "binary"
          }, function(err, result) {
            App.postImage("/users/uploadAvatarStream", result, function(data) {
              200 == parseInt(data.code) ? cc.find("FadeMsg").getComponent("FadeMsg").show("\u4e0a\u4f20\u5934\u50cf\u6210\u529f") : cc.find("FadeMsg").getComponent("FadeMsg").show(data.message.zh);
            });
          });
        });
      },
      start: function start() {},
      tapClose: function tapClose(sender, customEventData) {
        this.node.destroy();
      },
      tapChangeHeadImage: function tapChangeHeadImage(sender, customEventData) {
        if (cc.sys.isNative) SDKTools.selectAlbumImage(); else {
          var gameCanvas = document.getElementById("GameCanvas");
          var div = document.createElement("div");
          div.style.position = "absolute";
          div.style.width = 140;
          div.style.height = 140;
          div.style.left = 140;
          div.style.top = 140;
          var form = document.createElement("form");
          form.enctype = "multipart/form-data";
          form.id = "uploadForm";
          var input = document.createElement("input");
          input.id = "upLoadInput";
          input.apccept = "image/*";
          input.type = "file";
          cc.sys.os == cc.sys.OS_ANDROID && (input.capture = "camera");
          div.appendChild(form);
          form.appendChild(input);
          document.body.appendChild(div);
          var width = document.documentElement.clientWidth;
          var height = document.documentElement.clientHeight;
          cc.log(width, height);
          width < height && (div.style.transform = "rotate(90deg)");
          input.addEventListener("change", function(e) {
            var formData = new FormData(form);
            div.remove();
            formData.append("orderId", 123456789);
            cc.log(formData);
            var xhr = new XMLHttpRequest();
            xhr.open("POST", "/m2015/visa/book/UploadAndBindMaterial");
            xhr.onload = function(e) {
              200 == xhr.status;
            };
            xhr.ontimeout = function(e) {};
            xhr.onerror = function(e) {};
            xhr.upload.onprogress = function(e) {};
            xhr.send(formData);
          }, false);
        }
      },
      tapEditNickName: function tapEditNickName(sender, customEventData) {},
      tapSwitchAccount: function tapSwitchAccount(sender, customEventData) {},
      onDestroy: function onDestroy() {
        App.off("finishSelectImage");
      }
    });
    cc._RF.pop();
  }, {
    App: "App",
    SDKTools: "SDKTools"
  } ],
  personalManager: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "716c79FPiZE4JiAnMidxa2B", "personalManager");
    "use strict";
    var App = require("App");
    var SDKTools = require("SDKTools");
    cc.Class({
      extends: cc.Component,
      properties: {
        userid: {
          default: null,
          type: cc.Label
        },
        userName: {
          default: null,
          type: cc.EditBox
        },
        birthday: {
          default: null,
          type: cc.Label
        },
        userDynamic: {
          default: null,
          type: cc.EditBox
        },
        sex: {
          default: null,
          type: cc.ToggleContainer
        },
        headImage: {
          default: null,
          type: cc.Sprite
        },
        gold: {
          default: null,
          type: cc.Label
        },
        shareDialog: {
          default: null,
          type: cc.Prefab
        },
        recharge: {
          default: null,
          type: cc.Prefab
        },
        conversion: {
          default: null,
          type: cc.Prefab
        },
        setting: {
          default: null,
          type: cc.Prefab
        },
        billDialog: {
          default: null,
          type: cc.Prefab
        },
        noticeDialog: {
          default: null,
          type: cc.Prefab
        }
      },
      onLoad: function onLoad() {
        cc.log(App);
        this.updataView();
      },
      updataView: function updataView() {
        if (!App.myUser) return;
        this.userid.string = "ID:" + App.myUser.id;
        this.userName.string = App.myUser.username;
        this.sex.node.children[0].getComponent(cc.Toggle).isChecked = App.myUser.sex;
        this.sex.node.children[1].getComponent(cc.Toggle).isChecked = !App.myUser.sex;
        this.updateAvatar();
        App.getWithToken("/users/getUserBalance", function(data) {
          if (200 == parseInt(data.code)) {
            App.myUser.setup(data.data);
            self.gold.string = data.data;
          }
        });
        var self = this;
        App.on("finishSelectImage", function(savePath, imageWidth, imageHeight) {
          cc.loader.load({
            url: savePath,
            type: "binary"
          }, function(err, result) {
            App.postImage("/users/uploadAvatarStream", result, function(data) {
              if (200 == parseInt(data.code)) {
                cc.find("FadeMsg").getComponent("FadeMsg").show("\u4e0a\u4f20\u5934\u50cf\u6210\u529f\uff0c\u8bf7\u7a0d\u540e\u67e5\u770b");
                cc.find("Canvas").getComponent("HallScene").updateAvatar();
                self.updateAvatar();
              } else cc.find("FadeMsg").getComponent("FadeMsg").show(data.message.zh);
            });
          });
        });
      },
      updateAvatar: function updateAvatar() {
        var self = this;
        cc.loader.load({
          url: App.getHeadImageByUserId(App.myUser.id),
          type: "png"
        }, function(err, texture) {
          if (err) return;
          var sp = new cc.SpriteFrame(texture);
          self.headImage.spriteFrame = new cc.SpriteFrame(texture);
        });
      },
      onSwitchHeadImage: function onSwitchHeadImage(sender, customEventData) {
        cc.sys.isNative && SDKTools.selectAlbumImage();
      },
      onClose: function onClose() {
        this.node.destroy();
      },
      onClickStore: function onClickStore() {
        var postData = {
          birthdate: "",
          email: "",
          nickname: "",
          profile: "",
          sex: this.sex.node.children[0].getComponent(cc.Toggle).isChecked ? 1 : 0,
          truename: this.userName.string
        };
        cc.log(postData);
        App.post("/users/update", postData, function(data) {
          cc.log(data);
        });
      },
      onClickShare: function onClickShare() {
        var shareDialog = cc.instantiate(this.shareDialog);
        cc.find("Canvas").addChild(shareDialog);
      },
      onClickRecharge: function onClickRecharge() {
        var recharge = cc.instantiate(this.recharge);
        cc.find("Canvas").addChild(recharge);
      },
      onClickConversion: function onClickConversion() {
        var conversion = cc.instantiate(this.conversion);
        cc.find("Canvas").addChild(conversion);
      },
      onClickSetting: function onClickSetting() {
        var setting = cc.instantiate(this.setting);
        cc.find("Canvas").addChild(setting);
      },
      onClickBill: function onClickBill() {
        var billDialog = cc.instantiate(this.billDialog);
        cc.find("Canvas").addChild(billDialog);
      },
      onClickNotice: function onClickNotice() {
        var noticeDialog = cc.instantiate(this.noticeDialog);
        cc.find("Canvas").addChild(noticeDialog);
      },
      onDestroy: function onDestroy() {
        this.updateHeadImageFunc && this.updateHeadImageComponent.unschedule(this.updateHeadImageFunc);
        App.off("finishSelectImage");
      }
    });
    cc._RF.pop();
  }, {
    App: "App",
    SDKTools: "SDKTools"
  } ],
  provinces: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "eea22WzXSVNMpACP1CfJt3D", "provinces");
    "use strict";
    module.exports = [ {
      name: "\u5317\u4eac\u5e02",
      level: "1",
      code: "1100",
      cities: [ {
        name: "\u5317\u4eac\u5e02",
        level: "1",
        code: "1100"
      } ]
    }, {
      name: "\u5929\u6d25\u5e02",
      level: "1",
      code: "1200",
      cities: [ {
        name: "\u5929\u6d25\u5e02",
        level: "1",
        code: "1200"
      } ]
    }, {
      name: "\u6cb3\u5317\u7701",
      level: "1",
      code: "1300",
      cities: [ {
        name: "\u77f3\u5bb6\u5e84\u5e02",
        level: "2",
        code: "1301"
      }, {
        name: "\u5510\u5c71\u5e02",
        level: "3",
        code: "1302"
      }, {
        name: "\u79e6\u7687\u5c9b\u5e02",
        level: "3",
        code: "1303"
      }, {
        name: "\u90af\u90f8\u5e02",
        level: "3",
        code: "1304"
      }, {
        name: "\u90a2\u53f0\u5e02",
        level: "3",
        code: "1305"
      }, {
        name: "\u4fdd\u5b9a\u5e02",
        level: "3",
        code: "1306"
      }, {
        name: "\u5f20\u5bb6\u53e3\u5e02",
        level: "3",
        code: "1307"
      }, {
        name: "\u627f\u5fb7\u5e02",
        level: "3",
        code: "1308"
      }, {
        name: "\u6ca7\u5dde\u5e02",
        level: "3",
        code: "1309"
      }, {
        name: "\u5eca\u574a\u5e02",
        level: "3",
        code: "1310"
      }, {
        name: "\u8861\u6c34\u5e02",
        level: "3",
        code: "1311"
      } ]
    }, {
      name: "\u5c71\u897f\u7701",
      level: "1",
      code: "1400",
      cities: [ {
        name: "\u592a\u539f\u5e02",
        level: "2",
        code: "1401"
      }, {
        name: "\u5927\u540c\u5e02",
        level: "3",
        code: "1402"
      }, {
        name: "\u9633\u6cc9\u5e02",
        level: "3",
        code: "1403"
      }, {
        name: "\u957f\u6cbb\u5e02",
        level: "3",
        code: "1404"
      }, {
        name: "\u664b\u57ce\u5e02",
        level: "3",
        code: "1405"
      }, {
        name: "\u6714\u5dde\u5e02",
        level: "3",
        code: "1406"
      }, {
        name: "\u664b\u4e2d\u5e02",
        level: "3",
        code: "1407"
      }, {
        name: "\u8fd0\u57ce\u5e02",
        level: "3",
        code: "1408"
      }, {
        name: "\u5ffb\u5dde\u5e02",
        level: "3",
        code: "1409"
      }, {
        name: "\u4e34\u6c7e\u5e02",
        level: "3",
        code: "1410"
      }, {
        name: "\u5415\u6881\u5e02",
        level: "3",
        code: "1411"
      } ]
    }, {
      name: "\u5185\u8499\u53e4\u81ea\u6cbb\u533a",
      level: "1",
      code: "1500",
      cities: [ {
        name: "\u547c\u548c\u6d69\u7279\u5e02",
        level: "2",
        code: "1501"
      }, {
        name: "\u5305\u5934\u5e02",
        level: "3",
        code: "1502"
      }, {
        name: "\u4e4c\u6d77\u5e02",
        level: "3",
        code: "1503"
      }, {
        name: "\u8d64\u5cf0\u5e02",
        level: "3",
        code: "1504"
      }, {
        name: "\u901a\u8fbd\u5e02",
        level: "3",
        code: "1505"
      }, {
        name: "\u9102\u5c14\u591a\u65af\u5e02",
        level: "3",
        code: "1506"
      }, {
        name: "\u547c\u4f26\u8d1d\u5c14\u5e02",
        level: "3",
        code: "1507"
      }, {
        name: "\u5df4\u5f66\u6dd6\u5c14\u5e02",
        level: "3",
        code: "1508"
      }, {
        name: "\u4e4c\u5170\u5bdf\u5e03\u5e02",
        level: "3",
        code: "1509"
      }, {
        name: "\u5174\u5b89\u76df",
        level: "3",
        code: "1522"
      }, {
        name: "\u9521\u6797\u90ed\u52d2\u76df",
        level: "3",
        code: "1525"
      }, {
        name: "\u963f\u62c9\u5584\u76df",
        level: "3",
        code: "1529"
      } ]
    }, {
      name: "\u8fbd\u5b81\u7701",
      level: "1",
      code: "2100",
      cities: [ {
        name: "\u6c88\u9633\u5e02",
        level: "2",
        code: "2101"
      }, {
        name: "\u5927\u8fde\u5e02",
        level: "3",
        code: "2102"
      }, {
        name: "\u978d\u5c71\u5e02",
        level: "3",
        code: "2103"
      }, {
        name: "\u629a\u987a\u5e02",
        level: "3",
        code: "2104"
      }, {
        name: "\u672c\u6eaa\u5e02",
        level: "3",
        code: "2105"
      }, {
        name: "\u4e39\u4e1c\u5e02",
        level: "3",
        code: "2106"
      }, {
        name: "\u9526\u5dde\u5e02",
        level: "3",
        code: "2107"
      }, {
        name: "\u8425\u53e3\u5e02",
        level: "3",
        code: "2108"
      }, {
        name: "\u961c\u65b0\u5e02",
        level: "3",
        code: "2109"
      }, {
        name: "\u8fbd\u9633\u5e02",
        level: "3",
        code: "2110"
      }, {
        name: "\u76d8\u9526\u5e02",
        level: "3",
        code: "2111"
      }, {
        name: "\u94c1\u5cad\u5e02",
        level: "3",
        code: "2112"
      }, {
        name: "\u671d\u9633\u5e02",
        level: "3",
        code: "2113"
      }, {
        name: "\u846b\u82a6\u5c9b\u5e02",
        level: "3",
        code: "2114"
      } ]
    }, {
      name: "\u5409\u6797\u7701",
      level: "1",
      code: "2200",
      cities: [ {
        name: "\u957f\u6625\u5e02",
        level: "2",
        code: "2201"
      }, {
        name: "\u5409\u6797\u5e02",
        level: "3",
        code: "2202"
      }, {
        name: "\u56db\u5e73\u5e02",
        level: "3",
        code: "2203"
      }, {
        name: "\u8fbd\u6e90\u5e02",
        level: "3",
        code: "2204"
      }, {
        name: "\u901a\u5316\u5e02",
        level: "3",
        code: "2205"
      }, {
        name: "\u767d\u5c71\u5e02",
        level: "3",
        code: "2206"
      }, {
        name: "\u677e\u539f\u5e02",
        level: "3",
        code: "2207"
      }, {
        name: "\u767d\u57ce\u5e02",
        level: "3",
        code: "2208"
      }, {
        name: "\u5ef6\u8fb9\u671d\u9c9c\u65cf\u81ea\u6cbb\u5dde",
        level: "3",
        code: "2224"
      } ]
    }, {
      name: "\u9ed1\u9f99\u6c5f\u7701",
      level: "1",
      code: "2300",
      cities: [ {
        name: "\u54c8\u5c14\u6ee8\u5e02",
        level: "2",
        code: "2301"
      }, {
        name: "\u9f50\u9f50\u54c8\u5c14\u5e02",
        level: "3",
        code: "2302"
      }, {
        name: "\u9e21\u897f\u5e02",
        level: "3",
        code: "2303"
      }, {
        name: "\u9e64\u5c97\u5e02",
        level: "3",
        code: "2304"
      }, {
        name: "\u53cc\u9e2d\u5c71\u5e02",
        level: "3",
        code: "2305"
      }, {
        name: "\u5927\u5e86\u5e02",
        level: "3",
        code: "2306"
      }, {
        name: "\u4f0a\u6625\u5e02",
        level: "3",
        code: "2307"
      }, {
        name: "\u4f73\u6728\u65af\u5e02",
        level: "3",
        code: "2308"
      }, {
        name: "\u4e03\u53f0\u6cb3\u5e02",
        level: "3",
        code: "2309"
      }, {
        name: "\u7261\u4e39\u6c5f\u5e02",
        level: "3",
        code: "2310"
      }, {
        name: "\u9ed1\u6cb3\u5e02",
        level: "3",
        code: "2311"
      }, {
        name: "\u7ee5\u5316\u5e02",
        level: "3",
        code: "2312"
      }, {
        name: "\u5927\u5174\u5b89\u5cad\u5730\u533a",
        level: "3",
        code: "2327"
      } ]
    }, {
      name: "\u4e0a\u6d77\u5e02",
      level: "1",
      code: "3100",
      cities: [ {
        name: "\u4e0a\u6d77\u5e02",
        level: "1",
        code: "3100"
      } ]
    }, {
      name: "\u6c5f\u82cf\u7701",
      level: "1",
      code: "3200",
      cities: [ {
        name: "\u5357\u4eac\u5e02",
        level: "2",
        code: "3201"
      }, {
        name: "\u65e0\u9521\u5e02",
        level: "3",
        code: "3202"
      }, {
        name: "\u5f90\u5dde\u5e02",
        level: "3",
        code: "3203"
      }, {
        name: "\u5e38\u5dde\u5e02",
        level: "3",
        code: "3204"
      }, {
        name: "\u82cf\u5dde\u5e02",
        level: "3",
        code: "3205"
      }, {
        name: "\u5357\u901a\u5e02",
        level: "3",
        code: "3206"
      }, {
        name: "\u8fde\u4e91\u6e2f\u5e02",
        level: "3",
        code: "3207"
      }, {
        name: "\u6dee\u5b89\u5e02",
        level: "3",
        code: "3208"
      }, {
        name: "\u76d0\u57ce\u5e02",
        level: "3",
        code: "3209"
      }, {
        name: "\u626c\u5dde\u5e02",
        level: "3",
        code: "3210"
      }, {
        name: "\u9547\u6c5f\u5e02",
        level: "3",
        code: "3211"
      }, {
        name: "\u6cf0\u5dde\u5e02",
        level: "3",
        code: "3212"
      }, {
        name: "\u5bbf\u8fc1\u5e02",
        level: "3",
        code: "3213"
      } ]
    }, {
      name: "\u6d59\u6c5f\u7701",
      level: "1",
      code: "3300",
      cities: [ {
        name: "\u676d\u5dde\u5e02",
        level: "2",
        code: "3301"
      }, {
        name: "\u5b81\u6ce2\u5e02",
        level: "3",
        code: "3302"
      }, {
        name: "\u6e29\u5dde\u5e02",
        level: "3",
        code: "3303"
      }, {
        name: "\u5609\u5174\u5e02",
        level: "3",
        code: "3304"
      }, {
        name: "\u6e56\u5dde\u5e02",
        level: "3",
        code: "3305"
      }, {
        name: "\u7ecd\u5174\u5e02",
        level: "3",
        code: "3306"
      }, {
        name: "\u91d1\u534e\u5e02",
        level: "3",
        code: "3307"
      }, {
        name: "\u8862\u5dde\u5e02",
        level: "3",
        code: "3308"
      }, {
        name: "\u821f\u5c71\u5e02",
        level: "3",
        code: "3309"
      }, {
        name: "\u53f0\u5dde\u5e02",
        level: "3",
        code: "3310"
      }, {
        name: "\u4e3d\u6c34\u5e02",
        level: "3",
        code: "3311"
      } ]
    }, {
      name: "\u5b89\u5fbd\u7701",
      level: "1",
      code: "3400",
      cities: [ {
        name: "\u5408\u80a5\u5e02",
        level: "2",
        code: "3401"
      }, {
        name: "\u829c\u6e56\u5e02",
        level: "3",
        code: "3402"
      }, {
        name: "\u868c\u57e0\u5e02",
        level: "3",
        code: "3403"
      }, {
        name: "\u6dee\u5357\u5e02",
        level: "3",
        code: "3404"
      }, {
        name: "\u9a6c\u978d\u5c71\u5e02",
        level: "3",
        code: "3405"
      }, {
        name: "\u6dee\u5317\u5e02",
        level: "3",
        code: "3406"
      }, {
        name: "\u94dc\u9675\u5e02",
        level: "3",
        code: "3407"
      }, {
        name: "\u5b89\u5e86\u5e02",
        level: "3",
        code: "3408"
      }, {
        name: "\u9ec4\u5c71\u5e02",
        level: "3",
        code: "3410"
      }, {
        name: "\u6ec1\u5dde\u5e02",
        level: "3",
        code: "3411"
      }, {
        name: "\u961c\u9633\u5e02",
        level: "3",
        code: "3412"
      }, {
        name: "\u5bbf\u5dde\u5e02",
        level: "3",
        code: "3413"
      }, {
        name: "\u5de2\u6e56\u5e02",
        level: "3",
        code: "3414"
      }, {
        name: "\u516d\u5b89\u5e02",
        level: "3",
        code: "3415"
      }, {
        name: "\u4eb3\u5dde\u5e02",
        level: "3",
        code: "3416"
      }, {
        name: "\u6c60\u5dde\u5e02",
        level: "3",
        code: "3417"
      }, {
        name: "\u5ba3\u57ce\u5e02",
        level: "3",
        code: "3418"
      } ]
    }, {
      name: "\u798f\u5efa\u7701",
      level: "1",
      code: "3500",
      cities: [ {
        name: "\u798f\u5dde\u5e02",
        level: "2",
        code: "3501"
      }, {
        name: "\u53a6\u95e8\u5e02",
        level: "3",
        code: "3502"
      }, {
        name: "\u8386\u7530\u5e02",
        level: "3",
        code: "3503"
      }, {
        name: "\u4e09\u660e\u5e02",
        level: "3",
        code: "3504"
      }, {
        name: "\u6cc9\u5dde\u5e02",
        level: "3",
        code: "3505"
      }, {
        name: "\u6f33\u5dde\u5e02",
        level: "3",
        code: "3506"
      }, {
        name: "\u5357\u5e73\u5e02",
        level: "3",
        code: "3507"
      }, {
        name: "\u9f99\u5ca9\u5e02",
        level: "3",
        code: "3508"
      }, {
        name: "\u5b81\u5fb7\u5e02",
        level: "3",
        code: "3509"
      } ]
    }, {
      name: "\u6c5f\u897f\u7701",
      level: "1",
      code: "3600",
      cities: [ {
        name: "\u5357\u660c\u5e02",
        level: "2",
        code: "3601"
      }, {
        name: "\u666f\u5fb7\u9547\u5e02",
        level: "3",
        code: "3602"
      }, {
        name: "\u840d\u4e61\u5e02",
        level: "3",
        code: "3603"
      }, {
        name: "\u4e5d\u6c5f\u5e02",
        level: "3",
        code: "3604"
      }, {
        name: "\u65b0\u4f59\u5e02",
        level: "3",
        code: "3605"
      }, {
        name: "\u9e70\u6f6d\u5e02",
        level: "3",
        code: "3606"
      }, {
        name: "\u8d63\u5dde\u5e02",
        level: "3",
        code: "3607"
      }, {
        name: "\u5409\u5b89\u5e02",
        level: "3",
        code: "3608"
      }, {
        name: "\u5b9c\u6625\u5e02",
        level: "3",
        code: "3609"
      }, {
        name: "\u629a\u5dde\u5e02",
        level: "3",
        code: "3610"
      }, {
        name: "\u4e0a\u9976\u5e02",
        level: "3",
        code: "3611"
      } ]
    }, {
      name: "\u5c71\u4e1c\u7701",
      level: "1",
      code: "3700",
      cities: [ {
        name: "\u6d4e\u5357\u5e02",
        level: "2",
        code: "3701"
      }, {
        name: "\u9752\u5c9b\u5e02",
        level: "3",
        code: "3702"
      }, {
        name: "\u6dc4\u535a\u5e02",
        level: "3",
        code: "3703"
      }, {
        name: "\u67a3\u5e84\u5e02",
        level: "3",
        code: "3704"
      }, {
        name: "\u4e1c\u8425\u5e02",
        level: "3",
        code: "3705"
      }, {
        name: "\u70df\u53f0\u5e02",
        level: "3",
        code: "3706"
      }, {
        name: "\u6f4d\u574a\u5e02",
        level: "3",
        code: "3707"
      }, {
        name: "\u6d4e\u5b81\u5e02",
        level: "3",
        code: "3708"
      }, {
        name: "\u6cf0\u5b89\u5e02",
        level: "3",
        code: "3709"
      }, {
        name: "\u5a01\u6d77\u5e02",
        level: "3",
        code: "3710"
      }, {
        name: "\u65e5\u7167\u5e02",
        level: "3",
        code: "3711"
      }, {
        name: "\u83b1\u829c\u5e02",
        level: "3",
        code: "3712"
      }, {
        name: "\u4e34\u6c82\u5e02",
        level: "3",
        code: "3713"
      }, {
        name: "\u5fb7\u5dde\u5e02",
        level: "3",
        code: "3714"
      }, {
        name: "\u804a\u57ce\u5e02",
        level: "3",
        code: "3715"
      }, {
        name: "\u6ee8\u5dde\u5e02",
        level: "3",
        code: "3716"
      }, {
        name: "\u83cf\u6cfd\u5e02",
        level: "3",
        code: "3717"
      } ]
    }, {
      name: "\u6cb3\u5357\u7701",
      level: "1",
      code: "4100",
      cities: [ {
        name: "\u90d1\u5dde\u5e02",
        level: "2",
        code: "4101"
      }, {
        name: "\u5f00\u5c01\u5e02",
        level: "3",
        code: "4102"
      }, {
        name: "\u6d1b\u9633\u5e02",
        level: "3",
        code: "4103"
      }, {
        name: "\u5e73\u9876\u5c71\u5e02",
        level: "3",
        code: "4104"
      }, {
        name: "\u5b89\u9633\u5e02",
        level: "3",
        code: "4105"
      }, {
        name: "\u9e64\u58c1\u5e02",
        level: "3",
        code: "4106"
      }, {
        name: "\u65b0\u4e61\u5e02",
        level: "3",
        code: "4107"
      }, {
        name: "\u7126\u4f5c\u5e02",
        level: "3",
        code: "4108"
      }, {
        name: "\u6fee\u9633\u5e02",
        level: "3",
        code: "4109"
      }, {
        name: "\u8bb8\u660c\u5e02",
        level: "3",
        code: "4110"
      }, {
        name: "\u6f2f\u6cb3\u5e02",
        level: "3",
        code: "4111"
      }, {
        name: "\u4e09\u95e8\u5ce1\u5e02",
        level: "3",
        code: "4112"
      }, {
        name: "\u5357\u9633\u5e02",
        level: "3",
        code: "4113"
      }, {
        name: "\u5546\u4e18\u5e02",
        level: "3",
        code: "4114"
      }, {
        name: "\u4fe1\u9633\u5e02",
        level: "3",
        code: "4115"
      }, {
        name: "\u5468\u53e3\u5e02",
        level: "3",
        code: "4116"
      }, {
        name: "\u9a7b\u9a6c\u5e97\u5e02",
        level: "3",
        code: "4117"
      } ]
    }, {
      name: "\u6e56\u5317\u7701",
      level: "1",
      code: "4200",
      cities: [ {
        name: "\u6b66\u6c49\u5e02",
        level: "2",
        code: "4201"
      }, {
        name: "\u9ec4\u77f3\u5e02",
        level: "3",
        code: "4202"
      }, {
        name: "\u5341\u5830\u5e02",
        level: "3",
        code: "4203"
      }, {
        name: "\u5b9c\u660c\u5e02",
        level: "3",
        code: "4205"
      }, {
        name: "\u8944\u6a0a\u5e02",
        level: "3",
        code: "4206"
      }, {
        name: "\u9102\u5dde\u5e02",
        level: "3",
        code: "4207"
      }, {
        name: "\u8346\u95e8\u5e02",
        level: "3",
        code: "4208"
      }, {
        name: "\u5b5d\u611f\u5e02",
        level: "3",
        code: "4209"
      }, {
        name: "\u8346\u5dde\u5e02",
        level: "3",
        code: "4210"
      }, {
        name: "\u9ec4\u5188\u5e02",
        level: "3",
        code: "4211"
      }, {
        name: "\u54b8\u5b81\u5e02",
        level: "3",
        code: "4212"
      }, {
        name: "\u968f\u5dde\u5e02",
        level: "3",
        code: "4213"
      }, {
        name: "\u6069\u65bd\u571f\u5bb6\u65cf\u82d7\u65cf\u81ea\u6cbb\u5dde",
        level: "3",
        code: "4228"
      } ]
    }, {
      name: "\u6e56\u5357\u7701",
      level: "1",
      code: "4300",
      cities: [ {
        name: "\u957f\u6c99\u5e02",
        level: "2",
        code: "4301"
      }, {
        name: "\u682a\u6d32\u5e02",
        level: "3",
        code: "4302"
      }, {
        name: "\u6e58\u6f6d\u5e02",
        level: "3",
        code: "4303"
      }, {
        name: "\u8861\u9633\u5e02",
        level: "3",
        code: "4304"
      }, {
        name: "\u90b5\u9633\u5e02",
        level: "3",
        code: "4305"
      }, {
        name: "\u5cb3\u9633\u5e02",
        level: "3",
        code: "4306"
      }, {
        name: "\u5e38\u5fb7\u5e02",
        level: "3",
        code: "4307"
      }, {
        name: "\u5f20\u5bb6\u754c\u5e02",
        level: "3",
        code: "4308"
      }, {
        name: "\u76ca\u9633\u5e02",
        level: "3",
        code: "4309"
      }, {
        name: "\u90f4\u5dde\u5e02",
        level: "3",
        code: "4310"
      }, {
        name: "\u6c38\u5dde\u5e02",
        level: "3",
        code: "4311"
      }, {
        name: "\u6000\u5316\u5e02",
        level: "3",
        code: "4312"
      }, {
        name: "\u5a04\u5e95\u5e02",
        level: "3",
        code: "4313"
      }, {
        name: "\u6e58\u897f\u571f\u5bb6\u65cf\u82d7\u65cf\u81ea\u6cbb\u5dde",
        level: "3",
        code: "4331"
      } ]
    }, {
      name: "\u5e7f\u4e1c\u7701",
      level: "1",
      code: "4400",
      cities: [ {
        name: "\u5e7f\u5dde\u5e02",
        level: "2",
        code: "4401"
      }, {
        name: "\u97f6\u5173\u5e02",
        level: "3",
        code: "4402"
      }, {
        name: "\u6df1\u5733\u5e02",
        level: "3",
        code: "4403"
      }, {
        name: "\u73e0\u6d77\u5e02",
        level: "3",
        code: "4404"
      }, {
        name: "\u6c55\u5934\u5e02",
        level: "3",
        code: "4405"
      }, {
        name: "\u4f5b\u5c71\u5e02",
        level: "3",
        code: "4406"
      }, {
        name: "\u6c5f\u95e8\u5e02",
        level: "3",
        code: "4407"
      }, {
        name: "\u6e5b\u6c5f\u5e02",
        level: "3",
        code: "4408"
      }, {
        name: "\u8302\u540d\u5e02",
        level: "3",
        code: "4409"
      }, {
        name: "\u8087\u5e86\u5e02",
        level: "3",
        code: "4412"
      }, {
        name: "\u60e0\u5dde\u5e02",
        level: "3",
        code: "4413"
      }, {
        name: "\u6885\u5dde\u5e02",
        level: "3",
        code: "4414"
      }, {
        name: "\u6c55\u5c3e\u5e02",
        level: "3",
        code: "4415"
      }, {
        name: "\u6cb3\u6e90\u5e02",
        level: "3",
        code: "4416"
      }, {
        name: "\u9633\u6c5f\u5e02",
        level: "3",
        code: "4417"
      }, {
        name: "\u6e05\u8fdc\u5e02",
        level: "3",
        code: "4418"
      }, {
        name: "\u4e1c\u839e\u5e02",
        level: "3",
        code: "4419"
      }, {
        name: "\u4e2d\u5c71\u5e02",
        level: "3",
        code: "4420"
      }, {
        name: "\u6f6e\u5dde\u5e02",
        level: "3",
        code: "4451"
      }, {
        name: "\u63ed\u9633\u5e02",
        level: "3",
        code: "4452"
      }, {
        name: "\u4e91\u6d6e\u5e02",
        level: "3",
        code: "4453"
      } ]
    }, {
      name: "\u5e7f\u897f\u58ee\u65cf\u81ea\u6cbb\u533a",
      level: "1",
      code: "4500",
      cities: [ {
        name: "\u5357\u5b81\u5e02",
        level: "2",
        code: "4501"
      }, {
        name: "\u67f3\u5dde\u5e02",
        level: "3",
        code: "4502"
      }, {
        name: "\u6842\u6797\u5e02",
        level: "3",
        code: "4503"
      }, {
        name: "\u68a7\u5dde\u5e02",
        level: "3",
        code: "4504"
      }, {
        name: "\u5317\u6d77\u5e02",
        level: "3",
        code: "4505"
      }, {
        name: "\u9632\u57ce\u6e2f\u5e02",
        level: "3",
        code: "4506"
      }, {
        name: "\u94a6\u5dde\u5e02",
        level: "3",
        code: "4507"
      }, {
        name: "\u8d35\u6e2f\u5e02",
        level: "3",
        code: "4508"
      }, {
        name: "\u7389\u6797\u5e02",
        level: "3",
        code: "4509"
      }, {
        name: "\u767e\u8272\u5e02",
        level: "3",
        code: "4510"
      }, {
        name: "\u8d3a\u5dde\u5e02",
        level: "3",
        code: "4511"
      }, {
        name: "\u6cb3\u6c60\u5e02",
        level: "3",
        code: "4512"
      }, {
        name: "\u6765\u5bbe\u5e02",
        level: "3",
        code: "4513"
      }, {
        name: "\u5d07\u5de6\u5e02",
        level: "3",
        code: "4514"
      } ]
    }, {
      name: "\u6d77\u5357\u7701",
      level: "1",
      code: "4600",
      cities: [ {
        name: "\u6d77\u53e3\u5e02",
        level: "2",
        code: "4601"
      }, {
        name: "\u4e09\u4e9a\u5e02",
        level: "3",
        code: "4602"
      } ]
    }, {
      name: "\u91cd\u5e86\u5e02",
      level: "1",
      code: "5000",
      cities: [ {
        name: "\u91cd\u5e86\u5e02",
        level: "1",
        code: "5000"
      } ]
    }, {
      name: "\u56db\u5ddd\u7701",
      level: "1",
      code: "5100",
      cities: [ {
        name: "\u6210\u90fd\u5e02",
        level: "2",
        code: "5101"
      }, {
        name: "\u81ea\u8d21\u5e02",
        level: "3",
        code: "5103"
      }, {
        name: "\u6500\u679d\u82b1\u5e02",
        level: "3",
        code: "5104"
      }, {
        name: "\u6cf8\u5dde\u5e02",
        level: "3",
        code: "5105"
      }, {
        name: "\u5fb7\u9633\u5e02",
        level: "3",
        code: "5106"
      }, {
        name: "\u7ef5\u9633\u5e02",
        level: "3",
        code: "5107"
      }, {
        name: "\u5e7f\u5143\u5e02",
        level: "3",
        code: "5108"
      }, {
        name: "\u9042\u5b81\u5e02",
        level: "3",
        code: "5109"
      }, {
        name: "\u5185\u6c5f\u5e02",
        level: "3",
        code: "5110"
      }, {
        name: "\u4e50\u5c71\u5e02",
        level: "3",
        code: "5111"
      }, {
        name: "\u5357\u5145\u5e02",
        level: "3",
        code: "5113"
      }, {
        name: "\u7709\u5c71\u5e02",
        level: "3",
        code: "5114"
      }, {
        name: "\u5b9c\u5bbe\u5e02",
        level: "3",
        code: "5115"
      }, {
        name: "\u5e7f\u5b89\u5e02",
        level: "3",
        code: "5116"
      }, {
        name: "\u8fbe\u5dde\u5e02",
        level: "3",
        code: "5117"
      }, {
        name: "\u96c5\u5b89\u5e02",
        level: "3",
        code: "5118"
      }, {
        name: "\u5df4\u4e2d\u5e02",
        level: "3",
        code: "5119"
      }, {
        name: "\u8d44\u9633\u5e02",
        level: "3",
        code: "5120"
      }, {
        name: "\u963f\u575d\u85cf\u65cf\u7f8c\u65cf\u81ea\u6cbb\u5dde",
        level: "3",
        code: "5132"
      }, {
        name: "\u7518\u5b5c\u85cf\u65cf\u81ea\u6cbb\u5dde",
        level: "3",
        code: "5133"
      }, {
        name: "\u51c9\u5c71\u5f5d\u65cf\u81ea\u6cbb\u5dde",
        level: "3",
        code: "5134"
      } ]
    }, {
      name: "\u8d35\u5dde\u7701",
      level: "1",
      code: "5200",
      cities: [ {
        name: "\u8d35\u9633\u5e02",
        level: "2",
        code: "5201"
      }, {
        name: "\u516d\u76d8\u6c34\u5e02",
        level: "3",
        code: "5202"
      }, {
        name: "\u9075\u4e49\u5e02",
        level: "3",
        code: "5203"
      }, {
        name: "\u5b89\u987a\u5e02",
        level: "3",
        code: "5204"
      }, {
        name: "\u94dc\u4ec1\u5730\u533a",
        level: "3",
        code: "5222"
      }, {
        name: "\u9ed4\u897f\u5357\u5e03\u4f9d\u65cf\u82d7\u65cf\u81ea\u6cbb\u5dde",
        level: "3",
        code: "5223"
      }, {
        name: "\u6bd5\u8282\u5730\u533a",
        level: "3",
        code: "5224"
      }, {
        name: "\u9ed4\u4e1c\u5357\u82d7\u65cf\u4f97\u65cf\u81ea\u6cbb\u5dde",
        level: "3",
        code: "5226"
      }, {
        name: "\u9ed4\u5357\u5e03\u4f9d\u65cf\u82d7\u65cf\u81ea\u6cbb\u5dde",
        level: "3",
        code: "5227"
      } ]
    }, {
      name: "\u4e91\u5357\u7701",
      level: "1",
      code: "5300",
      cities: [ {
        name: "\u6606\u660e\u5e02",
        level: "2",
        code: "5301"
      }, {
        name: "\u66f2\u9756\u5e02",
        level: "3",
        code: "5303"
      }, {
        name: "\u7389\u6eaa\u5e02",
        level: "3",
        code: "5304"
      }, {
        name: "\u4fdd\u5c71\u5e02",
        level: "3",
        code: "5305"
      }, {
        name: "\u662d\u901a\u5e02",
        level: "3",
        code: "5306"
      }, {
        name: "\u4e3d\u6c5f\u5e02",
        level: "3",
        code: "5307"
      }, {
        name: "\u666e\u6d31\u5e02",
        level: "3",
        code: "5308"
      }, {
        name: "\u4e34\u6ca7\u5e02",
        level: "3",
        code: "5309"
      }, {
        name: "\u695a\u96c4\u5f5d\u65cf\u81ea\u6cbb\u5dde",
        level: "3",
        code: "5323"
      }, {
        name: "\u7ea2\u6cb3\u54c8\u5c3c\u65cf\u5f5d\u65cf\u81ea\u6cbb\u5dde",
        level: "3",
        code: "5325"
      }, {
        name: "\u6587\u5c71\u58ee\u65cf\u82d7\u65cf\u81ea\u6cbb\u5dde",
        level: "3",
        code: "5326"
      }, {
        name: "\u897f\u53cc\u7248\u7eb3\u50a3\u65cf\u81ea\u6cbb\u5dde",
        level: "3",
        code: "5328"
      }, {
        name: "\u5927\u7406\u767d\u65cf\u81ea\u6cbb\u5dde",
        level: "3",
        code: "5329"
      }, {
        name: "\u5fb7\u5b8f\u50a3\u65cf\u666f\u9887\u65cf\u81ea\u6cbb\u5dde",
        level: "3",
        code: "5331"
      }, {
        name: "\u6012\u6c5f\u5088\u50f3\u65cf\u81ea\u6cbb\u5dde",
        level: "3",
        code: "5333"
      }, {
        name: "\u8fea\u5e86\u85cf\u65cf\u81ea\u6cbb\u5dde",
        level: "3",
        code: "5334"
      } ]
    }, {
      name: "\u897f\u85cf\u81ea\u6cbb\u533a",
      level: "1",
      code: "5400",
      cities: [ {
        name: "\u62c9\u8428\u5e02",
        level: "2",
        code: "5401"
      }, {
        name: "\u660c\u90fd\u5730\u533a",
        level: "3",
        code: "5421"
      }, {
        name: "\u5c71\u5357\u5730\u533a",
        level: "3",
        code: "5422"
      }, {
        name: "\u65e5\u5580\u5219\u5730\u533a",
        level: "3",
        code: "5423"
      }, {
        name: "\u90a3\u66f2\u5730\u533a",
        level: "3",
        code: "5424"
      }, {
        name: "\u963f\u91cc\u5730\u533a",
        level: "3",
        code: "5425"
      }, {
        name: "\u6797\u829d\u5730\u533a",
        level: "3",
        code: "5426"
      } ]
    }, {
      name: "\u9655\u897f\u7701",
      level: "1",
      code: "6100",
      cities: [ {
        name: "\u897f\u5b89\u5e02",
        level: "2",
        code: "6101"
      }, {
        name: "\u94dc\u5ddd\u5e02",
        level: "3",
        code: "6102"
      }, {
        name: "\u5b9d\u9e21\u5e02",
        level: "3",
        code: "6103"
      }, {
        name: "\u54b8\u9633\u5e02",
        level: "3",
        code: "6104"
      }, {
        name: "\u6e2d\u5357\u5e02",
        level: "3",
        code: "6105"
      }, {
        name: "\u5ef6\u5b89\u5e02",
        level: "3",
        code: "6106"
      }, {
        name: "\u6c49\u4e2d\u5e02",
        level: "3",
        code: "6107"
      }, {
        name: "\u6986\u6797\u5e02",
        level: "3",
        code: "6108"
      }, {
        name: "\u5b89\u5eb7\u5e02",
        level: "3",
        code: "6109"
      }, {
        name: "\u5546\u6d1b\u5e02",
        level: "3",
        code: "6110"
      } ]
    }, {
      name: "\u7518\u8083\u7701",
      level: "1",
      code: "6200",
      cities: [ {
        name: "\u5170\u5dde\u5e02",
        level: "2",
        code: "6201"
      }, {
        name: "\u5609\u5cea\u5173\u5e02",
        level: "3",
        code: "6202"
      }, {
        name: "\u91d1\u660c\u5e02",
        level: "3",
        code: "6203"
      }, {
        name: "\u767d\u94f6\u5e02",
        level: "3",
        code: "6204"
      }, {
        name: "\u5929\u6c34\u5e02",
        level: "3",
        code: "6205"
      }, {
        name: "\u6b66\u5a01\u5e02",
        level: "3",
        code: "6206"
      }, {
        name: "\u5f20\u6396\u5e02",
        level: "3",
        code: "6207"
      }, {
        name: "\u5e73\u51c9\u5e02",
        level: "3",
        code: "6208"
      }, {
        name: "\u9152\u6cc9\u5e02",
        level: "3",
        code: "6209"
      }, {
        name: "\u5e86\u9633\u5e02",
        level: "3",
        code: "6210"
      }, {
        name: "\u5b9a\u897f\u5e02",
        level: "3",
        code: "6211"
      }, {
        name: "\u9647\u5357\u5e02",
        level: "3",
        code: "6212"
      }, {
        name: "\u4e34\u590f\u56de\u65cf\u81ea\u6cbb\u5dde",
        level: "3",
        code: "6229"
      }, {
        name: "\u7518\u5357\u85cf\u65cf\u81ea\u6cbb\u5dde",
        level: "3",
        code: "6230"
      } ]
    }, {
      name: "\u9752\u6d77\u7701",
      level: "1",
      code: "6300",
      cities: [ {
        name: "\u897f\u5b81\u5e02",
        level: "2",
        code: "6301"
      }, {
        name: "\u6d77\u4e1c\u5730\u533a",
        level: "3",
        code: "6321"
      }, {
        name: "\u6d77\u5317\u85cf\u65cf\u81ea\u6cbb\u5dde",
        level: "3",
        code: "6322"
      }, {
        name: "\u9ec4\u5357\u85cf\u65cf\u81ea\u6cbb\u5dde",
        level: "3",
        code: "6323"
      }, {
        name: "\u6d77\u5357\u85cf\u65cf\u81ea\u6cbb\u5dde",
        level: "3",
        code: "6325"
      }, {
        name: "\u679c\u6d1b\u85cf\u65cf\u81ea\u6cbb\u5dde",
        level: "3",
        code: "6326"
      }, {
        name: "\u7389\u6811\u85cf\u65cf\u81ea\u6cbb\u5dde",
        level: "3",
        code: "6327"
      }, {
        name: "\u6d77\u897f\u8499\u53e4\u65cf\u85cf\u65cf\u81ea\u6cbb\u5dde",
        level: "3",
        code: "6328"
      } ]
    }, {
      name: "\u5b81\u590f\u56de\u65cf\u81ea\u6cbb\u533a",
      level: "1",
      code: "6400",
      cities: [ {
        name: "\u94f6\u5ddd\u5e02",
        level: "2",
        code: "6401"
      }, {
        name: "\u77f3\u5634\u5c71\u5e02",
        level: "3",
        code: "6402"
      }, {
        name: "\u5434\u5fe0\u5e02",
        level: "3",
        code: "6403"
      }, {
        name: "\u56fa\u539f\u5e02",
        level: "3",
        code: "6404"
      }, {
        name: "\u4e2d\u536b\u5e02",
        level: "3",
        code: "6405"
      } ]
    }, {
      name: "\u65b0\u7586\u7ef4\u543e\u5c14\u81ea\u6cbb\u533a",
      level: "1",
      code: "6500",
      cities: [ {
        name: "\u4e4c\u9c81\u6728\u9f50\u5e02",
        level: "2",
        code: "6501"
      }, {
        name: "\u514b\u62c9\u739b\u4f9d\u5e02",
        level: "3",
        code: "6502"
      }, {
        name: "\u5410\u9c81\u756a\u5730\u533a",
        level: "3",
        code: "6521"
      }, {
        name: "\u54c8\u5bc6\u5730\u533a",
        level: "3",
        code: "6522"
      }, {
        name: "\u660c\u5409\u56de\u65cf\u81ea\u6cbb\u5dde",
        level: "3",
        code: "6523"
      }, {
        name: "\u535a\u5c14\u5854\u62c9\u8499\u53e4\u81ea\u6cbb\u5dde",
        level: "3",
        code: "6527"
      }, {
        name: "\u5df4\u97f3\u90ed\u695e\u8499\u53e4\u81ea\u6cbb\u5dde",
        level: "3",
        code: "6528"
      }, {
        name: "\u963f\u514b\u82cf\u5730\u533a",
        level: "3",
        code: "6529"
      }, {
        name: "\u514b\u5b5c\u52d2\u82cf\u67ef\u5c14\u514b\u5b5c\u81ea\u6cbb\u5dde",
        level: "3",
        code: "6530"
      }, {
        name: "\u5580\u4ec0\u5730\u533a",
        level: "3",
        code: "6531"
      }, {
        name: "\u548c\u7530\u5730\u533a",
        level: "3",
        code: "6532"
      }, {
        name: "\u4f0a\u7281\u54c8\u8428\u514b\u81ea\u6cbb\u5dde",
        level: "3",
        code: "6540"
      }, {
        name: "\u5854\u57ce\u5730\u533a",
        level: "3",
        code: "6542"
      }, {
        name: "\u963f\u52d2\u6cf0\u5730\u533a",
        level: "3",
        code: "6543"
      } ]
    }, {
      name: "\u53f0\u6e7e\u7701",
      level: "1",
      code: "7100",
      cities: [ {
        name: "\u53f0\u6e7e\u7701",
        level: "1",
        code: "7100"
      } ]
    }, {
      name: "\u9999\u6e2f\u7279\u522b\u884c\u653f\u533a",
      level: "1",
      code: "8100",
      cities: [ {
        name: "\u9999\u6e2f\u7279\u522b\u884c\u653f\u533a",
        level: "1",
        code: "8100"
      } ]
    }, {
      name: "\u6fb3\u95e8\u7279\u522b\u884c\u653f\u533a",
      level: "1",
      code: "8200",
      cities: [ {
        name: "\u6fb3\u95e8\u7279\u522b\u884c\u653f\u533a",
        level: "1",
        code: "8200"
      } ]
    } ];
    cc._RF.pop();
  }, {} ],
  receiveAward: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "eef926XLBtKtaKjos59/lHO", "receiveAward");
    "use strict";
    cc.Class({
      extends: cc.Component,
      properties: {
        count: {
          default: null,
          type: cc.Label
        }
      },
      onLoad: function onLoad() {
        this.node.on(cc.Node.EventType.TOUCH_START, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_MOVE, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_END, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_CANCEL, function(event, touch) {
          void 0 != event.stopProgagation && event.stopProgagation();
        });
      },
      start: function start() {},
      setCount: function setCount(num) {
        this.count.string = String(num);
      },
      tapClose: function tapClose(sender, customEventData) {
        this.node.destroy();
      },
      tapOk: function tapOk(sender, customEventData) {
        this.node.destroy();
      }
    });
    cc._RF.pop();
  }, {} ],
  rechargeAmount: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "c98a6Vqtw9Pi5VP/SumC4Dm", "rechargeAmount");
    "use strict";
    cc.Class({
      extends: cc.Component,
      properties: {},
      onLoad: function onLoad() {
        this.node.on(cc.Node.EventType.TOUCH_START, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_MOVE, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_END, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_CANCEL, function(event, touch) {
          void 0 != event.stopProgagation && event.stopProgagation();
        });
      },
      start: function start() {},
      setup: function setup(customEventData) {},
      tapClose: function tapClose(sender, customEventData) {
        this.node.destroy();
      },
      tapAmount: function tapAmount(sender, customEventData) {},
      tapPay: function tapPay(sender, customEventData) {}
    });
    cc._RF.pop();
  }, {} ],
  recharge: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "abc2eg/Cr5DKZ96xtDEwTZ/", "recharge");
    "use strict";
    cc.Class({
      extends: cc.Component,
      properties: {
        weipay: {
          default: null,
          type: cc.Node
        },
        alipay: {
          default: null,
          type: cc.Node
        },
        qqpay: {
          default: null,
          type: cc.Node
        },
        unionpay: {
          default: null,
          type: cc.Node
        },
        rechargeRecrd: {
          default: null,
          type: cc.Node
        },
        rechargeRecrdList: {
          default: null,
          type: cc.ScrollView
        },
        rechargeRecrdItem: {
          default: null,
          type: cc.Prefab
        },
        rechargeAmountPanel: {
          default: null,
          type: cc.Prefab
        }
      },
      onLoad: function onLoad() {
        this.node.on(cc.Node.EventType.TOUCH_START, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_MOVE, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_END, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_CANCEL, function(event, touch) {
          void 0 != event.stopProgagation && event.stopProgagation();
        });
        this.weipay.active = true;
        this.alipay.active = false;
        this.qqpay.active = false;
        this.unionpay.active = false;
        this.rechargeRecrd.active = false;
      },
      start: function start() {},
      tapClose: function tapClose(sender, customEventData) {
        this.node.destroy();
      },
      checkPay: function checkPay(sender, customEventData) {
        var index = parseInt(customEventData);
        switch (index) {
         case 1:
          this.weipay.active = true;
          this.alipay.active = false;
          this.qqpay.active = false;
          this.unionpay.active = false;
          this.rechargeRecrd.active = false;
          break;

         case 2:
          this.weipay.active = false;
          this.alipay.active = true;
          this.qqpay.active = false;
          this.unionpay.active = false;
          this.rechargeRecrd.active = false;
          break;

         case 3:
          this.weipay.active = false;
          this.alipay.active = false;
          this.qqpay.active = true;
          this.unionpay.active = false;
          this.rechargeRecrd.active = false;
          break;

         case 4:
          this.weipay.active = false;
          this.alipay.active = false;
          this.qqpay.active = false;
          this.unionpay.active = true;
          this.rechargeRecrd.active = false;
          break;

         case 5:
          this.weipay.active = false;
          this.alipay.active = false;
          this.qqpay.active = false;
          this.unionpay.active = false;
          this.rechargeRecrd.active = true;
          for (var i = 0; i < 10; i++) this.rechargeRecrdList.content.addChild(cc.instantiate(this.rechargeRecrdItem));
        }
      },
      tapImmediatelyGoPay: function tapImmediatelyGoPay(sender, customEventData) {
        var rechargeAmountPanel = cc.instantiate(this.rechargeAmountPanel);
        rechargeAmountPanel.getComponent("rechargeAmount").setup(customEventData);
        cc.find("Canvas").addChild(rechargeAmountPanel);
      }
    });
    cc._RF.pop();
  }, {} ],
  scrollItemScale: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "83408j0qnZO0JcMs94phAlf", "scrollItemScale");
    "use strict";
    cc.Class({
      extends: cc.Component,
      properties: {
        content: cc.Node,
        spacingY: 466,
        curSelect: cc.Node
      },
      setGroup: function setGroup() {
        if (this.group) return;
        this.group = [];
        for (var i = 0; i < this.content.childrenCount; i++) {
          this.group.push(this.content.children[i]);
          this.content.children[i].x = i * (this.spacingY - 200) + 590;
          this.content.children[i].groupIndex = i;
          this.content.children[i].on("touchend", this.click, this);
        }
        this.content.x = -590;
        this.content.width = this.content.childrenCount * this.spacingY + 100;
      },
      setCurSelect: function setCurSelect(n) {
        this.curSelect = n;
        this.setChilColor(n, cc.color("#FFFFFF"));
      },
      setOtherList: function setOtherList(n) {
        this.setChilColor(n, cc.color("#838383"));
      },
      setItem: function setItem() {
        var children = this.group || this.content.children;
        var i, n, sc;
        var t = 1e3;
        for (i = 0; i < children.length; i++) {
          Math.abs(children[i].x + this.content.x) < t && (n = i);
          t = children[i].x + this.content.x;
          if (t >= -400 && t <= 400) {
            sc = 1.05 - Math.abs(t) / 400 * .25;
            children[i].scale = sc;
          } else children[i].scale = .8;
          t = Math.abs(children[i].x + this.content.x);
        }
        for (i = 0; i < children.length; i++) {
          i == n ? this.setCurSelect(children[n]) : this.setOtherList(children[i]);
          children[i].zIndex = i;
        }
        for (i = n; i < children.length; i++) children[i].zIndex = n - (i - n);
      },
      scrolling: function scrolling() {
        this.node.emit("scrolling");
      },
      toItem: function toItem(n) {
        var _this = this;
        this.content.runAction(cc.sequence(cc.moveTo(.2, -this.group[n].x, this.content.y), cc.callFunc(function() {
          _this.unschedule(_this.scrolling);
          _this.setItem();
        })));
        this.schedule(this.scrolling, .05);
      },
      init: function init() {
        var _this2 = this;
        this._curSelect = 0;
        this.setGroup();
        this.setItem();
        this.node.on("scrolling", function(e) {
          _this2.setItem();
        });
      },
      click: function click(e) {
        this.curSelect.groupIndex == e.currentTarget.groupIndex ? e.currentTarget.emit("enter", {
          target: this.curSelect,
          index: this.curSelect.groupIndex
        }) : this.toItem(e.currentTarget.groupIndex);
      },
      setChilColor: function setChilColor(n, color) {
        n.children[0].color = color;
        n.children[1].color = color;
        n.children[2].color = color;
        n.children[3].color = color;
        n.children[3].children[0].color = color;
      }
    });
    cc._RF.pop();
  }, {} ],
  setting: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "497bfkp/jFJebuIFck+j7gX", "setting");
    "use strict";
    var App = require("App");
    var Tools = require("Tools");
    var SDKToos = require("SDKTools");
    cc.Class({
      extends: cc.Component,
      properties: {
        audioSetting: {
          default: null,
          type: cc.Node
        },
        accountPassword: {
          default: null,
          type: cc.Node
        },
        strongboxPassword: {
          default: null,
          type: cc.Node
        },
        strongboxFirstPassword: {
          default: null,
          type: cc.Node
        },
        strongboxModifyPassword: {
          default: null,
          type: cc.Node
        },
        bindTelephone: {
          default: null,
          type: cc.Node
        },
        bindDebitCard: {
          default: null,
          type: cc.Node
        },
        aboutus: {
          default: null,
          type: cc.Node
        },
        bindDebitCardList: {
          default: null,
          type: cc.ScrollView
        },
        bindDebitCardItem: {
          default: null,
          type: cc.Node
        },
        accountOldPassword: {
          default: null,
          type: cc.EditBox
        },
        accountNewPassword: {
          default: null,
          type: cc.EditBox
        },
        accountConfirmPassword: {
          default: null,
          type: cc.EditBox
        },
        strongboxFirstNewPassword: {
          default: null,
          type: cc.EditBox
        },
        strongboxFirstConfirmPassword: {
          default: null,
          type: cc.EditBox
        },
        strongboxModifyOldPassword: {
          default: null,
          type: cc.EditBox
        },
        strongboxModifyNewPassword: {
          default: null,
          type: cc.EditBox
        },
        strongboxModifyConfirmPassword: {
          default: null,
          type: cc.EditBox
        },
        shakeProgressBar: {
          default: null,
          type: cc.ProgressBar
        },
        effectProgressBar: {
          default: null,
          type: cc.ProgressBar
        },
        soundProgressBar: {
          default: null,
          type: cc.ProgressBar
        },
        shakeSlider: {
          default: null,
          type: cc.Slider
        },
        effectSlider: {
          default: null,
          type: cc.Slider
        },
        soundSlider: {
          default: null,
          type: cc.Slider
        },
        telephone: {
          default: null,
          type: cc.Label
        },
        lblBindNewTelephone: {
          default: null,
          type: cc.Label
        },
        newTelephone: {
          default: null,
          type: cc.EditBox
        },
        smsCode: {
          default: null,
          type: cc.EditBox
        },
        bankList: {
          default: null,
          type: cc.ScrollView
        },
        bankItem: {
          default: null,
          type: cc.Node
        },
        provincesList: {
          default: null,
          type: cc.ScrollView
        },
        provincesItem: {
          default: null,
          type: cc.Node
        },
        cityList: {
          default: null,
          type: cc.ScrollView
        },
        cityItem: {
          default: null,
          type: cc.Node
        },
        bindDebitCardNode: {
          default: null,
          type: cc.Node
        },
        bindNewCardNode: {
          default: null,
          type: cc.Node
        },
        accountName: {
          default: null,
          type: cc.EditBox
        },
        accountNumber: {
          default: null,
          type: cc.EditBox
        },
        bankName: {
          default: null,
          type: cc.Label
        },
        cityInfo: {
          default: null,
          type: cc.Label
        },
        bankToggle: {
          default: null,
          type: cc.Toggle
        },
        cityToggle: {
          default: null,
          type: cc.Toggle
        },
        bgCityInfo: {
          default: null,
          type: cc.Sprite
        }
      },
      onLoad: function onLoad() {
        this.node.on(cc.Node.EventType.TOUCH_START, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_MOVE, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_END, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_CANCEL, function(event, touch) {
          void 0 != event.stopProgagation && event.stopProgagation();
        });
        this.audioSetting.active = true;
        this.accountPassword.active = false;
        this.strongboxPassword.active = false;
        this.bindTelephone.active = false;
        this.bindDebitCard.active = false;
        this.aboutus.active = false;
        this.shakeSlider.progress = this.shakeProgressBar.progress = .3;
        this.effectSlider.progress = this.effectProgressBar.progress = .3;
        this.soundSlider.progress = this.soundProgressBar.progress = .3;
        App.myUser.telephone ? this.telephone.string = App.myUser.telephone : this.telephone.string = "\u672a\u7ed1\u5b9a\u624b\u673a\u53f7";
        this.bindDebitCardItem.active = false;
        this.bindDebitCardNode.active = true;
        this.bindNewCardNode.active = false;
        this.bankList.node.active = false;
        this.bankItem.active = false;
        this.provincesItem.active = false;
        this.bgCityInfo.node.active = false;
        this.cityItem.active = false;
        this.requestCardList();
        var bankList = require("bankList");
        for (var i = 0; i < bankList.length; i++) {
          var bankItem = cc.instantiate(this.bankItem);
          bankItem.active = true;
          bankItem.setPosition(cc.v2(-156, 0));
          bankItem.getComponent(cc.Label).string = bankList[i].name;
          var button = bankItem.getChildByName("button").getComponent(cc.Button);
          var clickEventHandler = new cc.Component.EventHandler();
          clickEventHandler.target = this.node;
          clickEventHandler.component = "setting";
          clickEventHandler.handler = "tapBank";
          clickEventHandler.customEventData = bankList[i].name;
          button.clickEvents.push(clickEventHandler);
          this.bankList.content.addChild(bankItem);
        }
        var provinces = require("provinces");
        for (var _i = 0; _i < provinces.length; _i++) {
          var provincesItem = cc.instantiate(this.provincesItem);
          provincesItem.active = true;
          provincesItem.setPosition(cc.v2(0, 0));
          provincesItem.getComponent(cc.Label).string = provinces[_i].name;
          var _button = provincesItem.getChildByName("button").getComponent(cc.Button);
          var _clickEventHandler = new cc.Component.EventHandler();
          _clickEventHandler.target = this.node;
          _clickEventHandler.component = "setting";
          _clickEventHandler.handler = "tapProvinces";
          _clickEventHandler.customEventData = provinces[_i].name;
          _button.clickEvents.push(_clickEventHandler);
          this.provincesList.content.addChild(provincesItem);
        }
        this.updateCityList("\u56db\u5ddd\u7701");
        var self = this;
        App.on("finishScanCard", function(cardNumber) {
          self.accountNumber.string = cardNumber;
          var BankInfoBean = require("BankInfoBean");
          var bankName = new BankInfoBean(cardNumber).getBankName();
          "\u672a\u77e5" != bankName && (self.bankName.string = bankName);
        });
      },
      onCardNumberTextChanged: function onCardNumberTextChanged(text, editbox, customEventData) {
        var BankInfoBean = require("BankInfoBean");
        var bankName = new BankInfoBean(text).getBankName();
        "\u672a\u77e5" != bankName && (this.bankName.string = bankName);
      },
      updateCityList: function updateCityList(p_provinces) {
        this.cityList.content.removeAllChildren();
        var provinces = require("provinces");
        for (var i = 0; i < provinces.length; i++) if (provinces[i].name == p_provinces) for (var j = 0; j < provinces[i].cities.length; j++) {
          var cityItem = cc.instantiate(this.cityItem);
          cityItem.active = true;
          cityItem.setPosition(cc.v2(0, 0));
          cityItem.getComponent(cc.Label).string = provinces[i].cities[j].name;
          var button = cityItem.getChildByName("button").getComponent(cc.Button);
          var clickEventHandler = new cc.Component.EventHandler();
          clickEventHandler.target = this.node;
          clickEventHandler.component = "setting";
          clickEventHandler.handler = "tapCity";
          clickEventHandler.customEventData = {
            provinces: provinces[i].name,
            city: provinces[i].cities[j].name
          };
          button.clickEvents.push(clickEventHandler);
          this.cityList.content.addChild(cityItem);
        }
      },
      start: function start() {},
      tapBank: function tapBank(event, customEventData) {
        this.bankName.string = customEventData;
        this.bankToggle.getComponent(cc.Toggle).uncheck();
      },
      tapProvinces: function tapProvinces(event, customEventData) {
        this.updateCityList(customEventData);
      },
      tapCity: function tapCity(event, customEventData) {
        this.cityInfo.string = customEventData.provinces + "-" + customEventData.city;
        this.cityToggle.getComponent(cc.Toggle).uncheck();
      },
      updateBindDebitCardList: function updateBindDebitCardList(data) {
        this.bindDebitCardList.content.removeAllChildren();
        for (var i = 0; i < data.bankAccounts.length; i++) {
          var bindDebitCardItem = cc.instantiate(this.bindDebitCardItem);
          bindDebitCardItem.active = true;
          bindDebitCardItem.setPosition(cc.v2(0, 0));
          bindDebitCardItem.getChildByName("name").getComponent(cc.Label).string = data.bankAccounts[i].bank;
          bindDebitCardItem.getChildByName("cardno").getComponent(cc.Label).string = Tools.getBankCardNumber(data.bankAccounts[i].accountNumber);
          this.bindDebitCardList.content.addChild(bindDebitCardItem);
        }
      },
      changeShake: function changeShake(sender, customEventData) {
        this.shakeProgressBar.progress = sender.progress;
      },
      changeEffect: function changeEffect(sender, customEventData) {
        this.effectProgressBar.progress = sender.progress;
      },
      changeSound: function changeSound(sender, customEventData) {
        this.soundProgressBar.progress = sender.progress;
      },
      tapOk: function tapOk(sender, customEventData) {
        switch (customEventData) {
         case "accountPassword":
          var accountOldPassword = this.accountOldPassword.getComponent(cc.EditBox).string;
          if ("" == accountOldPassword) {
            cc.find("FadeMsg").getComponent("FadeMsg").show("\u8bf7\u8f93\u5165\u65e7\u5bc6\u7801");
            return;
          }
          var accountNewPassword = this.accountNewPassword.getComponent(cc.EditBox).string;
          if ("" == accountNewPassword) {
            cc.find("FadeMsg").getComponent("FadeMsg").show("\u8bf7\u8f93\u5165\u65b0\u5bc6\u7801");
            return;
          }
          var accountConfirmPassword = this.accountConfirmPassword.getComponent(cc.EditBox).string;
          if ("" == accountConfirmPassword) {
            cc.find("FadeMsg").getComponent("FadeMsg").show("\u8bf7\u518d\u6b21\u8f93\u5165\u5bc6\u7801");
            return;
          }
          if (accountNewPassword != accountConfirmPassword) {
            cc.find("FadeMsg").getComponent("FadeMsg").show("\u4e24\u6b21\u8f93\u5165\u7684\u5bc6\u7801\u4e0d\u4e00\u81f4");
            return;
          }
          var postData = {
            currentPassword: accountOldPassword,
            password: accountNewPassword
          };
          App.postWithToken("/users/changePassword", postData, function(data) {
            if (200 == parseInt(data.code)) {
              cc.find("FadeMsg").getComponent("FadeMsg").show("\u5bc6\u7801\u4fee\u6539\u6210\u529f,\u8bf7\u91cd\u65b0\u767b\u5f55");
              App.getWithToken("/auth/logout", function(data) {
                cc.find("Loading").getComponent("Loading").show();
                200 == parseInt(data.code) && cc.director.loadScene("LoginScene");
              });
            } else cc.find("FadeMsg").getComponent("FadeMsg").show(data.message.zh);
          });
          break;

         case "strongboxPassword":
          if (1 == App.myUser.hasSecureCode) {
            var strongboxModifyOldPassword = this.strongboxModifyOldPassword.getComponent(cc.EditBox);
            if ("" == strongboxModifyOldPassword.string) {
              cc.find("FadeMsg").getComponent("FadeMsg").show("\u5f53\u524d\u8d44\u91d1\u5bc6\u7801\u4e0d\u80fd\u4e3a\u7a7a");
              return;
            }
            var strongboxModifyNewPassword = this.strongboxModifyNewPassword.getComponent(cc.EditBox);
            if ("" == strongboxModifyNewPassword.string) {
              cc.find("FadeMsg").getComponent("FadeMsg").show("\u65b0\u8d44\u91d1\u5bc6\u7801\u4e0d\u80fd\u4e3a\u7a7a");
              return;
            }
            var strongboxModifyConfirmPassword = this.strongboxModifyConfirmPassword.getComponent(cc.EditBox);
            if ("" == strongboxModifyConfirmPassword.string) {
              cc.find("FadeMsg").getComponent("FadeMsg").show("\u4e24\u6b21\u8f93\u5165\u7684\u5bc6\u7801\u4e0d\u4e00\u81f4");
              return;
            }
            var _postData = {
              currentSecurityCode: strongboxModifyOldPassword.string,
              securityCode: strongboxModifyNewPassword.string
            };
            App.postWithToken("/users/changeSecurityCode", _postData, function(data) {
              200 == parseInt(data.code) ? cc.find("FadeMsg").getComponent("FadeMsg").show("\u4fee\u6539\u8d44\u91d1\u5bc6\u7801\u6210\u529f") : cc.find("FadeMsg").getComponent("FadeMsg").show(data.message.zh);
            });
          } else {
            var strongboxFirstNewPassword = this.strongboxFirstNewPassword.getComponent(cc.EditBox);
            if ("" == strongboxFirstNewPassword.string) {
              cc.find("FadeMsg").getComponent("FadeMsg").show("\u65b0\u8d44\u91d1\u5bc6\u7801\u4e0d\u80fd\u4e3a\u7a7a");
              return;
            }
            var strongboxFirstConfirmPassword = this.strongboxFirstConfirmPassword.getComponent(cc.EditBox);
            if ("" == strongboxFirstConfirmPassword.string) {
              cc.find("FadeMsg").getComponent("FadeMsg").show("\u8d44\u91d1\u786e\u8ba4\u5bc6\u7801\u4e0d\u80fd\u4e3a\u7a7a");
              return;
            }
            if (strongboxFirstNewPassword.string != strongboxFirstConfirmPassword.string) {
              cc.find("FadeMsg").getComponent("FadeMsg").show("\u4e24\u6b21\u8f93\u5165\u7684\u5bc6\u7801\u4e0d\u4e00\u81f4");
              return;
            }
            var _postData2 = {
              securityCode: strongboxFirstNewPassword.string
            };
            App.postWithToken("/users/changeSecurityCode", _postData2, function(data) {
              200 == parseInt(data.code) ? cc.find("FadeMsg").getComponent("FadeMsg").show("\u8bbe\u7f6e\u8d44\u91d1\u5bc6\u7801\u6210\u529f") : cc.find("FadeMsg").getComponent("FadeMsg").show(data.message.zh);
            });
          }
          break;

         case "bindTelephone":
          var self = this;
          var _postData3 = {
            telephone: this.newTelephone.string,
            validCode: this.smsCode.string
          };
          App.postWithToken("/users/validMobile", _postData3, function(data) {
            if (200 == parseInt(data.code)) {
              App.myUser.telephone ? cc.find("FadeMsg").getComponent("FadeMsg").show("\u4fee\u6539\u624b\u673a\u53f7\u6210\u529f") : cc.find("FadeMsg").getComponent("FadeMsg").show("\u8bbe\u7f6e\u624b\u673a\u53f7\u6210\u529f");
              App.myUser.telephone = self.newTelephone.string;
              self.telephone.string = self.newTelephone.string;
            } else cc.find("FadeMsg").getComponent("FadeMsg").show(data.message.zh);
          });
        }
      },
      tapGetSecurityCode: function tapGetSecurityCode(sender, customEventData) {
        var self = this;
        cc.loader.load({
          url: App.getSecurityCodeUrl(),
          type: "png"
        }, function(err, texture) {
          var sp = new cc.SpriteFrame(texture);
          var background = self.accountGetSecurityCode.node.getChildByName("Background");
          background.getComponent(cc.Sprite).spriteFrame = new cc.SpriteFrame(texture);
        });
      },
      tapClose: function tapClose(sender, customEventData) {
        this.node.destroy();
      },
      tapSwitchAccount: function tapSwitchAccount(sender, customEventData) {
        App.getWithToken("/auth/logout", function(data) {
          cc.find("Loading").getComponent("Loading").show();
          200 == parseInt(data.code) && cc.director.loadScene("LoginScene");
        });
      },
      tapExitGame: function tapExitGame(sender, customEventData) {
        App.getWithToken("/auth/logout", function(data) {
          cc.find("Loading").getComponent("Loading").show();
          200 == parseInt(data.code) && cc.game.end();
        });
      },
      tapGetSMSCode: function tapGetSMSCode(sende, customEventData) {
        var postData = {
          telephone: this.newTelephone.string,
          type: ""
        };
        App.postWithToken("/auth/sendSMS", postData, function(data) {
          200 == parseInt(data.code) || cc.find("FadeMsg").getComponent("FadeMsg").show(data.message.zh);
        });
      },
      checkSetting: function checkSetting(sender, customEventData) {
        var index = parseInt(customEventData);
        switch (index) {
         case 1:
          this.audioSetting.active = true;
          this.accountPassword.active = false;
          this.strongboxPassword.active = false;
          this.bindTelephone.active = false;
          this.bindDebitCard.active = false;
          this.aboutus.active = false;
          break;

         case 2:
          this.audioSetting.active = false;
          this.accountPassword.active = true;
          this.strongboxPassword.active = false;
          this.bindTelephone.active = false;
          this.bindDebitCard.active = false;
          this.aboutus.active = false;
          break;

         case 3:
          this.audioSetting.active = false;
          this.accountPassword.active = false;
          this.strongboxPassword.active = true;
          if (1 == App.myUser.hasSecureCode) {
            this.strongboxFirstPassword.active = false;
            this.strongboxModifyPassword.active = true;
          } else {
            this.strongboxFirstPassword.active = true;
            this.strongboxModifyPassword.active = false;
          }
          this.bindTelephone.active = false;
          this.bindDebitCard.active = false;
          this.aboutus.active = false;
          break;

         case 4:
          this.audioSetting.active = false;
          this.accountPassword.active = false;
          this.strongboxPassword.active = false;
          this.bindTelephone.active = true;
          this.bindDebitCard.active = false;
          this.aboutus.active = false;
          break;

         case 5:
          this.audioSetting.active = false;
          this.accountPassword.active = false;
          this.strongboxPassword.active = false;
          this.bindTelephone.active = false;
          this.bindDebitCard.active = true;
          this.aboutus.active = false;
          break;

         case 6:
          this.audioSetting.active = false;
          this.accountPassword.active = false;
          this.strongboxPassword.active = false;
          this.bindTelephone.active = false;
          this.bindDebitCard.active = false;
          this.aboutus.active = true;
        }
      },
      tapAddNewCard: function tapAddNewCard(sender, customEventData) {
        this.bindDebitCardNode.active = false;
        this.bindNewCardNode.active = true;
      },
      tapBackDebitCardList: function tapBackDebitCardList(sender, customEventData) {
        this.bindDebitCardNode.active = true;
        this.bindNewCardNode.active = false;
      },
      checkBank: function checkBank(sender, customEventData) {
        if (sender.isChecked) {
          sender.node.getChildByName("Background").active = false;
          this.bankList.node.active = true;
        } else {
          sender.node.getChildByName("Background").active = true;
          this.bankList.node.active = false;
        }
      },
      checkCity: function checkCity(sender, customEventData) {
        if (sender.isChecked) {
          sender.node.getChildByName("Background").active = false;
          this.bgCityInfo.node.active = true;
        } else {
          sender.node.getChildByName("Background").active = true;
          this.bgCityInfo.node.active = false;
        }
      },
      tapImmediatelyBindCard: function tapImmediatelyBindCard(sender, customEventData) {
        var postData = {
          accountName: this.accountName.string,
          accountNumber: this.accountNumber.string,
          bank: this.bankName.string,
          branch: this.cityInfo.string
        };
        var self = this;
        App.postWithToken("/userBankAccounts/add", postData, function(data) {
          if (200 == parseInt(data.code)) {
            self.bindDebitCardNode.active = true;
            self.bindNewCardNode.active = false;
            self.requestCardList();
            cc.find("FadeMsg").getComponent("FadeMsg").show("\u7ed1\u5b9a\u94f6\u884c\u5361\u6210\u529f");
          } else cc.find("FadeMsg").getComponent("FadeMsg").show(data.message.zh);
        });
      },
      requestCardList: function requestCardList() {
        var self = this;
        App.getWithToken("/userBankAccounts/list", function(data) {
          200 == parseInt(data.code) && self.updateBindDebitCardList(data.data);
        });
      },
      tapScanCard: function tapScanCard(sender, customEventData) {
        SDKToos.scanCard();
      },
      onDestroy: function onDestroy() {
        App.off("finishScanCard");
      }
    });
    cc._RF.pop();
  }, {
    App: "App",
    BankInfoBean: "BankInfoBean",
    SDKTools: "SDKTools",
    Tools: "Tools",
    bankList: "bankList",
    provinces: "provinces"
  } ],
  settleInfo: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "944c4clqTFNiJvhfqJ9UYQJ", "settleInfo");
    "use strict";
    cc.Class({
      extends: cc.Component,
      properties: {},
      onLoad: function onLoad() {
        this.node.on(cc.Node.EventType.TOUCH_START, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_MOVE, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_END, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_CANCEL, function(event, touch) {
          void 0 != event.stopProgagation && event.stopProgagation();
        });
      },
      start: function start() {},
      tapClose: function tapClose(sender, customEventData) {
        this.node.destroy();
      },
      tapContactCustomer: function tapContactCustomer(sender, customEventData) {}
    });
    cc._RF.pop();
  }, {} ],
  shareManager: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "2d14esFF/BFjpaLbTwZZtSl", "shareManager");
    "use strict";
    var SDKTools = require("SDKTools");
    var App = require("App");
    cc.Class({
      extends: cc.Component,
      properties: {
        shareUrl: {
          default: null,
          type: cc.Label
        },
        qrcode: {
          default: null,
          type: cc.Sprite
        },
        shareUrlStr: "https://fir.im/8knv"
      },
      onLoad: function onLoad() {
        var self = this;
        this.shareUrl.string = "\u4e0b\u8f7d\u94fe\u63a5:  " + this.shareUrlStr;
        App.once("finishCreateQRImage", function(url, qrCodeSavePath, width, height) {
          cc.loader.load(qrCodeSavePath, function(err, texture) {
            if (err) return;
            var sp = new cc.SpriteFrame(texture);
            self.qrcode.spriteFrame = new cc.SpriteFrame(texture);
          });
        });
        SDKTools.createQRImage(this.shareUrlStr, 300, 300);
      },
      start: function start() {},
      onClose: function onClose() {
        this.node.destroy();
      },
      tapCopyToClipBoard: function tapCopyToClipBoard(sender, customEventData) {
        SDKTools.copyToClipBoard(this.shareUrlStr);
      },
      tapSaveToPhotoAlbum: function tapSaveToPhotoAlbum(sender, customEventData) {
        SDKTools.saveToPhotoAlbum();
      }
    });
    cc._RF.pop();
  }, {
    App: "App",
    SDKTools: "SDKTools"
  } ],
  signin1: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "971f2Om4bZFlr2guv5w/xpu", "signin1");
    "use strict";
    var App = require("App");
    cc.Class({
      extends: cc.Component,
      properties: {
        signBg: cc.SpriteFrame,
        closeBtn: cc.Node,
        alert: cc.Node,
        list: [ cc.Node ]
      },
      onLoad: function onLoad() {
        var _this = this;
        App.getWithToken("/promotions/checkSignin", function(d) {
          _this.showSignin(d.data.totalSignSize);
          d.data.applyTotalSignToday || _this.showCurSignin(d.data.totalSignSize);
        });
        this.alert.children[0].on("touchend", function() {
          _this.alert.active = false;
        });
        this.closeBtn.on("touchend", function() {
          _this.node.destroy();
        });
      },
      showSignin: function showSignin(d) {
        for (var i = 0; i < d; i++) this.list[i].children[2].getComponent(cc.Label).string = "\u5df2\u9886\u53d6";
      },
      showCurSignin: function showCurSignin(d) {
        var _this2 = this;
        this.list[d].children[2].color = cc.color("#20CAFB");
        this.list[d].getComponent(cc.Sprite).spriteFrame = this.signBg;
        this.list[d].once("touchend", function() {
          var xhr = new XMLHttpRequest();
          xhr.open("POST", App.apiurl + "/promotions/applySignin");
          xhr.setRequestHeader("Authorization", "Baer " + App.requestToken);
          xhr.send();
          xhr.onreadystatechange = function() {
            App.do_onreadystatechange(xhr, function(d) {
              if (!cc.isValid(_this2)) return;
              if (200 != d.code) return cc.find("FadeMsg").getComponent("FadeMsg").show(d.message);
              _this2.list[d].children[2].getComponent(cc.Label).string = "\u5df2\u9886\u53d6";
              _this2.list[d].children[2].color = cc.color("#79A2D3");
              _this2.alert.active = true;
            });
          };
        });
      }
    });
    cc._RF.pop();
  }, {
    App: "App"
  } ],
  signin: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "1ec363LTkNLu7555JidnMh5", "signin");
    "use strict";
    var Tools = require("Tools");
    var App = require("App");
    cc.Class({
      extends: cc.Component,
      properties: {
        mask: {
          default: null,
          type: cc.Sprite
        },
        bg: {
          default: null,
          type: cc.Sprite
        },
        receiveAwardPanel: {
          default: null,
          type: cc.Prefab
        },
        dayArray: [ cc.Node ],
        signedToday: {
          default: null,
          type: cc.Label
        },
        continuousSignSize: {
          default: null,
          type: cc.Label
        }
      },
      onLoad: function onLoad() {
        this.node.on(cc.Node.EventType.TOUCH_START, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_MOVE, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_END, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_CANCEL, function(event, touch) {
          void 0 != event.stopProgagation && event.stopProgagation();
        });
        var self = this;
        this.mask.node.on(cc.Node.EventType.TOUCH_END, function(event, touch) {
          self.node.destroy();
        });
        var today = new Date();
        var year = today.getFullYear();
        var month = today.getMonth() + 1;
        var firstDayWeek = Tools.getWeek(year, month, 1);
        var monthDays = Tools.getMonthDays(year, month);
        var flag = false;
        this.dayArray.push(void 0);
        for (var i = 0; i < 36; i++) {
          var day = this.node.getChildByName("day" + i);
          day.active = false;
        }
        for (var _i = 0, j = 1; j <= monthDays; _i++) {
          var _day = this.node.getChildByName("day" + _i);
          _i == firstDayWeek && (flag = true);
          if (flag) {
            _day.active = true;
            j++;
            this.dayArray.push(_day);
          }
        }
        for (var _i2 = 1; _i2 < this.dayArray.length; _i2++) this.dayArray[_i2].getComponent(cc.Label).string = _i2;
        this.dayArray[today.getDate()].color = new cc.Color(255, 0, 0);
        App.getWithToken("/promotions/checkSignin", function(data) {
          if (200 == parseInt(data.code)) {
            data.data.signedToday ? self.signedToday.getComponent(cc.Label).string = "\u4eca\u65e5\u5df2\u7b7e\u5230" : self.signedToday.getComponent(cc.Label).string = "\u4eca\u65e5\u672a\u7b7e\u5230";
            self.continuousSignSize.getComponent(cc.Label).string = "\u5df2\u8fde\u7eed\u7b7e\u5230" + data.data.continuousSignSize + "\u5929";
            var _loop = function _loop(_i3) {
              cc.loader.loadRes("icon_online", cc.SpriteFrame, function(err, spriteFrame) {
                if (err) {
                  cc.log(err);
                  return;
                }
                self.dayArray[data.data.signInDays[_i3]].getChildByName("signin").getComponent(cc.Sprite).spriteFrame = spriteFrame;
              });
            };
            for (var _i3 = 0; _i3 < data.data.signInDays.length; _i3++) _loop(_i3);
          }
        });
      },
      start: function start() {},
      tapReceive: function tapReceive(sender, customEventData) {
        var receiveAwardPanel = cc.instantiate(this.receiveAwardPanel);
        cc.find("Canvas").addChild(receiveAwardPanel);
        receiveAwardPanel.getComponent("receiveAward").setCount(5);
      },
      tapSignin: function tapSignin(sender, customEventData) {
        var self = this;
        var postData = [ "categoryId=5" ];
        App.postTitle("/tasks", postData, function(data) {
          if (200 == parseInt(data.code)) {
            cc.find("FadeMsg").getComponent("FadeMsg").show("\u7b7e\u5230\u6210\u529f");
            self.signedToday.getComponent(cc.Label).string = "\u4eca\u65e5\u5df2\u7b7e\u5230";
            cc.loader.loadRes("icon_online", cc.SpriteFrame, function(err, spriteFrame) {
              if (err) {
                cc.log(err);
                return;
              }
              var today = new Date();
              self.dayArray[today.getDate()].getChildByName("signin").getComponent(cc.Sprite).spriteFrame = spriteFrame;
            });
          } else cc.find("FadeMsg").getComponent("FadeMsg").show(data.message.zh);
        });
      },
      tapGetSigninReward: function tapGetSigninReward(sender, customEventData) {
        App.postNoneWithToken("/promotions/applySignin", function(data) {
          cc.log(data);
          true / parseInt(data.code) == 200 ? cc.find("FadeMsg").getComponent("FadeMsg").show("\u9886\u53d6\u7b7e\u5230\u4f18\u60e0\u6210\u529f") : cc.find("FadeMsg").getComponent("FadeMsg").show(data.message.zh);
        });
      }
    });
    cc._RF.pop();
  }, {
    App: "App",
    Tools: "Tools"
  } ],
  strongbox: [ function(require, module, exports) {
    "use strict";
    cc._RF.push(module, "a6463ktgDRK269jcltCDhwC", "strongbox");
    "use strict";
    var App = require("App");
    var Tools = require("Tools");
    cc.Class({
      extends: cc.Component,
      properties: {
        accessRecordList: {
          default: null,
          type: cc.ScrollView
        },
        accessRecordItem: {
          default: null,
          type: cc.Node
        },
        saveOrDraw: {
          default: null,
          type: cc.Node
        },
        accessRecord: {
          default: null,
          type: cc.Node
        },
        operateTitle: {
          default: null,
          type: cc.Label
        },
        operateButtonBg: {
          default: null,
          type: cc.Sprite
        },
        number: {
          default: null,
          type: cc.EditBox
        },
        toggle: 1,
        openBankPanel: {
          default: null,
          type: cc.Prefab
        },
        platformBalance: {
          default: null,
          type: cc.Label
        },
        balance: {
          default: null,
          type: cc.Label
        }
      },
      onLoad: function onLoad() {
        this.node.on(cc.Node.EventType.TOUCH_START, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_MOVE, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_END, function(event, touch) {
          void 0 != event.stopProgagation && event.stopPropagation();
        });
        this.node.on(cc.Node.EventType.TOUCH_CANCEL, function(event, touch) {
          void 0 != event.stopProgagation && event.stopProgagation();
        });
        this.accessRecord.active = false;
        this.saveOrDraw.active = true;
        this.accessRecordItem.active = false;
        var getData = [ "platformId=" + App.esportPlatformId ];
        var self = this;
        App.getWithTokenData("/users/getPlatformBalance", getData, function(data) {
          200 == parseInt(data.code) && (self.platformBalance.string = data.data);
        });
        App.getWithToken("/users/getUserBalance", function(data) {
          200 == parseInt(data.code) && (self.balance.string = data.data);
        });
      },
      start: function start() {},
      requestAccessRecordList: function requestAccessRecordList() {
        var postData = {
          endDate: Tools.todayStr(),
          limit: 100,
          offset: 0,
          platformId: App.esportPlatformId,
          startDate: Tools.todayStr()
        };
        var self = this;
        App.postWithToken("/credits/query", postData, function(data) {
          200 == parseInt(data.code) ? self.updateAccessRecordList(data.data.content) : cc.find("FadeMsg").getComponent("FadeMsg").show(data.message.zh);
        });
      },
      updateAccessRecordList: function updateAccessRecordList(data) {
        this.accessRecordList.content.removeAllChildren();
        for (var i = 0; i < data.length; i++) {
          var accessRecordItem = cc.instantiate(this.accessRecordItem);
          accessRecordItem.active = true;
          accessRecordItem.setPosition(cc.v2(0, 0));
          accessRecordItem.getChildByName("time").getComponent(cc.Label).string = data[i].createDate;
          1 == data[i].type ? accessRecordItem.getChildByName("exchangeType").getComponent(cc.Label).string = "\u5b58\u5165\u91d1\u5e01" : 2 == data[i].type && (accessRecordItem.getChildByName("exchangeType").getComponent(cc.Label).string = "\u53d6\u51fa\u91d1\u5e01");
          var amountStr = cc.js.formatStr("<color=#FAB622>%s</c><color=#BCD3F7>(\u5355\u4f4d:\u4e2a)</color>", data[i].amount);
          accessRecordItem.getChildByName("amount").getComponent(cc.RichText).string = amountStr;
          var walletAmount = cc.js.formatStr("<color=#FAB622>%s</c><color=#BCD3F7>(\u5355\u4f4d:\u4e2a)</color>", data[i].creditAfter);
          accessRecordItem.getChildByName("walletAmount").getComponent(cc.RichText).string = amountStr;
          this.accessRecordList.content.addChild(accessRecordItem);
        }
      },
      checkOperate: function checkOperate(sender, customEventData) {
        this.toggle = customEventData;
        var self = this;
        if (sender.isChecked) if (1 == customEventData) {
          this.saveOrDraw.active = true;
          this.accessRecord.active = false;
          cc.loader.loadRes("btn_save_money", cc.SpriteFrame, function(err, spriteFrame) {
            if (err) return;
            self.operateButtonBg.spriteFrame = spriteFrame;
          });
          self.operateTitle.string = "\u8bf7\u8f93\u5165\u60a8\u8981\u5b58\u5165\u7684\u91d1\u5e01";
        } else if (2 == customEventData) {
          this.saveOrDraw.active = true;
          this.accessRecord.active = false;
          cc.loader.loadRes("btn_draw_money", cc.SpriteFrame, function(err, spriteFrame) {
            if (err) return;
            self.operateButtonBg.spriteFrame = spriteFrame;
          });
          self.operateTitle.string = "\u8bf7\u8f93\u5165\u60a8\u8981\u53d6\u51fa\u7684\u91d1\u5e01";
        } else if (3 == customEventData) {
          this.saveOrDraw.active = false;
          this.accessRecord.active = true;
          this.requestAccessRecordList();
        }
      },
      tapClose: function tapClose(sender, customEventData) {
        this.node.destroy();
      },
      tapOperate: function tapOperate(sender, customEventData) {
        if (!App.myUser.hasSecureCode) {
          var openBankPanel = cc.instantiate(this.openBankPanel);
          cc.find("Canvas").addChild(openBankPanel);
          return;
        }
        var str = this.number.string;
        var amount = false == Boolean(parseInt(str)).valueOf() ? 0 : parseInt(str);
        if (1 == this.toggle) {
          var postData = {
            amount: amount,
            platformId: App.esportPlatformId
          };
          App.postWithToken("/credits/in", postData, function(data) {
            if (200 == parseInt(data.code)) ; else {
              cc.log(data);
              cc.find("FadeMsg").getComponent("FadeMsg").show(data.message.zh);
            }
          });
        } else if (2 == this.toggle) {
          var _postData = {
            amount: amount,
            platformId: App.esportPlatformId
          };
          App.postWithToken("/credits/out", _postData, function(data) {
            200 == parseInt(data.code) || cc.find("FadeMsg").getComponent("FadeMsg").show(data.message.zh);
          });
        }
      },
      tapNumber: function tapNumber(sender, customEventData) {
        this.number.string = String(customEventData);
      }
    });
    cc._RF.pop();
  }, {
    App: "App",
    Tools: "Tools"
  } ]
}, {}, [ "billManager", "itemManager", "personalManager", "shareManager", "ShaderHelper", "ShaderNameLabel", "ShaderTime", "bankList", "gameLogo", "provinces", "activity", "battleEnd", "bet", "betSuccess", "bindAlipay", "bindDebitCard", "bindSuccess", "conversion", "createRoom", "customer", "datePick", "friend", "friendBattle", "friendBattleRoom", "gameplaza", "goldPool", "inviteFriend", "joinRoom", "moreGame", "networkError", "notice", "noticeView", "openBank", "personalInfo", "receiveAward", "recharge", "rechargeAmount", "setting", "settleInfo", "signin", "signin1", "strongbox", "FadeMsg", "Global", "HallScene", "Loading", "LoginScene", "RegisterScene", "ResetPasswordScene", "SDKNode", "ShishileScene", "scrollItemScale", "App", "BankInfoBean", "CryptoJS", "HttpCenter", "MyUser", "SDKTools", "Tools", "UpdateScene" ]);
//# sourceMappingURL=project.dev.js.map