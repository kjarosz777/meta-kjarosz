require recipes-core/images/core-image-minimal.bb

DESCRIPTION = "A small kjarosz image just capable of allowing a device to boot and \
is suitable for development work."

IMAGE_FEATURES += "ssh-server-dropbear"

IMAGE_INSTALL += "aaa"
IMAGE_INSTALL += "bbb"
IMAGE_INSTALL += "aaa-kernel"
