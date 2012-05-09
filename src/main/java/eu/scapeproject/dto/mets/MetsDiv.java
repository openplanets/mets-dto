package eu.scapeproject.dto.mets;

import java.net.URI;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "div", namespace = "http://www.loc.gov/METS/")
public class MetsDiv {
    @XmlAttribute(name = "id", namespace = "http://www.loc.gov/METS/")
    private String id;
    @XmlAttribute(name = "type", namespace = "http://www.loc.gov/METS/")
    private String type;
    @XmlAttribute(name = "label", namespace = "http://www.loc.gov/METS/")
    private String label;
    @XmlAttribute(name = "dmdid", namespace = "http://www.loc.gov/METS/")
    private String dmdId;
    @XmlAttribute(name = "admid", namespace = "http://www.loc.gov/METS/")
    private String admId;
    @XmlAttribute(name = "order", namespace = "http://www.loc.gov/METS/")
    private int order;
    @XmlAttribute(name = "orderlabel", namespace = "http://www.loc.gov/METS/")
    private String orderLabel;
    @XmlAttribute(name = "contentids", namespace = "http://www.loc.gov/METS/")
    private URI contentIds;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    private String xlinkLabel;
    @XmlElement(name = "fptr", namespace = "http://www.loc.gov/METS/")
    private List<MetsFilePtr> filePointers;
    @XmlElement(name = "mptr", namespace = "http://www.loc.gov/METS/")
    private List<MetsPtr> metsPointers;
    
    private MetsDiv(){
        super();
    }

    private MetsDiv(Builder builder) {
        this.id = builder.id;
        this.type = builder.type;
        this.label = builder.label;
        this.dmdId = builder.dmdId;
        this.admId = builder.admId;
        this.order = builder.order;
        this.orderLabel = builder.orderLabel;
        this.contentIds = builder.contentIds;
        this.xlinkLabel = builder.xlinkLabel;
        this.filePointers = builder.filePointers;
        this.metsPointers = builder.metsPointers;
    }

    public String getAdmId() {
        return admId;
    }

    public URI getContentIds() {
        return contentIds;
    }

    public String getDmdId() {
        return dmdId;
    }

    public List<MetsFilePtr> getFilePointers() {
        return filePointers;
    }

    public String getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public List<MetsPtr> getMetsPointers() {
        return metsPointers;
    }

    public int getOrder() {
        return order;
    }

    public String getOrderLabel() {
        return orderLabel;
    }

    public String getType() {
        return type;
    }

    public String getXlinkLabel() {
        return xlinkLabel;
    }

    public static class Builder {
        private String id;
        private String type;
        private String label;
        private String dmdId;
        private String admId;
        private int order;
        private String orderLabel;
        private URI contentIds;
        private String xlinkLabel;
        private List<MetsFilePtr> filePointers;
        private List<MetsPtr> metsPointers;

        public Builder admId(String admId) {
            this.admId = admId;
            return this;
        }

        public MetsDiv build() {
            return new MetsDiv(this);
        }

        public Builder contentIds(URI contentIds) {
            this.contentIds = contentIds;
            return this;
        }

        public Builder dmdId(String dmdId) {
            this.dmdId = dmdId;
            return this;
        }

        public Builder filePointers(List<MetsFilePtr> filePointers) {
            this.filePointers = filePointers;
            return this;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder label(String label) {
            this.label = label;
            return this;
        }

        public Builder metsPointers(List<MetsPtr> metsPointers) {
            this.metsPointers = metsPointers;
            return this;
        }

        public Builder order(int order) {
            this.order = order;
            return this;
        }

        public Builder orderLabel(String orderLabel) {
            this.orderLabel = orderLabel;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder xlinkLabel(String xlinkLabel) {
            this.xlinkLabel = xlinkLabel;
            return this;
        }
    }
}
