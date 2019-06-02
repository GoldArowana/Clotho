namespace java com.aries.auth.clotho.idl.thrift.service
include 'dto.thrift'

service PermissionServer{
    string ping();
    bool hasPermission(1:dto.CompanyDTO companyDTO, 2:dto.RequestDTO requestDTO);
}
