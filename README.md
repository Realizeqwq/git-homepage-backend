<p align="center">
	<img alt="logo" src="https://cube.elemecdn.com/3/7c/3ea6beec64369c2642b92c6726f1epng.png" width="80">
</p>
<h1 align="center" style="margin: 30px 0 30px; font-weight: bold;">个人技术主页 | 王乐凡</h1>
<h4 align="center">基于Vue3 + Spring Boot的Git托管平台个人主页设计与实现</h4>
<p align="center">
	<a href="https://github.com/Realizeqwq/git-homepage-backend"><img src="https://img.shields.io/badge/后端-毕业设计-blue.svg"></a>
	<a href="https://github.com/Realizeqwq/git-homepage-frontend"><img src="https://img.shields.io/badge/前端-毕业设计-green.svg"></a>
	<a href="https://github.com/Realizeqwq"><img src="https://img.shields.io/badge/作者-王乐凡-orange.svg"></a>
</p>

## 项目简介

本项目是基于 Spring Boot 和 Vue3 开发的个人技术展示主页，旨在为开发者提供一个轻量化、低成本、可自动同步Git数据的个人名片网站。

系统采用前后端分离架构，前端通过Vue3实现组件化开发，集成技能雷达图、技术栈标签云、动态欢迎语等可视化功能；后端通过GitHub API获取仓库数据，利用浏览器缓存优化性能。项目通过GitHub Pages实现零成本部署，数据自动同步，解决了传统个人主页维护成本高、信息更新不及时的问题。

## 技术栈

### 前端
- Vue 3.3.8
- Element-Plus 2.4.3
- ECharts 5.4.0
- Axios
- Vite 4.5.0

### 后端
- Spring Boot 3.2.0
- MySQL 8.0.33
- Redis 7.0.12
- MyBatis-Plus

## 核心功能

1. **个人信息展示**：头像、姓名、专业、联系方式、社交链接
2. **技能雷达图**：使用ECharts动态展示技能熟练度分布
3. **技术栈标签云**：以标签形式展示掌握的技术能力
4. **动态欢迎语**：根据访问时段显示不同的问候语
5. **GitHub项目展示**：自动同步GitHub仓库列表，显示项目名称、描述、星标数
6. **关于我模块**：个人简介和学习方向
7. **响应式布局**：自动适配PC、平板、手机端
8. **回到顶部**：长页面浏览优化

## 系统截图

（此处插入你的网站截图）

## 快速开始

### 前端启动

```bash
# 进入前端目录
cd kuuga-ui

# 安装依赖
npm install

# 启动开发服务器
npm run dev
