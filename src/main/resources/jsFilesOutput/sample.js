var title = document.createElement("title");
title.appendChild(document.createTextNode("Sample"));

var link = document.createElement("link");
link.setAttribute("rel", "stylesheet");
link.setAttribute("href", "");

var meta = document.createElement("meta");
meta.setAttribute("charset", "utf-8");

var head = document.createElement("head");
head.appendChild(meta);

var h1 = document.createElement("h1");
h1.appendChild(document.createTextNode("Sample"));

var img = document.createElement("img");
img.setAttribute("src", "kanye.jpg");
img.setAttribute("alt", "kanye");

var div = document.createElement("div");
div.setAttribute("id", "header");
div.appendChild(h1);
div.appendChild(img);

var h2 = document.createElement("h2");
h2.appendChild(document.createTextNode("Main"));

var p = document.createElement("p");
p.appendChild(document.createTextNode("This is the main content."));

var img_ = document.createElement("img");
img_.setAttribute("src", "");
img_.setAttribute("alt", "");

var div_ = document.createElement("div");
div_.setAttribute("id", "main");
div_.appendChild(h2);
div_.appendChild(p);
div_.appendChild(img_);

var p_ = document.createElement("p");
p_.appendChild(document.createTextNode("Copyright © 2019"));

var div__ = document.createElement("div");
div__.setAttribute("id", "footer");
div__.appendChild(p_);

var div___ = document.createElement("div");
div___.setAttribute("id", "container");
div___.appendChild(div);
div___.appendChild(div_);
div___.appendChild(div__);

var body = document.createElement("body");
body.appendChild(div___);

var html = document.createElement("html");
html.appendChild(head);
html.appendChild(body);