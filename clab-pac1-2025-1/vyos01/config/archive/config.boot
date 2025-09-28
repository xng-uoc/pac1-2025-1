interfaces {
    dummy dum0 {
        address "1.1.1.1/32"
    }
    ethernet eth0 {
        address "172.20.20.41/24"
        address "3fff:172:20:20::7/64"
        description "Management Interface"
    }
    ethernet eth1 {
        address "10.1.2.1/30"
    }
    ethernet eth2 {
        address "10.1.3.1/30"
    }
    ethernet eth3 {
        address "192.168.1.1/24"
    }
    loopback lo {
    }
}
pki {
    ca clab {
        certificate "MIIDizCCAnOgAwIBAgICB+MwDQYJKoZIhvcNAQELBQAwVzELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGzAZBgNVBAMTEnBhYzEtMjAyNS0xIGxhYiBDQTAeFw0yNTA5MjUyMDA4MThaFw0yNjA5MjUyMDA4MThaMFcxCzAJBgNVBAYTAlVTMQkwBwYDVQQHEwAxFTATBgNVBAoTDGNvbnRhaW5lcmxhYjEJMAcGA1UECxMAMRswGQYDVQQDExJwYWMxLTIwMjUtMSBsYWIgQ0EwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQCrv6i5reawKIqp5r8rUNjLhYatvJCfwd+yOLW01efHF/oyRizfL6Udcxjcz+r5o10oZJp5hlpIbGzSmqIfWrfO7aszMH2gq+Rm42CqxqSFkUs56/AtjvjtW7S2OVT+0kLQwLmXRgNnt3uaaiP6BuvFnjgu3HOtjrq6gHuyEipBs/AahrorUZxqXdLxwql35IZFl59UKU2RFs0rX24FUdi2AXmO/k9pH/DBonWKG1rDj+aNZJ7rbjSN+PxHGCi4sOLOF3RkE6pRUOUVij5BW8ndLFt1jpswyVh4pF2WNG1kDRsCBL0UDEemjibd06GHhyTfrtML6EY/ia87EnVZt3qBAgMBAAGjYTBfMA4GA1UdDwEB/wQEAwIChDAdBgNVHSUEFjAUBggrBgEFBQcDAgYIKwYBBQUHAwEwDwYDVR0TAQH/BAUwAwEB/zAdBgNVHQ4EFgQUJ3mIpml0XzfYcX0ecIFeZh1FBjMwDQYJKoZIhvcNAQELBQADggEBAE0lDl6v1xbG+SAW2ArI6r4STeiqga9ZyLXZ1Cu65i5BLyspKN+Gx9kw+4Ry3y+JNaEzovHhIOzAfuc43FgRoLxX0AmhJed81tulYKNbDgo30Xit8gGMDN95xhr3cTt4/kKPP2wIHCXd4xm+mEmpy+GwaKxaUMeFbidzbgVsMijrEcB0ACflLk72mmfxPzRbxVTVnAwrSzoL8cf7tljsk64ihC6BJHHHXy9cgxGCf8RAMoNW3GuEh8y03vbKkbEP1uucWUSzeAbF9iMrzvCv5bcn9rCQtILvIUrMNTcmaP84/Y83LuWuZWb7GgiX7tGU4LYweuYhZCRupyOnwQtaDKk="
    }
    certificate self {
        certificate "MIID2jCCAsKgAwIBAgICBnowDQYJKoZIhvcNAQELBQAwVzELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGzAZBgNVBAMTEnBhYzEtMjAyNS0xIGxhYiBDQTAeFw0yNTA5MjUyMDA4MTlaFw0yNjA5MjUyMDA4MTlaMFoxCzAJBgNVBAYTAlVTMQkwBwYDVQQHEwAxFTATBgNVBAoTDGNvbnRhaW5lcmxhYjEJMAcGA1UECxMAMR4wHAYDVQQDExV2eW9zMDEucGFjMS0yMDI1LTEuaW8wggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQDOErgS2d2Aw5VpnHD3q8R9VcL0aMJRur9QM5pmxxZH9MRXbH4nPvnXjbijnCbT4ut1BhGNwWdVCZpo0kqJX5yjQNv25hqcXXki6d5IEFYLs7Eoe4t4RDOK2aKqNW0HSKbKW6hz2CM74kQwrLhCIxYyXMzY2LQys/qb8WmOsqyYi92CBHEiAD9roURmPUT1xLzrcmJyaHKRNgE838mtG3sLcyzJZYBwUPFN7JPFI6nKNIP9X+iHUP/Dl7tWdYj+8FkFmcV/QNkFMnsdYv9xVONCsFfBDofEvfRlGEb0k4/ty5vU+7fxVPdy/6bppiVUrgRo9wyeHxNecTOK/fdwoU15AgMBAAGjgawwgakwDgYDVR0PAQH/BAQDAgWgMB0GA1UdJQQWMBQGCCsGAQUFBwMCBggrBgEFBQcDATAOBgNVHQ4EBwQFAQIDBAYwHwYDVR0jBBgwFoAUJ3mIpml0XzfYcX0ecIFeZh1FBjMwRwYDVR0RBEAwPoIGdnlvczAxghdjbGFiLXBhYzEtMjAyNS0xLXZ5b3MwMYIVdnlvczAxLnBhYzEtMjAyNS0xLmlvhwSsFBQpMA0GCSqGSIb3DQEBCwUAA4IBAQCeOI53buJnSm6VAEAgBmAh27aUp2+AdOh+3+odlJ8W50RrJSGm7DAsNQBgURXn1LcYBYVUtVeJwVqgmAzFi6kf+4cREoDX6/UnT/y5M1k5XXN8Bycdw2ruhKDGvtZAf0hMARTvGZfBOwrp0z7xPVgUFExzM3Pd2/8TAj5oyd1eE0teVxfBow6F52lQKQiqyj6K2eNvoObRnLd4ygEaJjDCC7EtrWGNu0Zsl2aodU2XeGjzMDdp1WFJza8r1BTWZiMv3wkAZBnymnyXpO27VR72IxQhuAPdWrN9IH8QOHVa8QBMIEBp46v+S+WauyY9hEnll+DyZZqUJK0wWE0dwgwe"
        private {
            key "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQDOErgS2d2Aw5VpnHD3q8R9VcL0aMJRur9QM5pmxxZH9MRXbH4nPvnXjbijnCbT4ut1BhGNwWdVCZpo0kqJX5yjQNv25hqcXXki6d5IEFYLs7Eoe4t4RDOK2aKqNW0HSKbKW6hz2CM74kQwrLhCIxYyXMzY2LQys/qb8WmOsqyYi92CBHEiAD9roURmPUT1xLzrcmJyaHKRNgE838mtG3sLcyzJZYBwUPFN7JPFI6nKNIP9X+iHUP/Dl7tWdYj+8FkFmcV/QNkFMnsdYv9xVONCsFfBDofEvfRlGEb0k4/ty5vU+7fxVPdy/6bppiVUrgRo9wyeHxNecTOK/fdwoU15AgMBAAECggEAWPuWRnWTAwXxX5Aw65FdIC3HKBiQSBBWigAuXND82wdjPMjZVIMKCTzmDKfh0D69I2QCcm6f+wVRio+7pcQGdCwOj3de6EQoiZ3o4L9FGHp4Nh3a5Iy2oO9HIS4+rRV/CAQ6IgOjezlB7q62RcC21fpibgRtEzPKNEozJW4bvyZmqXFPllt1H6NM3P8qfvjPMoQq4QdBtdM9AusMCbjy6qwWnG4z7xpRyurFt7kMm7Coier45Muol2T0goTzO7uWRo1E+8WhV/Qb4nbjebE9z9QpNl94cC8JlEAbp2vsOzIuNnD1VHf+U+KMjc1YYD+zs7lmGxMQ8xNMHxGM6PmK/QKBgQD9TOiwi9pKJ6HRlW2xVhlDfmjo2DXnA9vjRr7IW4ttW6MRH0vKP1zWk2vsVx20rVHOzlY+GAz/i3jilqbxAhpq7M9ylZ6W04asiyS8gsC4XPi5DU1C+sUvqPIYoPY15RnO1rnfCIajQ1UTCPqX1nQpZN1C6eNzSMn5xXJlU7Cx7wKBgQDQRPUrc/P5IKQof3wX5ZXoEVdCm749YfnGoKHZ843bxeBvGjiuyeMic67wHvqsfenOlub5nl1PDD2/4saSaLIf+gTibl0uKQvDE8v0GP19EqjIoHGuc81Gt89NNKvWgBVS73uunUH8sSDfHwbh0SAMCKi9BqSLKMioqplwWQC/FwKBgH9vzjHkarKcNeGH2GQ7+QHn+0gKXzQW0O4LjbintgIS9HuMz0i1kDO0f7usKJnaCSqOzPz4hLGcrfjx6pOeh0P8WHJBrEQdr8fnSVg+QE+BFvGjK5fjKonL6eFSOgzrcoyJo4H+fB5vpcGp5sm1b0PUJy2fFnvNxzAOkntAG8mpAoGAaPjYubYP2hlhpCfdXA4TqIxU9vWYxUeEpWCBM2FWttbdcCI/P5nyKYM1QUHcBuTP25ijgl0XmqgI15Ztj43FeeiCXb5SqNl3XDO2MKoH2ep1t+lmYw9q/6HVkoxhsBOOq+aY6EHK6Jo+fzccOOU2ydnzcpLOjHVZ7elOvRmfDrECgYBQZlAHafCONYnVRu9/us7hu/+gjoEZAhzJ+ySPp8Warii7YsvnZ4G02AI5gn7ceE9WAyr7Zz/M/T4ElZ0jTjt6CO02Tajlxb+HT9XRrlMMw8vvcDg5aL4Xo8RPJN9+t7p7jZLciabdzqr6VUxtS48fxoO9eRewG8jOExS22uB5PA=="
        }
    }
}
protocols {
    ospf {
        area 0 {
            network "10.1.2.0/30"
            network "192.168.1.0/24"
            network "10.1.3.0/30"
            network "1.1.1.1/32"
        }
        interface dum0 {
            passive {
            }
        }
        interface eth1 {
            network "point-to-point"
        }
        interface eth2 {
            network "point-to-point"
        }
        interface eth3 {
            passive {
            }
        }
        parameters {
            router-id "1.1.1.1"
        }
    }
}
service {
    https {
        api {
            keys {
                id admin {
                    key "admin"
                }
            }
            rest {
            }
        }
        certificates {
            ca-certificate "clab"
            certificate "self"
        }
        listen-address "0.0.0.0"
    }
    ntp {
        allow-client {
            address "127.0.0.0/8"
            address "169.254.0.0/16"
            address "10.0.0.0/8"
            address "172.16.0.0/12"
            address "192.168.0.0/16"
            address "::1/128"
            address "fe80::/10"
            address "fc00::/7"
        }
        server time1.vyos.net {
        }
        server time2.vyos.net {
        }
        server time3.vyos.net {
        }
    }
    ssh {
        listen-address "0.0.0.0"
    }
}
system {
    config-management {
        commit-revisions "100"
    }
    host-name "vyos01"
    login {
        user admin {
            authentication {
                encrypted-password "$6$rounds=656000$8UyQmgDTWrix6/l9$1594WHgf34zhh3cYlxPZBLwntWZFKQ3HB6B60A1fisw.4Pu0eZ06n3eRgWAP//Iwsi/DZAk4WWKLhlMjJWSRV/"
                public-keys clab {
                    key "AAAAB3NzaC1yc2EAAAADAQABAAACAQDK7C0Y0+S14M1Kaz2tXm9tcQvNE6Urhj9cjUPoKFZLux+D81/ptkU+HmQp9czAMPHu2blzClvJnq+IIOv20AO2raUHtn7zzPlF62lU8tbCBQUm6WNKEm1zLEuihkrC6TKoxPu6MWl6RzCsQodXJ6UIDluvIG12R+wgqsPGVoRAMfHFObkVDOJyYOU00yQxWJKr5GJVLbxb4e+vgY29+HxbE+CsGo9QaT88emZSPxkTxjp6qshwYRwoz9oR3Ai0CXkkrDbw1j3KFxwv9EoOoxrxWldW7ytMnSxH4fzIO07EP0iph+iHfkitbnnH2Q8JwwGn5NmKieuPrhniXgeSRgqrYdWeWkniXSH+IpIZHbojRB0DFZZfKJ7+94rcpMjKgie9Kv8X8TFZuD9kPRNDWljoxxT31Pr7jrIZ9IlieYyhccTQhpMZdA9JOVuvX824EUxSDM6sjAxQFn3BZmqH3bIShOVuBMN5j8nWgZuvKchQdDeiVAxVH11RxNRFCC+iX7iHN72sWy7DRPVfVrr3wTZDtx5yokILtlgd3ikHssq5dGF0M6q1ff7769sCd3QSdNMX04VxRPpSCownfi6YdkKjedZU6db/41O7k3QhaUmQu1cKJ6G4jyRDwp3cooS7ymyMjDRD10bcyxkHaLXPIjlpem/eD7PJ6oPxcUmPE88tsw=="
                    type "ssh-rsa"
                }
            }
        }
    }
    syslog {
        local {
            facility all {
                level "info"
            }
            facility local7 {
                level "debug"
            }
        }
    }
}


// Warning: Do not remove the following line.
// vyos-config-version: "bgp@6:broadcast-relay@1:cluster@2:config-management@1:conntrack@6:conntrack-sync@2:container@3:dhcp-relay@2:dhcp-server@11:dhcpv6-server@6:dns-dynamic@4:dns-forwarding@4:firewall@19:flow-accounting@1:https@7:ids@1:interfaces@33:ipoe-server@4:ipsec@13:isis@3:l2tp@9:lldp@3:mdns@1:monitoring@2:nat@8:nat66@3:ntp@3:openconnect@3:openvpn@4:ospf@2:pim@1:policy@8:pppoe-server@11:pptp@5:qos@2:quagga@11:reverse-proxy@3:rip@1:rpki@2:salt@1:snmp@3:ssh@2:sstp@6:system@29:vrf@3:vrrp@4:vyos-accel-ppp@2:wanloadbalance@4:webproxy@2"
// Release version: 1.5-stream-2025-Q2
