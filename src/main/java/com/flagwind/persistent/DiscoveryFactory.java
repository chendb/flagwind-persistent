// package com.flagwind.persistent;



// public class DiscoveryFactory {


//     //#region 单例字段
//     private static DiscoveryFactory instance;
//     //#endregion

//     //#region 成员字段
//     private Discovery discovery;
//     //#endregion

//     //#region 构造函数
//     public DiscoveryFactory(){
//     }
//     //#endregion

//     public static DiscoveryFactory instance() {
//         if (instance == null) {
//             instance = new DiscoveryFactory();
//         }
//         return instance;
//     }

//     public void initialize(Discovery discovery) {
//         this.discovery = discovery;
//     }


//     //#region 公共方法


//     public <R> R resolve(String source) {

//         R r = (R) this.discovery.discover(source);
//         if (r == null) {
//             System.out.print(String.format("Discover %s 没有找到", source));
//         }
//         return r;
//     }

//     public <R> R resolve(Class<?> serviceType) {
//         return this.resolve(serviceType.getSimpleName());
//     }

//     //#endregion

// }
