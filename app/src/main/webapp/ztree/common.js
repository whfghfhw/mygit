//获取项目根路径,如： http://localhost:8080/pro
function getRootPath() {
	var path = window.document.location.href;
	//获取主机地址之后的目录，如： uimcardprj/share/meun.jsp
	var pathName = window.document.location.pathname;
	var pos = path.indexOf(pathName);
	//获取主机地址，如： http://localhost:8080
	var localhostPath = path.substring(0, pos);
	//获取带"/"的项目名，如：/pro
	//var projectName = pathName
			//.substring(0, pathName.substr(1).indexOf('/') + 1);
	return (localhostPath);
}