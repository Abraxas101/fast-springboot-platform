package com.nwx.common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import java.util.List;

import java.util.*;


public class NavbarBuilder {

	List<Navbar> nodes = new ArrayList<Navbar>();

	public NavbarBuilder(List<Navbar> nodes) {

		super();

		this.nodes = nodes;

	}

	/**
	 * 构建JSON树形结构
	 * 
	 * @return
	 */

	public String buildJSONTree() {

		List<Navbar> nodeTree = buildTree();

		JSONArray jsonArray = JSONArray.parseArray(JSON.toJSONString(nodeTree));

		return jsonArray.toString();

	}

	/**
	 * 构建树形结构
	 * 
	 * @return
	 */

	public List<Navbar> buildTree() {

		List<Navbar> treeNodes = new ArrayList<Navbar>();

		List<Navbar> rootNodes = getRootNodes();

		for (Navbar rootNode : rootNodes) {

			buildChildNodes(rootNode);

			treeNodes.add(rootNode);

		}

		return treeNodes;

	}

	/**
	 * 递归子节点
	 * 
	 * @param node
	 */

	public void buildChildNodes(Navbar node) {

		List<Navbar> children = getChildNodes(node);

		if (!children.isEmpty()) {

			for (Navbar child : children) {

				buildChildNodes(child);

			}
			node.setChildren(children);
		}

	}

	/**
	 * @Author Neil
	 * @Description 获取父节点下所有的子节点
	 * @Date 2019/4/30 11:28
	 * @Param [pnode]
	 * @return java.util.List<com.nwx.common.NavbarBuilder.Node>
	 **/
	public List<Navbar> getChildNodes(Navbar pnode) {

		List<Navbar> childNodes = new ArrayList<Navbar>();

		for (Navbar n : nodes) {

			if (pnode.getId().equals(n.getpId())) {

				childNodes.add(n);

			}

		}

		return childNodes;

	}

	/**
	 * @Author Neil
	 * @Description 判断是否为根节点
	 * @Date 2019/4/30 11:28
	 * @Param [node]
	 * @return boolean
	 **/
	public boolean rootNode(Navbar node) {

		boolean isRootNode = true;

		for (Navbar n : nodes) {

			if (node.getpId().equals(n.getId())) {

				isRootNode = false;

				break;

			}

		}

		return isRootNode;

	}

	/**
	 * @Author Neil
	 * @Description 获取集合中所有的根节点
	 * @Date 2019/4/30 11:28
	 * @Param []
	 * @return java.util.List<com.nwx.common.NavbarBuilder.Node>
	 **/
	public List<Navbar> getRootNodes() {

		List<Navbar> rootNodes = new ArrayList<Navbar>();

		for (Navbar n : nodes) {

			if (rootNode(n)) {

				rootNodes.add(n);

			}

		}

		return rootNodes;

	}

	public static class Navbar {

		private String id;

		private String pId;

		private String title;

		private String icon;

		private String url;

		private List<Navbar> children;

		public Navbar() {
		}

		public Navbar(String id, String pId, String title, String icon, String url) {

			super();

			this.id = id;

			this.pId = pId;

			this.title = title;

			this.icon = icon;

			this.url = url;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getpId() {
			return pId;
		}

		public void setpId(String pId) {
			this.pId = pId;
		}

		public List<Navbar> getChildren() {
			return children;
		}

		public void setChildren(List<Navbar> children) {
			this.children = children;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getIcon() {
			return icon;
		}

		public void setIcon(String icon) {
			this.icon = icon;
		}

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}
	}
}