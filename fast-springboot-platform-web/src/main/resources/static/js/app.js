/**
 * Name:app.js
 * Author:Van
 * E-mail:zheng_jinfan@126.com
 * Website:http://kit.zhengjinfan.cn/
 * LICENSE:MIT
 */
var tab;
layui.define(['element', 'form', 'table', 'loader', 'tab', 'navbar', 'onelevel', 'laytpl'], function(exports) {
    var $ = layui.jquery,
        element = layui.element,
        layer = layui.layer,
        _win = $(window),
        _doc = $(document),
        _body = $('.kit-body'),
        form = layui.form,
        table = layui.table,
        loader = layui.loader,
        navbar = layui.navbar,
    tab = layui.tab
    var app = {

        config: {
            type: 'iframe'
        },
        set: function(options) {
            var that = this;
            $.extend(true, that.config, options);
            return that;
        },
        init: function() {
            var that = this,
                _config = that.config;
            if (_config.type === 'iframe') {
                tab.set({
                    elem: '#container',
                    onSwitch: function(data) { //选项卡切换时触发

                    },
                    closeBefore: function(data) { //关闭选项卡之前触发

                        return true; //返回true则关闭
                    }
                }).render();
               
                //navbar加载方式二，设置远程地址加载
                navbar.set({
                    remote: {
                        url: ctxPath+'/datas/navbar1.json'
                    }
                }).render(function(data) {
                    tab.tabAdd(data);
                });
                
                //处理顶部一级菜单
                var onelevel = layui.onelevel;
                if (onelevel.hasElem()) {
                    onelevel.set({
                        remote: {
                            url: ctxPath+'/datas/onelevel1.json' //远程地址
                        },
                        onClicked: function(id) {
                            navbar.set({
                                remote: {
                                    url: ctxPath+ '/datas/navbar1.json'
                                }
                            }).render(function(data) {
                                tab.tabAdd(data);
                            });
                        },
                        renderAfter: function(elem) {
                            elem.find('li').eq(0).click();
                        }
                    }).render();
                }
            }
            return that;
        }
    };

    //输出test接口
    exports('app', app);
});