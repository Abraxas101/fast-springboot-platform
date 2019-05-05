var $;
layui.use(['jquery', 'table', 'form'], function() {
    $ = layui.jquery;

    $("#queryUser").click(function () {
        layer.open({
            type: 1,
            title: '<i class="fa fa-filter" aria-hidden="true" style="color:#4298fc"></i> 高级搜索',
            shadeClose: true,
            offset: 'r',
            anim: 2,
            move: false,
            area: ['25%', '100%'],
            content: $(".advancedSerach")
        });
    })

    $("#addUser").click(function () {
        top.layer.open({
            type: 2,
            area: ['45%', '90%'],
            content: ctxPath + '/admin/user/toSaveUI'
        });
    })
})