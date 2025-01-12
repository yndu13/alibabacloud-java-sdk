// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210706_165849384.models;

import com.aliyun.tea.*;

public class AscpAppointOrderCreatedErpSpiRequest extends TeaModel {
    // 预约单类型
    @NameInMap("orderType")
    public Integer orderType;

    // 供应商ID
    @NameInMap("supplierId")
    public Long supplierId;

    // 仓库编码（物理仓）
    @NameInMap("entityCode")
    public String entityCode;

    // 仓库编码（逻辑仓）
    @NameInMap("relationCode")
    public String relationCode;

    // 待预约单据编号
    @NameInMap("outOrderCode")
    public String outOrderCode;

    // 预约单号
    @NameInMap("appointOrderCode")
    public String appointOrderCode;

    // 仓库名称（逻辑仓）
    @NameInMap("relationName")
    public String relationName;

    // 供应商名称
    @NameInMap("realSupplierNick")
    public String realSupplierNick;

    // 仓库名称（物理仓）
    @NameInMap("entityName")
    public String entityName;

    // 库位类型
    @NameInMap("warehouseType")
    public String warehouseType;

    // 出入库方式
    @NameInMap("inboundType")
    public String inboundType;

    // 明细列表
    @NameInMap("items")
    public java.util.List<AscpAppointOrderCreatedErpSpiRequestItems> items;

    // 关联业务单号
    @NameInMap("outBusinessOrderCode")
    public String outBusinessOrderCode;

    // 二级供应商编码
    @NameInMap("memberId")
    public Long memberId;

    // 供应商ID，路由专用
    @NameInMap("routeSupplierId")
    public Long routeSupplierId;

    public static AscpAppointOrderCreatedErpSpiRequest build(java.util.Map<String, ?> map) throws Exception {
        AscpAppointOrderCreatedErpSpiRequest self = new AscpAppointOrderCreatedErpSpiRequest();
        return TeaModel.build(map, self);
    }

    public AscpAppointOrderCreatedErpSpiRequest setOrderType(Integer orderType) {
        this.orderType = orderType;
        return this;
    }
    public Integer getOrderType() {
        return this.orderType;
    }

    public AscpAppointOrderCreatedErpSpiRequest setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
        return this;
    }
    public Long getSupplierId() {
        return this.supplierId;
    }

    public AscpAppointOrderCreatedErpSpiRequest setEntityCode(String entityCode) {
        this.entityCode = entityCode;
        return this;
    }
    public String getEntityCode() {
        return this.entityCode;
    }

    public AscpAppointOrderCreatedErpSpiRequest setRelationCode(String relationCode) {
        this.relationCode = relationCode;
        return this;
    }
    public String getRelationCode() {
        return this.relationCode;
    }

    public AscpAppointOrderCreatedErpSpiRequest setOutOrderCode(String outOrderCode) {
        this.outOrderCode = outOrderCode;
        return this;
    }
    public String getOutOrderCode() {
        return this.outOrderCode;
    }

    public AscpAppointOrderCreatedErpSpiRequest setAppointOrderCode(String appointOrderCode) {
        this.appointOrderCode = appointOrderCode;
        return this;
    }
    public String getAppointOrderCode() {
        return this.appointOrderCode;
    }

    public AscpAppointOrderCreatedErpSpiRequest setRelationName(String relationName) {
        this.relationName = relationName;
        return this;
    }
    public String getRelationName() {
        return this.relationName;
    }

    public AscpAppointOrderCreatedErpSpiRequest setRealSupplierNick(String realSupplierNick) {
        this.realSupplierNick = realSupplierNick;
        return this;
    }
    public String getRealSupplierNick() {
        return this.realSupplierNick;
    }

    public AscpAppointOrderCreatedErpSpiRequest setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
    public String getEntityName() {
        return this.entityName;
    }

    public AscpAppointOrderCreatedErpSpiRequest setWarehouseType(String warehouseType) {
        this.warehouseType = warehouseType;
        return this;
    }
    public String getWarehouseType() {
        return this.warehouseType;
    }

    public AscpAppointOrderCreatedErpSpiRequest setInboundType(String inboundType) {
        this.inboundType = inboundType;
        return this;
    }
    public String getInboundType() {
        return this.inboundType;
    }

    public AscpAppointOrderCreatedErpSpiRequest setItems(java.util.List<AscpAppointOrderCreatedErpSpiRequestItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<AscpAppointOrderCreatedErpSpiRequestItems> getItems() {
        return this.items;
    }

    public AscpAppointOrderCreatedErpSpiRequest setOutBusinessOrderCode(String outBusinessOrderCode) {
        this.outBusinessOrderCode = outBusinessOrderCode;
        return this;
    }
    public String getOutBusinessOrderCode() {
        return this.outBusinessOrderCode;
    }

    public AscpAppointOrderCreatedErpSpiRequest setMemberId(Long memberId) {
        this.memberId = memberId;
        return this;
    }
    public Long getMemberId() {
        return this.memberId;
    }

    public AscpAppointOrderCreatedErpSpiRequest setRouteSupplierId(Long routeSupplierId) {
        this.routeSupplierId = routeSupplierId;
        return this;
    }
    public Long getRouteSupplierId() {
        return this.routeSupplierId;
    }

    public static class AscpAppointOrderCreatedErpSpiRequestItems extends TeaModel {
        // 箱规
        @NameInMap("pcs")
        public Integer pcs;

        // 品牌名称
        @NameInMap("brandName")
        public String brandName;

        // 重量（克）
        @NameInMap("weight")
        public Float weight;

        // 总箱数
        @NameInMap("box")
        public Integer box;

        // 货品ID
        @NameInMap("scItemId")
        public Long scItemId;

        // 商品类目
        @NameInMap("categoryName")
        public String categoryName;

        // 条形码
        @NameInMap("goodsBarCode")
        public String goodsBarCode;

        // 体积（立方毫米）
        @NameInMap("volume")
        public Float volume;

        // 商品ID
        @NameInMap("itemId")
        public Long itemId;

        // 计量单位
        @NameInMap("unit")
        public String unit;

        // 总件数
        @NameInMap("planNum")
        public Integer planNum;

        // 货品名称
        @NameInMap("scItemName")
        public String scItemName;

        // 存储类型
        @NameInMap("packageModel")
        public String packageModel;

        // SKUID
        @NameInMap("skuId")
        public Long skuId;

        public static AscpAppointOrderCreatedErpSpiRequestItems build(java.util.Map<String, ?> map) throws Exception {
            AscpAppointOrderCreatedErpSpiRequestItems self = new AscpAppointOrderCreatedErpSpiRequestItems();
            return TeaModel.build(map, self);
        }

        public AscpAppointOrderCreatedErpSpiRequestItems setPcs(Integer pcs) {
            this.pcs = pcs;
            return this;
        }
        public Integer getPcs() {
            return this.pcs;
        }

        public AscpAppointOrderCreatedErpSpiRequestItems setBrandName(String brandName) {
            this.brandName = brandName;
            return this;
        }
        public String getBrandName() {
            return this.brandName;
        }

        public AscpAppointOrderCreatedErpSpiRequestItems setWeight(Float weight) {
            this.weight = weight;
            return this;
        }
        public Float getWeight() {
            return this.weight;
        }

        public AscpAppointOrderCreatedErpSpiRequestItems setBox(Integer box) {
            this.box = box;
            return this;
        }
        public Integer getBox() {
            return this.box;
        }

        public AscpAppointOrderCreatedErpSpiRequestItems setScItemId(Long scItemId) {
            this.scItemId = scItemId;
            return this;
        }
        public Long getScItemId() {
            return this.scItemId;
        }

        public AscpAppointOrderCreatedErpSpiRequestItems setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public AscpAppointOrderCreatedErpSpiRequestItems setGoodsBarCode(String goodsBarCode) {
            this.goodsBarCode = goodsBarCode;
            return this;
        }
        public String getGoodsBarCode() {
            return this.goodsBarCode;
        }

        public AscpAppointOrderCreatedErpSpiRequestItems setVolume(Float volume) {
            this.volume = volume;
            return this;
        }
        public Float getVolume() {
            return this.volume;
        }

        public AscpAppointOrderCreatedErpSpiRequestItems setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public AscpAppointOrderCreatedErpSpiRequestItems setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public AscpAppointOrderCreatedErpSpiRequestItems setPlanNum(Integer planNum) {
            this.planNum = planNum;
            return this;
        }
        public Integer getPlanNum() {
            return this.planNum;
        }

        public AscpAppointOrderCreatedErpSpiRequestItems setScItemName(String scItemName) {
            this.scItemName = scItemName;
            return this;
        }
        public String getScItemName() {
            return this.scItemName;
        }

        public AscpAppointOrderCreatedErpSpiRequestItems setPackageModel(String packageModel) {
            this.packageModel = packageModel;
            return this;
        }
        public String getPackageModel() {
            return this.packageModel;
        }

        public AscpAppointOrderCreatedErpSpiRequestItems setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

    }

}
